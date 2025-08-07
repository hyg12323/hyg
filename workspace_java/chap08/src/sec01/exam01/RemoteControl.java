package sec01.exam01;


// new 못함
public interface RemoteControl {

	public static final int MAX_VOLUME = 10;
	// 모든 필드는 static final 이다
	// 그래서 생략 가능하다
	public int MIN_VOLUME = 0;
	
	public abstract void tornOn();
	// 기본적으로 메소드는 abstract(추상)메소드다
	// 그래서 생략 가능하다~!
	public void turnOff();
	public void setVolume(int vol);
	
	default void mic(String text) {
		
	}
	
}
