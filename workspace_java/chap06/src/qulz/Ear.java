package qulz;

public class Ear {

	
	
	
	
	
	String ename;
	Ear2[] model  = new Ear2[3];
 	
	
	
	
		Ear(String ename){             // 생성자에 이름 넣었음
          this.ename = ename;      //  this 필드랑 매개변수 이름 같으니 필드 저격
             System.out.println(ename);
             model();
		}                        			
//	 this.brand = brand;
//	 this.desian = desian; 
//	}   
		
	  
		void model () {
			
		   model[0] =new Ear2(); 
		   
		   model[0].brand = "apple";
		   model[0].design = "흰색";
		   model[0].sun = "선 없음";
		   model[0].music = "최상";
		   model[0].price =  2200000;
		   model[0].noise =  true;
		   
		   model[1] =new Ear2(); 
		   model[1].brand = "samsung";
		   model[1].design = "검정";
		   model[1].sun = "선 없음";
		   model[1].music = "상";
		   model[1].price =  1500000;
		   model[1].noise =  true;
		   
		   
		   model[2] =new Ear2(); 
		   model[2].brand = "sony";
		   model[2].design = "노랑";
		   model[2].sun = "선 있음";
		   model[2].music = "중";
		   model[2].price =  90000;
		   model[2].noise =  false;
		}		  
//		  
//		   
		 void specs (String a) {
		   for(int i =0; i<model.length; i++) {
	       if (a.equals(model[i].brand)){
				   System.out.println(model[i].brand);
				   System.out.println(model[i].design);
				   System.out.println(model[i].sun);
				   System.out.println(model[i].music);
				   System.out.println(model[i].price);
				   System.out.println("노이즈 켄슬링:"+model[i].noise);
			   
			   
			   }
			 }		
			 }
		
		
		 void all(String a) {
		   for(int i =0; i<model.length; i++) {
		   if (a.equals("all")){
			   System.out.println(model[i].brand);
			   System.out.println(model[i].design);
			   System.out.println(model[i].sun);
			   System.out.println(model[i].music);
			   System.out.println(model[i].price);
			   System.out.println("노이즈 켄슬링:"+model[i].noise);
		   
		   }
		 }		
		 }
		 
		 void noise(String a) {
			 for(int i =0; i<model.length; i++) {
				   if (a.equals(model[i].brand )){
					   System.out.println(model[i].noise);
					   
				   }
		 }
		 
		 

		 
}
	
	
	
	// 메소드명 : model
	// 전달인자 : 없음
	
	// 리턴타입 : void 
	// 디자인 :  "흰색"
	
	//void design() {
//		System.out.println();
//	}
//	
//	
	
}

