package sevlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.MemberVo;

@WebServlet("/04")
public class _04Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost( request, response );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//request
		MemberVo memberVo2 = new MemberVo();
		memberVo2.setNo(2L);
		memberVo2.setEmail("guwj@naver.com");
		memberVo2.setName("김용준");		
		
		request.setAttribute("memberVo2", memberVo2);
		
		//session
		MemberVo memberVo3 = new MemberVo();
		memberVo3.setNo(3L);
		memberVo3.setEmail("guwjguwj@naver.com");
		memberVo3.setName("흰둥이");		
		
		request.getSession(true).setAttribute("memberVo3", memberVo3);
		
		//application
		MemberVo memberVo4 = new MemberVo();
		memberVo4.setNo(3L);
		memberVo4.setEmail("guwjguwj@naver.com");
		memberVo4.setName("마이콜");		
		
		request.getRequestDispatcher( "/view/04.jsp" ).forward( request, response );
	}
}
