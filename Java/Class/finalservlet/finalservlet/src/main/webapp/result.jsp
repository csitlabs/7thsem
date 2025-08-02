<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="com.example.AdditionModel" %>
<html>
<head><title>Result</title></head>
<body>
<h2>Result - MVC</h2>
<%
  AdditionModel model = (AdditionModel) request.getAttribute("model");
  if (model != null) {
%>
<p><%= model.getNum1() %> + <%= model.getNum2() %> = <%= model.getSum() %></p>
<%
  }
%>
<a href="add.jsp">Back</a>
</body>
</html>
