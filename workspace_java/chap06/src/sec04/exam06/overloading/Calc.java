package sec04.exam06.overloading;

public class Calc {

	int plus(int a, int b) {
		System.out.println("int int 실행");
		 return a + b;
		 
	 }
	
//	전달인자가 int, int로 같기 때문에 오버로딩 적용 안됨 (이름같은)
//	int plus (int a, int b) {
//		 return a + b;
//	}
	
	double plus(double a, double b) {
	  System.out.println("더블 더블 실행");         //타입이 다르고 해야 됨
		return a + b;
	}	

	double plus(int a, double b) {
      System.out.println("인트 더블  실행");
	    return a + b;
	}

	    
//	    int plus(int b, int a) {
//			System.out.println("int int 실행");       //변수명은 상관없이 안됨
//			 return a + b;
//			 
//		 }    
	    
	    int plus(int x) {
	    	return x +x;
	    }
	    
	    
	    
	    
	    
	    
	
	 

}
