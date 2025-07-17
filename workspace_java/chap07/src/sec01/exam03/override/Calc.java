package sec01.exam03.override;

public class Calc {
	
	double areaCircle(double r) {
		System.out.println("calc Computer의 areaCirecle");
		return  r *r * Math.PI;
	}
     public int plus(int x, int y) {
    	 System.out.println("Calc의 plus실행");
    	 return x + y;
     }
}
