package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zxx\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"description\" content=\"Cake Template\">\r\n");
      out.write("        <meta name=\"keywords\" content=\"Cake, unica, creative, html\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <title>Cake | Template</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Google Font -->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Playfair+Display:wght@400;500;600;700;800;900&display=swap\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;600;700;800;900&display=swap\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
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
      out.write("        <style>\r\n");
      out.write("            #invoice {\r\n");
      out.write("                padding: 30px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice {\r\n");
      out.write("                position: relative;\r\n");
      out.write("                background-color: #FFF;\r\n");
      out.write("                min-height: 680px;\r\n");
      out.write("                padding: 15px\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice .company-details {\r\n");
      out.write("                text-align: right\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice .company-details .name {\r\n");
      out.write("                margin-top: 0;\r\n");
      out.write("                margin-bottom: 0\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice .contacts {\r\n");
      out.write("                margin-bottom: 20px\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice .invoice-to {\r\n");
      out.write("                text-align: left\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice .invoice-to .to {\r\n");
      out.write("                margin-top: 0;\r\n");
      out.write("                margin-bottom: 0\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice .invoice-details {\r\n");
      out.write("                text-align: right\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice main {\r\n");
      out.write("                padding-bottom: 50px\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice main .thanks {\r\n");
      out.write("                margin-top: -100px;\r\n");
      out.write("                font-size: 2em;\r\n");
      out.write("                margin-bottom: 50px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice table {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                border-collapse: collapse;\r\n");
      out.write("                border-spacing: 0;\r\n");
      out.write("                margin-bottom: 20px\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice table td,\r\n");
      out.write("            .invoice table th {\r\n");
      out.write("                padding: 15px;\r\n");
      out.write("                background: #eee;\r\n");
      out.write("                border-bottom: 1px solid #fff\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice table th {\r\n");
      out.write("                white-space: nowrap;\r\n");
      out.write("                font-weight: 400;\r\n");
      out.write("                font-size: 16px\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice table td h3 {\r\n");
      out.write("                margin: 0;\r\n");
      out.write("                font-weight: 400;\r\n");
      out.write("                color: #f08632;\r\n");
      out.write("                font-size: 1.2em\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice table .qty,\r\n");
      out.write("            .invoice table .total,\r\n");
      out.write("            .invoice table .unit {\r\n");
      out.write("                text-align: right;\r\n");
      out.write("                font-size: 1.2em\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice table .no {\r\n");
      out.write("                color: #eee;\r\n");
      out.write("                font-size: 1.6em;\r\n");
      out.write("                background: white;\r\n");
      out.write("                width: 150px;\r\n");
      out.write("                height: 100px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice table .unit {\r\n");
      out.write("                background: #ddd\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice table .total {\r\n");
      out.write("                background: #f08632;\r\n");
      out.write("                color: #fff;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice table tbody tr:last-child td {\r\n");
      out.write("                border: none\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice table tfoot td {\r\n");
      out.write("                background: 0 0;\r\n");
      out.write("                border-bottom: none;\r\n");
      out.write("                white-space: nowrap;\r\n");
      out.write("                text-align: right;\r\n");
      out.write("                padding: 10px 20px;\r\n");
      out.write("                font-size: 1.2em;\r\n");
      out.write("                border-top: 1px solid #aaa\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice table tfoot tr:first-child td {\r\n");
      out.write("                border-top: none\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice table tfoot tr:last-child td {\r\n");
      out.write("                color: #f08632;\r\n");
      out.write("                font-size: 1.4em;\r\n");
      out.write("                border-top: 1px solid #f08632\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invoice table tfoot tr td:first-child {\r\n");
      out.write("                border: none\r\n");
      out.write("            }\r\n");
      out.write("            .thanks input{\r\n");
      out.write("                margin-top: -50em;\r\n");
      out.write("                margin-left: 1500px;\r\n");
      out.write("                background-color:#f08632;\r\n");
      out.write("                color: white;\r\n");
      out.write("                width: 300px;\r\n");
      out.write("                height: 50px;\r\n");
      out.write("            }\r\n");
      out.write("            .no img{\r\n");
      out.write("                width: 150px;\r\n");
      out.write("                height: 100px;\r\n");
      out.write("            }\r\n");
      out.write("            @media print {\r\n");
      out.write("                .invoice {\r\n");
      out.write("                    font-size: 11px!important;\r\n");
      out.write("                    overflow: hidden!important\r\n");
      out.write("                }\r\n");
      out.write("                .invoice>div:last-child {\r\n");
      out.write("                    page-break-before: always\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
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
      out.write("                    <li>USD <span class=\"arrow_carrot-down\"></span>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li>EUR</li>\r\n");
      out.write("                            <li>USD</li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>ENG <span class=\"arrow_carrot-down\"></span>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li>Spanish</li>\r\n");
      out.write("                            <li>ENG</li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"LoginForm.jsp\"><img src=\"img/icon/login.png\" alt=\"\" height=\"25px\" width=\"25px\"> Login</a> <span class=\"arrow_carrot-down\"></span>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li class=\"Login\"><a href=\"LoginForm.jsp\">Login</a></li>\r\n");
      out.write("                            <li class=\"Login\"><a href=\"Register.jsp\">Register</a></li>\r\n");
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
      out.write("                                    <div class=\"header__top__right__links\">\r\n");
      out.write("                                        <a href=\"#\" class=\"search-switch\"><img src=\"img/icon/search.png\" alt=\"\"></a>\r\n");
      out.write("                                        <a href=\"#\"><img src=\"img/icon/heart.png\" alt=\"\"></a>\r\n");
      out.write("                                    </div>\r\n");
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
      out.write("                                <li ><a href=\"./index.jsp\">Trang chủ</a></li>\r\n");
      out.write("                                <li><a href=\"IndexProduct\">Chọn Món</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Tùy chọn</a>\r\n");
      out.write("                                    <ul class=\"dropdown\">\r\n");
      out.write("                                        <li><a href=\"./ShowOrder\">Giỏ Hàng</a></li>\r\n");
      out.write("                                        <li class=\"active\"><a href=\"./checkout.jsp\">Thanh Toán</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li ><a href=\"./blog.jsp\">Thuyết Trình</a></li>\r\n");
      out.write("                                <li><a href=\"./contact.jsp\">Liên Hệ</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"invoice\">\r\n");
      out.write("            <div class=\"invoice overflow-auto\">\r\n");
      out.write("                <div style=\"min-width: 600px\">\r\n");
      out.write("                    <div class=\"breadcrumb__text\">\r\n");
      out.write("                        <h2 class=\"text-center\">BILL ORDER</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <form action=\"CreateBill\" method=\"post\">\r\n");
      out.write("                        <main>\r\n");
      out.write("                            <div class=\"col invoice-to\">\r\n");
      out.write("                                <div class=\"text-gray-light\"><strong>Thông tin khách hàng:</strong></div>\r\n");
      out.write("                                <h2 class=\"to\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\r\n");
      out.write("                                <div class=\"email\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                                <div class=\"address\">Địa chỉ: <input name=\"DiaChi\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></div>\r\n");
      out.write("                                <span style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col invoice-details\">\r\n");
      out.write("                                <div class=\"date\"><strong>Ngày thanh toán:</strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th>Ảnh</th>\r\n");
      out.write("                                        <th class=\"text-left\">Tên sản phẩm</th>\r\n");
      out.write("                                        <th class=\"text-right\">Giá tiền</th>\r\n");
      out.write("                                        <th class=\"text-right\">Số lượng</th>\r\n");
      out.write("                                        <th class=\"text-right\">Tổng tiền</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                                <tfoot>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td colspan=\"2\"></td>\r\n");
      out.write("                                        <td colspan=\"2\">\r\n");
      out.write("                                            Phương thức thanh toán\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td>\r\n");
      out.write("                                            <input type=\"radio\" name=\"PhuongThuc\" value=\"Tiền mặt\" checked=\"checked\" id=\"Check1\"/>\r\n");
      out.write("                                            <label for=\"Check1\"> Tiền mặt</label><i class=\"fas fa-money-bill-alt\"></i>\r\n");
      out.write("                                            <input type=\"radio\" name=\"PhuongThuc\" value=\"Card\" id=\"check2\"/>\r\n");
      out.write("                                            <label for=\"check2\">Credit Card</label> <i class=\"fab fa-apple-pay\"></i>\r\n");
      out.write("\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td colspan=\"2\"></td>\r\n");
      out.write("                                        <td colspan=\"2\">Phí ship</td>\r\n");
      out.write("                                        <td>Free ship</td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td colspan=\"2\"></td>\r\n");
      out.write("                                        <td colspan=\"2\">Tổng thanh toán</td>\r\n");
      out.write("                                        <td><input name=\"TongTienBill\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tongBill}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"display: none\">");
      if (_jspx_meth_fmt_formatNumber_2(_jspx_page_context))
        return;
      out.write("VNĐ</td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("\r\n");
      out.write("                                </tfoot>\r\n");
      out.write("                            </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </main>\r\n");
      out.write("                        <div class=\"thanks text-center\">\r\n");
      out.write("                            <input type=\"submit\" name=\"thanhtoan\" value=\"Thanh toán\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--DO NOT DELETE THIS div. IT is responsible for showing footer always at the bottom-->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Checkout Section End -->\r\n");
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
      out.write("        <!-- Search Begin -->\r\n");
      out.write("        <div class=\"search-model\">\r\n");
      out.write("            <div class=\"h-100 d-flex align-items-center justify-content-center\">\r\n");
      out.write("                <div class=\"search-close-switch\">+</div>\r\n");
      out.write("                <form class=\"search-model-form\">\r\n");
      out.write("                    <input type=\"text\" id=\"search-input\" placeholder=\"Search here.....\">\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Search End -->\r\n");
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
        out.write("                                                <a href=\"ShowUser\" class=\"Login\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Admin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("showOrder");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listOr}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                            <tr>\r\n");
          out.write("                                                <td></td>\r\n");
          out.write("                                                <td><h3>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Rong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3></td>\r\n");
          out.write("                                            </tr>\r\n");
          out.write("                                            <tr>\r\n");
          out.write("                                                <td class=\"no\" style=\"background-image: url('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${showOrder.product.anh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'); background-size: 100%;\"></td>\r\n");
          out.write("                                                <td class=\"text-left\">\r\n");
          out.write("                                                    <h3>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${showOrder.product.ten}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3></td>\r\n");
          out.write("                                                <td class=\"unit\">");
          if (_jspx_meth_fmt_formatNumber_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("VNĐ</td>\r\n");
          out.write("                                                <td class=\"qty\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${showOrder.soLuong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                <td class=\"total\">");
          if (_jspx_meth_fmt_formatNumber_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("VNĐ</td>\r\n");
          out.write("                                                </tr>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatNumber_0.setType("number");
    _jspx_th_fmt_formatNumber_0.setMaxFractionDigits(0);
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${showOrder.product.giatien}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatNumber_1.setType("number");
    _jspx_th_fmt_formatNumber_1.setMaxFractionDigits(0);
    _jspx_th_fmt_formatNumber_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${showOrder.tongTien}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
    if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_1);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_1);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_2.setParent(null);
    _jspx_th_fmt_formatNumber_2.setType("number");
    _jspx_th_fmt_formatNumber_2.setMaxFractionDigits(0);
    _jspx_th_fmt_formatNumber_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tongBill}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_2 = _jspx_th_fmt_formatNumber_2.doStartTag();
    if (_jspx_th_fmt_formatNumber_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_2);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_2);
    return false;
  }
}
