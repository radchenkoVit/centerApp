package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.repository.ClientRepository;

//service which should correspond for adding a Client to DB and validation of this client
@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;
}
