<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<head>
<script type="text/javascript" src="resources/js/jquery-1.8.3.js">
	</script>
	
	<script type="text/javascript">
		function doAjax(){
			$.ajax({
				type:"post",
				url:"doAjax",
				data:"sn=1000&password=123",
				success:function(data){
					alert(JSON.stringify(data));
					
				}
			}); 
		}
	/* 	$.post("doAjax","sn=1000&password=123",
			function(result){alert(JSON.stringify(result));}); */
	
	</script>
  </head>
  <html>
  <body>
    	<a href="javaScript:doAjax()">ajax访问</a>
  </body>

</html>
