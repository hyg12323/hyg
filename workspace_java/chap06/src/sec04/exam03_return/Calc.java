package sec04.exam03_return;

public class Calc {

	//두 수를 입력 받아 더한 결과를 돌려주는 메소드 plus
	
	 int plus(int a, int b) {
		 return a + b;
		 
	 }
	                                  
	 //avg에 넣을거라 double
	  double avg(int x, int y) {        // 계산시켜주기 때문에
		   int sum = plus(x,y);
	  double result = (double)sum/2;
	  return result;
	  
	  }
	 
	void execute(int a1, int a2) {   
		
		double result = avg(a1, a2);
		System.out.println(a1 +"과"+a2+"의 평균은 "+result);
	}
	

// void 내부에서 계산하고 출력한다하면 void를쓴다
// CalcExam에서 작성하고 불러올댄 void에서 
//  계산해주지않기때문에 계산기능은 위에

    //계산기능 
//int plus(int a, int b) {
//	 return a + b;
} 
//}