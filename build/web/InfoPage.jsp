<%-- 
    Document   : AdminIndex
    Created on : Oct 27, 2021, 9:01:26 PM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html :class="{ 'theme-dark': dark }" x-data="data()" lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Thông Tin Cá Nhân </title>
        <link rel="ICON" href="./pictures/logo3.png" type="image/ico" />
        <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700;800&display=swap" rel="stylesheet" />
        <link rel="stylesheet" href="./css/tailwind.output.css" />
        <link rel="stylesheet" href="./css/infopage.css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/js/bootstrap.bundle.min.js"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"/>
        <script src="https://cdn.jsdelivr.net/gh/alpinejs/alpine@v2.x.x/dist/alpine.min.js" defer ></script>
        <script src="./js/init-alpine.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.css" />
        <script  src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.js" defer ></script>
        <link href="https://fonts.googleapis.com/css2?family=Playfair+Display:wght@400;500;600;700;800;900&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;600;700;800;900&display=swap" rel="stylesheet">

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
        <script src="./js/charts-lines.js" defer></script>
        <script src="./js/charts-pie.js" defer></script>
        <style type="text/css">
            #gradient-custom-4 {
                /* fallback for old browsers */
                background: #84fab0;

                /* Chrome 10-25, Safari 5.1-6 */
                background: -webkit-linear-gradient(to right, rgb(241, 195, 135), rgb(240, 255, 24));

                /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
                background: linear-gradient(to right, rgb(250, 218, 132), rgb(255, 170, 59))
            }

        </style>
    </head>
    <body>
        <header class="header">
            <div class="header__top">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="header__top__inner">
                                <div class="header__top__left">
                                    <ul>
                                        <li>
                                            <a href="index.jsp" class="Login">Trang chủ</a>
                                        </li>
                                        <li>
                                            <i class="fa fa-user-circle-o"></i>
                                            ${sessionScope.User} 
                                        </li>
                                        <li>
                                            <c:if test="${sessionScope.User == null}">
                                                <a href="Register.jsp"  class="Login">Đăng ký</a>
                                            </c:if>
                                            <c:if test="${sessionScope.User != null}">
                                                ${Admin}
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
                                    <a href="index.jsp"><img src="img/logo.png" alt=""></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="canvas__open"><i class="fa fa-bars"></i></div>
                </div>
            </div>
        </header>
        <!-- New Table -->
        <section class="vh-180 bg-image" id="gradient-custom-4" > 
            <div class="w-full overflow-hidden rounded-lg shadow-xs">
                <div class="w-full overflow-x-auto">
                    <div class="container rounded bg-white mt-5 mb-5">
                        <div class="row">
                            <div class="col-md-3 border-right">
                                <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle mt-5" width="150px" src="https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg"><span class="font-weight-bold">${fn:trim(user.ten)}</span><span class="text-black-50">${fn:trim(user.sdt)}</span><span> </span></div>
                            </div>

                            <div class="col-md-5 border-right">
                                <form action="UpdateUser" method="POST">

                                    <div class="p-3 py-5">
                                        <div class="d-flex justify-content-between align-items-center mb-3">
                                            <h4 class="text-right">Cập Nhật Hồ Sơ</h4>
                                        </div>
                                        <div class="row mt-2">
                                            <div class="col-md-6"><label class="labels">Họ và Tên:</label><input name="ten" type="text" class="form-control" placeholder="${fn:trim(user.ten)}" value="${fn:trim(user.ten)}"></div>
                                        </div>
                                        <div class="row mt-3">
                                            <div class="col-md-12"><label class="labels">Số Điện Thoại</label><input name="sdt" type="text" class="form-control" placeholder="${fn:trim(user.sdt)}" value="${fn:trim(user.sdt)}"></div>
                                            <div class="col-md-12"><label class="labels">Địa Chỉ</label><input name="diaChi" type="text" class="form-control" placeholder="${fn:trim(user.diaChi)}" value="${fn:trim(user.diaChi)}"></div>
                                            <div class="col-md-12"><label class="labels">Giới Tính</label> <br>
                                                <label class="labels"><input type="radio" name="gioiTinh" value="nu" ${user.gioiTinh.contains("nu")? "checked":""}/>
                                                    <span class="m2-1">Nữ</span>
                                                    <input type="radio" name="gioiTinh" value="nam"  ${user.gioiTinh.contains("nam")? "checked":""}/>
                                                    <span class="ml-1">Nam</span>
                                                    <input type="radio" name="gioiTinh" value="khac"  ${user.gioiTinh.contains("khac")? "checked":""}/>
                                                    <span class="ml-1">Khác</span>
                                                </label>
                                            </div>
                                            <div class="col-md-12"><label class="labels">Ngày sinh ( Năm - Tháng - Ngày ) </label><input name="ngaySinh" type="text" class="form-control" placeholder="${fn:trim(user.ngaySinh)}" value="${fn:trim(user.ngaySinh)}"></div>

                                        </div>
                                        <h class="text-danger"> ${ThongBao} </h>
                                        <div class="mt-3 text-center d-flex justify-content-center"><button class="btn btn-success btn-block btn-lg gradient-custom-4 text-body" type="submit" id="gradient-custom-4">Cập Nhật Thông Tin</button></div>
                                    </div>
                                </form>
                            </div>

                            <div class="col-md-4">
                                <form action="ChangePassword" method="POST"> 
                                    <div class="p-3 py-5">
                                        <div class="d-flex justify-content-between align-items-center experience"<span><h4>Đổi Mật Khẩu</h4></span></div><br>
                                        <div class="col-md-12"><label class="labels">Mật khẩu cũ</label><input name="oldpass" type="password" class="form-control" placeholder="" value=""></div> <br>
                                        <div class="col-md-12"><label class="labels">Mật khẩu mới</label><input name="newpass" type="password" class="form-control" placeholder="" value=""></div>
                                        <div class="col-md-12"><label class="labels">Nhập lại mật khẩu mới</label><input name="renewpass" type="password" class="form-control" placeholder="" value=""></div>
                                        <h class="text-danger"> ${ThongBaoPass} </h>
                                        <div class="mt-3 text-center d-flex justify-content-center "><button id="gradient-custom-4" class="btn btn-success btn-block btn-lg gradient-custom-4 text-body" type="submit" onclick="if (!confirm('Bạn có chắc chắn muốn đổi mật khẩu ?')) {
                                                    return false
                                                }">Đổi mật khẩu</button></div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </div>
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

