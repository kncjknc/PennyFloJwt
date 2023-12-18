package DemoFor.PennyFlo.repo;

import DemoFor.PennyFlo.entity.TransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionHistoryRepo extends JpaRepository<TransactionHistory,Integer> {



}
