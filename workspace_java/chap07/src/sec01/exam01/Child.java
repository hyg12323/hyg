package sec01.exam01;

public class Child extends Parent{
	
      void printName () {
    	  System.out.println("Child의 printName 실행");
    	  System.out.println("name :"+name);
    	  System.out.println("name :"+this.name);
    	  
    	  String pName = getName();
    	  System.out.println("pName:" + pName);
    	  
      }
      
      //전달인자가 필드를 가리는 현상
      // shadow라고 함 
      // (전달인자 필드 구분하기위해)
   void setName(String name) {
	   this.name = name;
	   
   }
   String name = "Child의 name";
	
}
