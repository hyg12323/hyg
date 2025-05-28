package sec01.exam01;

import java.util.Scanner;

public class KeyCodeExam {

	public static void main(String[] args) {
		
		
		
		System.out.println(1); // 실행되고 엔터
		System.out.println(2); 
		
		System.out.print(3); //엔터없이 옆에붙어서 나옴 
		System.out.print(4);
	    
		System.out.println(); // 엔터 기능
		System.out.println(5);
		System.out.println(6);
		
		//토글 누르면 선택된 파일로 켜지고 다시누르면 꺼짐
		System.out.printf("나이:%d",25);
		System.out.println();
		System.out.printf("이름:%s","감자바");
		
		
		System.out.printf("이름:%s,나이:%d","감자바",25);
		System.out.println();
		
		System.out.printf("이름:%6s,나이:%04d","감자바",25);
		System.out.println();
		//System.out.println("이름:" + name +",나이:"+age);
        
		// 입력
		int keyCode;
	
		
		
		
		/* Scanner 연습하려고 주석 처리	
		try {
			
			
			keyCode = System.in.read();
			
			System.out.println("keyCode:"+keyCode);
			
			keyCode = System.in.read();
			
			System.out.println("keyCode:"+keyCode);
			
			keyCode = System.in.read();
			
			
			System.out.println("keyCode:"+keyCode);
			
			keyCode = System.in.read();
			
			System.out.println("keyCode:"+keyCode);
			
			keyCode = System.in.read();
			
			System.out.println("keyCode:"+keyCode);
		} catch (IOException e) { // try 안에 catch는 에러잡는용
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  */
	     	
  
	       
		Scanner scan = new Scanner(System.in);   //빨간줄없애기 컨트롤+ 쉬프트+ 영어 o또는 마우스 첫번쨰
		//엔터까지의 모든 글씨
	    
		String inputDate = scan.nextLine();		
   //   String inputData = "a";
		System.out.println("inputDate:"+inputDate);
	    
	    //엔터쳤을 떄 띄어쓰기까지의 모든 글씨 
	    String inputDate2 = scan.next();
	    System.out.println("inputDate2:"+inputDate2);
	    
	    //엔터쳤을 떄의 숫자
	    int input = scan.nextInt();
	    System.out.println("input:"+(input*10));
		
	    System.out.print("x값을 입력하시오:");
		int input2 = scan.nextInt();
		System.out.println("입력한 x값:"+input2);
		 
	   	
		 
		 
	
	}

}
