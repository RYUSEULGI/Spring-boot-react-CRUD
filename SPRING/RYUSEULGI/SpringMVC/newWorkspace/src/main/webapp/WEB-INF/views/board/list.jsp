<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*, com.test.domain.Board"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title> Spring Board </title>
	<meta charset="utf-8">
	<style>
		a{text-decoration:none}
	</style>
</head>
<body>
	<h3> Spring Board</h3>
	<a href='../'>인덱스</a>
	<a href='write.do'>글쓰기</a><br/>
	<table>
		<tr>
			<th bgcolor='AliceBlue'>no</th>
			<th>writer</th>
			<th>e-mail</th>
			<th>subject</th>
			<th>date</th>
		</tr>
		<%
			List<Board> list = (List<Board>)request.getAttribute("list");
		    if(list.size() != 0){
		    	for(Board dto: list){
		%>
		<tr>
			<td><%= dto.getId()%></td>
			<td><%= dto.getEmail()%></td>
			<td>
				<a href="content.do?seq=<%= dto.getId()%>">
				<%= dto.getSubject()%>
				</a>
			</td>
			<td><%= dto.getRdate()%></td>
		</tr>
		<%
		    	}
		    }
		%>
     </table>
    (총페이지수 : 3)&nbsp;&nbsp;&nbsp;
        <a href="list.do?cp=1"><strong>1</strong></a>&nbsp;
        <a href="list.do?cp=2">2</a>&nbsp;
        <a href="list.do?cp=3">3</a>&nbsp;
    ( TOTAL : 9 )
       페이지 싸이즈 : 
    <select id="psId" name="ps" onchange="f(this)">
  		<option value="3" selected>3</option>
       <option value="5">5</option>
       <option value="10">10</option>
    </select>
    <script>
       function f(select){
           //var el = document.getElementById("psId");
           var ps = select.value;
           //alert("ps : " + ps);
           location.href="list.do?ps="+ps;
       }
    </script>
</body>
</html>