<%-- 
    Document   : newjsp
    Created on : Oct 26, 2021, 4:47:10 PM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="zxx">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Cake Template">
        <meta name="keywords" content="Cake, unica, creative, html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">


        <title>Giỏ Hàng</title>
        <link rel="ICON" href="./pictures/logo3.png" type="image/ico" />

        <!-- Google Font -->
        <link href="https://fonts.googleapis.com/css2?family=Playfair+Display:wght@400;500;600;700;800;900&display=swap"
              rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;600;700;800;900&display=swap"
              rel="stylesheet">

        <!-- Css Styles -->
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="css/flaticon.css" type="text/css">
        <link rel="stylesheet" href="css/barfiller.css" type="text/css">
        <link rel="stylesheet" href="css/magnific-popup.css" type="text/css">
        <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
        <link rel="stylesheet" href="css/nice-select.css" type="text/css">
        <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
        <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
        <link rel="stylesheet" href="css/style.css" type="text/css">
    </head>

    <body>
        <!-- Page Preloder -->
        <div id="preloder">
            <div class="loader"></div>
        </div>

        <!-- Offcanvas Menu Begin -->
        <div class="offcanvas-menu-overlay"></div>
        <div class="offcanvas-menu-wrapper">
            <div class="offcanvas__cart">
                <div class="offcanvas__cart__links">
                    <a href="#" class="search-switch"><img src="img/icon/search.png" alt=""></a>
                    <a href="#"><img src="img/icon/heart.png" alt=""></a>
                </div>
                <div class="offcanvas__cart__item">
                    <a href="#"><img src="img/icon/cart.png" alt=""> <span>0</span></a>
                    <div class="cart__price">Cart: <span>$0.00</span></div>
                </div>
            </div>
            <div class="offcanvas__logo">
                <a href="./index.html"><img src="img/logo.png" alt=""></a>
            </div>
            <div id="mobile-menu-wrap"></div>
            <div class="offcanvas__option">
                <ul>
                    <li><a href="LoginForm.jsp"><img src="img/icon/login.png" alt="" height="25px" width="25px"> Login</a> <span class="arrow_carrot-down"></span>
                        <ul>
                            <li class="Login"><a href="LoginForm.jsp">Login</a></li>
                            <li class="Login"><a href="Register.jsp">Register</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
        <!-- Offcanvas Menu End -->

        <!-- Header Section Begin -->
        <header class="header">
            <div class="header__top">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="header__top__inner">
                                <div class="header__top__left">
                                    <ul>
                                        <li>
                                            <img src="img/icon/login.png" alt="" height="25px" width="25px">
                                            <c:if test="${sessionScope.User == null}">
                                                <a href="LoginForm.jsp">Đăng nhập</a>
                                            </c:if>
                                            <c:if test="${sessionScope.User != null}">
                                                ${sessionScope.User}
                                            </c:if>
                                        </li>
                                        <li>
                                            <c:if test="${sessionScope.User == null}">
                                                <a href="Register.jsp"  class="Login">Đăng ký</a>
                                            </c:if>
                                            <c:if test="${sessionScope.User != null}">
                                                <a href="ShowUser" class="Login">${Admin}</a>
                                            </c:if>
                                        </li>
                                        <li>
                                            <c:if test="${sessionScope.User == null}">

                                            </c:if>
                                            <c:if test="${sessionScope.User != null}">
                                                <a href="LogOutAccount" class="Login">Đăng xuất</a>
                                            </c:if>
                                        </li>
                                    </ul>
                                </div>
                                <div class="header__logo">
                                    <a href="./index.html"><img src="img/logo.png" alt=""></a>
                                </div>
                                <div class="header__top__right">
                                    <div class="header__top__right__cart">
                                        <a href="#"><img src="img/icon/cart.png" alt=""> <span>0</span></a>
                                        <div class="cart__price">Cart: <span>$0.00</span></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="canvas__open"><i class="fa fa-bars"></i></div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <nav class="header__menu mobile-menu">
                            <ul>
                                <li><a href="./index.jsp">Trang chủ</a></li>
                                <li><a href="IndexProduct">Chọn Món</a></li>
                                <li><a href="#">Tùy chọn</a>
                                    <ul class="dropdown">
                                        <li class="active"><a href="./ShowOrder">Giỏ Hàng</a></li>
                                        <li><a href="./checkout.jsp">Thanh Toán</a></li>
                                    </ul>
                                </li>
                                <li><a href="./blog.jsp">Thuyết Trình</a></li>
                                <li><a href="./contact.jsp">Liên Hệ</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </header>
        <!-- Header Section End -->

        <!-- Breadcrumb Begin -->
        <div class="breadcrumb-option">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-6">
                        <div class="breadcrumb__text">
                            <h2>Shopping cart</h2>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-6">
                        <div class="breadcrumb__links">
                            <a href="./index.html">Home</a>
                            <span>Shopping cart</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Breadcrumb End -->

        <!-- Shopping Cart Section Begin -->
        <section class="shopping-cart spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8">
                        <form action="UpdateShopingCart" method="post">
                            <div class="shopping__cart__table">
                                <table>
                                    <thead>
                                        <tr>
                                            <th>Product</th>
                                            <th>Quantity</th>
                                            <th>Total</th>
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:set var="count" value="0"/>
                                        <c:forEach var="Order" items="${Orders}">
                                            <tr>
                                                <td class="product__cart__item">
                                                    <div class="product__cart__item__pic">
                                                        <img src="${Order.product.anh}" alt="">
                                                        <h6>${Order.product.ten}</h6>
                                                    </div>
                                                    <div class="product__cart__item__text">
                                                        <h5>${Order.product.giatien}</h5>
                                                    </div>
                                                </td>
                                                <td class="quantity__item">
                                                    <div class="quantity">
                                                        <div class="pro-qty">
                                                            <input type="text" value="${Order.soLuong}" name="SoluongSP${count}">
                                                            <c:set var="count" value="${count+1}"/>
                                                        </div>
                                                    </div>
                                                </td>
                                                <td class="cart__price"><fmt:formatNumber type="number" maxFractionDigits="0" value="${Order.tongTien}"></fmt:formatNumber>VNĐ</td>
                                                <td class="cart__close">
                                                    <a href="DeleteCartByCartID?ghid=${Order.id}"><span class="icon_close"></span></a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <div class="row">
                                <div class="col-lg-6 col-md-6 col-sm-6">
                                    <div class="continue__btn">
                                        <a href="IndexProduct">Tiếp tục mua hàng</a>
                                    </div>
                                </div>
                                <div class="col-lg-6 col-md-6 col-sm-6">
                                    <div class="continue__btn update__btn">
                                        <input type="submit" name="submit" value="Cập nhật giỏ hàng" class="primary-btn">
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="col-lg-4">

                        <div class="cart__total">
                            <h6>Tổng tiền</h6>
                            <ul>
                                <li>Tổng <span>${tongbill}</span></li>
                            </ul>
                            <a href="ShowBill" class="primary-btn">Thanh toán</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Shopping Cart Section End -->

        <!-- Footer Section Begin -->
        <footer class="footer set-bg" data-setbg="img/footer-bg.jpg">
            <div class="container">
                <div class="row">
                    <div class="col-lg-4 col-md-6 col-sm-6">
                        <div class="footer__widget">
                            <h6>Giờ Chạy DeadLine</h6>
                            <ul>
                                <li>Thứ Hai - Thứ 6: 07:00 chiều – 10:00 tối</li>
                                <li>Thứ Bảy: 10:00 sáng – 11:30 trưa </li>
                                <li>và 2:30 chiều - 4:30 chiều</li>
                                <li>Chủ Nhật: Tùy Hứng</li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 col-sm-6">
                        <div class="footer__about">
                            <div class="footer__logo">
                                <a href="#"><img src="img/footer-logo.png" alt=""></a>
                            </div>
                            <p>From SE1504 with Love</p>
                            <div class="footer__social">
                                <a href="#"><i class="fa fa-facebook"></i></a>
                                <a href="#"><i class="fa fa-twitter"></i></a>
                                <a href="#"><i class="fa fa-instagram"></i></a>
                                <a href="#"><i class="fa fa-youtube-play"></i></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 col-sm-6">
                        <div class="footer__newslatter">
                            <h6>Đăng ký</h6>
                            <p>Nhận thông tin món ăn mới nhất từ chúng tôi.</p>
                            <form action="#">
                                <input type="text" placeholder="Email">
                                <button type="submit"><i class="fa fa-send-o"></i></button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <div class="copyright">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-7">
                            <p class="copyright__text text-white">
                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                Copyright &copy;
                                <script>
                                    document.write(new Date().getFullYear());
                                </script> All rights reserved | This template is made with <i class="fa fa-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            </p>
                        </div>
                        <div class="col-lg-5">
                            <div class="copyright__widget">
                                <ul>
                                    <li><a href="#">Privacy Policy</a></li>
                                    <li><a href="#">Terms & Conditions</a></li>
                                    <li><a href="#">Site Map</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
        <!-- Footer Section End -->

        <!-- Search Begin -->
        <div class="search-model">
            <div class="h-100 d-flex align-items-center justify-content-center">
                <div class="search-close-switch">+</div>
                <form class="search-model-form">
                    <input type="text" id="search-input" placeholder="Search here.....">
                </form>
            </div>
        </div>
        <!-- Search End -->

        <!-- Js Plugins -->
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.nice-select.min.js"></script>
        <script src="js/jquery.barfiller.js"></script>
        <script src="js/jquery.magnific-popup.min.js"></script>
        <script src="js/jquery.slicknav.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/jquery.nicescroll.min.js"></script>
        <script src="js/main.js"></script>
    </body>

</html>
