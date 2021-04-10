<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*, springmvc.mission.domain.Board"
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
		<center>
			<font color='gray' size='4' face='휴먼편지체'>
				<hr width='600' size='2' color='gray' noshade>
				<h3>Spring Board</h3>
				<font color='gray' size='4' face='휴먼편지체'>
					<a href='write.do'>글쓰기</a>
				</font>
				<hr width='600' size='2' color='gray' noshade>
			</font>
			<%
				List<Board> list = (List<Board>)request.getAttribute("board");
			%>
			<table border='2' width='600' align='center' noshade>
				<tr>
					<td width='20%' align='center'>No</td>
					<td><%= list.getId()%></td>
				</tr>
				<tr>
					<td width='20%' align='center'>Writer</td>
					<td><%= list.getWriter()%></td>
				</tr>
				<tr>
					<td align='center'>Email</td>
					<td><%= list.getEmail()%></td>
				</tr>
				<tr>
					<td align='center'>Subject</td>
					<td><%= list.getSubject()%></td>
				</tr>
				<tr>
					<td align='center'>Contents</td>
					<td><%= list.getContent()%></td>
				</tr>
			</table>
			
			<hr width='600' size='2' color='gray' noshade>
			<font color='gray' size='4' face='휴먼편지체'>
				<a href='update.do?seq=<%= dto.getId() %>'>수정</a>&nbsp;&nbsp;| 
				<a href='del.do?seq=17'>삭제</a>&nbsp;&nbsp;| 
				<a href='list.do'>목록</a>
			</font>
			<hr width='600' size='2' color='gray' noshade>
		</center>		
	</body>
</html>