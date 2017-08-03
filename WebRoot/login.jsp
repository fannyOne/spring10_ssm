<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>登录</title>
	</head>
	<body>
		<h1>
			登录
		</h1>
		${message}
			<form action="login.html" method="post">
				用户ID：<input type="text" name="sn"><br/>
				密码:<input type="passowrd" name="password"/>
				<input type="submit" value="登录"/> 
			</form>
	</body>
</html>
