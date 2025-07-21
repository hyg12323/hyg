package qulz.cafe;

		import java.util.HashMap;
		import java.util.ArrayList;
public class Cafe2 {

	String building; // 건물명
	String name;     // 가게이름	
	int emp;         // 직원수
	private HashMap menuMap;  // 메뉴: 가격
	
	
	// geter ,seter 사용법
	 HashMap getMenuMap() {
		return this.menuMap;
	}
	void setMenuMap(HashMap menuMap) {
		 this.menuMap = menuMap;
	 }
	
	void putMenu(String menu, int price) {
		 this.menuMap.put(menu, price)
	}
	
	ArrayList list;   // 비품
	int money = -1; // 받아야 하는 돈
	String menu; 
	int count;
//	{
//	    {아아 :3000
//       뜨아 :500   }	
//	}
    
	// 생성자
	Cafe2(String building, String name, int emp, java.util.HashMap menuMap) {
		this.building = building;
		this.name = name;
		this.emp = emp;
		this.menuMap = menuMap;	
	}

	Cafe2(String building, String name) {
		this(building, name, 0, null);
	}

	// 주문받기
	int order(String menu, int count) {
		System.out.println("주문 내역");
		System.out.println("menu :" + menu);
		System.out.println("count :" + count);

		int money = -1;
		/*
		 * {"아아:" 3000 }
		 */

		if (this.menuMap.get(menu) != null) {
			money = (int)this.menuMap.get(menu) * count;
//			this.menu
		}
        this.money = money;
		return money;
	}
	
	//결제하기
	//메소드명: pay
	// 전달인자 : int money
	// 리턴타입 : int 거스름돈
	int pay(int money) {
		if(this.money == -1) {
			// 주문 내역이 없는 상태
			return money;
		}else if( this.money <= money){
			// 받은 금액이 결한 금액 이상
			return money - this.money;
//		} else if(this.money > money){
		} else{
			// 받은 금액이 결제할 금액 미만
			return money;
		}
	}
	// 서빙
	// 메소드명 : serve 
	// 전달인자 : 없음
	// 리턴타입 : void
	void serve() {
		System.out.println("주문하신"+this.menu +","
				+ " "+this.count+"개 나왔습니다");
	}
	void make() {
		System.out.println("우리는" +this.menu+"만드는게 신남");
		// 랜덤으로 커피 결과물 선택
		// 잘만들어진, 조금탄, 연한
		serve();
	}
}
