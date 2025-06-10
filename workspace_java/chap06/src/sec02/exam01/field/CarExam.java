package sec02.exam01.field;

public class CarExam {
     static int a = 10;
	public static void main(String[] args) {
		
		
		Car myCar = new Car();
		
		System.out.println(myCar.company);
		myCar.company = "벤틀리";
		
		System.out.println(myCar.company);
		
		
		myCar.speed = 150;
		System.out.println(myCar.speed);
		
		
		
		
		Car myCar2 = new Car();
		System.out.println(myCar2.company);
		
		
		System.out.println("a:"+ a );
		
	   

	}

}
