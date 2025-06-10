package sec04.exam01.method;

import java.lang.reflect.Array;

public class Calc {
	
	//전원 켜기 메소드
	void powerOn() {    // 선언하는 () 이다
		System.out.println("전원을 켭니다");
	}
	//메소드명 powerOff; powerOn 메소드와 동일하게
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	/**
	 * JAVADOC 주석 
	 * 더하기 기능 
	 * 두 수를 입력 받아서 더한 결과를 돌려준다
	 * 
	 * 메소드명 : plus
	 * 전달인자 : int x, int y
	 * 리턴타입 : int (두 수의 합)
	 * 
	 * @param int x, int y
	 * @return int
	 * @author hay_1845@naver.com
	 * 
	 */
	
	int plus(int x, int y) {
		System.out.println("x:"+ x);
		System.out.println("y:"+y);
	
	    int result = x + y;
	    
	    return result;
	}
	
	
	
	 /**
	  * 두 정수를 입력 받아서 
	  * 나누기한 결과를 x/y
	  * double로 돌려준다
	  * 단 ! y가 0일때는 "안된다"고 출력하고 0을 돌려 줌 
	  * 메소드 명 : divide
	  * 전달인자  : int x, int y
	  * 리턴타입  : double
	  */
	
	double divide(int x, int y) {
		System.out.println("x:"+x);
		System.out.println("y:"+y);
       
		
		
		
	     
		if(y!=0) {
			double result = (double)x/y;
			System.out.println("안된다");
		   return result;
		}
		else {
			System.out.println("0으로 나눌수없습니다");
		return 0;
		}
	}	
     // int 배열의 모든 값을 더하는 메소드
    //   int sum(int[]array) {
    	//   int sum = 0; 
       //for(int i =0; i<array.Length; i++);
       
	
	//가변인자, 전개연산자, spread op
	// 보내는 곳에서는 sum2(1,2,3,4)
	//내부에서는 배열로 취급
	
	
	//int sum2(int...values) {
		
       
       
       
       
       
       
	
	
	

}
