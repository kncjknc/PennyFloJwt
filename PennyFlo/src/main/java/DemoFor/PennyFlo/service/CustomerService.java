package DemoFor.PennyFlo.service;

import DemoFor.PennyFlo.entity.BankDetails;
import DemoFor.PennyFlo.entity.Invoice;
import DemoFor.PennyFlo.entity.Invoice_Details;
import DemoFor.PennyFlo.entity.TransactionHistory;
import DemoFor.PennyFlo.model.PayAndReceive;
import DemoFor.PennyFlo.repo.BankRepo;
import DemoFor.PennyFlo.repo.InvoiceRepo;
import DemoFor.PennyFlo.repo.Invoice_DetailRepo;
import DemoFor.PennyFlo.repo.TransactionHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private InvoiceRepo invoiceRepo;

    @Autowired
    private BankRepo bankRepo;

    @Autowired
    private BankDetails bankDetails;

    @Autowired
    private TransactionHistoryRepo transactionHistory;

    @Autowired
    private Invoice_DetailRepo invoiceDetailRepo;

    public PayAndReceive getPayAndReceive() {
       Invoice invoice= invoiceRepo.findById(1).orElse(null);
        PayAndReceive payAndReceive = new PayAndReceive(invoice.getAmount(),invoice.getAmount()+8);
        return payAndReceive;
    }

    public List<BankDetails> getBanks() {

        List<BankDetails> bankDetails = Arrays.asList(bankRepo.findById(1).orElse(null)
                ,bankRepo.findById(2).orElse(null));
        return bankDetails;
    }

    public List<Invoice_Details> getPayments() {
         List<Invoice_Details> list = Arrays.asList(invoiceDetailRepo.findById(1).orElse(null),
                invoiceDetailRepo.findById(2).orElse(null)
        ,invoiceDetailRepo.findById(3).orElse(null)
        ,invoiceDetailRepo.findById(4).orElse(null)
        ,invoiceDetailRepo.findById(5).orElse(null)
        ,invoiceDetailRepo.findById(6).orElse(null)
        ,invoiceDetailRepo.findById(7).orElse(null));

         return list;
    }

    public List<Invoice> getPaid() {
        List<Invoice> list = Arrays.asList(invoiceRepo.findById(1).orElse(null)
                ,invoiceRepo.findById(1).orElse(null)
                ,invoiceRepo.findById(2).orElse(null)
                ,invoiceRepo.findById(3).orElse(null)
                ,invoiceRepo.findById(4).orElse(null)
                ,invoiceRepo.findById(5).orElse(null)
                ,invoiceRepo.findById(6).orElse(null)
                ,invoiceRepo.findById(7).orElse(null)
                ,invoiceRepo.findById(8).orElse(null));
        return list;
    }

    public List<TransactionHistory> getHistory() {
        List<TransactionHistory> history = Arrays.asList(transactionHistory.findById(1).orElse(null)
        ,transactionHistory.findById(2).orElse(null)
        ,transactionHistory.findById(3).orElse(null)
        ,transactionHistory.findById(4).orElse(null)
        ,transactionHistory.findById(5).orElse(null)
        ,transactionHistory.findById(6).orElse(null)
        ,transactionHistory.findById(7).orElse(null)
         ,transactionHistory.findById(8).orElse(null));
        return history;
    }
}
