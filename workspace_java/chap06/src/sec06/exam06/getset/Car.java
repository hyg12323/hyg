package sec06.exam06.getset;

public class Car {
 
	// 필드는 private으로 지정해서
	//직접 읽고 쓰는걸 방지
  private	int speed;
  private  boolean stop;
  
  private String color;
  private double gas;
	
  public String getColor() {
	return color;
}


// 이렇게 맘대로 만들어도 되는데
  public int test() {
	  return this.speed;
  }
  
  //getset
  //보통 필드 값을 돌려주는 기능
  //메소드명 : get +필드명(대문자로 시작)
  // 전달인자 : 없음
  // 리턴타입 : 필드의 타입
  
  
  //보통 필드 값을 수정한는 기능
  // 메소드명: set +필드명 (대문자로 시작)
  // 전달인자 : 필드의 타입
  // 리턴타입 : void
  
  
  void setSpeed(int speed) {
	  if(speed >= 0) {
	  
	  this.speed = speed;
  }
  }
  //getter 중에서 boolean 타입의 경우
  //get 대신 is 사용하기도 함
  //getStop, isStop 둘다 허용인데
  // 일부에서는 get만 사용 가능하는 경우가 있다
  public boolean isStop() {
	  return this.stop;
  }
  public boolean getStop() {
	  return this.stop;
  }
  
  // 자동 완성된 getter/setter
  public void setStop(boolean stop) {
	  
  }
  public void setColor(String color) {
	  this.color = color;
  }
  
  public double getGas() {
	  return gas;
  }
  
  public void setGas(double gas) {
	  this.gas = gas;
  }
  
  public int getSpeed() {
	  return speed;
  }
    
  
}
