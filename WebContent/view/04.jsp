<%@page import="vo.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	MemberVo vo = new MemberVo();		// page안에 들어가지 않고 변수인 상태
	vo.setName("둘리");
	
	pageContext.setAttribute("memberVo", vo);	// page 안에 들어간 상태
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>객체 접근</h3>
	${requestScope.memberVo.no }	<!-- requestScope는 생략 가능한 부분 -->
	<br>
	${requestScope.email }
	<br>
	${requestScope.name }
	<br>
	${requestScope.email }
	<br>
	===================scope test01=======================
	<br>
	page scope : ${pageScope.memberVo.name }
	<br>
	request scope : ${requestScope.memberVo.name }
	<br>
	session scope : ${sessionScope.memberVo.email }
	<br>
	application scope : ${applicationScope.memberVo.email }
	<br>
	===================scope test02=======================
	<br>
	page scope : ${memberVo.name }		<!-- 현재 page에 저장 돼 있는 것을 불러온다, page안에서만 있다 사라짐 -->
	<br>
	request scope : ${memberVo2.name }	<!-- request에 저장 돼 있는 것을 불러온다, 만약 page에 저장 돼 있는 것과 같다면 page 것이 온다, response 나가면 사라짐-->
	<br>
	session scope : ${memberVo3.name }	<!-- session에 저장 돼 있는 것을 불러온다, 로그아웃하면 사라짐-->
	<br>
	application scope : ${memberVo4.name }
	
</body>
</html>