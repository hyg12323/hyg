package qulz;

public class UpDown {
	
	int[] game2 = new int [9];
	 
	
	
	// 정답 6
	// updown 맞는지
	// 메소드명 game
	// 전달인자 int
	// 리턴타입 boolean
	
	
	
			
			
			
	    boolean game(int[] game){
		for(int i =0; i<game.length; i++) {
		
		if( game[i]==6 ) {
         System.out.println("참입니다 :"+ i+1);			
			return true;
		}
		else {
			System.out.println("아닙니다");
		}
	}
	return false;  
	
	}
}
