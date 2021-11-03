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
        <title>Quản Lí Người Dùng</title>
        <link
            href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700;800&display=swap"
            rel="stylesheet"
            />
        <link rel="stylesheet" href="./css/tailwind.output.css" />
        <link rel="stylesheet" href="./css/infopage.css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/js/bootstrap.bundle.min.js"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"/>
        <script
            src="https://cdn.jsdelivr.net/gh/alpinejs/alpine@v2.x.x/dist/alpine.min.js"
            defer
        ></script>
        <script src="./js/init-alpine.js"></script>
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.css"
            />
        <script
            src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.js"
            defer
        ></script>
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
        <!-- New Table -->
        <section class="vh-100 bg-image" id="gradient-custom-4" > 
            <div class="w-full overflow-hidden rounded-lg shadow-xs">
                <div class="w-full overflow-x-auto">
                    <div class="container rounded bg-white mt-5 mb-5">
                        <div class="row">
                            <div class="col-md-3 border-right">
                                <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle mt-5" width="150px" src="https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg"><span class="font-weight-bold">Edogaru</span><span class="text-black-50">edogaru@mail.com.my</span><span> </span></div>
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

                                        <div class="mt-3 text-center"><button class="btn btn-primary profile-button" type="submit">Cập Nhật Thông Tin</button></div>
                                    </div>
                                </form>
                            </div>

                            <div class="col-md-4">
                                <div class="p-3 py-5">
                                    <div class="d-flex justify-content-between align-items-center experience"><span>Edit Experience</span><span class="border px-3 p-1 add-experience"><i class="fa fa-plus"></i>&nbsp;Experience</span></div><br>
                                    <div class="col-md-12"><label class="labels">Experience in Designing</label><input type="text" class="form-control" placeholder="experience" value=""></div> <br>
                                    <div class="col-md-12"><label class="labels">Additional Details</label><input type="text" class="form-control" placeholder="additional details" value=""></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </section>
    </body>
</html>

