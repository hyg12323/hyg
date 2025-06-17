package qulz;

import java.util.Scanner;

public class testcoffee {

	public static void main(String[] args) {


		
		  Scanner scan = new Scanner(System.in);
		   int menu = -1;
		   while(menu != 0) {

		       System.out.println("메뉴를 고르시오");
		       System.out.println("1: 커피,  0:종료");
		       

		       menu = scan.nextInt();
		       System.out.println("종류 선택해주세요");
		       System.out.println( " 1: 아메리카노 , 2:바닐라라떼원 3: 카페모카 ,0:종료");
		       
		       
		        menu = scan.nextInt();
		       if (menu == 1) {
		       System.out.println(" 아메리카노 드릴게요 ");
		   
		       } else if (menu == 2) {
                 
		    	   System.out.println(" 바닐라라떼 드릴게요");
		    	   
		       } else if (menu == 3) {
	                 
		    	   System.out.println(" 카페모카 드릴게요");
		        
		    	   
		            	   
		    	   
		    	   
		       } else if (menu == 0) {
		       System.out.println("주문을 종료합니다");
		   } else {
		       System.out.println("주문을확인하세요");
		   }
		   }
		
		   
		
		
	}

}
