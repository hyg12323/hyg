package qulz;

public class Fruit {
	String fname;
	String[] fu = new String[]{"사과","귤","복숭아","바나나"};
	int[] pr = new int[] {1000,2000,3000,4000};
	int[] ge = new int[] {1,2,3,4};
	
	
	
	
	Fruit(){
	 fname = "상한과일가게";		
	}
	
	
	// 전체 목록 출력(void)
	void wa() {
		System.out.println("--과일목록--");	
		for(int i= 0; i<fu.length; i++) {
			
		System.out.println(fu[i]+" 가격"+pr[i]+" 재고"+ge[i]);
			
		}
			
		System.out.println();
		
	}
	
	// 가격 문의
	String wd (String a) {
		for(int i= 0; i <fu.length; i++) {
			
			if(fu[i].equals(a)) {
				System.out.println("가격"+pr[i]);
				System.out.println("재고"+ge[i]);
				return fu[i];
			}
		}
	     return "없음";
	}	
	
	// 거스름돈
	int wb (int a) {
		for(int i= 0; i <fu.length; i++) {
		if(fu[i].equals(a)) {
			
			System.out.println();
			return ;
		}
		     return 11; 	
		}
		
	}
	
	
	
	
}
