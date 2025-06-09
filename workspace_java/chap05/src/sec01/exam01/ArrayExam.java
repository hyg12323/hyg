package sec01.exam01;

public class ArrayExam {

	public static void main(String[] args) {
		
		/* 
		 * 배열array
		 * 한번에 여러 변수를 만드는 방법
		 * 같은 타입만 선언할 수 있음
		 * 생성할 때 전체 크기를 지정해줘야 함
		 * 생성된 여러 변수들은 index로 관리한다(index는 0부터 시작)
		 * 
		 */
		
		//선언 방법
		int[] a1; //자바 스타일
//		int[] a;
		int a2[]; // c 스타일
        // 배열 변수는 참조 변수라서 null 을 넣을 수 있다
		a1 = null;
		
		int score_0 = 90;
		int score_1 = 80;
		int score_2 = 75;
		/* 첫번째 []: int[]
		 *       int로 이루어진 배열 변수 타입이다
	       두번째 [] : new int[3]
	              배열의 크기. 즉 한번에 만들 변수의 개수
		   세번째[] : score[0] = 90;
		          만들어진 변수 중에서 몇번째인가?
		          index는 0부터 시작한다
		 */
		
		
		
		int[]score = new int[30];
		score[0] = 90;
		score[1] = 80;
		score[2] = 75;
		
		
		System.out.println("score[1]:"+score[1]);
		System.out.println("score[3]:"+score[3]);
	

		
		String[] str = new String[3];
		//str[0] = "안녕하세요";
		//System.out.println("str[100]:"+str[100]);
		//Index 100 out of bounds for length 3
	    // 길이가 3밖에 안되는데 100을 넣었다 예외 발생
		
		
		//배열을 선언하는 두번째 방법
		// 넣을 값을 모두 정확히 알고 있는 경우
		int[] i1 = new int[] {90,80,75};
		int[] i2 = null;
		i2 = new int[] {90,80,75};
		
		// 배열을 선언하는 세번쨰 방법
		// 선언과 동시에 초기화 하는 경우에만
		// new int[]를 생략 할 수 있다
		int[] i3 = {90,80,75};
		int[] i4 = null;
	//	i4 = {90,80,75};
		
		System.out.println(i1[2]);
		
        int[] scores = {83, 90, 87};
        System.out.println("scores[0]:"+ scores[0]);
        System.out.println("scores[1]:"+ scores[1]);
        System.out.println("scores[2]:"+ scores[2]);
        
        int sum = 0;
        for(int i=0; i<3; i++) {
        	sum += scores[i];
        }
        System.out.println("총합:"+ sum);
        
        System.out.println("평균:"+ sum/3);
        
	     //배열의 길이
        System.out.println("scores.length:"+scores.length);
	
	       int b0 = 5;
	       int b1 = 15;
	       int b2 = 55;
	       
	       int[]bs0 = new int[3];

	       bs0[0] = b0;
	       bs0[1] = b1;
	       bs0[2] = b2;
	 
	       int[]bs1 = new int[3];

	       bs1[0] = b0+1;
	       bs1[1] = b1+1;
	       bs1[2] = b2+1;
	       
	       
	       
	       
	       int[] [] bs = new int[2][3];
	       bs[0] = bs0; 
	       bs[1] = bs1; 
	        
	      System.out.println("bs.length:"+bs0.length);
            
//          for(int i =1; i<=10; i++) {
//          }
//        	  
//            
//           int[] c = new int [20];
//           c[0] = i; 
//     	        
//           System.out.println(i);
//	       
	       
//	       
          int[] c = new int[10];
              
            
             
          for( c[0] = 1; c[0]<11; c[0]++) {
          }
        	
        
          for(int c1 =1; c1<c[0]; c1++)
        	  System.out.println(c1);
          
          
          
          
          
//             
//          for(int i =1; i<=10; i++)
//        	  
//          System.out.println(i);
//          
//          int[] c = new int[2];
//          c[0] = i;
        		  
//          
          
          int[] d1 = {1,2,3,4,5};
          int[] d2 = d1; //주소 동일하게 만듬
          int[] d3 = {1,2,3,4,5};
          System.out.println("d2 == d1:" +(d1 == d2));
          System.out.println("d2 == d1:" +(d1 == d3));
	      
          d2[1] = 10; // 2를 10으로 변경 
          System.out.println("d1:"+d1[1]); // 주소가 같으므로 d2를 바꾸면 d1도 바뀜

                     	
           
         int[] f = {4,5,7,2,6,9};
         int[] f2= new int[f.length]; // length는 f안에 방의 개수 
  //        System.out.println(f2[1]);
//       
          
    //      for(int f2=0; f2<=f.length; f2++) {
      //  	 System.out.println(f[f2]);
        	 
         
         
         
	     System.out.println(f[0]);
	     for(int i=0; i<f.length; i++) { 
	    	 System.out.println(f[i]);        //i는 방에 개수 0부터 새주기
	    	 f2[i] =f[i];
	    	 System.out.println(f2[i]); 
	     } 
	     
	      
	   for(int i=0; i<f.length; i++) {
		   int data = f[i];         
		   System.out.println("data:"+data);
	   }
	   //향상된 for문
	   for(int data :f) {
		   System.out.println("data:"+data);
	   } 
	   
	   //문제 0
	   // 배열 깊은 복사 : {1,2,3} -> {1,2,3}
	   int[]ac = new int[3];
	   ac[0]= 1;
	   ac[1]= 2;
	   ac[2]= 3;
	  
	   for(int c1= 0; c1<3; c1++) {
	   System.out.print(ac[c1]);
	   }
	   
	   System.out.println();
	   
	   int[] b = {1,2,3};
	   for(int c2= 0; c2<3; c2++) {
		   System.out.print(b[c2]);
		   }
	   
	   
	   System.out.println();
	   //문제1 
	  // 배열 뒤집기 : {1,2,3,} -> {3,2,1,}
	   
	   for(int c3= 2; c3>=0; c3--) {
		   System.out.print(ac[c3]);
	   }
          		   
	   
	   
	   
	   
	   
	   
	   
	   //문제2
	   // [3,4,7,5,1,4,9]
	   //여기서 홀수의 개수 찾기
	   System.out.println();
	   int[] aw = {3,4,7,5,1,9,4};
	   int count = 0;
	      
	   for(int i=0; i<aw.length; i++) {
		
	         // 홀수 일때만 세기
		 if(aw[i]%2!=0) {
			count++;

		//	 System.out.println(aw[i]);
 			 
		 }
		 
	   }System.out.println("2번:"+count);
	    
	   
	   
	   
	   
	   
	   count = 0;
	   
	   
	   //문제3
	   //[3,4,7,5,1,4,9] 4보다 큰 수의 개수 구하기
	      
	   for(int i=0; i<aw.length; i++) {
		
	         
		 if(aw[i]>4) {
			 count++;
		 }
			
	   }  System.out.println("3번"+count);
	   
	   
	   
	   
	   
	   
	   
	   //문제4 
	   //여기서 최대값을 출력하시오
	   
	  int max = 0;
	      
	   for(int i=0; i<aw.length; i++) {
		   
	        
		 if(aw[i]>max) {
			 max = aw[i];	
		
		 } 
	   }System.out.println("4번"+max);
	   
	   
//	   max = Integer.MIN_VALUE;
//	   System.out.println(max);
	   
	   //1. 일단 처음 값을 최대값으로 저장
	   //2. 다음부터 최대값 이었던 것과 비교해서 큰 값을 최대값으로 갱신
	   //3. 반복하다 보면 가장 큰 값이 최대값 변수에 남아있겠다
	   
	   
	   
	   
	   
       	   
	   //문제5
	   //여기서 두번째 큰 수 구하기
	   
	   
	      
	 int max2 = Integer.MIN_VALUE;
	 for(int i=0; i<aw.length; i++) {
		 if(aw[i] != max2 && aw[i] >max2) {
			 
		 }System.out.println(max2);
			 
	 }
	   
	  
	   
	   
	   
	   
			   
	   //문제6		   
	   //오른쪽으로 한칸밀기(왼쪽은 0으로 채우기)
	   //예시 [0,3,7,5,1,9,4]  배열하나가 늘어남
	   
	   
	 //  int[] aw[i] = {3,4,7,5,1,9,4};
        
	   int[] w = new int[aw.length+1];
	   
	   for(int ie=0; ie<aw.length; ie++) {
		   w[ie+1] = aw[ie];
        	 System.out.println("6번"+w[ie]);
        //	System.out.println(w[ie]);
        	
        } 
	    

	    
	   
	   
	  // int[][] w = new int[2][6];
	//     w[0] = aw;
	     
	     
	   
	   
	   
	   
	   
	   
	   //문제7
	   // 오른쪽으로 이동 하는데 맨 끝에 값을 맨 처음으로 보내기
	   //{3,4,7,5,1,9,4}  -> {4,3,4,7,5,1,9}
	   // 같은 크기의 배열을 일단 만들고
	   // 원본의 맨 마지막 값을 사본의 맨 처음에 넣기
	   // 나머지는 사본의 두번째 복사
	   
	   
            
	   int[] array7  = new int [aw.length];
         array7[0] = aw.length-1;
	   for(int i=1; i<array7.length; i++) {
	     array7[i] =aw[i-1];
	   }       
	        
	     for(int i=1; i<array7.length; i++) {
		     System.out.println("ㅁ"+aw[i]);
	     
	     }   
	   

	   
        	
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   //문제8
	   //임시 비밀번호 생성(랜덤)
	   // 8-1 : 숫자만
	   // 8-2 : 소문자만
	   // 8-3 : 숫자2개 이상, 대/소문자 각 1개 이상
	     
	     
	     int[] arr8 = new int[8];
	     for(int i=0; i<arr8.length; i++) {
	    	 // 한자리 숫자 random
	    arr8[i] =(int)(Math.random()*10);
	     }
	     System.out.println("문제8");
	     for(int i=0; i<arr8.length; i++) {
	    	 System.out.print(arr8[i]+", ");
	     }
	     
	     //char[] a = {'a','b',,,,'z'}
	     //97 ~122까지
	   
	     
	     
//	     (int)(Math.random()*26)+ 97
	     // 번외편. random공식을 완성해보자
	     {         int start = 48;
              int end = 59;
//	     (int)(Math.random()*(end -start +1)) +start;	
            
          char[] arr83 = new char[8];
          arr83[0] = (char)( (int)(Math.random()*(end -start +1)) +start );
          arr83[1] = (char)( (int)(Math.random()*(end -start +1)) +start );
          
          //대문자
          start = 65;
          end = 90;
          arr83[2] = (char)( (int)(Math.random()*(end -start +1)) +start );
          
          
          //소문자
          start = 97;
          end = 122;
          arr83[2] = (char)( (int)(Math.random()*(end -start +1)) +start );
	}          
          
      // 8번 반복하면서
      // 이번에 나올 숫자/대문자/소문자 random()으로 선택
      // 대충 마지막 쯤에서 숫자2개/대문자1개/소문자1개 나왔었는지 판단
              
	     
	     
	     
	   
	   //문제9
	   //자리가 10개 있는 소극장의 예약 시스템
       // 자리 번호는 1~10번까지 번호의 자리가 있습니다
	   // 메뉴 : "1.예약 2.모든 좌석 현황" 3. 잔여좌석 0.종료
	   //만약1 : 예약이 가능하다면 "n번 자리 예약 했습니다"
	   //만약2 : 예약이 불가능하다면 "이미 예약 되어 있습니다"
//	   
//	     int[] seat = new int[10]; // 0:예약가능, 1:예약완료
//	     // 예를 들어 3번째 자리에 예약을 했다
//	//     seat[2] = 1;
////             	     
//	     
//	     int booking = -1;
//	     do {
//	    	 System.out.println( "1.예약 2.모든 좌석 현황 3. 잔여좌석 0.종료");
//	    	 Scanner scan = new Scanner(system.in);
//	     menu = scan.nextInt();
//	     
//	     switch(booking) {
//	     case 1:
//	    	 System.out.println("몇번 자리?(0-9)");
//	         int booking =sacn.nextInt();
//	         if()
//	      
	     
	 //   }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	   
	   //문제10
	   // 로또 6개 생성. 단, 중복 없이
	   
	   
//	   int [] g =new int[6];
	   
//	   g[0] = (int)(Math.random()*45+1);
//	   g[1] = (int)(Math.random()*45+1);
//	   g[2] = (int)(Math.random()*45+1);
//	   g[3] = (int)(Math.random()*45+1);
//	   g[4] = (int)(Math.random()*45+1);
//	   g[5] = (int)(Math.random()*45+1);
//	   for(int i=0; i<g.length; i++) {
//		   g[i] = (int)(Math.random()*45+1);
//		   System.out.println("로또"+g[i]);  
//		for(int cc= 0; cc<=i; cc++) { 
//			if (g[0] != g[1]) {
//				System.out.println(g[i]);	
//				
//			}
//		            	
			//if(g[i] g[cc])  {             // 중복이 안됬다
			
					
			//}
			
		 
			
//		}
		
		
		   
//	   }  
		   
		                                       //flag가 true false로 바꿔서 
//	   int[] lotto = new int[(int)(Math.random()*45+1)];
//	   
//	   
//	   
//	   while(lotto[0] != lotto[1]) {
//		   lotto[1] = (int)(Math.random()*45+1);
//	   }
//	   
//	   lotto[2] = (int)(Math.random()*45+1);
//	   while(lotto[0] != lotto[2] && lotto[1] != lotto[2]) {
//		   lotto[2] =(int)(Math.random()*45+1);
//	   }
//	   //다시 쓰면
//	   //일단 추출
//	   
//	   
//	   lotto[2] = (int)(Math.random()*45+1);
//	   do {
//		   boolean flag = false;
//		   for(int i=0; i<2; i++) {
//			   if(lotto[i] == lotto[2]) {
//				   flag = true;
//			   }
//		   }
//		   while(flag) {
//	   }
	     System.out.println();
	     int [] lotto =new int[6];
	     
	     boolean flag = false;
	     
	     for(int i=0; i<lotto.length; i++) 
	    	 
	    do {
	    	flag = false;
	    	
	    	 lotto[i] = (int)(Math.random()*45)+1;
	    	 for(int j=0; j<i; j++) {
	    		 if(lotto[j] ==lotto[i]){
	    			 System.out.println(("중복:"+lotto[i]));
	    			 flag =true;
	    			 
	    		 }
	    	 }
	     } while(flag);
	     for(int i=0; i<lotto.length; i++) {
	    	 System.out.print(lotto[i]+",");
	    	 
	    	 
	     }System.out.println();
	   
	   
	   
	   
	     
	    
//	   for(int i=1; i<46; i++) {
//		   int[] c2 = new int[i];
//		   
		   
	   
	   
	   
	   
	   
	   
	}
	
	

}