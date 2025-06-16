package sec05.exam02_static;

import java.util.Scanner;

public class Calc {
  
 String color;
 
 //static 이긴 하지만 그래 봤자 필드(변수) 다
 static double pi = 3.14;  // 필드만 2가지
 
 static int price;
// price =100;
 static {
	 
	 price =100;
//	 System.out.println("값을 입력하시오");
//	 Scanner s = new Scanner(System.in);
//	 price = s.nextInt();
	 
 }
Calc(){
	
}

static String  test;
//static {
//   test = "아무말";
//System.out.println(test);
//}
}
