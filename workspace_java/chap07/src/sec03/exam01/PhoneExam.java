package sec03.exam01;

public class PhoneExam {
	
	public static void main(String[] args) {
		
		//abstract 클래스는 new 할 수 없다
//		Phone phone = new Phone();
		
		
		SmartPhone sp = new SmartPhone();
//		(부모형변환 생략 가능)
		
		Phone phone = (Phone)sp;
	}

}
