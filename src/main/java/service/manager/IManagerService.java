package service.manager;

import model.Client;
import model.VisaApplication;
import model.VisaType;

import java.util.UUID;

public interface IManagerService {
    void login(String email, String password);

    //operation with client
    boolean addClient(Client client);
    boolean addClient(String name, String lastName, String email, String phoneNumber);
    Client findClient(String name, String lastName);
    Client findClient(String email);
    Client findClientByPhone(String phone);
    Client removeClient(String email);
    Client removeClient(Integer id);

    //operation with application
    VisaApplication findApplication(UUID id);
    VisaApplication findApplication(String name, String lastName, VisaType visaType);
    boolean addVisaApplication();
}
