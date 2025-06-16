package sec05.exam02_static;

//import java.util.ArrayList;
//import java.util.HashMap;
import java.util.*;

//import sec05.exam05_final.

public class CalcExam {
	public static void main(String[] args) {
		
//		Calc c1 =new Calc();
		System.out.println("Calc.pi:" +Calc.pi);  // new가 안됬는데도 쓸수있는게 static
         // Calc.pi 는 Static 변수 바꾸면 전체가 바뀜 
		Calc c1 = new Calc(); //colc클래스를 c1변수로 선언
         c1.color ="블랙"; //Calc클래스에서 필드 color 
         c1.pi = 3.141592;
         // c1 .c2는 새로 생성하면 c1 변수 바꾸면 c2 변수변화 x
		System.out.println("c1.pi:" +c1.pi);
		
		Calc c2 = new Calc();
        c1.color ="빨강";    
		System.out.println("c2.pi:" +c2.pi);
		System.out.println("Calc.pi:" + Calc.pi);
		
		System.out.println(Math.PI);
				
	
	 test();
	 
// 	 java.util.ArrayList list = new  java.util.ArrayList(); 길어서 안씀
	 ArrayList list = new  ArrayList();
	 
	//2. test 메소드 사용하기
	
	}
	
//	1. 메소드 명 test 만들기
// 전달인자 /리턴타입 없음
// 그냥 아무 말이나 출력
	
	//static String  test;
	//void test();
	static void test(){
	   
	System.out.println("아무말");
	}
	
	
	
}
