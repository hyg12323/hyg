package yaService;

import yaDAO.LoginDAO;
import yaDTO.UserDTO;

public class LoginService {
    private final LoginDAO loginDAO = new LoginDAO();

    public UserDTO login(int userId, String nameAsPassword) {
        if (userId <= 0 || nameAsPassword == null) return null;
        return loginDAO.login(userId, nameAsPassword);
    }
}
