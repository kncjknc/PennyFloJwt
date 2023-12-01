package DemoFor.PennyFlo.service;

import DemoFor.PennyFlo.entity.BankDetails;
import DemoFor.PennyFlo.repo.BankRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {

    @Autowired
    private BankRepo bankRepo;

    public BankDetails addBank(BankDetails bankDetails) {
       return bankRepo.save(bankDetails);
    }
}
