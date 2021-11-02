package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\"Cake Template\">\n");
      out.write("        <meta name=\"keywords\" content=\"Cake, unica, creative, html\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <title>TaToOr - Trang chủ</title>\n");
      out.write("        <link rel=\"ICON\" href=\"./pictures/logo3.png\" type=\"image/ico\" />\n");
      out.write("\n");
      out.write("        <!-- Google Font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Playfair+Display:wght@400;500;600;700;800;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;600;700;800;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Css Styles -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flaticon.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/barfiller.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/elegant-icons.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nice-select.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slicknav.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- Page Preloder -->\n");
      out.write("        <div id=\"preloder\">\n");
      out.write("            <div class=\"loader\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Offcanvas Menu Begin -->\n");
      out.write("        <div class=\"offcanvas-menu-overlay\"></div>\n");
      out.write("        <div class=\"offcanvas-menu-wrapper\">\n");
      out.write("            <div class=\"offcanvas__cart\">\n");
      out.write("                <div class=\"offcanvas__cart__links\">\n");
      out.write("                    <a href=\"#\" class=\"search-switch\"><img src=\"img/icon/search.png\" alt=\"\"></a>\n");
      out.write("                    <a href=\"#\"><img src=\"img/icon/heart.png\" alt=\"\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"offcanvas__cart__item\">\n");
      out.write("                    <a href=\"#\"><img src=\"img/icon/cart.png\" alt=\"\"> <span>0</span></a>\n");
      out.write("                    <div class=\"cart__price\">Cart: <span>$0.00</span></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"offcanvas__logo\">\n");
      out.write("                <a href=\"./index.html\"><img src=\"img/logo.png\" alt=\"\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"mobile-menu-wrap\"></div>\n");
      out.write("            <div class=\"offcanvas__option\">\n");
      out.write("                <ul>\n");
      out.write("                    <li>USD <span class=\"arrow_carrot-down\"></span>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>EUR</li>\n");
      out.write("                            <li>USD</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>ENG <span class=\"arrow_carrot-down\"></span>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>Spanish</li>\n");
      out.write("                            <li>ENG</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"LoginForm.jsp\">Login</a> <span class=\"arrow_carrot-down\"></span>\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"Login\"><a href=\"LoginForm.jsp\">Login</a></li>\n");
      out.write("                            <li class=\"Login\"><a href=\"Register.jsp\">Register</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Offcanvas Menu End -->\n");
      out.write("\n");
      out.write("        <!-- Header Section Begin -->\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <div class=\"header__top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <div class=\"header__top__inner\">\n");
      out.write("                                <div class=\"header__top__left\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li>\n");
      out.write("                                            <img src=\"img/icon/login.png\" alt=\"\" height=\"25px\" width=\"25px\">\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"header__logo\">\n");
      out.write("                                    <a href=\"./index.html\"><img src=\"img/logo.png\" alt=\"\"></a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"header__top__right\">\n");
      out.write("                                    <div class=\"header__top__right__links\">\n");
      out.write("                                        <a href=\"#\" class=\"search-switch\"><img src=\"img/icon/search.png\" alt=\"\"></a>\n");
      out.write("                                        <a href=\"#\"><img src=\"img/icon/heart.png\" alt=\"\"></a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"header__top__right__cart\">\n");
      out.write("                                        <a href=\"#\"><img src=\"img/icon/cart.png\" alt=\"\"> <span>0</span></a>\n");
      out.write("                                        <div class=\"cart__price\">Cart: <span>$0.00</span></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"canvas__open\"><i class=\"fa fa-bars\"></i></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <nav class=\"header__menu mobile-menu\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li class=\"active\"><a href=\"./index.jsp\">Trang chủ</a></li>\n");
      out.write("                                <li><a href=\"IndexProduct\">Chọn Món</a></li>\n");
      out.write("                                <li><a href=\"#\">Tùy chọn</a>\n");
      out.write("                                    <ul class=\"dropdown\">\n");
      out.write("                                        <li><a href=\"./shop-details.jsp\">Thông Tin Sản Phẩm</a></li>\n");
      out.write("                                        <li><a href=\"./shoping-cart.jsp\">Giỏ Hàng</a></li>\n");
      out.write("                                        <li><a href=\"./checkout.jsp\">Thanh Toán</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"./blog.jsp\">Thuyết Trình</a></li>\n");
      out.write("                                <li><a href=\"./contact.jsp\">Liên Hệ</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- Header Section End -->\n");
      out.write("\n");
      out.write("        <!-- Hero Section Begin -->\n");
      out.write("        <section class=\"hero\">\n");
      out.write("            <div class=\"hero__slider owl-carousel\">\n");
      out.write("                <div class=\"hero__item set-bg\" data-setbg=\"img/hero/hero-1.jpg\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row d-flex justify-content-center\">\n");
      out.write("                            <div class=\"col-lg-8\">\n");
      out.write("                                <div class=\"hero__text\">\n");
      out.write("                                    <h2>Bạn đã đói bụng chưa ?</h2>\n");
      out.write("                                    <a href=\"IndexProduct\" class=\"primary-btn\">Chọn Món Ngay?</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Hero Section End -->\n");
      out.write("\n");
      out.write("        <!-- About Section Begin -->\n");
      out.write("        <section class=\"about spad\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-6 col-md-6\">\n");
      out.write("                        <div class=\"about__text\">\n");
      out.write("                            <div class=\"section-title\">\n");
      out.write("                                <span>Đôi nét về TaToOr</span>\n");
      out.write("                                <h2>Là một dự án của nhóm 6</h2>\n");
      out.write("                            </div>\n");
      out.write("                            <p>Trang web này được tạo ra để passed môn</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 col-md-6\">\n");
      out.write("                        <div class=\"about__bar\">\n");
      out.write("                            Tỉ lệ làm việc nhóm:\n");
      out.write("                            <div class=\"about__bar__item\">\n");
      out.write("                                <p>Nguyễn Thị Ngọc Yến</p>\n");
      out.write("                                <div id=\"bar1\" class=\"barfiller\">\n");
      out.write("                                    <div class=\"tipWrap\"><span class=\"tip\"></span></div>\n");
      out.write("                                    <span class=\"fill\" data-percentage=\"100\"></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"about__bar__item\">\n");
      out.write("                                <p>Lê Hoàng Thái</p>\n");
      out.write("                                <div id=\"bar2\" class=\"barfiller\">\n");
      out.write("                                    <div class=\"tipWrap\"><span class=\"tip\"></span></div>\n");
      out.write("                                    <span class=\"fill\" data-percentage=\"100\"></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"about__bar__item\">\n");
      out.write("                                <p>Nguyễn Chí Nguyên</p>\n");
      out.write("                                <div id=\"bar3\" class=\"barfiller\">\n");
      out.write("                                    <div class=\"tipWrap\"><span class=\"tip\"></span></div>\n");
      out.write("                                    <span class=\"fill\" data-percentage=\"100\"></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- About Section End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Team Section Begin -->\n");
      out.write("        <section class=\"team spad\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-7 col-md-7 col-sm-7\">\n");
      out.write("                        <div class=\"section-title\">\n");
      out.write("                            <span>Thành viên Nhóm:</span>\n");
      out.write("                            <h2>Nhóm mình đang chiêu mộ thành viên </h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-5 col-md-5 col-sm-5\">\n");
      out.write("                        <div class=\"team__btn\">\n");
      out.write("                            <a href=\"#\" class=\"primary-btn\">Tham gia cùng chúng tôi!</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-6\">\n");
      out.write("                        <div class=\"team__item set-bg\" data-setbg=\"img/team/team-1.jpg\">\n");
      out.write("                            <div class=\"team__item__text\">\n");
      out.write("                                <h6>Nguyễn Thị Ngọc Yến</h6>\n");
      out.write("                                <span>Cô giáo dạy tiếng Nhật</span>\n");
      out.write("                                <div class=\"team__item__social\">\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-youtube-play\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-6\">\n");
      out.write("                        <div class=\"team__item set-bg\" data-setbg=\"img/team/team-2.jpg\">\n");
      out.write("                            <div class=\"team__item__text\">\n");
      out.write("                                <h6>Nguyễn Chí Nguyên</h6>\n");
      out.write("                                <span>Nhà Bình Phẩm Thức Ăn - Tiktoker</span>\n");
      out.write("                                <div class=\"team__item__social\">\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-youtube-play\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-6\">\n");
      out.write("                        <div class=\"team__item set-bg\" data-setbg=\"img/team/team-3.jpg\">\n");
      out.write("                            <div class=\"team__item__text\">\n");
      out.write("                                <h6>Lê Hoàng Thái</h6>\n");
      out.write("                                <span>Đi làm để kiếm tiền để thành AppleFans</span>\n");
      out.write("                                <div class=\"team__item__social\">\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-youtube-play\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Team Section End -->\n");
      out.write("\n");
      out.write("        <!-- Testimonial Section Begin -->\n");
      out.write("        <section class=\"testimonial spad\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12 text-center\">\n");
      out.write("                        <div class=\"section-title\">\n");
      out.write("                            <span>Đánh Giá</span>\n");
      out.write("                            <h2>Khách Hàng Chúng Tôi đã đánh giá gì ?</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"testimonial__slider owl-carousel\">\n");
      out.write("                        <div class=\"col-lg-6\">\n");
      out.write("                            <div class=\"testimonial__item\">\n");
      out.write("                                <div class=\"testimonial__author\">\n");
      out.write("                                    <div class=\"testimonial__author__pic\">\n");
      out.write("                                        <img src=\"img/testimonial/ta-1.jpg\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"testimonial__author__text\">\n");
      out.write("                                        <h5>Kerry D.Silva</h5>\n");
      out.write("                                        <span>New york</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star-half_alt\"></span>\n");
      out.write("                                </div>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua viverra lacus vel facilisis.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-6\">\n");
      out.write("                            <div class=\"testimonial__item\">\n");
      out.write("                                <div class=\"testimonial__author\">\n");
      out.write("                                    <div class=\"testimonial__author__pic\">\n");
      out.write("                                        <img src=\"img/testimonial/ta-2.jpg\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"testimonial__author__text\">\n");
      out.write("                                        <h5>Kerry D.Silva</h5>\n");
      out.write("                                        <span>New york</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star-half_alt\"></span>\n");
      out.write("                                </div>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua viverra lacus vel facilisis.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-6\">\n");
      out.write("                            <div class=\"testimonial__item\">\n");
      out.write("                                <div class=\"testimonial__author\">\n");
      out.write("                                    <div class=\"testimonial__author__pic\">\n");
      out.write("                                        <img src=\"img/testimonial/ta-1.jpg\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"testimonial__author__text\">\n");
      out.write("                                        <h5>Ophelia Nunez</h5>\n");
      out.write("                                        <span>London</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star-half_alt\"></span>\n");
      out.write("                                </div>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua viverra lacus vel facilisis.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-6\">\n");
      out.write("                            <div class=\"testimonial__item\">\n");
      out.write("                                <div class=\"testimonial__author\">\n");
      out.write("                                    <div class=\"testimonial__author__pic\">\n");
      out.write("                                        <img src=\"img/testimonial/ta-2.jpg\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"testimonial__author__text\">\n");
      out.write("                                        <h5>Kerry D.Silva</h5>\n");
      out.write("                                        <span>New york</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star-half_alt\"></span>\n");
      out.write("                                </div>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua viverra lacus vel facilisis.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-6\">\n");
      out.write("                            <div class=\"testimonial__item\">\n");
      out.write("                                <div class=\"testimonial__author\">\n");
      out.write("                                    <div class=\"testimonial__author__pic\">\n");
      out.write("                                        <img src=\"img/testimonial/ta-1.jpg\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"testimonial__author__text\">\n");
      out.write("                                        <h5>Ophelia Nunez</h5>\n");
      out.write("                                        <span>London</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star-half_alt\"></span>\n");
      out.write("                                </div>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua viverra lacus vel facilisis.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-6\">\n");
      out.write("                            <div class=\"testimonial__item\">\n");
      out.write("                                <div class=\"testimonial__author\">\n");
      out.write("                                    <div class=\"testimonial__author__pic\">\n");
      out.write("                                        <img src=\"img/testimonial/ta-2.jpg\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"testimonial__author__text\">\n");
      out.write("                                        <h5>Kerry D.Silva</h5>\n");
      out.write("                                        <span>New york</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star\"></span>\n");
      out.write("                                    <span class=\"icon_star-half_alt\"></span>\n");
      out.write("                                </div>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua viverra lacus vel facilisis.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Testimonial Section End -->\n");
      out.write("\n");
      out.write("        <!-- Map Begin -->\n");
      out.write("        <div class=\"map\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4 col-md-7\">\n");
      out.write("                        <div class=\"map__inner\">\n");
      out.write("                            <h6>COlorado</h6>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>1000 Lakepoint Dr, Frisco, CO 80443, USA</li>\n");
      out.write("                                <li>Sweetcake@support.com</li>\n");
      out.write("                                <li>+1 800-786-1000</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"map__iframe\">\n");
      out.write("                <iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d10784.188505644011!2d19.053119335158936!3d47.48899529453826!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sbd!4v1543907528304\" height=\"300\" style=\"border:0;\" allowfullscreen=\"\"\n");
      out.write("                        aria-hidden=\"false\" tabindex=\"0\"></iframe>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Map End -->\n");
      out.write("\n");
      out.write("        <!-- Footer Section Begin -->\n");
      out.write("        <footer class=\"footer set-bg\" data-setbg=\"img/footer-bg.jpg\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-6\">\n");
      out.write("                        <div class=\"footer__widget\">\n");
      out.write("                            <h6>Giờ Chạy DeadLine</h6>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>Thứ Hai - Thứ 6: 07:00 chiều – 10:00 tối</li>\n");
      out.write("                                <li>Thứ Bảy: 10:00 sáng – 11:30 trưa </li>\n");
      out.write("                                <li>và 2:30 chiều - 4:30 chiều</li>\n");
      out.write("                                <li>Chủ Nhật: Tùy Hứng</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-6\">\n");
      out.write("                        <div class=\"footer__about\">\n");
      out.write("                            <div class=\"footer__logo\">\n");
      out.write("                                <a href=\"#\"><img src=\"img/footer-logo.png\" alt=\"\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <p>From SE1504 with Love</p>\n");
      out.write("                            <div class=\"footer__social\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-youtube-play\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-6\">\n");
      out.write("                        <div class=\"footer__newslatter\">\n");
      out.write("                            <h6>Đăng ký</h6>\n");
      out.write("                            <p>Nhận thông tin món ăn mới nhất từ chúng tôi.</p>\n");
      out.write("                            <form action=\"#\">\n");
      out.write("                                <input type=\"text\" placeholder=\"Email\">\n");
      out.write("                                <button type=\"submit\"><i class=\"fa fa-send-o\"></i></button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"copyright\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-7\">\n");
      out.write("                            <p class=\"copyright__text text-white\">\n");
      out.write("                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                                Copyright &copy;\n");
      out.write("                                <script>\n");
      out.write("                                    document.write(new Date().getFullYear());\n");
      out.write("                                </script> All rights reserved | This template is made with <i class=\"fa fa-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-5\">\n");
      out.write("                            <div class=\"copyright__widget\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                                    <li><a href=\"#\">Terms & Conditions</a></li>\n");
      out.write("                                    <li><a href=\"#\">Site Map</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- Footer Section End -->\n");
      out.write("\n");
      out.write("        <!-- Js Plugins -->\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.nice-select.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.barfiller.js\"></script>\n");
      out.write("        <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.slicknav.js\"></script>\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.nicescroll.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.User == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <a href=\"LoginForm.jsp\">Đăng nhập</a>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.User != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.User}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.User == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <a href=\"Register.jsp\"  class=\"Login\">Đăng ký</a>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.User != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Admin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.User == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.User != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <a href=\"LogOutAccount\" class=\"Login\">Đăng xuất</a>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }
}
