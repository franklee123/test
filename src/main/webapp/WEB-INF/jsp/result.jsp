<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<form id='confirmform' action="/example/result" method="POST">
		${message}<br>  
</form>	

<form action="/example/test/" method="GET" id="back">	
	 	<button id="bt" type="submit">返回</button>
	</form>

</body>
</html>