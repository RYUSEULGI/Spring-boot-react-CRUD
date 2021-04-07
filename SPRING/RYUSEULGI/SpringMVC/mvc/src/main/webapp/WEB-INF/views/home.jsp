<%@ page contentType="text/html;charset=utf-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>
		Hello world!  
	</h1>
	
	<P>  The time on the server is ${serverTime}. </P>
	<p>
		<a href="/controller/test/param1?name=홍길동&age=20">parameter test</a> 
		<a href="/controller/test/param2?names=홍길동&names=홍길동names=홍길동">parameter test</a>
		<a href="/controller/test/param3?names=홍길동&names=홍길동names=홍길동">parameter test</a>
		<a href="/controller/test/param4?memeber%5B0%5D.name=홍길동&memeber%5B0%5D.age=20&memeber%5B1%5D.name=홍길동&memeber%5B1%5D.age=22">parameter test</a>
		<a href="/controller/test/param5?name=홍길동&age=20&page=3">parameter test</a>
		<a href="/controller/test/json1">JSON test</a> 
		<a href="/controller/test/json2">JSON test</a>
	</p>
	
	<h2> JspIndex (인덱스) </h2>
    
	<a href="base/jsp1.jsp">라이프싸이클</a><br/>
	<a href="addr/list2.jsp">주소록</a><br/>
</body>
</html>