package sec01.exam01;

public class RefExam {

	public static void main(String[] args) {
		
		
		
		int a = 10;
		int b = a;
		
		System.out.println(a+","+b);
		
		b = 12;
		System.out.println(a+","+b);
		
		
		String c = "하용군";
		// = 을 기준으로 오른쪽이 먼저 실행된다 
		// "하용군"을 힙 heap 영역에 비어있는 번지에 할당(놓기)
		// 스택stack 영역의 변수 c에 방금 그 번지를 저장
		
		System.out.println("c:"+ c);
		
		System.out.println(a == b); // 값이 다르기때문에 
		// == 또는 != 는 무조건 stack의 값을 비교한다
		
		String d = new String("하용군"); // 새로운 주소에 하용군을 넣어라 라는뜻
		
		System.out.println(c==d);// 주소끼리 비교해서 false
		
        System.out.println(c.equals(d)); // equals 안에 있는내용 비교
        // string 값 비교는 무조건 equals() 사용한다
        
        
        String e = d;//d의 값을 e에 넣어라
        System.out.println(e==d); // 같음 
        
        
        String f = "하"+"용군";
        System.out.println("c==f:"+(c==f));
        
        //a = null;
        //기본 타입에는 null을 넣을 수 없다
        // 참조 타입에는 null을 넣을 수있다
        
        // null은 참조하는 주소가 없는 상태
        String g = "휴먼";
        System.out.println("g==null:"+(g== null));
        System.out.println("g==null:"+(g!= null));
        
        String h = ""; //이건 빈칸 null이 아님
       
        System.out.println("h==null:"+(h== null));

	    g =  null;
	    System.out.println("g==null:"+(g== null));
	    
	    System.out.println("g+\"abc\":"+(a+"abc"));
	    
	    System.out.println(h.equals(g));
	    if(g !=null) { //방어 코딩
	    
	    System.out.println(g.equals(h));
	    }
	    
	
	    
	    
	    
	}

}
