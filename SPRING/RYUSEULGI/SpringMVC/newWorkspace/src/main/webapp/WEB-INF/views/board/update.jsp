<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="com.test.domain.Board"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title> Spring Board </title>
		<meta charset="utf-8">
		<style>
			a{text-decoration:none}
		</style>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script>
		    function f(){
		    	input.email.value = "";
		    	input.subject.value = "";
		    	//input.content.innerText = "";
		    	$("#ta").text("");
		    	
		    	input.email.focus();
		    }
		</script>
	</head>
	<body>
		<h3> Spring Board</h3>
		<a href='list.do'>목록</a>
		<a href='write.do'>글쓰기</a>
		<%
			Board board = (Board)request.getAttribute("board");
		%>
		<form name='input' method='post' action='update.do'>
			<input type="hidden" name="id" value="<%= board.getId()%>">
			<table>	
				<tr>
				   <td width='20%' align='center' >WRITER</td>
				   <td>
				      <input name='writer' readonly value="<%= board.getWriter()%>" size="93"/>
				   </td>
				</tr>
				<tr>
					<td align='center'>EMAIL</td>
					<td><input name='email' value="<%= board.getEmail()%>" size="93"/></td>
				</tr>
				<tr>
					<td align='center'>SUBJECT</td>
					<td><input name='subject' value="<%= board.getSubject()%>" size="93"/></td>
				</tr>		
				<tr>
					<td align='center'>CONTENT</td>
					<td><textarea id='ta' name='content' rows='15' cols='70'><%= board.getContent()%></textarea></td>
				</tr>
				<tr>
					 <td colspan='2' align='center'>
						<input type='submit' value='수정'>
						<input type="button" value="다시입력" onclick="f()">
					 </td>
				</tr>
			</table>
		</form>
	</body>
</html>