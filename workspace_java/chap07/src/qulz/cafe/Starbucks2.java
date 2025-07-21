package qulz.cafe;

public class Starbucks2 extends Cafe2{
	
	 Starbucks2(){
		 super("백자빌딩","스벅 천안역점");
		 HashMap map = new HashMap();
		 map.put("아아",4500);
		 map.put("따아",4000);
		 setMenuMap(map);
//		 menuMap.put("참이슬",6000);
	 }
//	 @Override 안됨
//	 void serve(String nick) {
//		 System.out.println(nick +"님~!");
//		 super.serve();
	 
     @Override
	 void make() {
		 System.out.println("우리는"+this.menu+"만드는게 그닥 신나진 않는다");
	    // 랜덤으로 커피 결과물 선택
		 // 잘만들어진, 조금탄, 연한
		 serve();
	 }

}
