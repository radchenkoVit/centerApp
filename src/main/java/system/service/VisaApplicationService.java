package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.repository.VisaApplicationRepository;
import system.model.VisaApplication;

@Service
public class VisaApplicationService {

    @Autowired
    private VisaApplicationRepository visaAppRepository;

    public void add(VisaApplication visaApplication){
        // visa application validation ???
        visaAppRepository.save(visaApplication);
    }

    public VisaApplication find(Long id){
        if (id != null)
            return visaAppRepository.findOne(id);

        throw new IllegalArgumentException("Id should not me must");
    }

    public void delete(Long id){
        visaAppRepository.delete(id);
    }

    public void delete(VisaApplication visaApplication){
        visaAppRepository.delete(visaApplication);
    }
}
