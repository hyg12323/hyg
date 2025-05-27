package sec01.exam01;

public class TypeCastingExam03 {

	public static void main(String[] args) {
		
		
		int intValue = 10;
         byte byteValue = (byte)intValue;
         System.out.println(byteValue);
		
         intValue = 200; 
         byteValue = (byte)intValue;
         // 127을 넘어가니까 예상하기 힘들다
         // 비트를 2의 보수로 계산한 결과가 나온다
         System.out.println(byteValue); 
	     
         //형 변환 영산자
	     // type casting operator  
         
         double d = -3.14;
         int i = (int)d;
         System.out.println("i:"+ i);
         
         int i2 = 100;
         long l1 = (long)i2; 		// (long) 생략가능   int 보다 크기떄문에 상관없음 
         long t2 = i2;
         

         
         // 크기순생략 byte < short < int < long <float < double
	
	       // 여기서 () 우선 순위 연산자
         // int a = 2 *
	
	
	   
         int i3 = 3;
         long l3 = 4;
         long l4 = i3 + l3;
         //(long) i3 + l3; 연산에서 자동타입변환
        
          int i7 = 10;
          double d7 = 5.5;
          double d8 = i7 + d7;// (double)i7 + d7
          System.out.println("d8:"+d8);
         
	    // double d9 = 10/4;    오른쪽이 먼저계산int여서 2가나옴 
	     double d9 = (double)10/4;
	     // double d9 = 10.0 / 4;
	     
	     System.out.println("d9:"+d9);
	     
	     //문자를 숫자로 바꾸기
	     
	     String s1 = "123";
//	     int i8 = (int)s1;
	     int i8 = Integer.parseInt(s1); // 함수
	     
	     //가장 쉽게 숫자를 문자로 바꾸는 방법
	     String s2 = ""+i8;
	     System.out.println(s2);
	     
	     // 퀴즈 
	     // 회식비 4.3만원
	     // 참석인원 4명
         // 이 때 인당 얼마 내야 하는가?
	     // 1. 디테일하게 원단위까지
	     // 2. 참석인원은 만원단위로만 회식비를 낸다
	     // 3. 2번 처럼 받으면 주최자는 얼마를 내야 하나?
	    // double h1 = 4.3/4;
	    	//	  System.out.println(h1+"만원");
	     	 
	    	//	  double h1 = (double)4/4;
	    		//  System.out.println(h1+"만원");		  
	    		  
	     double total = 4.3;
	     int count = 4;
	     double result1 =total / (double)count;
	     System.out.println("1번:"+(result1*10000));
	     
	     int result2 = (int) result1;
	     System.out.println("2번:"+(result2*10000));
	     
	     double result3 = total -((count-1) * result2);
	     System.out.println("3번:"+(result3*10000));
	     
       	    		  
	     //double result3 = total -((count-1) * result2);
	     //System.out.println("3번:"+(Math.ceil(result3*10000));
	    
	    
	     
	       
	     /*설명:
    총 택시비가 2.8만원이고, 3명이 동승했을 때:

        정확히 N등분하면 1인당 얼마?

      만원 단위로 내면 각자 얼마씩 내야 하나?

        마지막 사람은 얼마를 부담해야 하나 */
	     


	    double t1 = 2.8;
	    int count1 = 3;
	    double g1 = t1/3;
	    
	    System.out.println(g1*10000);
	    int g2 = (int)t1/(count1-1);
	    System.out.println(g2*10000);
	    double g3 = t1 - g2;
	    System.out.println(g3*10000);
	    
  	    /*커피 총 5잔을 주문해서 총 2.15만원이 나왔습니다.
          그 중 4명은 같은 금액을 냅니다. 남은 1명은 나머지 금액을 부담합니다.

          4명이 정확히 나눠낸다면 1인당 얼마?
 
           4명이 천원 단위로 낸다면 얼마씩?

            1명은 얼마 부담해야 할까?  */
	
	    
	   // 2천원 4명  8000  나머지는 13500원  // 3천원 4명 12000 나머지 9500
	
       double ca0 = 2.15;
       int to = 5;
       
       int ca1 = (int)ca0*10000; 	  
       System.out.println(ca1/(to-1));
       
       
       
       
       
       
    		   
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
