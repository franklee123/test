<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="ooo" items="${ list }">			
			<div>
			<p>ID:${ooo.id}</p>
		    <p>NAME:${ooo.name}</p>		    
<form style="margin:0px;display:inline;" action="/example/delete/${ ooo.id }" method="POST">
				<input type="hidden" name="id" value="${id}">
		 		<button id="delete" type="submit">刪除</button>
			</form>    
		<form style="margin:0px;display:inline;" action="/example/update/${ ooo.id }" method="POST">
			 <button id="update" type="submit">修改</button>
		</form>		
	</div>
</c:forEach>			
<form action="/example/test/" method="GET" id="back">
		<div>
			<p><button id="bt" type="submit">返回</button></p>
		</div>	
</form>								

</body>
</html>