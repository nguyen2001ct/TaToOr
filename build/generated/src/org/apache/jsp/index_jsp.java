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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zxx\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"description\" content=\"Cake Template\">\r\n");
      out.write("        <meta name=\"keywords\" content=\"Cake, unica, creative, html\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("\r\n");
      out.write("        <title>TaToOr - Trang Chủ</title>\r\n");
      out.write("        <link rel=\"ICON\" href=\"./pictures/logo3.png\" type=\"image/ico\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- Google Font -->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Playfair+Display:wght@400;500;600;700;800;900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;600;700;800;900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Css Styles -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flaticon.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/barfiller.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/elegant-icons.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nice-select.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slicknav.min.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Page Preloder -->\r\n");
      out.write("        <div id=\"preloder\">\r\n");
      out.write("            <div class=\"loader\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Offcanvas Menu Begin -->\r\n");
      out.write("        <div class=\"offcanvas-menu-overlay\"></div>\r\n");
      out.write("        <div class=\"offcanvas-menu-wrapper\">\r\n");
      out.write("            <div class=\"offcanvas__cart\">\r\n");
      out.write("                <div class=\"offcanvas__cart__links\">\r\n");
      out.write("                    <a href=\"#\" class=\"search-switch\"><img src=\"img/icon/search.png\" alt=\"\"></a>\r\n");
      out.write("                    <a href=\"#\"><img src=\"img/icon/heart.png\" alt=\"\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"offcanvas__cart__item\">\r\n");
      out.write("                    <a href=\"#\"><img src=\"img/icon/cart.png\" alt=\"\"> <span>0</span></a>\r\n");
      out.write("                    <div class=\"cart__price\">Cart: <span>$0.00</span></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"offcanvas__logo\">\r\n");
      out.write("                <a href=\"./index.html\"><img src=\"img/logo.png\" alt=\"\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"mobile-menu-wrap\"></div>\r\n");
      out.write("            <div class=\"offcanvas__option\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"LoginForm.jsp\">Login</a> <span class=\"arrow_carrot-down\"></span>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li class=\"Login\"><a href=\"LoginForm.jsp\">Login</a></li>\r\n");
      out.write("                            <li class=\"Login\"><a href=\"Register.jsp\">Register</a></li>\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Offcanvas Menu End -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Header Section Begin -->\r\n");
      out.write("        <header class=\"header\">\r\n");
      out.write("            <div class=\"header__top\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-12\">\r\n");
      out.write("                            <div class=\"header__top__inner\">\r\n");
      out.write("                                <div class=\"header__top__left\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <img src=\"img/icon/login.png\" alt=\"\" height=\"25px\" width=\"25px\">\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"header__logo\">\r\n");
      out.write("                                    <a href=\"./index.html\"><img src=\"img/logo.png\" alt=\"\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"header__top__right\">\r\n");
      out.write("                                    <div class=\"header__top__right__cart\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"img/icon/cart.png\" alt=\"\"> <span>0</span></a>\r\n");
      out.write("                                        <div class=\"cart__price\">Cart: <span>$0.00</span></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"canvas__open\"><i class=\"fa fa-bars\"></i></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                        <nav class=\"header__menu mobile-menu\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li class=\"active\"><a href=\"Guest\">Trang chủ</a></li>\r\n");
      out.write("                                <li><a href=\"IndexProduct\">Chọn Món</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Tùy chọn</a>\r\n");
      out.write("                                    <ul class=\"dropdown\">\r\n");
      out.write("                                        <li><a href=\"./ShowOrder\">Giỏ Hàng</a></li>\r\n");
      out.write("                                        <li><a href=\"./checkout.jsp\">Thanh Toán</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li><a href=\"./blog.jsp\">Thuyết Trình</a></li>\r\n");
      out.write("                                <li><a href=\"./contact.jsp\">Liên Hệ</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- Header Section End -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Hero Section Begin -->\r\n");
      out.write("        <section class=\"hero\">\r\n");
      out.write("            <div class=\"hero__slider owl-carousel\">\r\n");
      out.write("                <div class=\"hero__item set-bg\" data-setbg=\"img/hero/hero-1.jpg\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"row d-flex justify-content-center\">\r\n");
      out.write("                            <div class=\"col-lg-8\">\r\n");
      out.write("                                <div class=\"hero__text\">\r\n");
      out.write("                                    <h2>Bạn đã đói bụng chưa ?</h2>\r\n");
      out.write("                                    <a href=\"IndexProduct\" class=\"primary-btn\">Chọn Món Ngay?</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- Hero Section End -->\r\n");
      out.write("\r\n");
      out.write("        <!-- About Section Begin -->\r\n");
      out.write("        <section class=\"about spad\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-6 col-md-6\">\r\n");
      out.write("                        <div class=\"about__text\">\r\n");
      out.write("                            <div class=\"section-title\">\r\n");
      out.write("                                <span>Đôi nét về TaToOr</span>\r\n");
      out.write("                                <h2>Là một dự án của nhóm 6</h2>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p>Trang web này được tạo ra để pass môn</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-6 col-md-6\">\r\n");
      out.write("                        <div class=\"about__bar\">\r\n");
      out.write("                            Tỉ lệ làm việc nhóm:\r\n");
      out.write("                            <div class=\"about__bar__item\">\r\n");
      out.write("                                <p>Nguyễn Thị Ngọc Yến</p>\r\n");
      out.write("                                <div id=\"bar1\" class=\"barfiller\">\r\n");
      out.write("                                    <div class=\"tipWrap\"><span class=\"tip\"></span></div>\r\n");
      out.write("                                    <span class=\"fill\" data-percentage=\"100\"></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"about__bar__item\">\r\n");
      out.write("                                <p>Lê Hoàng Thái</p>\r\n");
      out.write("                                <div id=\"bar2\" class=\"barfiller\">\r\n");
      out.write("                                    <div class=\"tipWrap\"><span class=\"tip\"></span></div>\r\n");
      out.write("                                    <span class=\"fill\" data-percentage=\"100\"></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"about__bar__item\">\r\n");
      out.write("                                <p>Nguyễn Chí Nguyên</p>\r\n");
      out.write("                                <div id=\"bar3\" class=\"barfiller\">\r\n");
      out.write("                                    <div class=\"tipWrap\"><span class=\"tip\"></span></div>\r\n");
      out.write("                                    <span class=\"fill\" data-percentage=\"100\"></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- Team Section Begin -->\r\n");
      out.write("        <section class=\"team spad\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-7 col-md-7 col-sm-7\">\r\n");
      out.write("                        <div class=\"section-title\">\r\n");
      out.write("                            <span>Thành viên Nhóm:</span>\r\n");
      out.write("                            <h2>Nhóm mình đang chiêu mộ thành viên </h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-5 col-md-5 col-sm-5\">\r\n");
      out.write("                        <div class=\"team__btn\">\r\n");
      out.write("                            <a href=\"#\" class=\"primary-btn\">Tham gia cùng chúng tôi!</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-6\">\r\n");
      out.write("                        <div class=\"team__item set-bg\" data-setbg=\"img/team/team-1.jpg\">\r\n");
      out.write("                            <div class=\"team__item__text\">\r\n");
      out.write("                                <h6>Nguyễn Thị Ngọc Yến</h6>\r\n");
      out.write("                                <span>Cô giáo dạy tiếng Nhật</span>\r\n");
      out.write("                                <div class=\"team__item__social\">\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-youtube-play\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-6\">\r\n");
      out.write("                        <div class=\"team__item set-bg\" data-setbg=\"img/team/team-2.jpg\">\r\n");
      out.write("                            <div class=\"team__item__text\">\r\n");
      out.write("                                <h6>Nguyễn Chí Nguyên</h6>\r\n");
      out.write("                                <span>Nhà Bình Phẩm Thức Ăn - Tiktoker</span>\r\n");
      out.write("                                <div class=\"team__item__social\">\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-youtube-play\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-6\">\r\n");
      out.write("                        <div class=\"team__item set-bg\" data-setbg=\"img/team/team-3.jpg\">\r\n");
      out.write("                            <div class=\"team__item__text\">\r\n");
      out.write("                                <h6>Lê Hoàng Thái</h6>\r\n");
      out.write("                                <span>Đi làm để kiếm tiền để thành AppleFans</span>\r\n");
      out.write("                                <div class=\"team__item__social\">\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-youtube-play\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- Team Section End -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Testimonial Section Begin -->\r\n");
      out.write("        <section class=\"testimonial spad\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12 text-center\">\r\n");
      out.write("                        <div class=\"section-title\">\r\n");
      out.write("                            <span>Đánh Giá</span>\r\n");
      out.write("                            <h2>Khách Hàng Chúng Tôi đã đánh giá gì ?</h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"testimonial__slider owl-carousel\">\r\n");
      out.write("                        <div class=\"col-lg-6\">\r\n");
      out.write("                            <div class=\"testimonial__item\">\r\n");
      out.write("                                <div class=\"testimonial__author\">\r\n");
      out.write("                                    <div class=\"testimonial__author__pic\">\r\n");
      out.write("                                        <img src=\"https://scontent.fsgn5-10.fna.fbcdn.net/v/t1.6435-9/127541583_1238316293221986_1426597242057875459_n.jpg?_nc_cat=110&ccb=1-5&_nc_sid=174925&_nc_ohc=l3uq3C_5g6QAX9HQCKy&_nc_ht=scontent.fsgn5-10.fna&oh=9d4b1373ded0a91fc644e0d77d63a16d&oe=61AB1D01\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"testimonial__author__text\">\r\n");
      out.write("                                        <h5>Đặng Ngọc Tùng Duy</h5>\r\n");
      out.write("                                        <span>Đại Học FPT Cần Thơ</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"rating\">\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <p>Mua đồ ăn ở đây rồi làm vài chai bia là hết sẩy!!!</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-6\">\r\n");
      out.write("                            <div class=\"testimonial__item\">\r\n");
      out.write("                                <div class=\"testimonial__author\">\r\n");
      out.write("                                    <div class=\"testimonial__author__pic\">\r\n");
      out.write("                                        <img src=\"https://scontent.fsgn5-6.fna.fbcdn.net/v/t1.6435-9/248559541_1032075830960875_4020897884494738835_n.jpg?_nc_cat=106&ccb=1-5&_nc_sid=09cbfe&_nc_ohc=WIN4qe7mQtQAX-k99uH&_nc_ht=scontent.fsgn5-6.fna&oh=17c51a92b56bc9a984c8114f044ccdba&oe=61A7E341\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"testimonial__author__text\">\r\n");
      out.write("                                        <h5>Nguyễn Thành Đô</h5>\r\n");
      out.write("                                        <span>Đại Học FPT Cần Thơ</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"rating\">\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <p>Tôi chọn món Bún Đậu Mắm Tôm nhưng được tặng thêm bịch nước tương tôi rất thích!!! <3</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-6\">\r\n");
      out.write("                            <div class=\"testimonial__item\">\r\n");
      out.write("                                <div class=\"testimonial__author\">\r\n");
      out.write("                                    <div class=\"testimonial__author__pic\">\r\n");
      out.write("                                        <img src=\"https://image-us.24h.com.vn/upload/2-2020/images/2020-05-12/83395730_134841691333804_1955901610945150976_o-1589260776-4-width960height960.jpg\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"testimonial__author__text\">\r\n");
      out.write("                                        <h5>Nguyễn Minh Hiếu</h5>\r\n");
      out.write("                                        <span>Cai Lậy, Tiền Giang</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"rating\">\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <p>Ngon lắm, thơm lắm, y như mùi sầu riêng vậy đó</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-6\">\r\n");
      out.write("                            <div class=\"testimonial__item\">\r\n");
      out.write("                                <div class=\"testimonial__author\">\r\n");
      out.write("                                    <div class=\"testimonial__author__pic\">\r\n");
      out.write("                                        <img src=\"https://i.ytimg.com/vi/9FCO8wTVaHI/hqdefault.jpg\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"testimonial__author__text\">\r\n");
      out.write("                                        <h5>Huấn Rose</h5>\r\n");
      out.write("                                        <span>Yến Bái</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"rating\">\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("\r\n");
      out.write("                                    <span class=\"icon_star-half_alt\"></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <p>Ngon lắm, 4.5 sao</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-6\">\r\n");
      out.write("                            <div class=\"testimonial__item\">\r\n");
      out.write("                                <div class=\"testimonial__author\">\r\n");
      out.write("                                    <div class=\"testimonial__author__pic\">\r\n");
      out.write("                                        <img src=\"https://i.vietgiaitri.com/2021/9/5/ba-phuong-hang-se-tang-luon-cai-dai-nam-neu-ai-tim-duoc-van-ban-nao-minh-keu-goi-quyen-gop-f94-6008990.jpg\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"testimonial__author__text\">\r\n");
      out.write("                                        <h5>Nguyễn Phương Hằng</h5>\r\n");
      out.write("                                        <span>Bình Dương</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"rating\">\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <p>Quá ok luôn nhe quí dị, rất là bình dân nhe quí dị.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-6\">\r\n");
      out.write("                            <div class=\"testimonial__item\">\r\n");
      out.write("                                <div class=\"testimonial__author\">\r\n");
      out.write("                                    <div class=\"testimonial__author__pic\">\r\n");
      out.write("                                        <img src=\"https://scontent.fsgn5-1.fna.fbcdn.net/v/t1.6435-9/149363543_2891514991127902_298257690163312688_n.jpg?_nc_cat=101&ccb=1-5&_nc_sid=09cbfe&_nc_ohc=6lhWfWbKHrUAX_NIyof&_nc_ht=scontent.fsgn5-1.fna&oh=deb41648e6a2893f6cf559db8f3b604c&oe=61A74348\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"testimonial__author__text\">\r\n");
      out.write("                                        <h5>Nguyễn Trọng Nghĩa</h5>\r\n");
      out.write("                                        <span>Trà Vinh</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"rating\">\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                    <span class=\"icon_star\"></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <p>Ăn xong có sức hít đất 30 ngày trend luôn</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- Testimonial Section End -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Map Begin -->\r\n");
      out.write("        <div class=\"map\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-7\">\r\n");
      out.write("                        <div class=\"map__inner\">\r\n");
      out.write("                            <h6>TaToOr</h6>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li>2P7J+JM Ninh Kiều, Cần Thơ</li>\r\n");
      out.write("                                <li>Tatoor@support.com</li>\r\n");
      out.write("                                <li>+842927303636</li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"map__iframe\">\r\n");
      out.write("                <iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15716.114740023777!2d105.73175248117843!3d10.01448919140329!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x3916a227d0b95a64!2zVHLGsOG7nW5nIMSQ4bqhaSBo4buNYyBGUFQgQ-G6p24gVGjGoQ!5e0!3m2!1sen!2s!4v1635948892586!5m2!1sen!2s\" height=\"300\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\"></iframe>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Map End -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Footer Section Begin -->\r\n");
      out.write("        <footer class=\"footer set-bg\" data-setbg=\"img/footer-bg.jpg\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-6\">\r\n");
      out.write("                        <div class=\"footer__widget\">\r\n");
      out.write("                            <h6>Giờ Chạy DeadLine</h6>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li>Thứ Hai - Thứ 6: 07:00 chiều – 10:00 tối</li>\r\n");
      out.write("                                <li>Thứ Bảy: 10:00 sáng – 11:30 trưa </li>\r\n");
      out.write("                                <li>và 2:30 chiều - 4:30 chiều</li>\r\n");
      out.write("                                <li>Chủ Nhật: Tùy Hứng</li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-6\">\r\n");
      out.write("                        <div class=\"footer__about\">\r\n");
      out.write("                            <div class=\"footer__logo\">\r\n");
      out.write("                                <a href=\"#\"><img src=\"img/footer-logo.png\" alt=\"\"></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p>From SE1504 with Love</p>\r\n");
      out.write("                            <div class=\"footer__social\">\r\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\r\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-youtube-play\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-6\">\r\n");
      out.write("                        <div class=\"footer__newslatter\">\r\n");
      out.write("                            <h6>Đăng ký</h6>\r\n");
      out.write("                            <p>Nhận thông tin món ăn mới nhất từ chúng tôi.</p>\r\n");
      out.write("                            <form action=\"#\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Email\">\r\n");
      out.write("                                <button type=\"submit\"><i class=\"fa fa-send-o\"></i></button>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"copyright\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-7\">\r\n");
      out.write("                            <p class=\"copyright__text text-white\">\r\n");
      out.write("                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("                                Copyright &copy;\r\n");
      out.write("                                <script>\r\n");
      out.write("                                    document.write(new Date().getFullYear());\r\n");
      out.write("                                </script> All rights reserved | This template is made with <i class=\"fa fa-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\r\n");
      out.write("                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-5\">\r\n");
      out.write("                            <div class=\"copyright__widget\">\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"#\">Privacy Policy</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Terms & Conditions</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Site Map</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("        <!-- Footer Section End -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Js Plugins -->\r\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.barfiller.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.slicknav.js\"></script>\r\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.nicescroll.min.js\"></script>\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
        out.write("\r\n");
        out.write("                                                <a href=\"LoginForm.jsp\">Đăng nhập</a>\r\n");
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
        out.write("\r\n");
        out.write("                                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.User}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
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
        out.write("\r\n");
        out.write("                                                <a href=\"Register.jsp\"  class=\"Login\">Đăng ký</a>\r\n");
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
        out.write("\r\n");
        out.write("                                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Admin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
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
        out.write("\r\n");
        out.write("\r\n");
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
        out.write("\r\n");
        out.write("                                                <a href=\"LogOutAccount\" class=\"Login\">Đăng xuất</a>\r\n");
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
