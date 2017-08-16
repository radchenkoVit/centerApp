package system.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import system.model.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, Long> {
}
