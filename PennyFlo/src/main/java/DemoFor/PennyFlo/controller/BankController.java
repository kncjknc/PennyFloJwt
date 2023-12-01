package DemoFor.PennyFlo.controller;

import DemoFor.PennyFlo.entity.BankDetails;
import DemoFor.PennyFlo.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @Autowired
    private BankService bankService;

    @PostMapping("/addBank")
    public BankDetails addBank(@RequestBody BankDetails bankDetails){
      return  bankService.addBank(bankDetails);
    }

}
