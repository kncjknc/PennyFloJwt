package DemoFor.PennyFlo.controller;

import DemoFor.PennyFlo.entity.User;
import DemoFor.PennyFlo.model.AuthTokenclass;
import DemoFor.PennyFlo.model.UserName;
import DemoFor.PennyFlo.service.JwtService;
import DemoFor.PennyFlo.service.UserInfoService;
import jakarta.annotation.security.RolesAllowed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserCotroller {

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private JwtService jwtService;

    Logger logger = LoggerFactory.getLogger(UserCotroller.class);

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        userInfoService.addUsers(user);
        return "User Added SuccessFully";
    }

    @PostMapping("/tokenAPI")
    public String authenticationTicket(@RequestBody AuthTokenclass authRequest) {
        logger.info("inside method");
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassWord()));

        if (authentication.isAuthenticated()) {
            logger.info("inside If");
            return jwtService.generateToken(authRequest.getUserName());
        } else {
            logger.info("inside else");
            throw new UsernameNotFoundException("Invalid User !");
        }

    }

    @PostMapping("/forgetPassword")
    public String forgetPassword(@RequestBody UserName userName){

        return userInfoService.forgetPassword(userName);
    }

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable int id){
       return userInfoService.getUser(id);
    }






}
