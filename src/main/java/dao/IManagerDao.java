package dao;

import model.Client;

import java.util.List;

public interface IManagerDao {
    void addClient(Client client);
    List<Client> listClients();
    void removeClient(Integer id);
}
