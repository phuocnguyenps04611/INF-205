package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Product;
import model.Products;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background: #00cccc;\">\n");
      out.write("    <center>\n");
      out.write("        <h1>Products</h1>\n");
      out.write("        <a href=\"index.jsp\">Home</a>\n");
      out.write("        <a href=\"products.jsp\">Sản Phẩm</a>\n");
      out.write("        <a href=\"login.jsp\">Login</a>\n");
      out.write("        \n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <td> Ma SP</td>\n");
      out.write("                <td> Ten SP </td>\n");
      out.write("                <td> Gia </td>\n");
      out.write("            </tr>\n");
      out.write("            ");

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
                
            
      out.write("\n");
      out.write("           \n");
      out.write("        </table>\n");
      out.write("        <form action=\"ControllerCarBean\">\n");
      out.write("            <input type=\"submit\" value=\"View Cart\" name=\"action\"/> \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("    </center>   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}