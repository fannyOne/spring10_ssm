<%@ page language="java" import="java.util.*;" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>添加报销单页面</title>
		<script type="text/javascript" src="resources/js/jquery-1.8.3.js"></script>
	
		<script type="text/javascript">
			alert(222);
			$(function(){
				alert(111);
			});
		</script>
	</head>
	<body>
	<h1>添加报销单页面</h1>
		<%
			if (request.getSession().getAttribute("employee") != null){
		%>
		<h1>
			${sessionScope.employee.name } 登录成功
		</h1>
		<%
			} else {
		%>
		<h1>
			你还没登录，请您先登录。
		</h1>
		<%
			}
		%>
		<br>
		<a href="login.jsp">继续操作</a>
	</body>
</html>