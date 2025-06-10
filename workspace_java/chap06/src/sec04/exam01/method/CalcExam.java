package sec04.exam01.method;

public class CalcExam {

	public static void main(String[] args) {  // 선언하는 () 
		
		Calc calc = new Calc();
		
		
		calc.powerOn();   // 실행하는 ()이다 
		
		
		calc.powerOff(); 
		
		
		int sum = calc.plus(5,7);
		System.out.println("sum:"+ sum);
		
		
		
		int  x = 5;                // 전혀 관계없는 새로운 변수
		sum = calc.plus(x,7);
		System.out.println("sum:"+ sum);

		
		
		int  a = 5;                // 전혀 관계없는 새로운 변수
		sum = calc.plus(a,7);
		System.out.println("sum:"+ sum);
		
		
		
		
	     
	    double	di = calc.divide(10,0);
	    
	    
		System.out.println("di:"+di);
		

		
	}

}
