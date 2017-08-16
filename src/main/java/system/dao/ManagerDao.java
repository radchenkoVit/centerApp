package system.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import system.model.Manager;

@Repository
public interface ManagerDao extends JpaRepository<Manager, Long> {
}
