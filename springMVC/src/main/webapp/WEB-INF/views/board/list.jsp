<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게시글 목록</h2>
	${list.size()}
	
	<table border="1">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성일</th>
		</tr>
		
		<c:forEach items="${list }" var="vo" varStatus="cnt">
			<tr>
				<td>${vo.bidx}</td>
				<td><a href="view.do?bidx=${vo.bidx}">${vo.bsubject}</a></td>
				<td>${vo.bwdate}</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>