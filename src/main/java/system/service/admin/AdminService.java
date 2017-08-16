package system.service.admin;

public interface AdminService {
    void login(String email, String password);
    void addManager();
    void removeManager();
    void addClient();
    void removeClient();
}
