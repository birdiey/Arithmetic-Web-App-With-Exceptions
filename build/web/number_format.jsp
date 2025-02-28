

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NumberFormatException Page</title>
    </head>
    <body>
        <h1>Number Format Exception</h1>
        
        <%
        String errorMessage =exception.getMessage();
        %>
        
        <p> <b>Error message --> <%=errorMessage%></b></p>
        
        <p>
             <p>Click  <a href=index.html>here</a> to go back to the main page</p>
        </p>
    </body>
</html>
