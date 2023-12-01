package DemoFor.PennyFlo.repo;

import DemoFor.PennyFlo.entity.BankDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepo extends JpaRepository<BankDetails,Integer> {
}
