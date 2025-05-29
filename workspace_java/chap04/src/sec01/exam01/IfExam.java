package sec01.exam01;

public class IfExam {

	public static void main(String[] args) {
		
	int score = 60;
	
	if(score >= 90) { 
     System.out.println("90 이상입니다");
     System.out.println("A 등급");
     
		}
		
	if(!(score >= 90)) {   /// 전개식 ! 안에 들어가는게
	     System.out.println("90 미만입니다");
	     System.out.println("B 등급");
	}
		
	
	if(score >= 90) { 
	     System.out.println("90 이상입니다");
	     System.out.println("A 등급");
	     
	}	else { 
		     System.out.println("90 미만입니다");
		     System.out.println("B 등급");
    }
		
	
	if(score >= 90) { 
	     System.out.println("90 이상입니다");
	//   else if(score < 90 && score >= 80)  
	     System.out.println("A 등급");
	     
	}	else { 
		     System.out.println("90 미만입니다");
		     System.out.println("B 등급");
   }
	
	   
	
	
	
	 if(score >=90) {
		 System.out.println("A등급");
	 }
	 else if(score >=80) {
		 System.out.println("B등급");
	 }
	 
	 else if(score >=70) {
		 System.out.println("C등급");
	 }
	 else  {  // else가 있다는 건 무조건 하나의 실행 블럭이 실행 된다
		 System.out.println("D등급");
	 } 
	
	
	score = 94;
	if (score >= 95) {
		System.out.println("95점 이상");
	}
	else if(score >= 90) {
		System.out.println("90점 이상");
	}
    if (score >=90) {
    	System.out.println("90점 이상");
    }
    if(score >=90) {
    	System.out.println("95점 이상");
    }

    int x = 3;
   if(x%2 == 0){
     System.out.println("짝수");
    } 
 // else if(x%2 != 0) {
   else if(x%2 == 1) { 
   System.out.println("홀수");
    }
    
    
      ///////////////////////
   //// random
   double random1 = Math.random();
   System.out.println(random1);
   
 // math.random()
 // 0 <= math.random() < 1
 // 주사위 : 1-6
 // 0~5로 구해놓고 +1을 해서 1~6까지로 만들겠다
 // 대충 나머지로 구하는 법
 // math.random() *10000 / 6
   // math.random() = 0.123456789
   double random2 = Math.random()*100000;
   // 1234.56789
   // (int)1234.56789 >>1234
   // 1234 % 6 : 0 ~ 5
   // 0 ~ 5 + 1 >>> 1 ~ 6                 
   int dice =((int)random2) % 10 + 1;   //이해하기 힘들면 쪼개서 담으셔요
   System.out.println("주사위:"
   		+ ""+dice );
   
     
   
   if ( dice %3 == 0) {
	   System.out.println("1000원");
   }
   else if(dice *7==0) {
	   System.out.println("500원");
	   
   }
   else if(dice == 5) {
	   System.out.println("복권 당첨");
	   
   }
   else {
	   System.out.println("꽝");
   }
   
   //  3  + 2 = 5
   //  3  + 2 = 5 +10
   //  0*10  < 5*10 < 10*10
   //  0< =  math.random()  < 1
   //  0*6 < =  (0.몇숫자)*6  < 1*6
   //   0  <=   0.몇숫자*6  < 6
   int dice0 = (int)(Math.random()*6);   
        dice = dice0 +1;// 1 ~ 6
        System.out.println("주사위:"+dice0);
	
    // 로또 번호: 1~ 45   >>> 0~44 +1
     int dice45 = (int)(Math.random()*45);  
          dice45 = dice45+1;
          System.out.println("lotto1:"+dice45);
        
        int ww1 =(int)(Math.random() * 5 + 1);  
                
        System.out.println(ww1);
        
     //switch문으로 만들수 있는건 전부 if로 다만들수 있음
     // if 로만들수있는건  swhitch 불가능   
    
        
        int num = 1;
        if(num == 1) {
        	System.out.println("num은 1입니다");
        }	
        else if (num == 2) {
            System.out.println("num은 2입니다");        
        }
        else {        	
            System.out.println("num은 1과 2가 아닙니다");
        }    
        
              //  switch는  사용가능 (char,byte, short, int, string)
              //            사용못함 (boolean,long,float, double)
        switch(num) {
             case 1:
            	 System.out.println("switch num은 1입니다");
            //     break;    //break 없으면 break나오기까지 다나옴
             case 2:
            	 System.out.println("switch num은 2입니다");
            	 break;
             default :
            	 System.out.println("switch num은 1과 2가 아닙니다");
            	 break;}
           int month =1;
     
        
        
        
                 
           switch(month) {
               case 3:
               case 4:                            //브레이크전까지 넘김
               case 5:
            	   System.out.println("봄");
            	   break;  
               case 6:
            	   System.out.println("여름");
            	   break;  
               case 7:
            	   System.out.println("여름");
            	   break;  
               case 8:
            	   System.out.println("여름");
            	   break;  
               case 9:
            	   System.out.println("가을");
            	   break;  
           } 
            
            	  int month2 = 11;
                   
                               
                   if( 3 >= month2  && month2 <=5) {
                   	System.out.println(" 봄 입니다");
                   }
                   if( 6 >= month2  && month2 <=8 ) {
                   	System.out.println(" 여름 입니다");
                   }
                   if( 9 >= month2  && month2 <=11) {
                        	System.out.println(" 가을 입니다");	
                   }     	
                  	else {    	 
                        System.out.println("겨울 입니다");
                  }     
               
                   
                   int i = 10;
                   if(i > 5) {
                	   System.out.println("5보다 크다");
                   }
                   
                   if(i > 5) {
                	   System.out.println("5보다 크다");
                   }	       
     
                   if(i < 0)  i = 0; 
                	   
                  
        /*          if(i > 50)
                	  System.out.println("50보다 크다");
                  System.out.println("50보다 크다"); 
                  System.out.println("양수");
        
                 if(i>0)
                	 System.out.println("양수")  */
        
        
        
                	  
                   
         /*       int sum = 0;
                for(int i = 1; i<=100; i++) {
                	sum = sum + i;
                }
                System.out.println(sum);  */
                   
                   
             // 문제 1
             // int 변수에 임의의 수를 넣고
             // 그 수가 "양수", "0", "음수" 구분하여 출력
              
                   
                
                int m1 = 0;
                
                if(m1 > 0) {
                	System.out.println("양수");
                }
                if(m1 < 0) {
                	System.out.println("음수");
                }
                if(m1 == 0) {
                	System.out.println("0");
                }   
                   
                   
                   
                   
                   
                   
         /*      double tt = (Math.random())  ;
               
                System.out.println(tt);
               
               int tt1 = (int)(Math.random()*10000+1);
                System.out.println(tt1
                		);    
                if(tt < 0 && tt1 <0) { 
                   	System.out.println("음수:"+tt);
                }
                else(tt < 0 && tt1 <0){
              
                }  */
                  
                   
             // 문제 2.
             //   a와 b 두 수 중에서 큰 값을 출력
                
                 
                int ma = 7;
                int mb = 3;
              
                
                        
                if(ma < mb) {                     
                      System.out.println(mb);                	
                }
                if(ma > mb) {                     
                         System.out.println(ma);                	
                   }     
                
                
                
                
                
                
                
             // 문제 3.
             // 시간과 분이 있을 때
             // 35분이 지난 시간을 출력
                
             //  int m3 = (int)(Math.random()*60+1);
             //     System.out.println(m3);
                
              
              int hh = 25;
              
              int hh2 = hh %24;
              
              int mm = 30+35;
              
             
             
              int mm2 = mm %60;           
             
              
             
              
              
              
              if(hh < 24 && mm <60){
            	  System.out.println(hh+"시"+mm2+"분");
              }
               
              else if(hh > 24 && mm >60) {
            	  System.out.println(hh2+1 +"시"+mm2+"분");
              }      
              else if(hh < 24 && mm >60) {
            	  System.out.println(hh2+1+"시"+mm2+"분");
              }      
              else if(hh > 24 && mm <60) {
            	  System.out.println(hh2+"시"+mm2+"분");
              } 
              
              else if(hh > 24 && mm == 60) {
            	  System.out.println(hh2+1 +"시"+"00분");
              } 
              else if(hh == 24 && mm == 60) {
            	  System.out.println(hh2+1 +"시"+"00분");
              } 
              else if(hh == 24 && mm > 60) {
            	  System.out.println(hh2+1 +"시"+mm2+"분");
              } 
              else if(hh == 24 && mm < 60) {
            	  System.out.println(hh2 +"시"+mm2+"분");
              } 
              
              
             // 문제 4.
             // 어떤수가 15와 20(포함) 사이에 있는가?    		
                
              
          //    int a4 = 16;
            //  int a5 = 20; 	
            		  
                 
              
              
              
              
                	 
             // 문제 5.
             // 통장 잔액이 10000원 있을 떄
             // 출금액에 따라 " 잔액이 부족합니다" , 
            //  "얼마 출금 했고 얼마 남았습니다" 정확히 입력 해주세요"
                		
                
              
              int g1 = 5000;
              int g2 = 10000-g1;
              
              
                   if(g1 > 10000) {
                	   System.out.println("잔액이 부족합니다");
                   }
                  if(g1 <= 10000) {
                	  System.out.println(g1+"출금했구"+g2+"남았습니다" );
                  }
              
              
              
              
              
              
              
              
        
            // 문제 6.
             // 값에 따라 (예를 들어 125) (단 0은 양수+짝수)
            //  "100 보다 큰 수이며, 양수이고, 홀수입니다"  
            //  예를들어 -6
             // "100 보다 작은 수이며, 음수이고, 짝수입니다"
              
                 int e6 =111;
                
                 
                 
                 
                 if(e6%2>0 && e6 >100 && e6 >0) {
                	 System.out.println("100 보다 큰 수이며  양수이고,  홀수입니다");	 
                 }
                 if(e6%2<=0 && e6>100 && e6>0) {
                	 System.out.println("100 보다 큰 수이며  양수이고,  짝수입니다");	 
                 }

                 if(e6%2>0 && e6 <100 && e6>0) {
                	 System.out.println("100 보다 작은 수이며, 양수이며, 홀수입니다");	 
                 }
                 if(e6%2<=0 && e6 < 100 && e6>0) {
                	 System.out.println("100 보다 작은 수이며, 양수이고,짝수입니다");	 
                 }                           
                 if(e6%2<0 && e6 <0 && e6 < 0) {
                	 System.out.println("100 보다 작은 수이며, 음수이며, 홀수입니다");	 
                 }
                 if(e6%2==0 && e6 <0 && e6 <0) {
                	 System.out.println("100 보다 작은 수이며, 음수이고,짝수입니다");	 
                 }                            
                  
                  
                  
                
            //문제 7.
             // 어제 온도, 오늘 온도 변수 두개
             
          //  2, -3       영하 3도
             // 오늘 온도는 영하 3도 입니다. 어제보다 5도 낮습니다
          
           // 문제 8. 
            // 변수에 두자리 숫자(10~99)가 있을 때
            //  10의 자리와 1의 자리가 같은 수인지 판단 
                
                
                
           //문제 9.
            //  사각형의 한쪽 모서리 : x1: 10 y1: 20
            //  대각선 모서리        : x2 : 90, y2 :100    
            //  이럴 때 새로운 점 x3, y3는 사격형에 포함되는가?
	}
        }

	
	
