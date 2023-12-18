package DemoFor.PennyFlo.controller;

import DemoFor.PennyFlo.entity.Invoice;
import DemoFor.PennyFlo.entity.Invoice_Details;
import DemoFor.PennyFlo.service.EntityCommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EntityCommonController {

    @Autowired
    private EntityCommonService entityCommonService;

    @PostMapping("/addInvoice")
    public Invoice addInvoice(@RequestBody Invoice invoice){
        return entityCommonService.addInvoice(invoice);
    }

    @PostMapping("/addInvoice_Details")
    public Invoice_Details addInvoice_Details(@RequestBody Invoice_Details invoiceDetails){
        return entityCommonService.addInvoice_Details(invoiceDetails);
    }

    @GetMapping("/getInvoice/{id}")
    public Invoice getInvoice(@PathVariable int id){
        return entityCommonService.getInvoice(id);
    }

    @GetMapping("/getInvoiceDetail/{id}")
    public Invoice_Details getInvoiceDetail(@PathVariable int id){
        return entityCommonService.getInvoiceDetail(id);
    }

}
