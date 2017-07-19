package service.manager;

import dao.IManagerDao;
import model.Client;
import model.VisaApplication;
import model.VisaType;
import service.db.DaoAccessObject;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

//@Service Мы используем данную аннотацию, чтобы объявить, что этот класс представляет сервис – компонент сервис-слоя. Сервис является подтипом класса @Component. Использование данной аннотации позволит искать бины-сервисы автоматически (смотрите далее в root-context.xml).
public class ManagerService implements IManagerService {
    //@Autowired
    private IManagerDao dao;


    public void login(String email, String password) {

    }

    //@Transactional Перед исполнением метода помеченного данной аннотацией начинается транзакция, после выполнения метода транзакция коммитится, при выбрасывании RuntimeException откатывается.
    public boolean addClient(Client client) {
         dao.addClient(client);
         return true; // no exception happen --> returns trur
    }

    public boolean addClient(String name, String lastName, String email, String phoneNumber) {
        Client client = new Client();
        client.setName(name);
        client.setLastName(lastName);
        client.setEmail(email);
        client.setPhoneNumber(phoneNumber);


         return addClient(client);
    }

    public Client findClient(String name, String lastName){
        return null;
    }

    public Client findClient(String email){
        List<Client> clients = dao.listClients();
        Optional<Client> foundClient = clients.stream().filter(client -> email.equalsIgnoreCase(client.getEmail())).findFirst();
        if (foundClient != null && foundClient.isPresent()){
            Client client = foundClient.get();
            dao.removeClient(client.getId()); // remove client
            return client;
        }

        // throwNOT FOUND ECEPTION;
        return null;
    }

    public Client findClientByPhone(String phone){
        return null;
    }

    //@Transactional
    public Client removeClient(final String email) {
//        List<Client> clients = dao.listClients();
//        Optional<Client> foundClient = clients.stream().filter(client -> email.equalsIgnoreCase(client.getEmail())).findFirst();
//        if (foundClient != null && foundClient.isPresent()){
//            Client client = foundClient.get();
//            dao.removeClient(client.getId()); // remove client
//            return client;
//        }

        Client client = findClient(email); // exeption will happen here
        dao.removeClient(client.getId()); // remove client

        return client; // TODO: throw exception
    }

    public Client removeClient(Integer id) {
         dao.removeClient(id);

         return null;// what should I do in this case?
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
