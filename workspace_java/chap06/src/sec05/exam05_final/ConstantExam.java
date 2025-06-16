package sec05.exam05_final;

public class ConstantExam {

	public static void main(String[] args) {
	
int result = LoginCheck("admin","1234");
if(result == Constant.LOGIN_SUCCESS) {
	System.out.println("로그인성공 >>메인페이지 이동");
}
	}	
	
	
	static int LoginCheck(String id, String pw) {
		if("admin".equals(id)&& "1234".equals(pw)) {
			return Constant.LOGIN_SUCCESS;
			
		}else {
			
		}
	}
}
