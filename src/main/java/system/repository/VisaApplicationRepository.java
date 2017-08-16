package system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import system.model.VisaApplication;

@Repository
public interface VisaApplicationRepository extends JpaRepository<VisaApplication, Long> {
}