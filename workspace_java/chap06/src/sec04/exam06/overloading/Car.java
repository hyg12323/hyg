package sec04.exam06.overloading;

public class Car {
	
	
	
	int dd(int a, int b) {
		return a+b;
	
	}
	
   double avg(int x, int y) {
	   int s = dd(x,y);
	   
	   return s;
   }
	
	
	
	
	void mo (int a1, int b1) {
		
		double aa = avg(a1,b1);
		System.out.println( aa);
	}
	
	
	

}
