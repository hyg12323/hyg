package sec04.exam03_return;

public class Car {

	
	int gas;
	
	void setgas(int g) {
		gas = g;
	}
	
	
	boolean isLeftGas() {
		if(gas == 0 ) {
			System.out.println("gas가 없습니다");
		return false;
		// return 하는 순간에 메소드 종료!
		
	} else {
	
	System.out.println("가스가 있습니다");      // return으로 끝나서 else 안써도됨
	 return true;
	}	
	}


       

            // 만약 주석을 단다면?
         // gas가 0이면 false, 그렇지 않으면 true를 돌려주는 메소드
	boolean isLeftGas2() {
         boolean result = false;
       
       
       if(gas ==0) {
    	   System.out.println("gas가 없습니다");
       }else {
    	   System.out.println("gas가 있습니다");
    	   result = true;
       }
       return result;
       }    
       
       
       boolean isLeftgas3() {
    //	boolean result = (gas != 0);   
    //  return result;
        return gas !=0;
       }
       
       
       void run() {
    	   while(true) {
    		   if(gas > 0 ) {
    			   System.out.println("달립니다! 잔량:"+gas);
    			   gas--;
    		   
    	   }else {
    		   System.out.println("멈춰! 잔량:"+gas);
    	       return;   
    	   }
       }
       
       
              
       
       
       
       
       
       
       
       }

       }
       
       
       
       
       
       