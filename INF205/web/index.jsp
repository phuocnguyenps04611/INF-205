<%-- 
    Document   : index
    Created on : Sep 30, 2016, 10:30:21 AM
    Author     : phuoc
--%>

<%@page import="java.util.List"%>
<%@page import="model.Product"%>
<%@page import="model.Products"%>
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
        <h1>Products</h1>
        <a href="index.jsp">Home</a>
        <a href="products.jsp">Sản Phẩm</a>
        <a href="login.jsp">Login</a>
        
        <table border="1">
            <tr>
                <td> Ma SP</td>
                <td> Ten SP </td>
                <td> Gia </td>
            </tr>
            <%
                Products listSP = new Products();
                List<Product> list = listSP.showProduct("");
                for (Product sp:list){
                    out.print("<form action=\"ControllerCarBean\">");
                    out.print("<tr><td>"+sp.getCode()+"</td><td>"+sp.getName()+"</td>"
                            + "<td>"+sp.getPrice()+"</td><td><input type=\"submit\" "
                            + "value=\"Add to Cart\" name =\"action\" /></td>"  
                            + "<input type=\"hidden\" name=\"txtCode\" value='" +sp.getCode() + "'>"
                            + "<input type=\"hidden\" name=\"txtName\" value='" +sp.getName()+ "'>"
                            + "<input type=\"hidden\" name=\"txtPrice\" value='" +sp.getPrice()+ "'>"
                            + "</tr>");
                    
                    out.print("</form>");
                    
                }
                
            %>
           
        </table>
        <form action="ControllerCarBean">
            <input type="submit" value="View Cart" name="action"/> 
        </form>
        
    </center>   
    </body>
</html>
