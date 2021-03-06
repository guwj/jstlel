package sevlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.MemberVo;

@WebServlet( "/01" )
public class _01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost( request, response );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iValue = 10;
		float fValue = 3.14f;
		String sValue = "hello it's me";
		boolean bValue = true;
		Object nullValue = null;
		
		MemberVo memberVo = new MemberVo();
		memberVo.setNo(10L);
		memberVo.setEmail("guwj@naver.com");
		
		request.setAttribute("iVal", iValue);
		request.setAttribute("fVal", fValue);
		request.setAttribute("sVal", sValue);
		request.setAttribute("bVal", bValue);
		request.setAttribute("nullVal", nullValue);
		request.setAttribute("vo", memberVo);
		
		request.getRequestDispatcher( "/view/01.jsp" ).forward( request, response );
	}
}
