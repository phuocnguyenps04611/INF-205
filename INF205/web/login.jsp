
    

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body style="background: #00cccc;">
    <center>
        <h1>Login</h1>
        <form action="CotrollerCustomers">
            Username: <input type="text" name ="txtUser" value=""><br />
            password: <input type="password" name ="txtPass" value=""><br />
            <input type="submit" name="action" value="Login"/>
            <input type="reset" name ="Reset" value="Reset"/>
        </form>
    </center>
    </body>
</html>
