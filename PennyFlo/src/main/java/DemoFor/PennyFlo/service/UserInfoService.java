package DemoFor.PennyFlo.service;


import DemoFor.PennyFlo.entity.User;
import DemoFor.PennyFlo.exceptions.MailIDnotValid;
import DemoFor.PennyFlo.exceptions.UserAlreadyExistsException;
import DemoFor.PennyFlo.model.UserInfoDetails;
import DemoFor.PennyFlo.model.UserName;
import DemoFor.PennyFlo.repo.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserInfoService implements UserDetailsService {

    @Autowired
    private UserRepo userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    Logger logger = LoggerFactory.getLogger(UserInfoService.class);

    public User getUser(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> userInfo = userRepository.findByUserName(username);

        return userInfo.map(UserInfoDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("user not found " + username));

    }

    public String addUsers(User user) {
        User exist = userRepository.findByUserName(user.getUserName()).orElse(null);
        if(exist==null){
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userRepository.save(user);
            return "New User Added SuccessFully!";
        }else {
            throw new UserAlreadyExistsException(user.getUserName());
        }
    }

    public String forgetPassword(UserName userName) {
        User user = userRepository.findByUserName(userName.getName()).orElse(null);
        if(user!=null){
            logger.info("inside if forgetPassword");
            return "We will be send forget password link in your email kindly please check ";
        }
        else{
            throw new MailIDnotValid(userName.getName());
        }
    }
}