package emp.service;

import java.util.List;

import emp.dao.EmpDAO;
import emp.dto.EmpDTO;

public class EmpService {

	EmpDAO empDAO = new EmpDAO();
	
	public List<EmpDTO> getPageEmp(EmpDTO dto){
		
		int pagePerRows = dto.getPagePerRows();
		int page = dto.getPage();
		
		int 	start = 0
		       ,end = 0;
		end = pagePerRows * page;
		start = end - (pagePerRows -1);
		
		dto.setStart(start);
        dto.setEnd(end);		
		
		EmpDAO empDAO = new EmpDAO();
		List list = empDAO.selectPageEmp(dto);
		return list;
	}
	
	public EmpDTO getOneEmp(EmpDTO empDTO) {
		EmpDTO dto = empDAO.selectOneEmp(empDTO);
		return dto;
	}
	
	public int removeEmp(EmpDTO empDTO) {
		return empDAO.deleteEmp(empDTO);
	}

	public int addEmp(EmpDTO empDTO) {
		return empDAO.insertEmp(empDTO);
	}
	
	public int editEmp(EmpDTO empDTO) {
		return empDAO.updateEmp(empDTO);
	}
}
