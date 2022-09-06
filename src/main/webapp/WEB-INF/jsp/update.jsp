<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<form action="/example/exUpdate" method="POST">
	 	<p>ID:</p><input type="text" readonly="readonly" name="id" value="${id}" required>
	 	<p>NAME:</p><input type="text" name="name" value="${name}" required><br><br>
	 	<button  type="submit" value="update"確認修改</button>
	</form>
</body>
</html>
