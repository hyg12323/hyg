package sec03.exam01;

public abstract class Phone {
 //(추상클래스 선언방법 class앞에 abstract 박으면된다)
	String owner;
	
	Phone(String owner){
		this.owner = owner;
	}

	void turnOn(){
		System.out.println("전원을 킵니다");
	}
	void turnOff(){
		System.out.println("전원을 끕니다");
	}
}
