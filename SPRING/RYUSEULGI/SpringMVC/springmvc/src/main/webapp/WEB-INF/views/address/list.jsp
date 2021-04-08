<%@ page contentType="text/html;charset=utf-8" 
         import="java.util.*, springmvc.md.domain.Address"%>
<meta charset="utf-8">
<html>
<style>
	table, th, td {
	   border: 1px solid black;
	   border-collapse: collapse;
	}
	th, td {
	   padding: 5px;
	}
	a { text-decoration:none }
</style>
	<body>
		<h1>
			주소록
		</h1>
		<a href="write.do">입력폼</a>
		<table>
		    <tr>
			    <th>번호</th>
				<th>이름</th>
				<th>주소</th>
				<th>날짜</th>
				<th>삭제</th>
			</tr>
			<%
				List<Address> list = (List<Address>)request.getAttribute("list");
		    	if(list.size() != 0){
		    		for(Address dto: list){
			%>
			<tr>
				<td><%= dto.getName()%></td>
				<td><%= dto.getAddr()%></td>
				<td><%= dto.getRdate()%></td>
				<td align='center'><a href='del.do?seq=<%= dto.getSeq()%>'>삭제</a></td>
			 </tr>  
		</table>
	</body>
</html>