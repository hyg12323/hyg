package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class CheckFilter
 */
@WebFilter("/*")
public class CheckFilter implements Filter {

	public CheckFilter() {
		System.out.println("CheckFilter 생성자 실행");
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		long before = System.currentTimeMillis();

		System.out.println("doFilter 실행 전");

		request.setCharacterEncoding("utf-8");

		HttpServletRequest req = (HttpServletRequest) request;

		HttpServletResponse resp = (HttpServletResponse) response;

		String path = req.getServletPath();
		System.out.println("path:" + path);

		if (isExclude(path)) {
			chain.doFilter(request, response);
			System.out.println("세션 없이 진행");
		} else {
			HttpSession session = req.getSession();
			String login = (String)session.getAttribute("login");
			if("Y".equals(login)) {
				chain.doFilter(request, response);
			}else {
				System.out.println("세션 없어서 통과 못함");
		    	resp.sendRedirect(req.getContextPath()+"/login.html");
		    	return;   // ❌ 여기 추가해서 밑에 chain.doFilter() 안 타도록 수정
		    }
		}

		System.out.println("doFilter 실행 후");

		long after = System.currentTimeMillis();
		System.out.println("걸린 시간 :" + (after - before));
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

	private boolean isExclude(String path) {
	    boolean result = false;
	    if (path.equals("/login.html")
	    	||	path.equals("/login")
	    	|| path.startsWith("/assets")
	    	) {
	        result = true;
	    }
	    return result;
	}
}

