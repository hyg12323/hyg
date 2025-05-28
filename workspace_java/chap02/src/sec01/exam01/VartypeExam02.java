package sec01.exam01;

public class VartypeExam02 {

	public static void main(String[] args) {
	
		
		byte b1;
		b1 = 127;
		System.out.println("b1: " + b1);
		b1 = 127;
        // b1 = 128; 불가능 byte 가 127까지밖에 못담기때문 
        
		char c1 = 65;
		System.out.println("c1:"+c1);
		
		c1 = 65 + 2;
		System.out.println("c1:"+c1);
	
	    
		
		char c2 = 'F';   // char 타입만 '' 홀따옴표 씀
        System.out.println("c2:"+c2);
        System.out.println("c1-c2:"+(c2-c1));

	
	   char c3 = '한' ;
	   System.out.println("c3:"+c3);
	   
	   System.out.println("c3:"+(c3+1));
	
	   String s1 = "하용군";
	   
	   System.out.println("s1:" + s1 );
	   
	  String s2 = "하\"용군";    // \(역슬래쉬)"쌍따옴표 넣기
	  System.out.println("s2:"+s2);
	  
	  
	  String s3 = "하\t용\n군";   //  \t는 텝 만큼띄우는 기능 \n은 엔터해주는기능
      System.out.println("s3:"+s3);	
	
	
	  s3 = s3 + "\n글씨"+3+2 + (3+2);   //가로치면 먼저계산
	  System.out.println("s3:"+s3);
	
	
      String s4 = 3+2+"글씨";  // = 기준으로 오른쪽부터 계산
      System.out.println("s4:"+s4);
	
      
      int i = 2100000000;
 //   int i = 2200000000;  불가능 int는 21억까지밖에 안됨
      
      long l1 = 2200000000L;   // 롱은 l을 뒤에 붙여줘야한다 기본값이 int임
      
      long l2 = 123;    // int(21억)보다 작은수는 l을 붙여도되고 안붙여도 됨
	
      float f1 = 3.14f;	
      System.out.println("f1:"+f1);
      double d1 = 3.14;
	  System.out.println("d1:"+d1);
	  
	  float f2 = 0.1234567890123f;   // 플루트는 8자리까지만인식 마지막8자리는 반올림해버림  
	  System.out.println("f2:"+f2);  // float의 정밀도 : 소수점 7자리
	  
	  double d2 = 0.12345678901234567890; //더블은 소수점 16자리까지만 인식 마지막 16자리는 반올림
	  System.out.println("d2:"+d2);  
	  
	 // double i10 = 5e2 // 자바에서 승을 말할때
	  
	  
	  boolean stop = true;                            //블리언		  
	  boolean start = false;        // 참과 거짓을 저장하는 타입(논리타입)		  

	
	  //1.내 나이를 저장 하시오 
	//  age
	  int age = 29;
	 System.out.println("age:"+age);		  
			  
	//2. 내 소유 차가 있다		  
	 boolean car = true;    
   	 System.out.println("car:"+car );
 	 
	 
	//3.  내 이름 
     String name = "하용군";
     System.out.println("name:"+name);
   	
	//4. 1평은 3.3제곱미터입니다. 5평은?
     double area = 5 * 3.3;
	 System.out.println("area:"+area);
	
	// 퀴즈 0
	/*
	 * 두 변수 a, b에 각각 3, 4를 넣고
	 * "3과 4" 단 변수를 활용해서   
	 */
	int a = 3;
	int b = 4;
	
	System.out.println(a+"과"+b);
	 		

	
	System.out.println(a+">"+b+"결과는"+(a>b)+"입니다");
	

	 
	{  a = 6;
		   b = 5;
		 
		 
	     System.out.println(a+">"+b+"결과는"+(a>b)+"입니다"); } 
		
	
	
	//퀴즈 1
	/*
	 * 1-1 : 두 변수 a, b에 각각 3, 4를 넣고  
	 출력 결과 : "3>4의 결과는 false입니다"
	   1-2 : 두 변수의 값을 6,5 변경
	  출력 결과 : "6 > 5의 결과는 true입니다" 
	 */
   //  System.out.println(a>b); 
     
 
     
     
     //퀴즈 2
     /*
      * 숫자 132
      * 출력 결과
      * "백의 자리 : 5"
      * "십의 자리 : 3"
      * "일의 자리 : 7"
      */
  /*  int g = 537;
	int g1 = g / 100;
	int g2 = g /
	System.out.println("백의 자리"+g1);
    
    */
    int g1 = 537;
    int g2 = 537/100;
      System.out.println(g2);
    
   //  System.out.println("백의자리"+(g/100)");
     
     
     
     
     
     
     
 	/* 퀴즈 3
	 * 두변수 h, m에 각각 시간과 분을 넣습니다
	 * +35분 한 결과를 출력
	 */
	
	
     // user + info
	// 카멜케이스 comel case
    // userInto : 카멜케이스 comel case
    // user_info : snake case
    // user-info : 캐밥 kebab case
	// nUseInfo, sUserInfo : 헝가리언 표기법
    	
	

    
    /*총 생일파티 비용이 12.9만원이고, 참석자는 총 5명입니다.
    단, 주최자는 마지막에 계산하고, 참석자는 5천원 단위로 납부합니다.

    1인당 정확한 금액은?

    참석자들은 5천원 단위로 얼마씩 낼까?

    주최자는 얼마를 부담해야 하나?  */
    
    
    double ten = 12.9;
    int tot   = 5;
    double to2  = (12.9/tot)*10;
    
    System.out.println(to2); 
    int to3 = (int)to2*1000 ;
    int to4 = to3 * 4;      
    
    System.out.println(ten/tot*10000);
    
    System.out.println(to3);
    
    
    double to5 = ten*10000;
    System.out.println(to5-to4);		
    
  
    
    double total = 4.3;  //토탈 변수를 4.3 으로만듬
    int count = 4;
    double result1 = total / (double)count;
    System.out.println("1번:"+(result1*10000)); //4.3만원이여서 *10000함
    
    int result2 =(int)result1;    // 새로운변수  만원으로 딱 떨어지기 위해 int
    System.out.println("2번:"+result2*10000);
    
    double result3 = total-((count -1)*result2); //double쓰는이유는total이 4.3 
	 System.out.println("3번:"+(Math.ceil(result3*10000)));  //math.ceil은 올림 소수점
    
    
    
    
    
	
	}    

	
	
}
