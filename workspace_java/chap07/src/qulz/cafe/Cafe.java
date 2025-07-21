package qulz.cafe;

public class Cafe {

	 Cafe(){
		 super();
	 }
	
 	 
	
	/*
	 * 커피, 가게, 알바생, 디저트 , MD상품,디카페인, 손님
	 * 바닥에 기어다는 개미, 기계에 붙어있는 개미
	 * 티tea, 빨대,컵홀더,가격
	 * 주문,구매,결제,키오스크,돈, 서빙
	 * 바코드, 커피만들기, 설거지
	 */
	
	// 필드
	/*
	 * 가격s + 메뉴s
	 * 가게이름
	 * 비품s
	 * 건물 = null
	 * 직원s
	 * 
	 */
	
	String[] price;
	String name;
	int[] bip;
	String[] human;
	
	//생성자 // 카페 차리기
	/*
	 * 건물명 설정, 직원몇명고용, 
	 * 메뉴+가격 설정(추후 수정 가능).
	 * 가게이름 
	 */
	
        Cafe(String[] price, String name, int[] bip, String[] human) {
        this.price = price;
        this.name = name;
        this.bip = bip;
        this.human = human;
    }
      
	
	//메소드
    /*
     * 주문받기(string,int), 결제하기(int),커피만들기,설거지,일마감
     * 서빙
     */
    
    void order(String menu, int susu) {
        System.out.println("주문받은메뉴:"+menu+",수량:" + susu+"입니다");
    }
    
    void pay(int i) {
    	System.out.println("결제금액"+i+"원 결제되었습니다");
    }
    void make() {
    System.out.println("만드는 중입니다");	
    }
    void clean() {
        System.out.println("설거지 중입니다");	
    }
    void close () {
        System.out.println("영업 마감입니다");	
    }
    void soso() {
    	System.out.println("서빙 중입니다");
    }
   
    
    




}
