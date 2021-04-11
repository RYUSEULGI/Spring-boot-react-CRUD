<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="com.test.domain.Board"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<style>
			a{text-decoration:none}
		</style>
		<meta charset="utf-8">
	</head>
	<body>
		<h3>Spring Board</h3>
		<a href='write.do'>글쓰기</a>
		<%
			Board board = (Board)request.getAttribute("board");
		%>
		<table border='2' width='600' align='center' noshade>
			<tr>
				<td width='20%' align='center'>No</td>
				<td><%= board.getId()%></td>
			</tr>
			<tr>
				<td width='20%' align='center'>Writer</td>
				<td><%= board.getWriter()%></td>
			</tr>
			<tr>
				<td align='center'>Email</td>
				<td><%= board.getEmail()%></td>
			</tr>
			<tr>
				<td align='center'>Subject</td>
				<td><%= board.getSubject()%></td>
			</tr>
			<tr>
				<td align='center'>Contents</td>
				<td><%= board.getContent()%></td>
			</tr>
		</table>

		<a href='update.do?seq=<%= board.getId()%>>'>수정</a>&nbsp;&nbsp;| 
		<a href='del.do?seq=<%= board.getId()%>>'>삭제</a>&nbsp;&nbsp;| 
		<a href='list.do'>목록</a>	
	</body>
</html> 