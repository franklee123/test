<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<form style="margin:0px;display:inline;" id='testform' action="/example/confirm" method="POST">
		${message}<br> 
		<input type='hidden' name='num'>
		<input type='hidden' id='act' name='act' value='add'> 
		ID:<input type='text' id='id' name='id'><br> 
		NAME:<input type='text' name='name'><br>
		<button type="submit" value="submit">新增</button>	
</form>

<form style="margin:0px;display:inline;" id='testform' action="/example/search" method="POST">
		<input type="hidden" name="id" value="${id}">
		<input type="hidden" name="name" value="${name}">
		<button type="submit" value="submit">查詢</button>	
</form>

</body>
</html>
