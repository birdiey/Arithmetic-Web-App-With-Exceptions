
<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Negative Numbers Exception Page</title>
    </head>
    <body>
        <h1>Negative Numbers Exception</h1>
        
        <%
        String errorMsg = exception.getMessage();
        
        %>
        
        <p>
            <b>Error message --> <%=errorMsg%></b>
        </p>
        
        <p>
            Click <a href="index.html"> here</a> to go back to the main page.
        </p>
    </body>
</html>
