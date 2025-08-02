<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>JSP Example</title>
</head>
<body>
<h2>JSP Example</h2>

<form method="post">
  Enter your name: <input type="text" name="username" required />
  <input type="submit" value="Submit" />
</form>

<%
  String name = request.getParameter("username");
  if (name != null && !name.isEmpty()) {
%>
<h3>Hello, <%= name %>!</h3>
<%
  }
%>
</body>
</html>