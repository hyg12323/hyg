package sec01.exam01;

public class ForExam {

	public static void main(String[] args) {
		

      		
		
		
		   int ee = 0;                          // 지정
	         for (int i=1; i <=100;i++  ) { // 1시작문 -> 2조건문 
	        	 ee = ee+i;
	         }
	         System.out.println(ee);
	         
		
	/*	
	     int sum1 =0;
	       sum1 = sum1 + 1;
	       sum 1= sum1 + 1;
	       sum 1= sum1 + 1;
	       sum 1= sum1 + 1;
	       sum = sum1 + 1;
	       sum = sum1 + 1;
	       sum = sum1 + 1;
	       sum = sum1 + 1;
	       sum = sum1 + 1;
	       sum = sum1 + 1;
	       sum = sum1 + 1;
	       System.out.println(sum1); */
	         
	         
	       int sum2 = 0;            // i = 3
	        for (int i = 1; i <=10;i=i+1) {
	             sum2 =sum2+1;
	        }
	        System.out.println(sum2)
	        ;
	        
	       
	        int limit = 10;            // i = 3
	        for (int i = 1; i <=10;i=i+1) {
	             sum2 =sum2+i;
	        }
	        System.out.println(sum2)
	        ;  
	        
	        //공식
	        // 1~5까지의 합을 구하는 거 
	        /*int ee = 0;                          // 지정
	         for (int i=1; i <=100;i++  ) { // 1시작문 -> 2조건문 
	        	 ee = ee+i;
	         }
	         System.out.println(ee); 
	         분해해 보자 
	         */
	       
	        
	        
	        
	        int i = 1;
	        int sum = 0;
	        
	        
	        sum = sum +i; // i:1
	        i++;
	        
	        sum = sum +i; // i:2
	        i++;
	        
	        sum = sum +i; 
	        i++;
	         
          	// 구구단 2단을 출력하시오
	        int s2 = 0;
	        for(int e2=2; e2 <=18; e2= e2+2)
	        	s2 = s2+2;
	        System.out.println(s2);
	        
	        
	        
	        
	        
	        
	        // sum = sum +1
	        // sum = sum +2
	        // sum = sum +3
	        
	        
	        
	        /*
	         * 반복문 만드는 원리
	         * 1. 반복 되는 것 찾기
	         *    ctrl +c, v했을 떄 바뀌지 않는 것
	         * 2. 반복 되지 않는 것에서
	         *    규칙(패턴) 찾기
	         *    변수를 활용해서 더 이상 바뀌지 않게 만들기
	         * 3. 시작 조건 파악
	         * 4. 종료 조건 파악 
	         * 
	         * for : 반복 횟수를 아는 경우
	         * while : 반복 횟수를 모르는 경우
	         */
	        int i2 = 1; 
	       
	        System.out.println(i2);
	        i2 = i2 +1;
	        System.out.println(i2);   	         
	        i2 = i2 +1;
	        System.out.println(i2);
	        i2 = i2 +1;
	        
	        for(int i3 = 1; i3 <=3; i3 = i3 +1 ) {
	        	System.out.println(i3);
	        
	        }
	      
	        // 2~10 까지 중 짝수만 출력
	        
	        int i5 = 2;
	        System.out.println(i5);
	        i5 = i5+2;

	        System.out.println(i5);
	        i5 = i5+2;
		
	        System.out.println(i5);
	        i5 = i5+2;
		
	        System.out.println(i5);
	        i5 = i5+2;
	        System.out.println("i5:"+i5);
	        i5 = i5+2;
		
	        
	        for(int i6 = 2; i6 <=10; i6 = i6 +2) {
	        	System.out.println("짝수"+i6);
	        }
	    
	        //10~ 1 출력
	        System.out.println(10);
	        System.out.println(9);
	        int i6 = 10;
	        System.out.println(i6);
	        
	        System.out.println(i6);
	        
	        
	        // 10~ 1 출력
	        // 1~10까지 다음과 같이 출력
	        // 1: 홀수
	        // 2: 짝수
	        // 4. 구구단 2단 출력
	        // 1~10까지 3개씩 옆으로 찍기
	        //     123
	        //     456
	        //     789
	        //     10
 	   	   
		    	
			    	   
	    
	        
	       for(int qq2 = 1; qq2 <=10; qq2 = qq2+1) {
	    	   System.out.println(qq2);
	       }
	       
	       for(int qq3 = 10; qq3 >=1; qq3 = qq3-1) {
	    	   System.out.println(qq3);
	       }
	       
	       for(int qq2 = 1; qq2 <=10; qq2 = qq2+1) {
	    	   System.out.println(qq2);
	    	   if(qq2%2 <=0) {
	    		   System.out.println("짝수");
	    	   }
	    	   else {
	    		   System.out.println("홀수");
	    	   }
	  
	       }    	
	       for(int qq4 = 2; qq4 <=18; qq4= qq4+2)
		  	    	 {System.out.println(qq4);
	    	   
		  	    	 }
	       // 1~10까지 3개씩 옆으로 찍기
	        //     123
	        //     456
	        //     789
	        //     10
	   	   
	       // 1부터 100까지 홀수의 개수
	       // 6번 구구단 전체 출력 (2단부터 9단까지)
	       // 한줄에 1단 씩 출력
	       
	       
	       for(int qq5 = 1;qq5 <=10; qq5 = qq5+1) { 
	    	   if (qq5<= 3) {     
	    		   System.out.print(qq5);
	    		   System.out.print("");}
	    	            
	    System.out.println("1 2 3");
	    System.out.println("4 5 6");
	    int i10 = 1;
	    
	    System.out.println(i10 +""+(i10+1)+""+(i10+2));
	    
	    i10 = i10 + 3;
	    System.out.println(i10 +""+(i10+1)+""+(i10+2));
	    
	    for(int j=1; j<=10; j +=3) {

	    	
	      if(j !=10) {
	    	  System.out.println(j+""+(j+1)+""+(j+2));
	      }
	      else {
	    	  System.out.println(j);
	      }	   
	    }
	      }
	     

	 int i11 = 1;
	 System.out.print(i11+"");
	 if(i11 %3 == 0) {
		 System.out.println();
	 }
	 i11++;      
	 System.out.print(i11+"");
	 i11++;      
	 System.out.print(i11+"");
	 i11++;      
	 System.out.print(i11+"");
	 i11++;      
	 System.out.print(i11+"");
	 i11++;      
	       
	       
	 for(int j=1; j<10; j++) {      
		 System.out.print(j+"");
		 if(j%3 == 0) {
			 System.out.println();
		 } }   
	       
	 // 1부터 100까지 홀수의 개수       
	       
	 int count = 0;
	     for(int j=1; j<=100; j++) {
	    	 if(j %2 !=0) {
	    		 count++;
	    	 }
	     }
	      System.out.println("count:"+count);
	      
	      
	   // 6번 구구단 전체 출력 (2단부터 9단까지)
	     
	      
	   for(int j=1; j<=9; j++) {
		   System.out.println("2x"+j+"="+(2*j));
	   }
	   for(int j=1; j<=9; j++) {
		   System.out.println("3x"+j+"="+(3*j));
	   }   
	   for(int j=1; j<=9; j++) {
		   System.out.println("3x"+j+"="+(3*j));
	   }       
	       
	   for(int k=2; k<=9; k++){
		   for(int j=1; j<=9; j++) {
			   System.out.println(k+"x"+j+"="+(k*j));
		   }
		   
	   }  
	      
	   
	   // 한줄에 1단 씩 출력
	   for(int k=2; k<=9; k++){
		   for(int j=1; j<=9; j++) {
			   System.out.println(k+"x"+j+"="+(k*j)+"");
		    
		   }   
	   }
	    
	   
	   
	   
	   
	   
	   int i23 = 1; 
	   System.out.println(i23);
	   
	   //9 두단씩 옆으로 출력
	//   for(int k=2; k<=9; k++){
		//   for(int j=1; j<=9; j++) {
		//	   System.out.println(k+"x"+j+"="+(k*j)+"");
	   //if (int c= k*2;c<=9;c++){
		 //  System.out.println(c+"");
//	   }
		//0단계
	   
	   /*
	        +
	        +	
		    +
	        +
	        +
	    */	 
	//     System.out.println("+");
	//     System.out.println("+");
	//     System.out.println("+");
	//     System.out.println("+");
	//    System.out.println("+");
	    // 0단계 
	     for(int j=1; j<=5; j++) {
	    	 System.out.println("+");
	     }
		//1단계
	     String mark = "+";
	     for(int j=1; j<=5; j++) {
	    	 System.out.print(mark);
	     }System.out.println();
	    //2단계
	    String space = ".";   
		 for(int j=1; j<=5;j++) {
			 
			 System.out.print(mark+space);
		 }
		 System.out.println();
          for(int j=1; j<=5;j++) {
			 
			 System.out.print(mark);
		 }
          System.out.println();
          for(int j=1; j<=5;j++) {
        	 System.out.print(mark);
 			
 		 }
          System.out.println();
          for(int j=1; j<=5;j++) {
         	 System.out.print(mark);
         }  
           
             System.out.println();
             
             int  mark2 = 11111;
          for(int c2=1;c2<=1;c2= c2+1) {
        	 System.out.print(mark2); 
          }
          System.out.println();  
          System.out.println(mark2*2);
          
      
          System.out.print(mark2*3);
	      
          System.out.println();  
          System.out.print(mark2*4);
          System.out.println();  
          System.out.println(mark2*5);
	   
         
          int  mark3 = 1;
          for(int cc=1; cc<=5; cc++) {
            
        	  
        	  for(int c9=1; c9<=cc; c9++)
        		  	  
        	
        	 System.out.print(mark3*cc);
        	  System.out.println();
        	  
          }
          
                                
          for(int cc=1; cc<=5; cc++) {
            
        	                            
        	  for(int c9=1; c9<=cc; c9++) {
        		  	  
        	
        	 System.out.print(mark);}
        	  System.out.println();
        	  
          }
          
        
          for(int cc=1; cc<=5; cc++) {
            
        	                           
        	  for(int c9=1; c9<=5; c9++) {
        		  	  
        	
        		  System.out.print(cc);}  
        	  System.out.println();         
        	  
          }

          for(int c9=1; c9<=5; c9++) {
		  	  
          	
    		  System.out.print(c9);}
          
          System.out.println();
          
         for(int c9=1; c9<=5; c9++) {
            for(int c10 = 5; c10>=c9; c10--) {
               System.out.print(c9);	
            }
        	System.out.println();
        	 
         }
         //String space = ".";
         
         
         for(int c9=1; c9<=5; c9++) {
        	 
         for(int c10= 1; c10<=c9; c10++) {
        	 System.out.print(mark);       
             }	
         for(int c11=1; c11<=5; c11++) {
        		
         for(int c12=5; c12>=c11; c12--) {
        	 
        	 System.out.print(space); 		
        	
         }
         
         }   
             	 
         System.out.println();
         	
         	 
          }
         
         
	      
         for(int c9=1; c9<=5; c9++) {
        	 
             for(int c10= 1; c10<=c9; c10++) {
            	 System.out.print(mark);
                   
                 }	System.out.println();
          }
              int n = 5;
      	
         	for(int c9=1; c9<=5; c9++) {
        	 
             for(int c10= 1; c10<=c9; c10++) {
            	 System.out.print(mark);
             }
            	 
            	 for(int c11=1; c11<=n-c9; c11++) {
                	 System.out.print(space);
                
           
                	
             }  
            System.out.println();
          
             
             	 
         	}
             
     
         
         
         for(int c = 2; c<=20; c=c+2) {
        	 
        	 System.out.println("2x"+(c/2)+"="+c)
        	 ;
        	 }
          
         for(int c = 2; c<=9; c++) {
        	 for(int c3 =1; c3<=9;  c3++) {
        		 System.out.println(c + "x"+c3+"="+(c*c3));
        	 }
        	 
        	  
        	 ;
        	 }
         
         
         
         for(int c = 1; c<=3;c++) {
        	 for(int c2 =1; c2<=7; c2++) {
        		 System.out.print(c2);
        	 } 
         }
         System.out.println();
         
         
         int c4 = 5;
         
         for(int c= 1; c<=5; c++) {
        	 
        	 System.out.println();
         for(int c2=1; c2<=c; c2++) {
        	 System.out.print(mark);}
         for(int c3=1; c3<=c4-c; c3++) {
        	 System.out.print(space);
          
        	 
        	 
        	 
         }
         
        
         
         }
         
         
         int c5 = 5;
         
         for(int c= 1; c<=5; c++) {
        	 
        	 System.out.println();
         for(int c2=1; c2<=c5-c; c2++) {
        	 System.out.print(space);}
         for(int c3=1; c3<=c*2-1; c3++) {
        	 System.out.print(mark);
         }
         for(int c7=1; c7<=c5-c; c7++) {
        	 System.out.print(space);
         }
          
         }
         System.out.println();
         
         
       //문제 1
       // 주사위 2개를 굴려서 나올 수 있는 모든 조합을 출력하라
       // [1.1][1.2]
     
         System.out.println();
         for(int c=1; c<=6; c++) {
         	
         	for(int c2=1; c2<=6; c2++) {
         	
         	System.out.println();
         	System.out.print(""+c+"."+c2);
         	System.out.print(c+c2);
         	}
         }
         
      //문제 2
      // 주사위 2개의 합 별로 나올 수 있는 조합
      // 합2: [1.1]
      // 합3: [1.2] [2.1]
         	 System.out.println();
             for(int c=1; c<=6; c++) {
             	
             	for(int c2=1; c2<=6; c2++) {
             	
             	System.out.println();
             	System.out.print("["+c+c2+"]");
             	
                 int c3=c+c2;
             		
             	if(c3<=2) {
             		System.out.println();
               	 System.out.print("합2:"+"="+c3);
               	System.out.println();
             	}
             	
             	else if(c3<=3) {
             		
               	 System.out.print("합3"+"="+c3);
               	System.out.println();
             	}
             	
             	else if(c3<=4) {
             		
                  	 System.out.print("합4"+"="+c3);
                  	System.out.println();
                	}
             	
             	
             	
             	
             	//count약자 : cout
             	
             	
             	
             }   	
         
         
         	
         	
         	
         	
         
      //문제 3
      // 합 별 조합의 수 출력
             	
             	
             	
         
         
     //문제 4
      // 순서에 관계 없이 중복 제거
         //순서에 관계 없이 중복 제거
         // 합2: [1.1]
         // 합3: [1.2]와 [2.1]는 같음
         
    
             	
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

}
