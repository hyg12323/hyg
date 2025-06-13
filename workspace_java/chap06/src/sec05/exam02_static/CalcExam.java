package sec05.exam02_static;

public class CalcExam {
	public static void main(String[] args) {
		
		
		System.out.println("Calc.pi:" +Calc.pi);  // new가 안됬는데도 쓸수있는게 static

		Calc c1 = new Calc(); //colc클래스를 c1변수로 선언
         c1.color ="블랙"; //Calc클래스에서 필드 color 
         c1.pi = 3.141592;
		System.out.println("c1.pi:" +c1.pi);
		
		Calc c2 = new Calc();
        c1.color ="빨강";    
		System.out.println("c2.pi:" +c2.pi);
		System.out.println("Calc.pi:" + Calc.pi);
		
		
	}
	
}
