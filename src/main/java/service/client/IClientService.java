package service.client;

public interface IClientService {
    void login(String name, String password);
    void getVisaStatus(String id);
}
