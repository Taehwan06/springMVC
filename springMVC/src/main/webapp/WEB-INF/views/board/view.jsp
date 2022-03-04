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
	<h2>게시글 상세조회</h2>
	<table border="1">
		<tbody>
			<tr>
				<td>제목</td>
				<td>${vo.bsubject}</td>
			</tr>
			<tr height="300">
				<td>내용</td>
				<td>${vo.bcontent}</td>
			</tr>
		</tbody>
	</table>
	<input type="button" value="수정" onclick="location.href='update.do?bidx=${vo.bidx}'">
</body>
</html>