package service.manager;

import model.Client;
import model.VisaApplication;
import model.VisaType;
import service.db.DaoAccessObject;

import java.util.UUID;

public class ManagerService implements IManagerService {
    private DaoAccessObject dao;


    public void login(String email, String password) {

    }

    public boolean addClient(Client client) {
        return dao.addClient(client);
    }

    public boolean addClient(String name, String lastName, String email, String phoneNumber) {
        Client client = new Client();
        client.setName(name);
        client.setLastName(lastName);
        client.setEmail(email);
        client.setPhoneNumber(phoneNumber);


        return dao.addClient(client);
    }

    public Client findClient(String name, String lastName){
        return null;
    }

    public Client findClient(String email){
        return null;
    }

    public Client findClientByPhone(String phone){
        return null;
    }

    public Client removeClient(String email) {
        return dao.removeClient(email);
    }

    public Client removeClient(UUID uuid) {
        return dao.removeClient(uuid);
    }

    public VisaApplication findApplication(UUID id) {
        return null;
    }

    public VisaApplication findApplication(String name, String lastName, VisaType visaType) {
        return null;
    }

    public boolean addVisaApplication() {
        return false;
    }
}
