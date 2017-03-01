package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Manager_005fProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div class=\"dangky\">\n");
      out.write("             ");

            String error = "";
            if (request.getParameter("error")!=null) {
                    error = (String) request.getParameter("error");
                }
            
            
            
      out.write("\n");
      out.write("       \n");
      out.write("                    <center></br></br></br>\n");
      out.write("       <form action=\"getProduct\" method=\"post\">\n");
      out.write("           <center>\n");
      out.write("                 <script>\n");
      out.write("                        function ac0() {\n");
      out.write("                            var a0 = 0;\n");
      out.write("                            document.getElementById(\"ac\").value = a0;\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("                        function ac1() {\n");
      out.write("                            var a1 = 1;\n");
      out.write("                            document.getElementById(\"ac\").value = a1;\n");
      out.write("                        }\n");
      out.write("                        function ac2() {\n");
      out.write("                            var a2 = 2;\n");
      out.write("                            document.getElementById(\"ac\").value = a2;\n");
      out.write("                        }\n");
      out.write("                        function ac3() {\n");
      out.write("                            var a3 = 3;\n");
      out.write("                            document.getElementById(\"ac\").value = a3;\n");
      out.write("                        }\n");
      out.write("                      \n");
      out.write("                    </script>\n");
      out.write("\t\t<table width=\"95%\" border=\"1\" >\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<tr><td><b>Mã Sản Phẩm</b></td><td>\n");
      out.write("                             \n");
      out.write("                               \n");
      out.write("                                <input type=\"text\" class=\"\" name=\"Ma_sp\" name=\"Ma_sp\" value=\"");
      out.print(Model.getProduct.masp);
      out.write("\"><input type=\"submit\" value=\"Tìm\" onclick=\"ac0()\"></td>\n");
      out.write("\t\t\t\t\n");
      out.write("              \n");
      out.write("\t\t\t</td></tr>\n");
      out.write("                        <tr><td><b>Tên Sản Phẩm</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"Ten_sp\" value=\"");
      out.print(Model.getProduct.tensp);
      out.write("\"</td></tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t <tr><td><b>Mô Tả</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"Mo_ta\" value=\"");
      out.print(Model.getProduct.mota);
      out.write("\"</td></tr>\t\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("\t\t\t <tr><td><b>Số Lượng</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"So_luong\" value=\"");
      out.print(Model.getProduct.soluong);
      out.write("\"</td></tr>\t\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("                         <tr><td><b>Đơn Giá</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"Don_gia\" value=\"");
      out.print(Model.getProduct.dongia);
      out.write("\"</td></tr>\t\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("                        <tr><td><b>Hình Ảnh</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"Hinh_anh\" value=\"");
      out.print(Model.getProduct.hinhanh);
      out.write("\"</td></tr>\t\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("                         <tr><td><b>Nhà Sản Xuất</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"Nha_sx\" value=\"");
      out.print(Model.getProduct.nhasx);
      out.write("\"</td></tr>\t\n");
      out.write("                          <tr><td><b>Mã Loại</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"Ma_loai\" value=\"");
      out.print(Model.getProduct.maloai);
      out.write("\"</td></tr>\t\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("\t\t\t<tr><td>\n");
      out.write("                               \n");
      out.write("                            <td height=\"40\"><input type=\"submit\" value=\"Thêm\" onclick=\"ac1()\" >  <input type=\"submit\" value=\" Sửa \" onclick=\"ac2()\">  <input type=\"submit\" value=\" Xóa \" onclick=\"ac3()\"></td>\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("                        <input type=\"text\" value=\"\" style=\"display: none\" id=\"ac\" name=\"ac\"> \n");
      out.write("                </table>\n");
      out.write("                        </center> \n");
      out.write("       </form></center></div>\n");
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
