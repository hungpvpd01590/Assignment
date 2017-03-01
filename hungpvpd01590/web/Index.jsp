<%-- 
    Document   : Index
    Created on : Oct 19, 2016, 11:27:57 PM
    Author     : PC
--%>
<%@page import="Model.Product"%>
<%@page import="Dao.ProductDAO"%>
<%@page import="Model.Catalogue"%>
<%@page import="Dao.CategoryDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" href="images/favicon.ico">
        <title>Fnatic Việt Nam</title>
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href='http://fonts.googleapis.com/css?family=Roboto:400,300,300italic,400italic,500,700,500italic,100italic,100' rel='stylesheet' type='text/css'>
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen"/>
        <link href="css/sequence-looptheme.css" rel="stylesheet" media="all"/>
        <link href="css/style.css" rel="stylesheet">
    </head>
    <body>
        <%
            CategoryDAO categoryDAO = new CategoryDAO();
        %>

         <%
            ProductDAO productDAO = new ProductDAO();
            String Ma_loai = "";
            if (request.getParameter("category") != null) {
                Ma_loai = request.getParameter("category");
            }
        %>
        <div class="wrapper">
            <div class="header">
                <div class="container">
                    <div class="row">
                        <div class="col-md-2 col-sm-2">
                            <div class="logo"><a href="Index.jsp"><img src="images/logo.png" alt="FnaticShop"></a></div>
                        </div>
                        <div class="col-md-10 col-sm-10">
                            <div class="header_top">
                                <div class="row">
                                    <div class="col-md-3">
                                        <ul class="option_nav">
                                            <li class="dorpdown">
                                                <a href="#">Vns</a>
                                                <ul class="subnav">
                                                    <li><a href="#">Vns</a></li>
                                                    <li><a href="#">Eng</a></li>
                                                </ul>
                                            </li>
                                            <li class="dorpdown">
                                                <a href="#">VND</a>
                                                <ul class="subnav">
                                                    <li><a href="#">VND</a></li>
                                                    <li><a href="#">USD</a></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="col-md-6">
                                        <ul class="topmenu">
                                            <li><a href="#">News</a></li>
                                            <li><a href="#">Media</a></li>
                                            <li><a href="#">Support</a></li>
                                        </ul>
                                    </div>
                                    <div class="col-md-3">
                                        <ul class="usermenu">
                                            <li><a href="Login.jsp" class="log">Login</a></li>
                                            <li><a href="Register.jsp" class="reg">Register</a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="clearfix"></div>
                            <div class="header_bottom">
                                <ul class="option">
                                    <li id="search" class="search">
                                        <form><input class="search-submit" type="submit" value=""><input class="search-input" placeholder="Enter your search term..." type="text" value="" name="search"></form>
                                    </li>
                                    <li class="option-cart">
                                        <a href="#" class="cart-icon">cart <span class="cart_no"></span></a>
                                        <ul class="option-cart-item">
                                            <li><span class="total">Total <strong>$00.00</strong></span><button class="checkout" onClick="location.href = 'checkout.html'">CheckOut</button></li>
                                        </ul>
                                    </li>
                                </ul>
                                <div class="navbar-header"><button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button></div>
                                <div class="navbar-collapse collapse">
                                    <ul class="nav navbar-nav">
                                        <li><a href="Index.jsp">Home</a></li>                                                                
                                            <%
                                                for (Catalogue c : categoryDAO.getListCategory()) {

                                            %>
                                        <li><a href="Index.jsp?category=<%=c.getMaloai()%>"><%=c.getTenloai()%></a></li>
                                            <%
                                                }
                                            %>
                                        </a>                              
                                        </li>                                                          
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="clearfix"></div>
            <div class="container_fullwidth">
                <div class="container">
                    <div class="hot-products">
                        <h3 class="title"><strong>Hot Products</strong></h3>
                        <div class="control"><a id="prev_hot" class="prev" href="#">&lt;</a><a id="next_hot" class="next" href="#">&gt;</a></div>
                        <ul id="hot">
                            <li>
                                <div class="row">
                               
                              <div class="products">
                                         <%
                        for (Product p : productDAO.getListProductByCategory(Ma_loai)) {
                    %>
					<h2 class=" products-in"></h2>
					<div class=" top-products">
						<div class="col-md-3 md-col">
							<div class="col-md">
								<a href="single.html" class="compare-in"><img  src="<%=p.getHinhanh()%>" alt="" />
								<div class="compare">
									<span><%=p.getTensp()%></span>
									<span><%=p.getMasp()%></span>
								</div>
								</a>	
								<div class="top-content">
									<h5><a href="single.html"><%=p.getMota()%></a></h5>
									<div class="white">
										<a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">Số Lượng :<%=p.getSoluong()%> Cái</a>
										<p class="dollar"><span class="in-dollar">$</span><span><%=p.getDongia()%></span></p>
										<div class="clearfix"></div>
									</div>
								</div>							
							</div>
                                                </div>
                                        </div>
                                            <%}%>
                              </div>
						
						
						
					<div class="clearfix"></div>
					</div>
					

                    <div class="clearfix"></div>
                    <div class="our-brand">
                        <h3 class="title"><strong>Thương hiệu</strong></h3>
                        <div class="control"><a id="prev_brand" class="prev" href="#">&lt;</a><a id="next_brand" class="next" href="#">&gt;</a></div>
                        <ul id="braldLogo">
                            <li>
                                <ul class="brand_item">
                                    <li>
                                        <a href="#">
                                            <div class="brand-logo"><img src="images/envato.png" alt=""></div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <div class="brand-logo"><img src="images/themeforest.png" alt=""></div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <div class="brand-logo"><img src="images/photodune.png" alt=""></div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <div class="brand-logo"><img src="images/activeden.png" alt=""></div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <div class="brand-logo"><img src="images/envato.png" alt=""></div>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <ul class="brand_item">
                                    <li>
                                        <a href="#">
                                            <div class="brand-logo"><img src="images/envato.png" alt=""></div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <div class="brand-logo"><img src="images/themeforest.png" alt=""></div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <div class="brand-logo"><img src="images/photodune.png" alt=""></div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <div class="brand-logo"><img src="images/activeden.png" alt=""></div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <div class="brand-logo"><img src="images/envato.png" alt=""></div>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="clearfix"></div>
            <div class="footer">
                <div class="footer-info">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-3">
                                <div class="footer-logo"><a href="#"><img src="images/logo.png" alt=""></a></div>
                            </div>
                            <div class="col-md-3 col-sm-6">
                                <h4 class="title">Contact <strong>Info</strong></h4>
                                <p>No. 02, Phuloc7, Danang, Vietnam</p>
                                <p>Call Us : (+84) 0126.822.2096</p>
                                <p>Email : hungpvpd01590@fpt.edu.vn</p>
                            </div>
                            <div class="col-md-3 col-sm-6">
                                <h4 class="title">Customer<strong> Support</strong></h4>
                                <ul class="support">
                                    <li><a href="#">FAQ</a></li>
                                    <li><a href="#">Payment Option</a></li>
                                    <li><a href="#">Booking Tips</a></li>
                                    <li><a href="#">Infomation</a></li>
                                </ul>
                            </div>
                            <div class="col-md-3">
                                <h4 class="title">Get Our <strong>Newsletter </strong></h4>
                                <p>Lorem ipsum dolor ipsum dolor.</p>
                                <form class="newsletter">
                                    <input type="text" name="" placeholder="Type your email....">
                                    <input type="submit" value="SignUp" class="button">
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="copyright-info">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-6">
                                <p>Copyright © 2012. Designed by <a href="#">Michael Lee</a>. All rights reseved</p>
                            </div>
                            <div class="col-md-6">
                                <ul class="social-icon">
                                    <li><a href="#" class="linkedin"></a></li>
                                    <li><a href="#" class="google-plus"></a></li>
                                    <li><a href="#" class="twitter"></a></li>
                                    <li><a href="#" class="facebook"></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Bootstrap core JavaScript==================================================-->
        <script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
        <script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/jquery.sequence-min.js"></script>
        <script type="text/javascript" src="js/jquery.carouFredSel-6.2.1-packed.js"></script>
        <script defer src="js/jquery.flexslider.js"></script>
        <script type="text/javascript" src="js/script.min.js" ></script>
    </body>
</html>