<%-- 
    Document   : newjsp
    Created on : Oct 26, 2021, 4:47:10 PM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="zxx">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Cake Template">
        <meta name="keywords" content="Cake, unica, creative, html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Thông Tin Chi Tiết Sản Phẩm</title>
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
                    <li><a href="LoginForm.jsp">Login</a> <span class="arrow_carrot-down"></span>
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
                                <li ><a href="./index.jsp">Trang chủ</a></li>
                                <li><a href="IndexProduct">Chọn Món</a></li>
                                <li><a href="#">Tùy chọn</a>
                                    <ul class="dropdown">
                                        <li><a href="./shoping-cart.jsp">Giỏ Hàng</a></li>
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
                            <h2>Chi Tiết Món Ăn</h2>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-6">
                        <div class="breadcrumb__links">
                            <a href="./index.jsp">Trang chủ</a>
                            <a href="./IndexProduct">Thực Đơn</a>
                            <span>Thông tin Món Ăn</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Breadcrumb End -->

        <!-- Shop Details Section Begin -->
        <section class="product-details spad">
            <div class="container">
                <%-- Thông tin chi tiết sản phẩm --%>

                <div class="row">
                    <div class="col-lg-6">
                        <div class="product__details__img">
                            <div class="product__details__big__img">
                                <img class="big_img" src="${product.anh}" alt="">
                            </div>

                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="product__details__text">
                            <div class="product__label">${product.thuoctinh}</div>
                            <h4>${product.ten}</h4>
                            <h5 style="color: #009933"><fmt:formatNumber type="number" maxFractionDigits="0" value="${product.giatien} "></fmt:formatNumber>VNĐ</h5>
                            <p>${product.mota}</p>
                            <div class="product__details__option">
                                <div class="quantity">
                                    <div class="pro-qty">
                                        <input type="text" value="2">
                                    </div>
                                </div>
                                <a href="#" class="primary-btn">Thêm vào giỏ hàng</a>
                                <a href="#" class="heart__btn"><span class="icon_heart_alt"></span></a>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="product__details__tab">
                    <div class="col-lg-12">
                        <ul class="nav nav-tabs" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link active" data-toggle="tab" href="#tabs-1" role="tab">Viết Đánh Giá</a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link" data-toggle="tab" href="#tabs-3" role="tab">Người Dùng Đánh Giá</a>
                            </li>
                        </ul>
                        <div class="tab-content">
                            <form action="CreateReview?productid=${product.id}" method="post">
                                <div class="tab-pane active" id="tabs-1" role="tabpanel">
                                    <div class="row d-flex justify-content-center">
                                        <div class="col-lg-12">
                                            <p>Lưu ý: Bạn chỉ có thể mua hàng xong mới có thể đánh giá!!!</p><br>
                                            <a>Số Sao: </a> 
                                            <c:forEach var="sao" begin="1" end="5"> 
                                                <div class="form-check-inline">
                                                    <input name ="danhgiasao" class="form-check-input" type="radio" id="exampleRadios2" value="${sao}">
                                                    <label class="form-check-label" for="exampleRadios2">
                                                        ${sao}
                                                    </label>
                                                </div>
                                            </c:forEach>
                                            <br>
                                            Bình Luận: <br><textarea name="binhluandanhgia" maxlength="1000" > </textarea><br>
                                            Ảnh: <input name="anhdanhgia" type="text">
                                            
                                            <br>
                                            <button type =submit class="primary-btn">Đánh giá</button>
                                        </div>
                                    </div>
                                </div>
                            </form>

                            <div class="tab-pane" id="tabs-3" role="tabpanel">
                                <div class="row d-flex justify-content-center">
                                    <c:forEach var="review" items="${listreview}">
                                        <c:forEach var="user" items="${listuser}">
                                            <c:if test="${fn:trim(review.nguoidung_id==user.id)}">
                                                <c:if test="${fn:trim(review.sanpham_id==product.id)}"> 
                                                    <c:if test="${review.hienthi==1}">
                                                        <c:if test="${review.damua==1}">
                                                            <div class="col-lg-6">
                                                                <div class="testimonial__item">
                                                                    <div class="testimonial__author">
                                                                        <div class="testimonial__author__pic">
                                                                            <img src="${review.anh}" alt="">
                                                                        </div>
                                                                        <div class="testimonial__author__text">
                                                                            <h5>${user.ten}</h5>
                                                                        </div>
                                                                    </div>
                                                                    <div class="rating">
                                                                        <c:forEach begin="1" end="${review.sao}">
                                                                            <span class="icon_star"></span>
                                                                        </c:forEach>
                                                                    </div>
                                                                    <p>${review.binhluan}</p>
                                                                </div>
                                                            </div>
                                                        </c:if>
                                                    </c:if>
                                                </c:if>
                                            </c:if>
                                        </c:forEach>

                                    </c:forEach>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Shop Details Section End -->

        <!-- Related Products Section Begin -->
        <section class="related-products spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <div class="section-title">
                            <h2>Các món ăn khác</h2>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="related__products__slider owl-carousel">
                        <c:forEach var="show" items="${productlist}">
                            <c:if test="${show.id!=product.id}">
                                <div class="col-lg-3">
                                    <div class="product__item">
                                        <div class="product__item__pic set-bg" data-setbg="${show.anh}">
                                            <div class="product__label">
                                                <span>${show.thuoctinh}</span>
                                            </div>
                                        </div>
                                        <div class="product__item__text">
                                            <h6><a href="ProductDetail?sid=${show.id}">${show.ten}</a></h6>
                                            <div class="product__item__price" style="color: #009933"><fmt:formatNumber type="number" maxFractionDigits="0" value="${show.giatien}"></fmt:formatNumber>VNĐ</div>
                                                <div class="cart_add">
                                                    <a href="#">Thêm vào giỏ hàng</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                            </c:if>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </section>
        <!-- Related Products Section End -->

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