package qulz;

public class Dict2 {

	
	String[] en  =  new String[] {"love", "hate", "devil", "angel"};
    String[] ko  =  new String[] {"사랑", "증오", "악마", "천사"};
    
    //영어로 한국어로 번역하는 메소드
    // 메소드명 : en2ko
    // 전달인자 : String 영단어
    // 리턴타입 : String 영단어
	
    String en2ko(String word) {                          // 메소드
        for(int i =0; i<en.length; i++) {
        //	if(word != null && word.equals(en[i]))  {    &&의 경우 앞에서부터 순서대로 거짓을 찾기때문에
            if(en[i].equals(word)) {                      //하나라도 거짓이면 종료
              System.out.println("같은거 찾음:"+i);                   // or 하나라도 참이면 다른거안찾음 	 
              return ko[i];
             }
            
            
        
                 	
    } 
        return"없는 단어";
	
}
}