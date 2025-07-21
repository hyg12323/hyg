package qulz.class1;

import java.util.HashMap;

public class YoungDAO {
   
	HashMap map = new HashMap();
	
	YoungDAO(){
		map.put("사탕", "청포도");
		map.put("점심", "달식당");
		map.put("회식", "어디로가요?");
		map.put("휴식", "네 ~!!!");
	}
	String selectAnswer(String question) {
		return (String)map.get(question);		
	}
}
