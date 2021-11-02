<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://getbootstrap.com/docs/4.0/assets/js/vendor/popper.min.js">
    <link rel="stylesheet" href="/exercises/css/fontawesome.css" media="all">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="ICON" href="./img/a.PNG" type="image/ico" />
    <title>Login</title>
    <style type="text/css">


        .gradient-custom-4 {
            /* fallback for old browsers */
            background: #84fab0;

            /* Chrome 10-25, Safari 5.1-6 */
            background: -webkit-linear-gradient(to right, rgb(241, 195, 135), rgb(240, 255, 24));

            /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
            background: linear-gradient(to right, rgb(250, 218, 132), rgb(255, 170, 59))
        }

        #check{
            display: block;
        }
        section{
            background-size: 50%;
        }
        #logo{
            margin-left: 150px;
        }
        .form-check-label{
            color: black;
        }
        .form-label{
            color: red;
        }
    </style>
    <script type="text/javascript">
        var errorArray = [];

        function checkUsername() {
            tk = document.getElementById("txtUsername").value;
            document.getElementById("txtUsernameMess").innerHTML = tk == "" ? "Tên không được bỏ trống" : "";
        }
        function checkYear() {
            year = document.getElementById("txtYear").value;
            var d = new Date(year);
            var da = new Date();
            document.getElementById("txtYearMess").innerHTML = d.getFullYear() > da.getFullYear() ? "Năm sinh phải nhỏ hơn năm hiện tại" : "";
        }
    </script>
</head>
<body>
    <section class="vh-100 bg-image" style="background-image: url('./img/background.jpg');"> 
        <div class="mask d-flex align-items-center h-100 gradient-custom-3">
            <div class="container h-100">
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <div class="col-12 col-md-9 col-lg-7 col-xl-6">
                        <div class="card" style="border-radius: 15px;">
                            <div class="card-body p-5 ">
                                <div id="logo">
                                    <p class=" mb-7" style="background-image: url('./img/logo.jpg'); background-repeat: no-repeat;height: 98px; " ></p>
                                </div>
                                <h2 class="text-uppercase mb-5 text-center">Tạo tài khoản</h2>

                                <form action="CreateAccount" method="POST" >
                                    <div class="form-outline mb-7">
                                        <input name="taiKhoan" type="text" id="txtUsername" class="form-control form-control-lg" placeholder="Tài Khoản" onblur="checkUsername()"/>
                                        <p class="form-label" for="form3Example1cg" id="txtUsernameMess" ></p>
                                    </div>

                                    <div class="form-outline mb-7">
                                        <input name="pass" type="password" id="txtPass1" class="form-control form-control-lg"  placeholder="Mật khẩu"/>
                                        <p class="form-label" for="form3Example4cg" ></p>
                                    </div>

                                    <div class="form-outline mb-7">
                                        <input name="repass" type="password" id="txtPass2" class="form-control form-control-lg" placeholder="Nhập lại mật khẩu" />
                                        <p class="form-label" for="form3Example4cdg"></p>
                                    </div>
                                    <h class="text-danger"> ${error5}</p>
                                        <div class="form-outline mb-7">
                                            <input name="ten" type="text" id="txtUsername" class="form-control form-control-lg" placeholder="Họ và Tên" onblur="checkUsername()"/>
                                            <p class="form-label" for="form3Example1cg" id="txtUsernameMess" ></p>
                                        </div>
                                        <div class="form-outline mb-7" id="check">
                                            <div class="form-check-inline">
                                                <input name ="gioitinh" class="form-check-input" type="radio" id="exampleRadios1" value="nam" >
                                                <label class="form-check-label" for="exampleRadios1">
                                                    Nam
                                                </label>
                                            </div>
                                            <div class="form-check-inline">
                                                <input name ="gioitinh" class="form-check-input" type="radio" id="exampleRadios2" value="nu">
                                                <label class="form-check-label" for="exampleRadios2">
                                                    Nữ
                                                </label>
                                            </div>
                                        </div>
                                        <p></p>

                                        <div class="form-outline mb-7">
                                            <input type="text" name="namsinh" id="txtYear" class="form-control form-control-lg" placeholder="Năm sinh(yyyy)" maxlength="4" pattern="[1-2][0-9]{3}" title="Nhập 4 kí tự chỉ bao gồm số." onblur="checkYear()"/>
                                            <p class="form-label" for="form3Example4cdg" id="txtYearMess"></p>
                                        </div>


                                        <div class="form-outline mb-7">
                                            <input type="text" name="sdt" id="txtPhone" class="form-control form-control-lg" placeholder="Nhập số điện thoại" title="Nhập 10 kí tự chỉ bao gồm số." maxlength="10" pattern="[0][0-9]{9}"/>
                                            <label class="form-label" for="form3Example4cdg"></label>
                                        </div>



                                        <div class="d-flex justify-content-center">
                                            <button type="submit" class="btn btn-success btn-block btn-lg gradient-custom-4 text-body" >Đăng kí</button>
                                            <p class="form-label" for="form3Example1cg" id="txtDkiMess" ></p>
                                        </div>

                                        <p class="text-center text-muted mt-5 mb-0">Bạn đã có tài khoản? <a href="LoginForm.jsp" class="fw-bold text-body"><u>Đăng nhập</u></a></p>

                                </form>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</body>
</html>