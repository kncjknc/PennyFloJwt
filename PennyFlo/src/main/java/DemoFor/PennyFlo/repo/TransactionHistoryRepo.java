package DemoFor.PennyFlo.repo;

import DemoFor.PennyFlo.entity.TransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionHistoryRepo extends JpaRepository<TransactionHistory,Integer> {



}
