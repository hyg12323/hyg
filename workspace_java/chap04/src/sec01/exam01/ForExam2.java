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
			
			if (i !=a ) { 
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
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
