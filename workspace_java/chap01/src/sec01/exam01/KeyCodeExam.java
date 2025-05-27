package sec01.exam01;

public class KeyCodeExam {

	public static void main(String[] args) {
		
		
		
		System.out.println(1); // 실행되고 엔터
		System.out.println(2); 
		
		System.out.print(3); //엔터없이 옆에붙어서 나옴 
		System.out.print(4);
	    
		System.out.println(); // 엔터 기능
		System.out.println(5);
		System.out.println(6);
		
		
		
		
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
