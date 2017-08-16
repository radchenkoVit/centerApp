package system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import system.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
