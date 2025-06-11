package sec04.exam03_return;

public class CalcExam {
 
	public static void main(String[] args) {
	
         Calc calc =  new Calc();		
		
           calc.plus(3,10);
         
       //  System.out.println(calc.plus);
		
          
         /*회식비 4.3만원
참석인원 4명
이 때 인당 얼마 내야 하는가?

디테일하게 원단위까지
참석인원은 만원단위로만 회식비를 낸다
[3]. 2번처럼 받으면 주최자는 얼마를 내야 하나?*/
           
           double a = 4.3;
           
           int b = (int)a /4*10000;
          double e = (double)a%3*10000+0.01;
        System.out.println( "한명당 "+b+"주최자" +(int)e);  
           
		

}
	
}
