package DemoFor.PennyFlo.service;

import DemoFor.PennyFlo.entity.Invoice;
import DemoFor.PennyFlo.entity.Invoice_Details;
import DemoFor.PennyFlo.repo.InvoiceRepo;
import DemoFor.PennyFlo.repo.Invoice_DetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntityCommonService {

    @Autowired
    private InvoiceRepo invoiceRepo;

    @Autowired
    private Invoice_DetailRepo invoiceDetailRepo;

    public Invoice addInvoice(Invoice invoice) {
        return invoiceRepo.save(invoice);
    }

    public Invoice_Details addInvoice_Details(Invoice_Details invoiceDetails) {
        return invoiceDetailRepo.save(invoiceDetails);
    }

    public Invoice getInvoice(int id) {
        return invoiceRepo.findById(id).orElse(null);
    }

    public Invoice_Details getInvoiceDetail(int id) {
        return invoiceDetailRepo.findById(id).orElse(null);
    }
}
