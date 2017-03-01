package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Product;
import Dao.ProductDAO;
import Model.Catalogue;
import Dao.CategoryDAO;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\"/>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/favicon.ico\">\n");
      out.write("        <title>Fnatic Việt Nam</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Roboto:400,300,300italic,400italic,500,700,500italic,100italic,100' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\"/>\n");
      out.write("        <link href=\"css/sequence-looptheme.css\" rel=\"stylesheet\" media=\"all\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            CategoryDAO categoryDAO = new CategoryDAO();
        
      out.write("\n");
      out.write("\n");
      out.write("         ");

            ProductDAO productDAO = new ProductDAO();
            String Ma_loai = "";
            if (request.getParameter("category") != null) {
                Ma_loai = request.getParameter("category");
            }
        
      out.write("\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-2 col-sm-2\">\n");
      out.write("                            <div class=\"logo\"><a href=\"Index.jsp\"><img src=\"images/logo.png\" alt=\"FnaticShop\"></a></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-10 col-sm-10\">\n");
      out.write("                            <div class=\"header_top\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-3\">\n");
      out.write("                                        <ul class=\"option_nav\">\n");
      out.write("                                            <li class=\"dorpdown\">\n");
      out.write("                                                <a href=\"#\">Vns</a>\n");
      out.write("                                                <ul class=\"subnav\">\n");
      out.write("                                                    <li><a href=\"#\">Vns</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Eng</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"dorpdown\">\n");
      out.write("                                                <a href=\"#\">VND</a>\n");
      out.write("                                                <ul class=\"subnav\">\n");
      out.write("                                                    <li><a href=\"#\">VND</a></li>\n");
      out.write("                                                    <li><a href=\"#\">USD</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <ul class=\"topmenu\">\n");
      out.write("                                            <li><a href=\"#\">News</a></li>\n");
      out.write("                                            <li><a href=\"#\">Media</a></li>\n");
      out.write("                                            <li><a href=\"#\">Support</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-3\">\n");
      out.write("                                        <ul class=\"usermenu\">\n");
      out.write("                                            <li><a href=\"Login.jsp\" class=\"log\">Login</a></li>\n");
      out.write("                                            <li><a href=\"Register.jsp\" class=\"reg\">Register</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("                            <div class=\"header_bottom\">\n");
      out.write("                                <ul class=\"option\">\n");
      out.write("                                    <li id=\"search\" class=\"search\">\n");
      out.write("                                        <form><input class=\"search-submit\" type=\"submit\" value=\"\"><input class=\"search-input\" placeholder=\"Enter your search term...\" type=\"text\" value=\"\" name=\"search\"></form>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"option-cart\">\n");
      out.write("                                        <a href=\"#\" class=\"cart-icon\">cart <span class=\"cart_no\"></span></a>\n");
      out.write("                                        <ul class=\"option-cart-item\">\n");
      out.write("                                            <li><span class=\"total\">Total <strong>$00.00</strong></span><button class=\"checkout\" onClick=\"location.href = 'checkout.html'\">CheckOut</button></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                                <div class=\"navbar-header\"><button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\"><span class=\"sr-only\">Toggle navigation</span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span></button></div>\n");
      out.write("                                <div class=\"navbar-collapse collapse\">\n");
      out.write("                                    <ul class=\"nav navbar-nav\">\n");
      out.write("                                        <li><a href=\"Index.jsp\">Home</a></li>                                                                \n");
      out.write("                                            ");

                                                for (Catalogue c : categoryDAO.getListCategory()) {

                                            
      out.write("\n");
      out.write("                                        <li><a href=\"Index.jsp?category=");
      out.print(c.getMaloai());
      out.write('"');
      out.write('>');
      out.print(c.getTenloai());
      out.write("</a></li>\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\n");
      out.write("                                        </a>                              \n");
      out.write("                                        </li>                                                          \n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("            <div class=\"container_fullwidth\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"hot-products\">\n");
      out.write("                        <h3 class=\"title\"><strong>Hot Products</strong></h3>\n");
      out.write("                        <div class=\"control\"><a id=\"prev_hot\" class=\"prev\" href=\"#\">&lt;</a><a id=\"next_hot\" class=\"next\" href=\"#\">&gt;</a></div>\n");
      out.write("                        <ul id=\"hot\">\n");
      out.write("                            <li>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                               \n");
      out.write("                              <div class=\"products\">\n");
      out.write("                                         ");

                        for (Product p : productDAO.getListProductByCategory(Ma_loai)) {
                    
      out.write("\n");
      out.write("\t\t\t\t\t<h2 class=\" products-in\"></h2>\n");
      out.write("\t\t\t\t\t<div class=\" top-products\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 md-col\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"compare-in\"><img  src=\"");
      out.print(p.getHinhanh());
      out.write("\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"compare\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>");
      out.print(p.getTensp());
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>");
      out.print(p.getMasp());
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5><a href=\"single.html\">");
      out.print(p.getMota());
      out.write("</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"white\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Số Lượng :");
      out.print(p.getSoluong());
      out.write(" Cái</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"dollar\"><span class=\"in-dollar\">$</span><span>");
      out.print(p.getDongia());
      out.write("</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                </div>\n");
      out.write("                                        </div>\n");
      out.write("                                            ");
}
      out.write("\n");
      out.write("                              </div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                    <div class=\"our-brand\">\n");
      out.write("                        <h3 class=\"title\"><strong>Thương hiệu</strong></h3>\n");
      out.write("                        <div class=\"control\"><a id=\"prev_brand\" class=\"prev\" href=\"#\">&lt;</a><a id=\"next_brand\" class=\"next\" href=\"#\">&gt;</a></div>\n");
      out.write("                        <ul id=\"braldLogo\">\n");
      out.write("                            <li>\n");
      out.write("                                <ul class=\"brand_item\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <div class=\"brand-logo\"><img src=\"images/envato.png\" alt=\"\"></div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <div class=\"brand-logo\"><img src=\"images/themeforest.png\" alt=\"\"></div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <div class=\"brand-logo\"><img src=\"images/photodune.png\" alt=\"\"></div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <div class=\"brand-logo\"><img src=\"images/activeden.png\" alt=\"\"></div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <div class=\"brand-logo\"><img src=\"images/envato.png\" alt=\"\"></div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <ul class=\"brand_item\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <div class=\"brand-logo\"><img src=\"images/envato.png\" alt=\"\"></div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <div class=\"brand-logo\"><img src=\"images/themeforest.png\" alt=\"\"></div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <div class=\"brand-logo\"><img src=\"images/photodune.png\" alt=\"\"></div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <div class=\"brand-logo\"><img src=\"images/activeden.png\" alt=\"\"></div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <div class=\"brand-logo\"><img src=\"images/envato.png\" alt=\"\"></div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <div class=\"footer-info\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <div class=\"footer-logo\"><a href=\"#\"><img src=\"images/logo.png\" alt=\"\"></a></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                                <h4 class=\"title\">Contact <strong>Info</strong></h4>\n");
      out.write("                                <p>No. 02, Phuloc7, Danang, Vietnam</p>\n");
      out.write("                                <p>Call Us : (+84) 0126.822.2096</p>\n");
      out.write("                                <p>Email : hungpvpd01590@fpt.edu.vn</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                                <h4 class=\"title\">Customer<strong> Support</strong></h4>\n");
      out.write("                                <ul class=\"support\">\n");
      out.write("                                    <li><a href=\"#\">FAQ</a></li>\n");
      out.write("                                    <li><a href=\"#\">Payment Option</a></li>\n");
      out.write("                                    <li><a href=\"#\">Booking Tips</a></li>\n");
      out.write("                                    <li><a href=\"#\">Infomation</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <h4 class=\"title\">Get Our <strong>Newsletter </strong></h4>\n");
      out.write("                                <p>Lorem ipsum dolor ipsum dolor.</p>\n");
      out.write("                                <form class=\"newsletter\">\n");
      out.write("                                    <input type=\"text\" name=\"\" placeholder=\"Type your email....\">\n");
      out.write("                                    <input type=\"submit\" value=\"SignUp\" class=\"button\">\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"copyright-info\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <p>Copyright © 2012. Designed by <a href=\"#\">Michael Lee</a>. All rights reseved</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <ul class=\"social-icon\">\n");
      out.write("                                    <li><a href=\"#\" class=\"linkedin\"></a></li>\n");
      out.write("                                    <li><a href=\"#\" class=\"google-plus\"></a></li>\n");
      out.write("                                    <li><a href=\"#\" class=\"twitter\"></a></li>\n");
      out.write("                                    <li><a href=\"#\" class=\"facebook\"></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Bootstrap core JavaScript==================================================-->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.10.2.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.sequence-min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.carouFredSel-6.2.1-packed.js\"></script>\n");
      out.write("        <script defer src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/script.min.js\" ></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
