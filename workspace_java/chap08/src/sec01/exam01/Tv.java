package sec01.exam01;

public class Tv extends Display implements RemoteControl, OTT {
	
	int vol;

	@Override
	public void tornOn() {
		System.out.println("TV 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV 끕니다");
		}
		
	

	@Override
	public void setVolume(int vol) {
		if(vol > RemoteControl.MAX_VOLUME) {
			System.out.println(RemoteControl.MAX_VOLUME +"이하만 가능");
		}else if (vol < RemoteControl.MIN_VOLUME) {
			System.out.println(RemoteControl.MIN_VOLUME +"이상만 가능");
		}else {
		this.vol = vol;
	}
		if(vol > RemoteControl.MAX_VOLUME) vol = RemoteControl.MAX_VOLUME;
		else if(vol > RemoteControl.MIN_VOLUME) vol = RemoteControl.MIN_VOLUME;
	
		this.vol = vol;
	}

	@Override
	public void netflix() {
		System.out.println("넷플릭스 시청");
		
	}
}
