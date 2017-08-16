package system.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import system.model.Client;

@Repository
public interface ClientDao extends JpaRepository<Client, Long> {
}
