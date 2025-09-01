package yaService;

import yaDAO.UsersDAO;
import yaDTO.UsersDTO;

public class LoginService {
    private UsersDAO usersDAO = new UsersDAO();

    public UsersDTO login(String username, String password) {
        return usersDAO.login(username, password);
    }
}
