<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@page isErrorPage="true" %>
<p>数値を入力してください。</p>
<button onclick="history.back()">戻る</button>
<br>
<p><%=exception %></p>
<table border=1>
<tr>
	<tb><strong>エラーメッセージ</strong></tb>
	<tb><%= exception.getMessage() %></tb>
</tr>
<tr>
<tb><strong>例外を文字列に変換</strong></tb>
</tr>
<tr>
<tb><strong>スタックトレース</strong></tb>
<tb>
<%
exception.printStackTrace(new java.io.PrintWriter(out));%>
</tb></tr>
</table>

</body>
</html>