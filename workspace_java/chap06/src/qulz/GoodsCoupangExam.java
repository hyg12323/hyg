package qulz;

public class GoodsCoupangExam {
       
	
	public static void main(String[] args) {
		
		GoodsCoupang coupang = new GoodsCoupang();
		
		
		Goods g1 =new Goods();
		g1.urlImage = "http://g1";
		g1 name = "우유 2.3l"
        g1.price = 6480;
		coupang.insert(g1);
		
	//	coupang.selectAll();
	// g2 = new GOods();
		Goods g2 =new Goods();
		g2.urlImage = "http://g3";
		g2 name = "이오 10개입"
        g2.price = 3730;
		coupang.insert(g2); // 얕은 복사 
		
		
	}
}
