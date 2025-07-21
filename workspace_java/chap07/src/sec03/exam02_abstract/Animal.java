package sec03.exam02_abstract;

public abstract class Animal {
	
	String kind;
	
	void breathe() {
		System.out.println("숨셔 숨셔");
	}
	// 추상 메소드
	// abstract  키워드 붙은 메소드
	// 실행 블럭{} 있으면 안됨!!!@#!#@#@
	// 나는 구현하지 않고 자식에게 구현을 떠넘김
	abstract	void sound();
	
	void love() {
		
	}

}
