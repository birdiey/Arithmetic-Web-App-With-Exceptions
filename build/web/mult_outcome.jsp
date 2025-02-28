

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Multiplication Outcome Page</title>
    </head>
    <body>
        <h1>Multiplication Outcome</h1>
        
        <%
        int num1 =(Integer)request.getAttribute("num1");
        int num2 =(Integer)request.getAttribute("num2");
        int multiplication =(Integer)request.getAttribute("multiplication");
        
        %>
        
        <p>
            The multiplication of <b><%=num1%></b> and <b><%=num2%></b> is <b><%=multiplication%></b>
        </p>
        
        <p>
            Click <a href="index.html">here</a> to go back to the main page.
        </p>
    </body>
</html>
