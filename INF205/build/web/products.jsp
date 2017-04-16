<%-- 
    Document   : products
    Created on : Sep 30, 2016, 10:40:33 AM
    Author     : phuoc
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background: #00cccc;">
    <center>
        <h1>Sản Phẩm</h1>
        <a href="index.jsp">Home</a>
        <a href="products.jsp">Sản Phẩm</a>
        <form action="ControllerProducts">
            nhap ten SP:<input type="text" name="txtTenSP" value=""/>
            <input type="submit" name="action" value="Search"/>
        </form>
        <table border="1">
            <tr>
                <td>Code</td>
                <td>Name</td>
                <td>Price</td>
                <td>Edit</td>
                <td>Delete</td>
                
            </tr>
            
            <c:forEach var="rows" items="${listSP}">
                <form action="ControllerProducts">
                    <tr>
                    <td>${rows.code}</td>
                    <td>${rows.name}</td>
                    <td>${rows.price}</td>
                    <c:url var="del" value="ControllerProducts">
                        <c:param name="action" value="Edit"/>
                        <c:param name="txtCode" value="${rows.code}"/>
                        <c:param name="txtName" value="${rows.name}"/>
                        <c:param name="txtPrice" value="${rows.price}"/>
                    </c:url>
                    <td><a href="${del}">Edit</a></td>
                    
                    <td>
                        <input type="hidden" name="txtCode" value="${rows.code}"/>
                        <input type="submit" name="action" value="Delete"/>
                    </td>
                    <c:url var="del" value="ControllerProducts">
                        <c:param name="action" value="New"/>
                        <c:param name="txtCode" value="${rows.code}"/>
                        <c:param name="txtName" value="${rows.name}"/>
                        <c:param name="txtPrice" value="${rows.price}"/>
                    </c:url>
                    
                </tr>
                </form>
                
                
            </c:forEach>
        </table>
        <td><a href="${del}">New</a></td>
        <br/>
    </center>
    </body>
</html>
