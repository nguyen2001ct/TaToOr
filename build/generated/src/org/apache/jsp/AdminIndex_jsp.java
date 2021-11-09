package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:contains", org.apache.taglibs.standard.functions.Functions.class, "contains", new Class[] {java.lang.String.class, java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_default_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_var_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_default_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_var_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_default_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_var_test.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html :class=\"{ 'theme-dark': dark }\" x-data=\"data()\" lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <title>Quản Lý Người Dùng</title>\r\n");
      out.write("        <link rel=\"ICON\" href=\"./pictures/logo3.png\" type=\"image/ico\" />\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700;800&display=swap\" rel=\"stylesheet\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/tailwind.output.css\" />\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/gh/alpinejs/alpine@v2.x.x/dist/alpine.min.js\" defer></script>\r\n");
      out.write("        <script src=\"./js/init-alpine.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.css\"/>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.js\" defer></script>\r\n");
      out.write("        <script src=\"./js/charts-lines.js\" defer></script>\r\n");
      out.write("        <script src=\"./js/charts-pie.js\" defer></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            function showMess(id) {\r\n");
      out.write("                var option = confirm('Bạn muốn xóa người dùng này?');\r\n");
      out.write("                if (option === true) {\r\n");
      out.write("                    window.location.href = 'DeleteAccount?sid=' + id;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            function checkUsername() {\r\n");
      out.write("                tk = document.getElementById(\"txtUsername\").value;\r\n");
      out.write("                document.getElementById(\"txtUsernameMess\").innerHTML = tk == \"\" ? \"Tên không được bỏ trống\" : \"\";\r\n");
      out.write("            }\r\n");
      out.write("            function checkName() {\r\n");
      out.write("                ten = document.getElementById(\"txtName\").value;\r\n");
      out.write("                document.getElementById(\"txtNameMess\").innerHTML = ten == \"\" ? \"Tên không được bỏ trống\" : \"\";\r\n");
      out.write("            }\r\n");
      out.write("            function checkYear() {\r\n");
      out.write("                year = document.getElementById(\"txtYear\").value;\r\n");
      out.write("                var d = new Date(year);\r\n");
      out.write("                var da = new Date();\r\n");
      out.write("                document.getElementById(\"txtYearMess\").innerHTML = d.getFullYear() > da.getFullYear() ? \"Năm sinh phải nhỏ hơn năm hiện tại\" : \"\";\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"flex h-screen bg-gray-50 dark:bg-gray-900\":class=\"{ 'overflow-hidden': isSideMenuOpen }\">\r\n");
      out.write("             <!-- Desktop sidebar -->\r\n");
      out.write("             <aside class=\"z-20 hidden w-64 overflow-y-auto bg-white dark:bg-gray-800 md:block flex-shrink-0\">\r\n");
      out.write("                <div class=\"py-4 text-gray-500 dark:text-gray-400\">\r\n");
      out.write("                    <a class=\"ml-6 text-lg font-bold text-gray-800 dark:text-gray-200\"href=\"index.jsp\"> Trang chủ</a>\r\n");
      out.write("                    <ul class=\"mt-6\">\r\n");
      out.write("                        <li class=\"relative px-6 py-3\">\r\n");
      out.write("                            <span class=\"absolute inset-y-0 left-0 w-1 bg-purple-600 rounded-tr-lg rounded-br-lg\" aria-hidden=\"true\"></span>\r\n");
      out.write("                            <a class=\"inline-flex items-center w-full text-sm font-semibold text-gray-800 transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200 dark:text-gray-100\"  href=\"ShowUser\">\r\n");
      out.write("                                <svg\r\n");
      out.write("                                    class=\"w-5 h-5\"\r\n");
      out.write("                                    aria-hidden=\"true\"\r\n");
      out.write("                                    fill=\"none\"\r\n");
      out.write("                                    stroke-linecap=\"round\"\r\n");
      out.write("                                    stroke-linejoin=\"round\"\r\n");
      out.write("                                    stroke-width=\"2\"\r\n");
      out.write("                                    viewBox=\"0 0 24 24\"\r\n");
      out.write("                                    stroke=\"currentColor\"\r\n");
      out.write("                                    >\r\n");
      out.write("                                <path d=\"M3 12l2-2m0 0l7-7 7 7M5 10v10a1 1 0 001 1h3m10-11l2 2m-2-2v10a1 1 0 01-1 1h-3m-6 0a1 1 0 001-1v-4a1 1 0 011-1h2a1 1 0 011 1v4a1 1 0 001 1m-6 0h6\" ></path>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                                <span class=\"ml-4\">Quản lý người dùng</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li class=\"relative px-6 py-3\">\r\n");
      out.write("                            <a class=\"inline-flex items-center w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\" href=\"forms.html\">\r\n");
      out.write("                                <svg\r\n");
      out.write("                                    class=\"w-5 h-5\"\r\n");
      out.write("                                    aria-hidden=\"true\"\r\n");
      out.write("                                    fill=\"none\"\r\n");
      out.write("                                    stroke-linecap=\"round\"\r\n");
      out.write("                                    stroke-linejoin=\"round\"\r\n");
      out.write("                                    stroke-width=\"2\"\r\n");
      out.write("                                    viewBox=\"0 0 24 24\"\r\n");
      out.write("                                    stroke=\"currentColor\"\r\n");
      out.write("                                    >\r\n");
      out.write("                                <path d=\"M9 5H7a2 2 0 00-2 2v12a2 2 0 002 2h10a2 2 0 002-2V7a2 2 0 00-2-2h-2M9 5a2 2 0 002 2h2a2 2 0 002-2M9 5a2 2 0 012-2h2a2 2 0 012 2m-3 7h3m-3 4h3m-6-4h.01M9 16h.01\"></path>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                                <span class=\"ml-4\">Quản lý hóa đơn</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"relative px-6 py-3\">\r\n");
      out.write("                            <a class=\"inline-flex items-center w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\" href=\"ShowReview\" >\r\n");
      out.write("                                <svg\r\n");
      out.write("                                    class=\"w-5 h-5\"\r\n");
      out.write("                                    aria-hidden=\"true\"\r\n");
      out.write("                                    fill=\"none\"\r\n");
      out.write("                                    stroke-linecap=\"round\"\r\n");
      out.write("                                    stroke-linejoin=\"round\"\r\n");
      out.write("                                    stroke-width=\"2\"\r\n");
      out.write("                                    viewBox=\"0 0 24 24\"\r\n");
      out.write("                                    stroke=\"currentColor\"\r\n");
      out.write("                                    >\r\n");
      out.write("                                <path\r\n");
      out.write("                                    d=\"M15 15l-2 5L9 9l11 4-5 2zm0 0l5 5M7.188 2.239l.777 2.897M5.136 7.965l-2.898-.777M13.95 4.05l-2.122 2.122m-5.657 5.656l-2.12 2.122\"\r\n");
      out.write("                                    ></path>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                                <span class=\"ml-4\">Quản lý đánh giá</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"relative px-6 py-3\">\r\n");
      out.write("                            <a\r\n");
      out.write("                                class=\"inline-flex items-center w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\"\r\n");
      out.write("                                href=\"ShowProduct\"\r\n");
      out.write("                                >\r\n");
      out.write("                                <svg\r\n");
      out.write("                                    class=\"w-5 h-5\"\r\n");
      out.write("                                    aria-hidden=\"true\"\r\n");
      out.write("                                    fill=\"none\"\r\n");
      out.write("                                    stroke-linecap=\"round\"\r\n");
      out.write("                                    stroke-linejoin=\"round\"\r\n");
      out.write("                                    stroke-width=\"2\"\r\n");
      out.write("                                    viewBox=\"0 0 24 24\"\r\n");
      out.write("                                    stroke=\"currentColor\"\r\n");
      out.write("                                    >\r\n");
      out.write("                                <path d=\"M4 6h16M4 10h16M4 14h16M4 18h16\"></path>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                                <span class=\"ml-4\">Quản lý sản phẩm</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </aside>\r\n");
      out.write("            <!-- Mobile sidebar -->\r\n");
      out.write("            <!-- Backdrop -->\r\n");
      out.write("            <div\r\n");
      out.write("                x-show=\"isSideMenuOpen\"\r\n");
      out.write("                x-transition:enter=\"transition ease-in-out duration-150\"\r\n");
      out.write("                x-transition:enter-start=\"opacity-0\"\r\n");
      out.write("                x-transition:enter-end=\"opacity-100\"\r\n");
      out.write("                x-transition:leave=\"transition ease-in-out duration-150\"\r\n");
      out.write("                x-transition:leave-start=\"opacity-100\"\r\n");
      out.write("                x-transition:leave-end=\"opacity-0\"\r\n");
      out.write("                class=\"fixed inset-0 z-10 flex items-end bg-black bg-opacity-50 sm:items-center sm:justify-center\"\r\n");
      out.write("                ></div>\r\n");
      out.write("            <aside\r\n");
      out.write("                class=\"fixed inset-y-0 z-20 flex-shrink-0 w-64 mt-16 overflow-y-auto bg-white dark:bg-gray-800 md:hidden\"\r\n");
      out.write("                x-show=\"isSideMenuOpen\"\r\n");
      out.write("                x-transition:enter=\"transition ease-in-out duration-150\"\r\n");
      out.write("                x-transition:enter-start=\"opacity-0 transform -translate-x-20\"\r\n");
      out.write("                x-transition:enter-end=\"opacity-100\"\r\n");
      out.write("                x-transition:leave=\"transition ease-in-out duration-150\"\r\n");
      out.write("                x-transition:leave-start=\"opacity-100\"\r\n");
      out.write("                x-transition:leave-end=\"opacity-0 transform -translate-x-20\"\r\n");
      out.write("                @click.away=\"closeSideMenu\"\r\n");
      out.write("                @keydown.escape=\"closeSideMenu\"\r\n");
      out.write("                >\r\n");
      out.write("                <div class=\"py-4 text-gray-500 dark:text-gray-400\">\r\n");
      out.write("                    <a class=\"ml-6 text-lg font-bold text-gray-800 dark:text-gray-200\" href=\"#\" >\r\n");
      out.write("                        Windmill\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"mt-6\">\r\n");
      out.write("                        <li class=\"relative px-6 py-3\">\r\n");
      out.write("                            <span class=\"absolute inset-y-0 left-0 w-1 bg-purple-600 rounded-tr-lg rounded-br-lg\" aria-hidden=\"true\"></span>\r\n");
      out.write("                            <a\r\n");
      out.write("                                class=\"inline-flex items-center w-full text-sm font-semibold text-gray-800 transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200 dark:text-gray-100\"\r\n");
      out.write("                                href=\"index.html\"\r\n");
      out.write("                                >\r\n");
      out.write("                                <svg\r\n");
      out.write("                                    class=\"w-5 h-5\"\r\n");
      out.write("                                    aria-hidden=\"true\"\r\n");
      out.write("                                    fill=\"none\"\r\n");
      out.write("                                    stroke-linecap=\"round\"\r\n");
      out.write("                                    stroke-linejoin=\"round\"\r\n");
      out.write("                                    stroke-width=\"2\"\r\n");
      out.write("                                    viewBox=\"0 0 24 24\"\r\n");
      out.write("                                    stroke=\"currentColor\"\r\n");
      out.write("                                    >\r\n");
      out.write("                                <path\r\n");
      out.write("                                    d=\"M3 12l2-2m0 0l7-7 7 7M5 10v10a1 1 0 001 1h3m10-11l2 2m-2-2v10a1 1 0 01-1 1h-3m-6 0a1 1 0 001-1v-4a1 1 0 011-1h2a1 1 0 011 1v4a1 1 0 001 1m-6 0h6\"\r\n");
      out.write("                                    ></path>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                                <span class=\"ml-4\">Dashboard</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li class=\"relative px-6 py-3\">\r\n");
      out.write("                            <a\r\n");
      out.write("                                class=\"inline-flex items-center w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\"\r\n");
      out.write("                                href=\"forms.html\"\r\n");
      out.write("                                >\r\n");
      out.write("                                <svg\r\n");
      out.write("                                    class=\"w-5 h-5\"\r\n");
      out.write("                                    aria-hidden=\"true\"\r\n");
      out.write("                                    fill=\"none\"\r\n");
      out.write("                                    stroke-linecap=\"round\"\r\n");
      out.write("                                    stroke-linejoin=\"round\"\r\n");
      out.write("                                    stroke-width=\"2\"\r\n");
      out.write("                                    viewBox=\"0 0 24 24\"\r\n");
      out.write("                                    stroke=\"currentColor\"\r\n");
      out.write("                                    >\r\n");
      out.write("                                <path\r\n");
      out.write("                                    d=\"M9 5H7a2 2 0 00-2 2v12a2 2 0 002 2h10a2 2 0 002-2V7a2 2 0 00-2-2h-2M9 5a2 2 0 002 2h2a2 2 0 002-2M9 5a2 2 0 012-2h2a2 2 0 012 2m-3 7h3m-3 4h3m-6-4h.01M9 16h.01\"\r\n");
      out.write("                                    ></path>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                                <span class=\"ml-4\">Forms</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"relative px-6 py-3\">\r\n");
      out.write("                            <a\r\n");
      out.write("                                class=\"inline-flex items-center w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\"\r\n");
      out.write("                                href=\"cards.html\"\r\n");
      out.write("                                >\r\n");
      out.write("                                <svg\r\n");
      out.write("                                    class=\"w-5 h-5\"\r\n");
      out.write("                                    aria-hidden=\"true\"\r\n");
      out.write("                                    fill=\"none\"\r\n");
      out.write("                                    stroke-linecap=\"round\"\r\n");
      out.write("                                    stroke-linejoin=\"round\"\r\n");
      out.write("                                    stroke-width=\"2\"\r\n");
      out.write("                                    viewBox=\"0 0 24 24\"\r\n");
      out.write("                                    stroke=\"currentColor\"\r\n");
      out.write("                                    >\r\n");
      out.write("                                <path\r\n");
      out.write("                                    d=\"M19 11H5m14 0a2 2 0 012 2v6a2 2 0 01-2 2H5a2 2 0 01-2-2v-6a2 2 0 012-2m14 0V9a2 2 0 00-2-2M5 11V9a2 2 0 012-2m0 0V5a2 2 0 012-2h6a2 2 0 012 2v2M7 7h10\"\r\n");
      out.write("                                    ></path>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                                <span class=\"ml-4\">Cards</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"relative px-6 py-3\">\r\n");
      out.write("                            <a\r\n");
      out.write("                                class=\"inline-flex items-center w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\"\r\n");
      out.write("                                href=\"buttons.html\"\r\n");
      out.write("                                >\r\n");
      out.write("                                <svg\r\n");
      out.write("                                    class=\"w-5 h-5\"\r\n");
      out.write("                                    aria-hidden=\"true\"\r\n");
      out.write("                                    fill=\"none\"\r\n");
      out.write("                                    stroke-linecap=\"round\"\r\n");
      out.write("                                    stroke-linejoin=\"round\"\r\n");
      out.write("                                    stroke-width=\"2\"\r\n");
      out.write("                                    viewBox=\"0 0 24 24\"\r\n");
      out.write("                                    stroke=\"currentColor\"\r\n");
      out.write("                                    >\r\n");
      out.write("                                <path\r\n");
      out.write("                                    d=\"M15 15l-2 5L9 9l11 4-5 2zm0 0l5 5M7.188 2.239l.777 2.897M5.136 7.965l-2.898-.777M13.95 4.05l-2.122 2.122m-5.657 5.656l-2.12 2.122\"\r\n");
      out.write("                                    ></path>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                                <span class=\"ml-4\">Buttons</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"relative px-6 py-3\">\r\n");
      out.write("                            <a\r\n");
      out.write("                                class=\"inline-flex items-center w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\"\r\n");
      out.write("                                href=\"modals.html\"\r\n");
      out.write("                                >\r\n");
      out.write("                                <svg\r\n");
      out.write("                                    class=\"w-5 h-5\"\r\n");
      out.write("                                    aria-hidden=\"true\"\r\n");
      out.write("                                    fill=\"none\"\r\n");
      out.write("                                    stroke-linecap=\"round\"\r\n");
      out.write("                                    stroke-linejoin=\"round\"\r\n");
      out.write("                                    stroke-width=\"2\"\r\n");
      out.write("                                    viewBox=\"0 0 24 24\"\r\n");
      out.write("                                    stroke=\"currentColor\"\r\n");
      out.write("                                    >\r\n");
      out.write("                                <path\r\n");
      out.write("                                    d=\"M8 16H6a2 2 0 01-2-2V6a2 2 0 012-2h8a2 2 0 012 2v2m-6 12h8a2 2 0 002-2v-8a2 2 0 00-2-2h-8a2 2 0 00-2 2v8a2 2 0 002 2z\"\r\n");
      out.write("                                    ></path>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                                <span class=\"ml-4\">Modals</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li class=\"relative px-6 py-3\">\r\n");
      out.write("                            <button\r\n");
      out.write("                                class=\"inline-flex items-center justify-between w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200\"\r\n");
      out.write("                                @click=\"togglePagesMenu\"\r\n");
      out.write("                                aria-haspopup=\"true\"\r\n");
      out.write("                                >\r\n");
      out.write("                                <span class=\"inline-flex items-center\">\r\n");
      out.write("                                    <svg\r\n");
      out.write("                                        class=\"w-5 h-5\"\r\n");
      out.write("                                        aria-hidden=\"true\"\r\n");
      out.write("                                        fill=\"none\"\r\n");
      out.write("                                        stroke-linecap=\"round\"\r\n");
      out.write("                                        stroke-linejoin=\"round\"\r\n");
      out.write("                                        stroke-width=\"2\"\r\n");
      out.write("                                        viewBox=\"0 0 24 24\"\r\n");
      out.write("                                        stroke=\"currentColor\"\r\n");
      out.write("                                        >\r\n");
      out.write("                                    <path\r\n");
      out.write("                                        d=\"M4 5a1 1 0 011-1h14a1 1 0 011 1v2a1 1 0 01-1 1H5a1 1 0 01-1-1V5zM4 13a1 1 0 011-1h6a1 1 0 011 1v6a1 1 0 01-1 1H5a1 1 0 01-1-1v-6zM16 13a1 1 0 011-1h2a1 1 0 011 1v6a1 1 0 01-1 1h-2a1 1 0 01-1-1v-6z\"\r\n");
      out.write("                                        ></path>\r\n");
      out.write("                                    </svg>\r\n");
      out.write("                                    <span class=\"ml-4\">Pages</span>\r\n");
      out.write("                                </span>\r\n");
      out.write("                                <svg\r\n");
      out.write("                                    class=\"w-4 h-4\"\r\n");
      out.write("                                    aria-hidden=\"true\"\r\n");
      out.write("                                    fill=\"currentColor\"\r\n");
      out.write("                                    viewBox=\"0 0 20 20\"\r\n");
      out.write("                                    >\r\n");
      out.write("                                <path\r\n");
      out.write("                                    fill-rule=\"evenodd\"\r\n");
      out.write("                                    d=\"M5.293 7.293a1 1 0 011.414 0L10 10.586l3.293-3.293a1 1 0 111.414 1.414l-4 4a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414z\"\r\n");
      out.write("                                    clip-rule=\"evenodd\"\r\n");
      out.write("                                    ></path>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </aside>\r\n");
      out.write("            <div class=\"flex flex-col flex-1 w-full\">\r\n");
      out.write("                <header class=\"z-10 py-4 bg-white shadow-md dark:bg-gray-800\">\r\n");
      out.write("                    <div class=\"container flex items-center justify-between h-full px-6 mx-auto text-purple-600 dark:text-purple-300\" >\r\n");
      out.write("                        <!-- Mobile hamburger -->\r\n");
      out.write("                        <button\r\n");
      out.write("                            class=\"p-1 mr-5 -ml-1 rounded-md md:hidden focus:outline-none focus:shadow-outline-purple\"\r\n");
      out.write("                            @click=\"toggleSideMenu\"\r\n");
      out.write("                            aria-label=\"Menu\"\r\n");
      out.write("                            >\r\n");
      out.write("                            <svg\r\n");
      out.write("                                class=\"w-6 h-6\"\r\n");
      out.write("                                aria-hidden=\"true\"\r\n");
      out.write("                                fill=\"currentColor\"\r\n");
      out.write("                                viewBox=\"0 0 20 20\"\r\n");
      out.write("                                >\r\n");
      out.write("                            <path\r\n");
      out.write("                                fill-rule=\"evenodd\"\r\n");
      out.write("                                d=\"M3 5a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 10a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 15a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1z\"\r\n");
      out.write("                                clip-rule=\"evenodd\"\r\n");
      out.write("                                ></path>\r\n");
      out.write("                            </svg>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <!-- Search input -->\r\n");
      out.write("                        <div class=\"flex justify-center flex-1 lg:mr-32\">\r\n");
      out.write("                            <img src=\"img/footer-logo.png\" width=\"180px\"> \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <ul class=\"flex items-center flex-shrink-0 space-x-6\">\r\n");
      out.write("                            <!-- Theme toggler -->\r\n");
      out.write("                            <li class=\"flex\">\r\n");
      out.write("                                <button\r\n");
      out.write("                                    class=\"rounded-md focus:outline-none focus:shadow-outline-purple\"\r\n");
      out.write("                                    @click=\"toggleTheme\"\r\n");
      out.write("                                    aria-label=\"Toggle color mode\"\r\n");
      out.write("                                    >\r\n");
      out.write("                                    <template x-if=\"!dark\">\r\n");
      out.write("                                        <svg\r\n");
      out.write("                                            class=\"w-5 h-5\"\r\n");
      out.write("                                            aria-hidden=\"true\"\r\n");
      out.write("                                            fill=\"currentColor\"\r\n");
      out.write("                                            viewBox=\"0 0 20 20\"\r\n");
      out.write("                                            >\r\n");
      out.write("                                        <path\r\n");
      out.write("                                            d=\"M17.293 13.293A8 8 0 016.707 2.707a8.001 8.001 0 1010.586 10.586z\"\r\n");
      out.write("                                            ></path>\r\n");
      out.write("                                        </svg>\r\n");
      out.write("                                    </template>\r\n");
      out.write("                                    <template x-if=\"dark\">\r\n");
      out.write("                                        <svg\r\n");
      out.write("                                            class=\"w-5 h-5\"\r\n");
      out.write("                                            aria-hidden=\"true\"\r\n");
      out.write("                                            fill=\"currentColor\"\r\n");
      out.write("                                            viewBox=\"0 0 20 20\"\r\n");
      out.write("                                            >\r\n");
      out.write("                                        <path\r\n");
      out.write("                                            fill-rule=\"evenodd\"\r\n");
      out.write("                                            d=\"M10 2a1 1 0 011 1v1a1 1 0 11-2 0V3a1 1 0 011-1zm4 8a4 4 0 11-8 0 4 4 0 018 0zm-.464 4.95l.707.707a1 1 0 001.414-1.414l-.707-.707a1 1 0 00-1.414 1.414zm2.12-10.607a1 1 0 010 1.414l-.706.707a1 1 0 11-1.414-1.414l.707-.707a1 1 0 011.414 0zM17 11a1 1 0 100-2h-1a1 1 0 100 2h1zm-7 4a1 1 0 011 1v1a1 1 0 11-2 0v-1a1 1 0 011-1zM5.05 6.464A1 1 0 106.465 5.05l-.708-.707a1 1 0 00-1.414 1.414l.707.707zm1.414 8.486l-.707.707a1 1 0 01-1.414-1.414l.707-.707a1 1 0 011.414 1.414zM4 11a1 1 0 100-2H3a1 1 0 000 2h1z\"\r\n");
      out.write("                                            clip-rule=\"evenodd\"\r\n");
      out.write("                                            ></path>\r\n");
      out.write("                                        </svg>\r\n");
      out.write("                                    </template>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </header>\r\n");
      out.write("                <main class=\"h-full overflow-y-auto\">\r\n");
      out.write("                    <div class=\"container px-6 mx-auto grid\">\r\n");
      out.write("                        <h2\r\n");
      out.write("                            class=\"my-6 text-2xl font-semibold text-gray-700 dark:text-gray-200\"\r\n");
      out.write("                            >\r\n");
      out.write("                            Dashboard\r\n");
      out.write("                        </h2>\r\n");
      out.write("                        <!-- CTA -->\r\n");
      out.write("                        <a\r\n");
      out.write("                            class=\"flex items-center justify-between p-4 mb-8 text-sm font-semibold text-purple-100 bg-purple-600 rounded-lg shadow-md focus:outline-none focus:shadow-outline-purple\"\r\n");
      out.write("                            href=\"https://github.com/estevanmaito/windmill-dashboard\"\r\n");
      out.write("                            >\r\n");
      out.write("                            <div class=\"flex items-center\">\r\n");
      out.write("                                <svg\r\n");
      out.write("                                    class=\"w-5 h-5 mr-2\"\r\n");
      out.write("                                    fill=\"currentColor\"\r\n");
      out.write("                                    viewBox=\"0 0 20 20\"\r\n");
      out.write("                                    >\r\n");
      out.write("                                <path\r\n");
      out.write("                                    d=\"M9.049 2.927c.3-.921 1.603-.921 1.902 0l1.07 3.292a1 1 0 00.95.69h3.462c.969 0 1.371 1.24.588 1.81l-2.8 2.034a1 1 0 00-.364 1.118l1.07 3.292c.3.921-.755 1.688-1.54 1.118l-2.8-2.034a1 1 0 00-1.175 0l-2.8 2.034c-.784.57-1.838-.197-1.539-1.118l1.07-3.292a1 1 0 00-.364-1.118L2.98 8.72c-.783-.57-.38-1.81.588-1.81h3.461a1 1 0 00.951-.69l1.07-3.292z\"\r\n");
      out.write("                                    ></path>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                                <span>Star this project on GitHub</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <span>View more &RightArrow;</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <!-- Cards -->\r\n");
      out.write("                        <div class=\"grid gap-6 mb-8 md:grid-cols-2 xl:grid-cols-4\">\r\n");
      out.write("                            <!-- Card -->\r\n");
      out.write("                            <div\r\n");
      out.write("                                class=\"flex items-center p-4 bg-white rounded-lg shadow-xs dark:bg-gray-800\"\r\n");
      out.write("                                >\r\n");
      out.write("                                <div\r\n");
      out.write("                                    class=\"p-3 mr-4 text-orange-500 bg-orange-100 rounded-full dark:text-orange-100 dark:bg-orange-500\"\r\n");
      out.write("                                    >\r\n");
      out.write("                                    <svg class=\"w-5 h-5\" fill=\"currentColor\" viewBox=\"0 0 20 20\">\r\n");
      out.write("                                    <path\r\n");
      out.write("                                        d=\"M13 6a3 3 0 11-6 0 3 3 0 016 0zM18 8a2 2 0 11-4 0 2 2 0 014 0zM14 15a4 4 0 00-8 0v3h8v-3zM6 8a2 2 0 11-4 0 2 2 0 014 0zM16 18v-3a5.972 5.972 0 00-.75-2.906A3.005 3.005 0 0119 15v3h-3zM4.75 12.094A5.973 5.973 0 004 15v3H1v-3a3 3 0 013.75-2.906z\"\r\n");
      out.write("                                        ></path>\r\n");
      out.write("                                    </svg>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <p class=\"mb-2 text-sm font-medium text-gray-600 dark:text-gray-400\">\r\n");
      out.write("                                        Tổng Người Dùng\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <p class=\"text-lg font-semibold text-gray-700 dark:text-gray-200\">\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Card -->\r\n");
      out.write("                            <div class=\"flex items-center p-4 bg-white rounded-lg shadow-xs dark:bg-gray-800\">\r\n");
      out.write("                                <div class=\"p-3 mr-4 text-green-500 bg-green-100 rounded-full dark:text-green-100 dark:bg-green-500\" >\r\n");
      out.write("                                    <svg class=\"w-5 h-5\" fill=\"currentColor\" viewBox=\"0 0 20 20\">\r\n");
      out.write("                                    <path\r\n");
      out.write("                                        fill-rule=\"evenodd\"\r\n");
      out.write("                                        d=\"M4 4a2 2 0 00-2 2v4a2 2 0 002 2V6h10a2 2 0 00-2-2H4zm2 6a2 2 0 012-2h8a2 2 0 012 2v4a2 2 0 01-2 2H8a2 2 0 01-2-2v-4zm6 4a2 2 0 100-4 2 2 0 000 4z\"\r\n");
      out.write("                                        clip-rule=\"evenodd\"\r\n");
      out.write("                                        ></path>\r\n");
      out.write("                                    </svg>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <p class=\"mb-2 text-sm font-medium text-gray-600 dark:text-gray-400\">\r\n");
      out.write("                                        Account balance\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <p class=\"text-lg font-semibold text-gray-700 dark:text-gray-200\" >\r\n");
      out.write("                                        $ 46,760.89\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Card -->\r\n");
      out.write("                            <div class=\"flex items-center p-4 bg-white rounded-lg shadow-xs dark:bg-gray-800\">\r\n");
      out.write("                                <div class=\"p-3 mr-4 text-blue-500 bg-blue-100 rounded-full dark:text-blue-100 dark:bg-blue-500\">\r\n");
      out.write("                                    <svg class=\"w-5 h-5\" fill=\"currentColor\" viewBox=\"0 0 20 20\">\r\n");
      out.write("                                    <path\r\n");
      out.write("                                        d=\"M3 1a1 1 0 000 2h1.22l.305 1.222a.997.997 0 00.01.042l1.358 5.43-.893.892C3.74 11.846 4.632 14 6.414 14H15a1 1 0 000-2H6.414l1-1H14a1 1 0 00.894-.553l3-6A1 1 0 0017 3H6.28l-.31-1.243A1 1 0 005 1H3zM16 16.5a1.5 1.5 0 11-3 0 1.5 1.5 0 013 0zM6.5 18a1.5 1.5 0 100-3 1.5 1.5 0 000 3z\"\r\n");
      out.write("                                        ></path>\r\n");
      out.write("                                    </svg>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <p class=\"mb-2 text-sm font-medium text-gray-600 dark:text-gray-400\">\r\n");
      out.write("                                        New sales\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <p class=\"text-lg font-semibold text-gray-700 dark:text-gray-200\">\r\n");
      out.write("                                        376\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Card -->\r\n");
      out.write("                            <div class=\"flex items-center p-4 bg-white rounded-lg shadow-xs dark:bg-gray-800\" >\r\n");
      out.write("                                <div class=\"p-3 mr-4 text-teal-500 bg-teal-100 rounded-full dark:text-teal-100 dark:bg-teal-500\">\r\n");
      out.write("                                    <svg class=\"w-5 h-5\" fill=\"currentColor\" viewBox=\"0 0 20 20\">\r\n");
      out.write("                                    <path\r\n");
      out.write("                                        fill-rule=\"evenodd\"\r\n");
      out.write("                                        d=\"M18 5v8a2 2 0 01-2 2h-5l-5 4v-4H4a2 2 0 01-2-2V5a2 2 0 012-2h12a2 2 0 012 2zM7 8H5v2h2V8zm2 0h2v2H9V8zm6 0h-2v2h2V8z\"\r\n");
      out.write("                                        clip-rule=\"evenodd\"\r\n");
      out.write("                                        ></path>\r\n");
      out.write("                                    </svg>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <p class=\"mb-2 text-sm font-medium text-gray-600 dark:text-gray-400\" >\r\n");
      out.write("                                        Pending contacts\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <p class=\"text-lg font-semibold text-gray-700 dark:text-gray-200\">\r\n");
      out.write("                                        cKLinGUYTN KHÙM\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- New Table -->\r\n");
      out.write("                        <div class=\"w-full overflow-hidden rounded-lg shadow-xs\">\r\n");
      out.write("                            <div class=\"w-full overflow-x-auto\">\r\n");
      out.write("                                <table class=\"w-full whitespace-no-wrap\">\r\n");
      out.write("                                    <thead>\r\n");
      out.write("                                        <tr class=\"text-xs font-semibold tracking-wide text-left text-gray-500 uppercase border-b dark:border-gray-700 bg-gray-50 dark:text-gray-400 dark:bg-gray-800\">\r\n");
      out.write("                                            <th class=\"px-4 py-3\">Tài Khoản</th>\r\n");
      out.write("                                            <th class=\"px-4 py-3\">Mật Khẩu</th>\r\n");
      out.write("                                            <th class=\"px-4 py-3\">Số Điện Thoại</th>\r\n");
      out.write("                                            <th class=\"px-4 py-3\">Giới Tính</th>\r\n");
      out.write("                                            <th class=\"px-4 py-3\">Ngày sinh</th>\r\n");
      out.write("                                            <th class=\"px-4 py-3\">Tùy Chọn</th>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </thead>\r\n");
      out.write("                                    <tbody class=\"bg-white divide-y dark:divide-gray-700 dark:bg-gray-800\">\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    </tbody>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <form action=\"CreateAccount\" method=\"POST\">\r\n");
      out.write("                                <table class=\"w-full whitespace-no-wrap\">\r\n");
      out.write("                                    <h4 class=\"mb-4 text-lg font-semibold text-gray-600 dark:text-gray-300\"> Thêm một người dùng </h4>\r\n");
      out.write("                                    <tr class=\"text-gray-700 dark:text-gray-400\">\r\n");
      out.write("                                        <td>\r\n");
      out.write("                                            <label class=\"left-0 text-sm\">\r\n");
      out.write("                                                <span class=\"text-gray-700 dark:text-gray-400\">Tên tài khoản người dùng</span>\r\n");
      out.write("                                                <input class=\"block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input\"\r\n");
      out.write("                                                       name=\"taiKhoan\" type=\"text\" placeholder=\"ví dụ: yenntn0708\" style=\"background-color: graytext\" id=\"txtUsername\" onblur=\"checkUsername()\"/>\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                            <p  class=\"form-label\" for=\"form3Example4cdg\" id=\"txtUsernameMess\" ></p>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td>\r\n");
      out.write("                                            <label class=\"left-0 text-sm\">\r\n");
      out.write("                                                <span class=\"text-gray-700 dark:text-gray-400\">Mật khẩu</span>\r\n");
      out.write("                                                <input class=\"block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input\"\r\n");
      out.write("                                                       name=\"pass\" type=\"password\" placeholder=\"ví dụ: 12345yen\" style=\"background-color: graytext\" />\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr class=\"text-gray-700 dark:text-gray-400\">\r\n");
      out.write("                                        <td>\r\n");
      out.write("                                            <label class=\"left-0 text-sm\">\r\n");
      out.write("                                                <span class=\"text-gray-700 dark:text-gray-400\">Họ và tên</span>\r\n");
      out.write("                                                <input class=\"block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input\"\r\n");
      out.write("                                                       name=\"ten\" type=\"text\" placeholder=\"ví dụ: Nguyễn Thị Ngọc Yến\" style=\"background-color: graytext\" id=\"txtName\" onblur=\"checkName()\"/>\r\n");
      out.write("                                                <p  class=\"form-label\" for=\"form3Example4cdg\" id=\"txtNameMess\" ></p>\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td class=\"text-gray-700 dark:text-gray-400  form-check-label\">\r\n");
      out.write("                                            <label class=\"left-0 text-sm\">\r\n");
      out.write("                                                <span class=\"text-gray-700 dark:text-gray-400\">Số điện thoại</span>\r\n");
      out.write("                                                <input class=\"block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input\"\r\n");
      out.write("                                                       name=\"sdt\" type=\"text\" placeholder=\"0123456789\" style=\"background-color: graytext\" title=\"Nhập 10 kí tự chỉ bao gồm số.\" maxlength=\"10\" pattern=\"[0][0-9]{9}\"/>\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td class=\"text-gray-700 dark:text-gray-400  form-check-label\">\r\n");
      out.write("                                            <label class=\"left-0 text-sm\">\r\n");
      out.write("                                                <span class=\"text-gray-700 dark:text-gray-400\">Năm sinh</span>\r\n");
      out.write("                                                <input class=\"block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input\"\r\n");
      out.write("                                                       name=\"namsinh\" type=\"text\" placeholder=\"ví dụ 2001\" style=\"background-color: graytext\" id=\"txtYear\" maxlength=\"4\" pattern=\"[1-2][0-9]{3}\" title=\"Nhập 4 kí tự chỉ bao gồm số.\" onblur=\"checkYear()\"/>\r\n");
      out.write("                                                <p class=\"form-label\" for=\"form3Example4cdg\" id=\"txtYearMess\"></p>\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td>\r\n");
      out.write("                                            <label class=\"block text-sm\">\r\n");
      out.write("                                                <span class=\"text-gray-700 dark:text-gray-400\">Giới tính</span>\r\n");
      out.write("                                                <span><br></span>\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                            <label class=\"inline-flex text-sm text-gray-700 dark:text-gray-400 form-check-label\">\r\n");
      out.write("                                                <input class=\"text-purple-600 form-radio focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray\"\r\n");
      out.write("                                                       name =\"gioitinh\" value=\"nam\" class=\"form-check-input\" type=\"radio\" > Nam</span>\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                            <label class=\"inline-flex text-sm text-gray-700 dark:text-gray-400\">\r\n");
      out.write("                                                <input class=\"text-purple-600 form-radio focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray\"\r\n");
      out.write("                                                       name =\"gioitinh\" value=\"nu\" class=\"form-check-input\" type=\"radio\"> Nữ</span>\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                            <label class=\"inline-flex text-sm text-gray-700 dark:text-gray-400\">\r\n");
      out.write("                                                <input class=\"text-purple-600 form-radio focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray\"\r\n");
      out.write("                                                       name =\"gioitinh\" value=\"khac\" class=\"form-check-input\" type=\"radio\"> Khác</span>\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                    </tr> \r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td>\r\n");
      out.write("                                            <label class=\"block text-sm\">\r\n");
      out.write("                                                <span class=\"text-gray-700 dark:text-gray-400\">Loại người dùng</span>\r\n");
      out.write("                                                <span><br></span>\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                            <label class=\"inline-flex text-sm text-gray-700 dark:text-gray-400 form-check-label\">\r\n");
      out.write("                                                <input class=\"text-purple-600 form-radio focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray\"\r\n");
      out.write("                                                       name =\"loai\" class=\"form-check-input\" type=\"radio\" value=\"0\"> Người dùng</span>\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                            <label class=\"inline-flex text-sm text-gray-700 dark:text-gray-400\">\r\n");
      out.write("                                                <input class=\"text-purple-600 form-radio focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray\"\r\n");
      out.write("                                                       name =\"loai\" class=\"form-check-input\" type=\"radio\" value=\"1\"> Quản lý</span>\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </table><br>\r\n");
      out.write("                                <h1>\r\n");
      out.write("                                    <button type=\"reset\" class=\"px-3 py-1 text-sm font-medium leading-5 text-white transition-colors duration-150 bg-purple-600 border border-transparent rounded-md active:bg-purple-600 hover:bg-purple-700 focus:outline-none focus:shadow-outline-purple\"       >\r\n");
      out.write("                                        Reset\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                    <button type=\"submit\" class=\"px-3 py-1 text-sm font-medium leading-5 text-white transition-colors duration-150 bg-purple-600 border border-transparent rounded-md active:bg-purple-600 hover:bg-purple-700 focus:outline-none focus:shadow-outline-purple\"       >\r\n");
      out.write("                                        Thêm\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                </h1>\r\n");
      out.write("                            </form> \r\n");
      out.write("\r\n");
      out.write("                            <div class=\"grid px-4 py-3 text-xs font-semibold tracking-wide text-gray-500 uppercase border-t dark:border-gray-700 bg-gray-50 sm:grid-cols-9 dark:text-gray-400 dark:bg-gray-800\">\r\n");
      out.write("                                <span class=\"flex items-center col-span-3\">\r\n");
      out.write("                                    Showing 21-30 of 100\r\n");
      out.write("                                </span>\r\n");
      out.write("                                <span class=\"col-span-2\"></span>\r\n");
      out.write("                                <!-- Pagination -->\r\n");
      out.write("                                <span class=\"flex col-span-4 mt-2 sm:mt-auto sm:justify-end\">\r\n");
      out.write("                                    <nav aria-label=\"Table navigation\">\r\n");
      out.write("                                        <ul class=\"inline-flex items-center\">\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <button\r\n");
      out.write("                                                    class=\"px-3 py-1 rounded-md rounded-l-lg focus:outline-none focus:shadow-outline-purple\"\r\n");
      out.write("                                                    aria-label=\"Previous\"\r\n");
      out.write("                                                    >\r\n");
      out.write("                                                    <svg\r\n");
      out.write("                                                        aria-hidden=\"true\"\r\n");
      out.write("                                                        class=\"w-4 h-4 fill-current\"\r\n");
      out.write("                                                        viewBox=\"0 0 20 20\"\r\n");
      out.write("                                                        >\r\n");
      out.write("                                                    <path\r\n");
      out.write("                                                        d=\"M12.707 5.293a1 1 0 010 1.414L9.414 10l3.293 3.293a1 1 0 01-1.414 1.414l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 0z\"\r\n");
      out.write("                                                        clip-rule=\"evenodd\"\r\n");
      out.write("                                                        fill-rule=\"evenodd\"\r\n");
      out.write("                                                        ></path>\r\n");
      out.write("                                                    </svg>\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <button\r\n");
      out.write("                                                    class=\"px-3 py-1 rounded-md focus:outline-none focus:shadow-outline-purple\"\r\n");
      out.write("                                                    >\r\n");
      out.write("                                                    1\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <button\r\n");
      out.write("                                                    class=\"px-3 py-1 rounded-md focus:outline-none focus:shadow-outline-purple\"\r\n");
      out.write("                                                    >\r\n");
      out.write("                                                    2\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <button\r\n");
      out.write("                                                    class=\"px-3 py-1 text-white transition-colors duration-150 bg-purple-600 border border-r-0 border-purple-600 rounded-md focus:outline-none focus:shadow-outline-purple\"\r\n");
      out.write("                                                    >\r\n");
      out.write("                                                    3\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <button\r\n");
      out.write("                                                    class=\"px-3 py-1 rounded-md focus:outline-none focus:shadow-outline-purple\"\r\n");
      out.write("                                                    >\r\n");
      out.write("                                                    4\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <span class=\"px-3 py-1\">...</span>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <button\r\n");
      out.write("                                                    class=\"px-3 py-1 rounded-md focus:outline-none focus:shadow-outline-purple\"\r\n");
      out.write("                                                    >\r\n");
      out.write("                                                    8\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <button\r\n");
      out.write("                                                    class=\"px-3 py-1 rounded-md focus:outline-none focus:shadow-outline-purple\"\r\n");
      out.write("                                                    >\r\n");
      out.write("                                                    9\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <button\r\n");
      out.write("                                                    class=\"px-3 py-1 rounded-md rounded-r-lg focus:outline-none focus:shadow-outline-purple\"\r\n");
      out.write("                                                    aria-label=\"Next\"\r\n");
      out.write("                                                    >\r\n");
      out.write("                                                    <svg\r\n");
      out.write("                                                        class=\"w-4 h-4 fill-current\"\r\n");
      out.write("                                                        aria-hidden=\"true\"\r\n");
      out.write("                                                        viewBox=\"0 0 20 20\"\r\n");
      out.write("                                                        >\r\n");
      out.write("                                                    <path\r\n");
      out.write("                                                        d=\"M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z\"\r\n");
      out.write("                                                        clip-rule=\"evenodd\"\r\n");
      out.write("                                                        fill-rule=\"evenodd\"\r\n");
      out.write("                                                        ></path>\r\n");
      out.write("                                                    </svg>\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </nav>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </main>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_default_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setDefault("lỗi");
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.size()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_default_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_default_nobody.reuse(_jspx_th_c_out_0);
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
    _jspx_th_c_forEach_0.setVar("show");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                            <tr class=\"text-gray-700 dark:text-gray-400\">\r\n");
          out.write("                                                <td class=\"px-4 py-3\">\r\n");
          out.write("                                                    <div class=\"flex items-center text-sm\">\r\n");
          out.write("                                                        <!-- Avatar with inset shadow -->\r\n");
          out.write("                                                        <div class=\"relative hidden w-8 h-8 mr-3 rounded-full md:block\">\r\n");
          out.write("                                                            <img class=\"object-cover w-full h-full rounded-full\"\r\n");
          out.write("                                                                 src=\"https://images.unsplash.com/photo-1551069613-1904dbdcda11?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max&ixid=eyJhcHBfaWQiOjE3Nzg0fQ\"\r\n");
          out.write("                                                                 alt=\"\"\r\n");
          out.write("                                                                 loading=\"lazy\"/>\r\n");
          out.write("                                                            <div class=\"absolute inset-0 rounded-full shadow-inner\" aria-hidden=\"true\"></div>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                        ");
          out.write("\r\n");
          out.write("                                                        <div>\r\n");
          out.write("                                                            <p class=\"font-semibold\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.taiKhoan}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                                            <p class=\"text-xs text-gray-600 dark:text-gray-400\">\r\n");
          out.write("                                                                ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                                ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                                    </p>\r\n");
          out.write("                                                                </div>\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                        </td>\r\n");
          out.write("                                                        <td class=\"px-4 py-3 text-sm\">\r\n");
          out.write("                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.matKhau}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                </td>\r\n");
          out.write("                                                <td class=\"px-4 py-3 text-sm\">\r\n");
          out.write("                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.sdt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                </td>\r\n");
          out.write("                                                <td class=\"px-4 py-3 text-xs\">\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                    </td>\r\n");
          out.write("                                                    <td class=\"px-4 py-3 text-sm\">\r\n");
          out.write("                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.ngaySinh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                </td>\r\n");
          out.write("                                                <td class=\"px-4 py-3 text-xs\">\r\n");
          out.write("                                                    <span class=\"px-2 py-1 font-semibold leading-tight text-green-700 bg-green-100 rounded-full dark:text-green-100 dark:bg-green-700\">\r\n");
          out.write("                                                        <a href=\"UpdateUser?sid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Cập Nhật</a>\r\n");
          out.write("                                                    </span>\r\n");
          out.write("                                                    <span class=\"px-2 py-1 font-semibold leading-tight text-green-700 bg-green-100 rounded-full dark:text-green-100 dark:bg-green-700\">\r\n");
          out.write("                                                        <a href=\"#\" onclick=\"showMess(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\">Xóa</a>\r\n");
          out.write("                                                    </span>\r\n");
          out.write("                                                </td>\r\n");
          out.write("                                            </tr>\r\n");
          out.write("                                        ");
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_var_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setVar("neu");
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.loai==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("ID: ");
        if (_jspx_meth_fmt_formatNumber_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write(" | Quản Trị Viên ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_fmt_formatNumber_0.setType("number");
    _jspx_th_fmt_formatNumber_0.setMaxFractionDigits(0);
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_var_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setVar("neu");
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.loai==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("ID: ");
        if (_jspx_meth_fmt_formatNumber_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write(" | Người Dùng ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_fmt_formatNumber_1.setType("number");
    _jspx_th_fmt_formatNumber_1.setMaxFractionDigits(0);
    _jspx_th_fmt_formatNumber_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
    if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_1);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(show.gioiTinh,'nam')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <span class=\"px-2 py-1 font-semibold leading-tight text-green-700 bg-green-100 rounded-full dark:text-green-100 dark:bg-green-700\">\r\n");
        out.write("                                                            ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.gioiTinh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                                                        </span> ");
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

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(show.gioiTinh,'nu')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <span class=\"px-2 py-1 font-semibold leading-tight text-red-700 bg-red-100 rounded-full dark:text-red-100 dark:bg-red-700\">\r\n");
        out.write("                                                            ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.gioiTinh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                                                        </span> ");
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

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(show.gioiTinh,'khac')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \r\n");
        out.write("                                                        <span class=\"px-2 py-1 font-semibold leading-tight text-purple-700 bg-purple-100 rounded-full dark:text-purple-100 dark:bg-red-700\">\r\n");
        out.write("                                                            ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.gioiTinh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                                                        </span> ");
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
}
