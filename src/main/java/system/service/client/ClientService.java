package system.service.client;

public interface ClientService {
    void login(String name, String password);
    void getVisaStatus(String id);
}
