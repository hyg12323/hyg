package sec04.exam03_return;

public class Student {

// string sname = "하용군"; x안됨 컬럼명 같은느낌
  String sname;
  int age;
  
    // 이름값을 전달 받아서 필드에 저장하는 메소드
    // 메소드명: setName 
    // 전달인자: String
    // 리턴타입: void 
  
    // 이름필드의 이름을 돌려주는 메소드
    void setName(String n) {
    	sname = n;
    	return;
    }
     
    // 이름값을 전달 받아서 필드에 저장하는 메소드
    // 메소드명: getName 
    // 전달인자: 없음
    // 리턴타입: String
    String getName() {
    	return sname;
    }
     
 // 이름과 나이를 받아서 저장
    // 메소드명: setInfo 
    // 전달인자: string n, int a
    // 리턴타입: void
    void setInfo(String n, int a) {
    	sname = n;
    	age = a;
    	
    }
//    String[] getInfo() {
     String getInfo() { 
//    	String[] aa {sname, ""+age};
//    	return sname;
//    	return age;
//
    	return sname + ","+age;
    }
    
    
  
  
  
  
  
  



	//필드
	//학생 클래스를 만들고
	//이름과 나이 필드를 만든다
	//학생Exam 클래스를 만들고
	//학생 2명을 각각 등록하고
	//두 학생의 정보를 각각 출력해보세요
	//
	//메소드
	//메소드를 통해서 
	//이름과 나이를 전달해서 저장하기
	//이름과 나이를 돌려받아서 출력하기

    









}




