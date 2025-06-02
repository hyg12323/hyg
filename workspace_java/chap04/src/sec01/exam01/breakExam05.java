package sec01.exam01;

import java.util.Scanner;

public class breakExam05 {

	public static void main(String[] args) {

		
		
		System.out.println("게임을 시작하지");
		int count = 0;
		while(true) {
			int num =(int) (Math.random()*6) +1;
			System.out.println("주사위:"+num);

		if(num ==6) {
			break;
		}
		count++;
			
			
		}
		System.out.println("게임 종료:총:"+count);
        for(int i=1; i<10; i++) {
        	System.out.println(i);
        	if(i>=5) {  //혹시 몰라서 >= 써야함 습관화
        		break;
        	}
        }
		
		for(int i=0; i<5; i++) {
			System.out.println("i:"+i);
			
			for(int j=0; j<20; j++) {
				System.out.println("j:"+j);
				if(j >=2) {
					System.out.println("break");
					break;
				}
			}
		}
		boolean isStop = false; 
		  // 총 5명이 순차적으로 게임 시작
		for(int i=1; i<=5; i++) {
			// 한명 당 주사위 3번씩 던지기
			for(int j=1; j<=3; j++) {
				int num2 = (int)(Math.random()*6)+1;
				System.out.println("주사위:"+num2);
		
				//만약 6이 나오면 전체 게임 종료, 다음 사람으로 넘어감
				if(num2==6) {
					isStop = true;
					break;
					
				}
				
				
				
			}
			if(isStop) {
				break;// 전체적으로 6이 나오면 멈춤
			}
			
			
		}
		
		
		for(int i=1; i<=10; i++){
			if(i%2==0) {          //짝수 일 때만 출력해라
				System.out.println(i);
			}
		}
		for(int i=1; i<=10; i++){
			if(i%2!=0) {
				continue;   // 홀수 일때는 건너 뛰어라
				
			}System.out.println(i);
		}
		
		//int a = integer.parseint(문자) 
		
	//while 
	/* 문제 1
	 * 특정 수(0)가 오기 전까지 반복
	 * 수를 입력하세요
	 * -3 음수
	 * 나머지는 "양수"	
	 */
	
	Scanner scan = new Scanner(System.in);
//	int i =1; 
//	
//	while (i!=0) {
//		System.out.println("수를 입력하세요");
//		i = scan.nextInt();
//		
//		if (i >0 ) {
//		System.out.println("양수");
//		
//		}
//		 else if (i <0 ) {
//			System.out.println("음수");
//			 
//			}
//		
//		 else if(i ==0 ) {	
//			System.out.println("경고 멈춤니다");
//			
//			}
//		
//		
//		
//	}
		
		
		
		
		
	/* 문제 2
	 * 월을 입력하면 계절이 나오고 
	 * 0을 입력하면 종료	
	 */
	
	/* 문제4
	 * 은행에서 1. 예금 2. 출금 3. 잔고확인 4. 종료	
	 * 조건 예금할 때 음수 불가
	 * 출금할 때 음수 불가, 잔고보다 큰 금액 불가
	 */
	
		
	/*
	int c = 1;
	while (c!=0) { 
		System.out.println("월을입력해주세요");
		
		  c = scan.nextInt();
		
		if(c<=3&& c>0) {
		System.out.println("봄입니다");
		
	}
		else if(c<=6&& c>0) {
			System.out.println("여름입니다");
			
		}
		else if(c<=9&& c>0) {
			System.out.println("가을입니다");
			
		}
		else if(c<=12&& c>0) {
			System.out.println("겨울입니다");
			
		}
		else if(c==0) {
			System.out.println("종료입니다");
			break;
			
		} */
		
		
		 
//	} 
		
	/* 문제 3
	 * 가위바위보게임 0이 입력 될 때 까지 반복
//	 */
//	int t =(int)(Math.random()*4);
//	while(t!=0) {  
//		
//		t++;
//		if(t==0) {
//			System.out.println("주사위2"+t);
//			
//		}
//	}		

	System.out.println("------");
	
	int t1= 1;

    while (true) {
        t1 = (int)(Math.random() * 4); 
        System.out.println (t1);

        if (t1 == 0) {
            System.out.println("이라서멈춥니다.");
            break;  
        }
    }
	
    /* 문제4
	 * 은행에서 1. 예금 2. 출금 3. 잔고확인 4. 종료	
	 * 조건 예금할 때 음수 불가
	 * 출금할 때 음수 불가, 잔고보다 큰 금액 불가
	 */
    
    int a=2 ;
    
    int b= 1;
    int d= 3;
    int e= 10000;
    
    System.out.println("안녕하세요");
    System.out.println("출금1번 예금2번");
    System.out.println("3번 잔고확인");
    System.out.println("4번 종료");
    while(b <=1) {
    	
    	b = scan.nextInt();   
    	
    	if(b==2){
        	System.out.println("입금 할 잔액을 입력하세요");
    	}
    	
    	
    	if(b==1){
        	System.out.println("출금 할 잔액을 입력하세요");
        	
        }
    	e = scan.nextInt(); 
    	
    	
        
    	
    	
    		
    		int c = e-10000;
    
    if (b==1&&e>=0&& e<=10000){
    	System.out.println(e+"를출금합니다"+c+"남은금액");
    }
    else if  (b==1&&b>=0) { 
    		System.out.println("잔액이 부족합니다");
    	}
   
		int g = 10000+e;
		 
    if (a==2&&g>=0){
    	System.out.println(e+"를입금합니다"+g+"남은금액");
    }a = scan.nextInt();
   
    
    
    
    
	
    }
	
    
    
    

	
	
	
	
	
       

	}
}
