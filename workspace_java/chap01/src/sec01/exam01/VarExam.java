package sec01.exam01;

public class VarExam {

	public static void main(String[] args) {

		
		int value; // 변수 선언
		//변수의 값 넣기
		value = 5;
		value = 6; // 덮어쓰기
		System.out.println(value);
		
		int result = value + 10;
		
		System.out.println(result);
	   
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간"+ minute + "분");
		
	     
		value = value + 1;
		System.out.println("value: "+value);
		
		// 이클립스 단축기
		/* 
		 * 한줄 지우기 : ctrl + d
		 * 한줄 복사   : ctrl + alt + 위아래 방향기
		 * 주석 단축기 : ctrl + /
		 * 자동 정렬   : ctrl + shift +f
		 
		  한줄 이동   : Alt + 위아래 방향기  */
		//변수 a를 선언과 동시에 10으로 초기화
		int a = 10;
		int b; // 변수 선언
//	     System.out.println(b);
		
//		System.out.println(x);  읽을수 없음 -> 위에서 아래로 인식 
		int x = 10;
		int y = x;
		// int x = 10000; --안됨
		
		System.out.println(x);
		{
			System.out.println(x);
			int z = 5;
			System.out.println("z: "+z);
		}
	//	int z = 55   // 여기는 중가로 밖이라 됨
		//System.out.println("z: "+z); -- 인식안됨 중가로안에만 허용가능(로컬 변수)
          
		
		int x1 = 26845;
		  
		int x2 = 684684;
          		
		
		System.out.println(x1);
		/*  
		 * 
		 */
		System.out.println("x1 : "+ x1); // 684684
		System.out.println("x2 : "+ x2); // 26845
		
////		{
//		{int x1 = 26845;
//		
//		int x2 = 684684;} 
//	    int x1 = 684684;
//	    int x2 = 26845; 		
//	    System.out.println("x1 : "+ x1); // 684684
//		System.out.println("x2 : "+ x2); // 26845
//		}
	
		
/*		int x1 = 26845;
		  x1 = 684684;
		int x2 = 684684;
          x2 = 26845;
	   */	
		
	//	int x1 =256845  
		//		x1 = x2
		//		System.out.println(x2)
			//	(int x1 = )
		
		
//		if (x1 < x2) {
//		    int temp = x1;
//		    x1 = x2;
//		    x2 = temp; 
		
	//	System.out.println("x1 : " + x1); // 큰 값

		//System.out.println("x2 : " + x2);
	
		
		
		
}
}
