package system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import system.model.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {
}
