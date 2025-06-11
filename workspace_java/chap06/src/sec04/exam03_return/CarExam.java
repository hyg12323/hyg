package sec04.exam03_return;

public class CarExam {
	
	public static void main(String[] args) {
	
		
		
		
		Car car = new Car();
		boolean status = car.isLeftGas();
		System.out.println("가스 남았나?"+status);
		car.gas =3;
		car.setgas(3);
		
		status = car.isLeftGas();
		System.out.println("가스 남았나?"+status);
		
		if(status) {
			System.out.println("출발~!");
			car.run();
		
		
		}

  		Car2 c2 = new Car2();
  		c2.setgas(3);
  		c2.run();
		
		
		
}
}