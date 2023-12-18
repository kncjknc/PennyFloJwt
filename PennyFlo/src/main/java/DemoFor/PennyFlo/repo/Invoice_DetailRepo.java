package DemoFor.PennyFlo.repo;

import DemoFor.PennyFlo.entity.Invoice_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Invoice_DetailRepo extends JpaRepository<Invoice_Details,Integer> {
}
