package sec01.exam01;

public class ForExam2 {

	public static void main(String[] args) {
		
	     //문제 3
	      // 합 별 조합의 수 출력
	             	
	             
	             	
	         
	         
	     //문제 4
	      // 순서에 관계 없이 중복 제거
	         //순서에 관계 없이 중복 제거
	         // 합2: [1.1]
	         // 합3: [1.2]와 [2.1]는 같음
	       int  count = 0;
		for(int i = 1;  i <= 6; i++ ) {
			//System.out.print(i);
			for(int a = 1; a <= 6; a++) {
	//		System.out.println("["+i+"," +a+"]" );
			
			if (i != a ) { 
			//	System.out.println("["+i+"," +a+"]" );
				if (a+i == 3) {
			  count++;
				System.out.print("합3:["+i+"," +a+"]" );
		    	
		    }
				
			}
			
			
			
			
			}
			
			
			
		}
		
	    
	             	
	      //문제 5
	      // 입력받은 정수에 따라 다음과 같이 출력
	      /* 3
	       * 00 01 02
	       * 10 11 12
	       * 20 21 22       
	       */
	             	
		   	 /* 4 
		   	  * 00 01 02 03
		      * 10 11 12 13
		      * 20 21 22 23      
		      */
	             	
	       
	             	
	             	
	             	
	             	
	             	
		                          	  	
	        	
	        	
	     //문제 6
	     // 입력받은 정수에 따라 다음과 같이 출력
	     // 3
	     /* (정사각형)
	      * 3
	      * +++
	      * +.+
	      * +++
	      * 5
	      * +++++
	      * +...+
	      * +...+
	      * +...+
	      * +++++
	      *         	
	      */
		
		
		
		
		
		
		for(int i = 1; i<=9; i++) {
			for (int e =1; e<=9; e++)
				System.out.println(""+i+"x"+e+"="+i*e);
		}
		
		
		
		//연산1. 
//		돈이 2만원 있을 때 
//		4500원 짜리 라떼를 몇 잔 살 수 있는가?
		
//		
		{int a = 20000;
		int b = 4500;
		
		int ab = a/b;
		System.out.println(ab);}
		
//		
//		
		
		
		//연산2.
//		7264원을 5000원, 1000원 , 500원 , 100원 , 50원, 10원, 1원
		//각각 몇개씩 줘야할까?
		
		
		
		int a = 7264;
		
		
		int b = 5000;
		
		int a1 = a/b; // 1개
		
		int a2 = a%b; // 2264
				
		int c = 1000; 
		
		int a3 = a2/c;  //2개
		
		int a4 = a2%c;
	    int d = 500;
	    
        int a5 = a3/d;  //0개
		
		
	    
	    
	//    int a5 = 
	    
	    int e = 100;
        int a6 = a4/e; // 2개
		
		int a7 = a4%e; // 
	         
	    int f = 50; 
        int a8 = a7/f; 
		
		int a9 = a7%f; // 
	    
	    int g = 10;
	    
	    int a10 = a9/g;
	    int a11 = a9%g;
	    
	    int h = 1;
	    int a12 = a11/h;
	    int a13 = a11%h;
	   
	    System.out.println("오천원"+a1+"개 남은금액:"+a2+"  천원"+a3+"개 남은금액:"+a4);
	    System.out.println("오백원"+a5+"개 남은금액:"+a4+"   백원"+a6+"개 남은금액:"+a7);
	    System.out.println("오 십 원"+a8+"개 남은금액:"+a9+"   십원"+a10+"개 남은금액:"+a11+ "  일원"+a12 +"개"+
	    		 "  남은금액"+a13);
		
	//	System.out.println(b);
		
		
		
		
//		문제 1.
//int 변수에 임의의 수를 넣고
//그 수가 "양수", "0", "음수" 구분하여 출력


	    int aa = -1;
	    if(aa==0) {
	    	System.out.println("0입니다");
	    }
	    else if (aa>0) {
	    	System.out.println("양수");
	    }
	    else if (aa<0) {
	    	System.out.println("음수");
	    }
//	    else {
//	    	System.out.println("?");
//	    }



         


//문제 2.
//a와 b 두 수 중에서 큰 값을 출력
	    
	    int bb = 3;
	    int bb2 = 2;
	    
	    if(bb>bb2) {
	    	System.out.println("bb큰값입니다");
	    }
	    
	    else if(bb<bb2) {
	    	System.out.println("bb2큰값입니다");
	    }
	    
	    else  {
	    	
	    	System.out.println("값이 같습니다");
	    }
	    
	    
	    
//
//문제 3.
//시간 과 분이 있을 때
//35분이 지난 시간을 출력
	    
	    int ff = 26;
	    int ff2 =ff%24;
	    
	    int ee = 59+35;
	    int ee2 = ee%60;
	     
	    		 //    int ie =         
	    if (ee >=60){ 
	    System.out.println(ff2+1 +"시"+ee2+"분");	
	    }
	    else {
	    	System.out.println(ff2+"시"+ee2+"분");
	    }
	    
	    
	    
//
//문제 4.
//어떤 수가
//15와 20 사이(포함)에 있는가?
	    
	    
	    int dd3 =  17;
	    int dd4 = 15;                      // 15 16 17 18 19 20 
	    int dd5 = 20;
	         
	     
	    if(dd3>=dd4 && dd3<=dd5 ) {
	          System.out.println("15~20사이 입니다");     //1~15 제외    20부터 나머지제외
	    }
	    else {
	    	System.out.println("아닙니다");
	    }
	   
//	   for(int i =0; i<=5; i++) {
//		   System.out.println(dd4+i);
//	   }
		    
	      
	   	
	    
	  
	    
	    
	    
	    
//
//문제 5.
//통장 잔액이 10000원 있을 때
//출금액에 따라
//"잔액이 부족합니다", "얼마 출금 했고 얼마 남았습니다", "정확히 입력 해주세요"
	   
	   
	   
	   
	   
	   
	   
	   
//
//문제 6.
//값에 따라(예를 들어 125)(단, 0은 양수+짝수)
//"100 보다 큰 수이며, 양수이고, 홀수입니다"
//예를들어 -6
//"100 보다 작은 수이며, 음수이고, 짝수입니다"
//
//문제 7.
//어제 온도, 오늘 온도 변수 두개
//2, -3
//"오늘 온도는 영하 3도 입니다. 어제보다 5도 낮습니다" 
//
//문제 8번.
//변수에 두자리 숫자(10~99)가 있을 때
//10의 자리와 1의 자리가 같은 수인지 판단
//
//문제 9번.
//사각형의 한쪽 모서리 x1:10, y1:20
//대각선 모서리       x2:90, y2:100
//이럴 때 새로운 점 x3, y3는 사각형에 포함되는가?

		
		
		
		int x1  = 10;
		int y1  = 20;
		
		int x2 = 90;
		int y2 = 100;
		
		int x3 = 70;
		int y3 = 50;
		
		if(x3 >=x1&&x3<=x2&& y3 >= y1 && y3 <=y2) {
			System.out.println("들어갔다");
		}
		
		else {
			System.out.println("안들어갔다");
		}
		
		   
        for(int i =1; i<=5;  i++) {
        	for(int s = 1; s<=i; s++)
       	  System.out.print(i);
        }
		
		
		
		
		

	}

}
