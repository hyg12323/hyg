package sec02.exam02;

public class OpExam {

	public static void main(String[] args) {
	
		int x = 10;
		
		
		++x;
		System.out.println("x:"+x);
		
		
		
		x++;
		System.out.println("x:"+x);
		
		x = 10;
		x = x + 1;
		x += 1;//위와 같은 코드
		x++;    // 위와 같은 코드
		       //단, 1을 증가할때만
		
		
		
		int y = 10;
		y--;
		--y;
		System.out.println("y:"+y);
		
		x = 10;
		int z = ++x;
		System.out.println("z:"+z);
		
		x = 10; 
		z = x++;
		System.out.println("z:"+z);
		System.out.println("x:"+x);
		
		x = 10;
		System.out.println("++x:"+ ++x);
		x = 10;
		System.out.println("x++:"+ x++);
		
		x = 1;
		z = x++ + ++x;
		System.out.println("z:"+z);
		System.out.println("x:"+ x);
		
		
		
		// x = 1 >> 2>> 1 >> 2>> 1
		// 1 -  1*1 - 2
		// 1 - (1*1) - 2
		
		x = 1;       
		z =  x++ - --x * x++ - x--;
		
		//x와 z의 값은?
		System.out.println("z:"+z);
		   
		
		
		boolean a = false;
		a =!a;
		System.out.println("a:"+a);
		
     			 
	// 나누기 할 때 0으로 나누지 않도록 조심    
		int b = 10;
//		int c = b / 0;
	
		
		double d = 7.3;
		double e = d / 0;		
		
		System.out.println(e);  // infinity
		
		
		boolean f = 3 > 4; 
		System.out.println("f:"+f);
		
		System.out.println(0.1==0.1f);  //플룻 더블 비교
		//소수점을 비교할 때는 같은 타입으로 변환해서 비교하자
		
		
		String s1 = "s1";
		String s2 = "s" +1;
        System.out.println(s1.equals(s2));  
        // 글자 비교할때는 무조건 equals 
        System.out.println(  "ssss".equals(s2)); //참으로 바꿀대 !앞에다 쓰면됨
        
        
        /* 비트연산자
         * 1100
         * 1010   &
         * ㅡㅡㅡㅡ
         * 1000
         * 
         * 1100
         * 1010
         * ㅡㅡㅡㅡ |
         * 1110
         * 
         */
        
        
        System.out.println(10%3);
        int mo = 10000;
        int pr = 4500;
        int count = mo / pr;
          System.out.println("총"+count+"잔");	
          int change = mo % pr;
          System.out.println("잔액"+change);
          
        //System.out.println(stp);
        //퀴즈
        // 난 돈이 10000원 있습니다
        //1. 4500원 짜리 프라프치노 최대 몇 잔 살수있나요?
        // 2. 그리고 남은 돈
        //
        
          
        
// 올리브영에 꿀홍차가 8000원 
 //         15% 세일중이면 꿀홍차 가격은?
          int honey = 8000;
          double m = honey - (honey*0.15);
         // honey - (honey *0.15)
         // (honey*1) - (honey * 0.15)
         // honey * (1-0.15)
         // honey * 0.85
          
       	 // 957	  
         // 957 % 100
         // 957 % 10
	
	
         int score = 87;
         System.out.println("내 점수는 80과 90사이다 참? 거짓? :");
         
         
         System.out.println(score >= 80 && score <= 90 ); 
          //어떤 숫자를 10의 자리 이하 버림
         // 957를 900으로 바꾸는 법
         // 957 - 57 // 957 %100
         // a - (a%100)
         int k = 1937;
         k = k - (k % 100);
	     k = k / 100; 
   //    k /= 100;
	     k = k * 100;
   //    k *= 100;	
	
	
	//   v1 / v2의를 소수점 3자리까지 출력하시오 
	     double v1 = 1000.0;
	     double v2 = 794.0;
	     
	     double v3 = v1/ v2;
	     double v4 = v3 ;
	          
///     	System.out.printf("%.3f".v3);     
//	    (int)(v3 * 1000)  // 1259 
	    v3 = ( (int)(v3 * 1000) ) / 1000.0;   // doubel 생략 .0 
	    System.out.println(v3); 
	  
	   
//      double v4 = (v1 / v2) *1000;
//      int v5  = (int) v4;
//      double v6 = (double)v5 /1000;
	
	int s = 95;
	String grade = (s > 90) ? "A" : "B"; // string 은 ""/ 
	System.out.println("grade:"+grade);
	
	
	
	int x6 = 5;
	int y5 = ++x6 + x6-- - x6++ + --x6;
	          
			
	System.out.println(y5);	
	
	
			
           		
	//  6 + 6 - 5 +5 
	 // 12- 10 2
		 	
	
	int c3= 3;
	int b4= c3++ + ++c3 * c3-- - --c3;
	          
	
	      //3 +5 x 5 - 3 
	        // 25 -
	System.out.println(b4);
	
	
	int xz = 4;
	int yz = xz-- - --xz + ++xz * xz--;
	          
	   
	
	System.out.println(yz);
	
	
	int zw= 2;
	int ww = zw++ + ++zw * --zw - zw-- + ++zw * zw++;
	          
	
	System.out.println(ww);
	
	
	
	double va = 1223.0;
    double vb= 777.0;

    double vc= va/ vb;
   
    double vd = vc*1000000;
    
     vd = ((int)(vd/1))/1000000.0;
    
    System.out.println(vd);
  
	  int va11 = 65;
	
    if (va11 >= 70) {
    	System.out.println("70점이상입니다");
    	}
    
    else if (va11 >= 60) 
    	System.out.println("60점이상 입니다");
     
    
    
	
	
	}    

	
	
}