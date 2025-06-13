package qulz;

public class KfruitMarket {
          
	
	   // 필드
	// 필드는 변수고 , 변수는 뭔가를 저장할 수 있다
	    String name;     // 업체명
	    // 필드
		// 필드는 변수고 , 변수는 뭔가를 저장할 수 있다
		    
		String address; //업체 주소
//	    
//	    Fruit apple1 = new Fruit();
//	    Fruit tomato1 = new Fruit();
	    
	    
	    //int[] arr = new int[10]; // 참고
	    kfruit[] fruits = new kfruit[10];
	    
	     		
	    
	    
	    
	  // 생성자 
	  // new 하자마자 실행되는 메소드의 일종  
	    
	    KfruitMarket(String name,String address){         
	      System.out.println(fruits[0]);
	    	
	      this.name = name;   // 지역변수랑 필드변수랑 이름이 같아서 this를 붙여서 필드변수 선택하는 느낌
	      this.address = address; 
	      	      
	    }
	    void init() {
	    // apple1.name = 
	    	
	    	fruits[0] = new kfruit();
	    	fruits[0].name = "사과";
	    	fruits[0].price =1000;
	    	fruits[0].stock = 5;
	    
	    
	    }
	    
	    
	    
	    KfruitMarket(String address){         
//		      this.name = "오픈예정";   
//		      this.address = address; 
		      this( "오픈예정",address );
		    }
	    
	    
	    
	    
	    
	    //메소드(기능)
	    // 동작, 작동
        
	    String _tomato = "토마토";         // 필드변수는 _ 붙여주는게 좋다
	    int _tomatoPrice = 2000;
	 
	    
	    String _apple = "사과";
	    int _applePrice = 1000;
	    
	    
	    //과일 목록 전체 출력
	    // 메소드 명 : print
	    // 전달인자  : 없음
	    // 과일 가격 : 문의
	    // 리턴 타입 : void
       
     	  
	    void print() {
	//    	System.out.println("사과,1000원"); 
	    	System.out.println(_apple+_applePrice);
	    	System.out.println("수박");
	    	System.out.println("자두");
	  
	    	System.out.println(this._tomato);
	    	System.out.println(_tomato+_applePrice);
	    }
	    
          
          // 과일 가격 문의
          // 메소드명 : ask 
	      //  전달인자 : 과일명
          // 리턴타입 : 가격          
          int ask(String fruitName) {
        	  
        	  if(this._apple.equals(fruitName)) {
        		  return _applePrice;
                        		  
        	  }else if (this._tomato.equals(fruitName)) {
        		  return _tomatoPrice;
        	  }else {
        		  System.out.println("그런과일 없습니다");
        		  return -1;
        	  }
        	  
        	  
          }

          int ask2(String fruitName) {
        	  // 전체 과일 중에서
        	  for(int i= 0; i<fruits.length; i++) {
        		  // 전달받은 이름과 같은게 있다면
        		 if(this.fruits[i].name.equals(fruitName)) {
        			 
        			 //가격을 돌려줘라
        			 return this.fruits[i].price;
        		 }
        	  }
         
                 System.out.println("그런 과일 없습니다");
                 return -1;
          
          }
          
          // 과일 추가 기능
          // 메소드 이름 : addFruit
          // 전달인자 : Fruit 
          // 리턴타입 : void
          void addFruit(Fruit fruit) {
      // 이유는 기존 것의 마지막에 하나 추가
     //   	기본 것 보다 하나 큰 배열 만들기
        	  Fruit[] newFruits = new Fruit[this.fruits.length +1];
        	  // 기본것 복사
        	  for(int i=0; i<this.fruits.length +1; i++) {
        		  newFruits[i] = new this.fruits[1];
        		  
        	  }
               // 마지막 추가
        	  newFruits[newFruits.length -1] = fruit;
          }
          
        // 새 배열을 기존 배열에 덮어쓰기
              this.fruits = newFruits;
          
          
}
