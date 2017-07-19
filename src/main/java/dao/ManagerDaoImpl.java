package dao;

import model.Client;

import java.util.List;

//@Repository TODO: to understand what it does
public class ManagerDaoImpl implements IManagerDao {

    //@Autowired Understand what it does
    private SessionFactory sessionFactory;

    public void addClient(Client client) {

    }

    public List<Client> listClients() {
        return null;
    }

    public void removeClient(Integer id) {

    }
}
