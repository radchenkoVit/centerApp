package system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import system.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
}
