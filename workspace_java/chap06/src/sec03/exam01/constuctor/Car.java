package sec03.exam01.constuctor;

public class Car {
	
//	Car(){                                                           // class이름과 같은 메소드 
//		System.out.println("Car 생성자 실행");
//	}
//	

	
	
	//이장면 꿈에서 
	
	 // 오버로딩 가능
	//생성자를 생략한 경우 (생성자가 하나도 없는 경우)
	// 기본 생성자가 자동완성 된다
//	Car(){
//		// 기본 생성자
//	}
     // 생성자가 하나라도 선언되어 있으면
	// 기본 생성자는 만들어지지 않는다

	
	String model = "아반떼";
	String color;
    int maxSpeed;
    CarExam carExam = new CarExam();
	
//	Car(){
//		//보통 생성자는 필드 값 초기화 하는데 많이 사용된다.
//		color = "빨강";
////	       if 
////	       for
////        test();		
//	}             
 // 생성자를 하나라도 생성하면 기본생성자는 자동으로 생기지않는다
	Car(String c){         
		
		
		//다른 생성자를 호출하는 방법
		// 무조건 첫번째 있어야 한다!!!!
		this("아반떼",c,240);    
		color = c;
		model = "아반떼";
		maxSpeed = 240;
        
	}
	
	Car(String m, String c, int ms){
		model = m;
		color = c;
		maxSpeed = ms ;
	}
	
	
	void test() {	
	}
	
//	void setColor(String c) {	
//	     color = c;
//	}
	
	void setColor(String color) {      // 지역안에서 사용	
	     
//       	this.color = "빨강";
		this.color = color;          //필드는 무조건 this. 으로 실행
	}
	
	
	

	
	
	
	
	
	
	
	
}