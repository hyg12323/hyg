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
 // 대충 나머지로 구하는 법
 // math.random() *10000 / 6 
   double random2 = Math.random()*10000;
   int dice =((int)random2) % 10 + 1;
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
   
   
   
   

	
	}

}
