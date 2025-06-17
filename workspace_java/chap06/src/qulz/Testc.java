package qulz;

public class Testc {

	
	
	
     String coffee;
     int price;
    Testc[] cc = new Testc[4]; 
        	
	  
     
     void aa () {
    	  cc[0] = new  Testc();
    	 cc[0].coffee = "바보";
    	 cc[0].price = 123;
    	 cc[1].coffee = "언니";
    	 cc[1].price = 124;
    	 
     }
     
	 
	
     void soso (String a) {
    	 for(int i = 1; i<cc.length; i++) {
    	 if (a.equals(cc[i].coffee) ) {
    		 System.out.println("아닌데요");
    	 }
    		 
    	 
    	 }
    	 
     }
     
     
	
	
}
