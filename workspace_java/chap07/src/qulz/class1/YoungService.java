package qulz.class1;

public class YoungService {
	
	YoungDAO youngDAO = new YoungDAO();
	// 머리속
	String getInfo(String question) {
		String result = youngDAO.selectAnswer(question);
		if(result == null) {
			result ="(무시)";
		}else {
			result = "흐음... 저는요"+ result+"이거요!";			
		}
		return result;
	}
	// gpt
	// 노션

}
