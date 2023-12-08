package DemoFor.PennyFlo.controller;

import DemoFor.PennyFlo.entity.Invoice;
import DemoFor.PennyFlo.entity.Invoice_Details;
import DemoFor.PennyFlo.entity.TransactionHistory;
import DemoFor.PennyFlo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/getPayments")
    public List<Invoice_Details> getPayments(){
        return customerService.getPayments();
    }

    @GetMapping("/getPaid")
    public List<Invoice> getPaid(){
        return customerService.getPaid();
    }

    @GetMapping("/getHistory")
    public List<TransactionHistory> getHistory(){
       return customerService.getHistory();
    }


}
