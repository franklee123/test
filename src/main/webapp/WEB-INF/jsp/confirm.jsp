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
		ID:${id}<br>  
		NAME:${name}<br>
		<input type="hidden" name="id" value="${id}">
		<input type="hidden" name="name" value="${name}">
		<button type="submit" value="submit">確認</button>
</form>
</body>
</html>
