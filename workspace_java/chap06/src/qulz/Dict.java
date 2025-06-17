package qulz;

public class Dict {

//	전자사전
//	단어 Eo2En(영단어)
//	영단어 Ko2En(단어)
//
//	String[] en = (love, hate, devil, angel)
//	String[] ko = (사랑, 증오, 악마, 천사
	
    String[] en  =  new String[] {"love", "hate", "devil", "angel"};
    String[] ko  =  new String[] {"사랑", "증오", "악마", "천사"};
       
      String abc (String a ){
     	  
    	    
    	  for (int i =0; i < en.length; i++) {
    		  if (a.equals(en[i]))  {
    			  return ko[i];
    		  }	    
    	//		  System.out.println(en[i]);
    		  		 
    	  }return "없음"; 
    	  } 
        
          }	  

//      }
//  

       
        
          


  
     
	
	

