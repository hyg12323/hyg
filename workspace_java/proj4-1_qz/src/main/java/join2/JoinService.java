package join;

import java.util.List;

import join.JoinDAO;
import join.JoinDTO;

public class JoinService {
JoinDAO joinDAO = new JoinDAO();
	
	public List<JoinDTO> getAllEmp(){
		JoinDAO empDAO = new JoinDAO();
		List list = empDAO.selectAllEmp();
	    return list; 
	}
	
}
