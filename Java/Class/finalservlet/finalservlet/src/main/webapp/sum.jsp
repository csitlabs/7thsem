<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sum of Two Numbers</title>
</head>
<body>
<h2>Enter two numbers</h2>
<form method="post">
    Number 1: <input type="number" name="num1" required><br><br>
    Number 2: <input type="number" name="num2" required><br><br>
    <input type="submit" value="Calculate Sum">
</form>

<%--<h4>Bimochan - 28555</h4>--%>
<h4>Ujwol Aryal - 28594/078</h4>
<%
    String n1 = request.getParameter("num1");
    String n2 = request.getParameter("num2");

    if (n1 != null && n2 != null && !n1.isEmpty() && !n2.isEmpty()) {
        try {
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
            int sum = num1 + num2;
%>
<h3>Sum: <%= num1 %> + <%= num2 %> = <%= sum %></h3>
<%
} catch (NumberFormatException e) {
%>
<p style="color:red;">Please enter valid numbers.</p>
<%
        }
    }
%>

</body>
</html>
