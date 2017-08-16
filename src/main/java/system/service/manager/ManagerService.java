package system.service.manager;

import system.model.VisaApplication;
import system.model.VisaType;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

//@Service Мы используем данную аннотацию, чтобы объявить, что этот класс представляет сервис – компонент сервис-слоя. Сервис является подтипом класса @Component. Использование данной аннотации позволит искать бины-сервисы автоматически (смотрите далее в root-context.xml).
public class ManagerService implements IManagerService {

    public void login(String email, String password) {

    }

    public boolean addClient(String name, String lastName, String email, String phoneNumber) {
        Client client = new Client();
        client.setName(name);
        client.setLastName(lastName);
        client.setEmail(email);
        client.setPhoneNumber(phoneNumber);


        return true;// TODO: mock up
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

    public Client removeClient() {
        return null;
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
