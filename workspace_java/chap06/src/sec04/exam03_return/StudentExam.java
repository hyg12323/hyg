package sec04.exam03_return;

public class StudentExam {
	public static void main(String[] args) {
	
		
		
	Student st	=  new Student();
	st.sname = "하용군";
	st.age =  29; 
	System.out.println("학생이름:"+st.sname+"  나이"+st.age);
	
	
	Student st2	=  new Student();
	st2.sname = "김동현";
	st2.age = 30;

	System.out.println("학생이름:"+st2.sname+"  나이"+st2.age);   // 드래그 ctrl +f  
	
	
	
	st.setName("박춘보");
	System.out.println(st.sname); // void 값
	
	String name = st.getName();
	System.out.println("name:"+name);
	
	
	
	}	
}
      