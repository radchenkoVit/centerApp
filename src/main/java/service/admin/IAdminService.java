package service.admin;

public interface IAdminService {
    void login(String email, String password);
    void addManager();
    void removeManager();
    void addClient();
    void removeClient();
}
