<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4><c:out value="${exception.getMessage() }"></c:out></h4>
	
	<ul>
		<c:forEach items="${exception.getStackTrace() }">
			<li><c:out value="${stack }"></c:out>
		</c:forEach>
	</ul>
</body>
</html>