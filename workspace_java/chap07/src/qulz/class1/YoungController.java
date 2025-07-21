package qulz.class1;

public class YoungController extends Student {

	
	YoungController(){
		super("용군");
	}
	
	YoungService youngSevice = new YoungService();
	@Override
	String answer(String question) {
		String result = youngSevice.getInfo(question);
		return result;
	}
	
}
