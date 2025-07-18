package sec02.exam01;

public class ParentEaxm {

	public static void main(String[] args) {
		
		
	Parent1_1_1 p1_1_1 = new Parent1_1_1();
	Parent1_1 p1_1 = (Parent1_1)p1_1_1;
	p1_1 = p1_1_1; //형 변환 생략 가능
	
	Parent1 p1 = p1_1;
	p1 = p1_1_1;
	
	Parent1 pp1 = new Parent1_1_1();
	
	/////////////////////////////
	
	Parent1_2 p1_2 = new Parent1_2();
	Parent1 ppp1 = p1_2;
//	pp1 = p1_2; 가능
	
	// 자식이 부모가 될대는 생략가능
	// 부모가 자식이 될대는 
	//형 변환 연산자 생략 불가능(Parent1_2)붙임
	Parent1_2 pp1_2 = (Parent1_2)ppp1;
	//형변환이 형제끼리는 불가능 에러뜸
	// 런타임 runtime 오류 : 실행해봐야 아는 것
//	Parent1_2 ppp1_2 = (Parent1_2)pp1;
	String a = null;
	System.out.println(a.length());
	}
}
