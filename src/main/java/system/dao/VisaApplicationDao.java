package system.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import system.model.VisaApplication;

@Repository
public interface VisaApplicationDao extends JpaRepository<VisaApplication, Long> {
}
