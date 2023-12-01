package DemoFor.PennyFlo.repo;

import DemoFor.PennyFlo.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepo extends JpaRepository<Invoice,Integer> {
}
