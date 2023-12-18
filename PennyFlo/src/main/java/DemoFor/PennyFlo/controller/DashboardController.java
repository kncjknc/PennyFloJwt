package DemoFor.PennyFlo.controller;

import DemoFor.PennyFlo.entity.BankDetails;
import DemoFor.PennyFlo.model.PayAndReceive;
import DemoFor.PennyFlo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController
public class DashboardController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/getPayandPayable")
    public PayAndReceive payAndReceive(){
        return customerService.getPayAndReceive();
    }


    public List<Integer> overDuePayandReceive(){
        return Arrays.asList(1,2);
    }

    public List<BankDetails> banks(){
       return customerService.getBanks();
    }


}
