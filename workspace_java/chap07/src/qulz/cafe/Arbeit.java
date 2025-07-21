package qulz.cafe;

public class Arbeit {
  
	Cafe cafe;

	Arbeit(Cafe cafe){
		this.cafe = cafe;	
	}

	void work(String menu, int count) {
		if(cafe instanceof Starbucks2) {
			System.out.println("안녕하세요 스타벅스입니다");
		}
		int money = cafe.order(menu, count);  

		if(money == -1) {
			System.out.println("없는 메뉴입니다");
		} else {
			System.out.println("금액은 " + money + " 원입니다");
		}
	}
}