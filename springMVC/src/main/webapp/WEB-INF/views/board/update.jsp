<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게시글 수정</h2>
	<form name="updateFrm" action="" method="post">
		<table border="1">
			<tbody>
				<tr>
					<td>제목</td>
					<td><input name="bsubject" type="text" value="${vo.bsubject}"></td>
				</tr>
				<tr height="300">
					<td>내용</td>
					<td><textarea name="bcontent">${vo.bcontent}</textarea></td>
				</tr>
			</tbody>
		</table>
		<input type="button" value="저장">
		<input type="button" value="취소">
	</form>
</body>
</html>