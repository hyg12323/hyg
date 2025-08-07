package sec01.exam01;

public class RemoconEaxm {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.setVolume(11);
		System.out.println(tv.vol);

		RemoteControl rc1 = (RemoteControl)tv;
		RemoteControl rc2 = tv;
		powerOn(tv);
	}
//         new RemoteControl(); 추상클레스라 뉴안됨
	static void powerOn(RemoteControl rc) {
		rc.tornOn();
	}
}
