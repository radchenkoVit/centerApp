package service.db;

import model.Client;

import java.util.UUID;

/**
 * Created by vradchenko on 7/3/2017.
 */
public class DaoAccessObject implements IDbController {

    //private Connection dbConnection;


    public boolean addClient(Client client) {
        return false; // add client TODO: make workable
    }

    public Client removeClient(String id) {
        return removeClient(UUID.fromString(id)); // add client TODO: make workable
    }

    public Client removeClient(UUID id) {
        boolean result = false; // add client TODO: make workable

        if (result){} else {} // TODO: add some logic

        return null;
    }
}
