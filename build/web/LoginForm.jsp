<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>

    <head>
        <title>Login Form</title>
        <link rel="ICON" href="./pictures/logo3.png" type="image/ico" />
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
    </head>
    <body>
        <style>
            body {
                font-family: Arial, Helvetica, sans-serif;
                background-image: url('./pictures/Background.png');
                background-size: 50%;
                width: 100%;
                height: 100%;
            }

            h2 {
                text-align: center;
                padding-top: 20px;
            }

            form {
                border: 0px solid #f1f1f1;
            }

            .form-input {
                margin-top: 5px;
                border: 2px solid #eee;
                border-radius: 4px;
                width: 98%;
                height: 50px;
                transition: 0.25s ease;
            }

            .form {
                position: relative;
            }

            .form-label {
                position: absolute;
                top: 55%;
                transform: translateY(-50%);
                left: 21px;
                user-select: none;
                color: #999;
                pointer-events: none;
                transform: 0.25s ease;
            }

            .form-input:not(:placeholder-shown)+.form-label,
            .form-input:focus+.form-label {
                top: 0;
                display: inline-block;
                padding: 10px;
                background-color: white;
                color: #6a5af9;
            }

            button {
                /* fallback for old browsers */
                background: #84fab0;
                /* Chrome 10-25, Safari 5.1-6 */
                background: -webkit-linear-gradient(to right, rgb(241, 195, 135), rgb(240, 255, 24));
                /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
                background: linear-gradient(to right, rgb(250, 218, 132), rgb(255, 170, 59));
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
            }

            button:hover {
                opacity: 0.8;
            }

            .cancelbtn {
                width: auto;
                padding: 10px 18px;
                background-color: #f44336;
            }

            .imgcontainer {
                text-align: center;
                padding-top: 5%;
                margin: 0 auto;
                width: 50%;
                height: 50%;
            }

            img.avatar {
                width: 40%;
            }

            .container {
                padding: 16px;
            }

            span.psw {
                float: right;
                padding-top: 16px;
            }

            .psw a {
                color: black;
                text-decoration: none;
            }

            .form1 {
                background-color: white;
                height: 90%;
                width: 40%;
                margin: 0 auto;
                margin-top: 10%;
            }
            /* Change styles for span and cancel button on extra small screens */

            #SignUp {
                margin-top: 10px;
                text-decoration: none;
                margin-left: 44%;
                position: relative;
            }

            #ShowPass {
                margin-top: 8px;
            }

            input:valid~span {
                display: block;
            }

            span i.hide-btn::before {
                content: "\f070";
            }
            .Error{
                text-align: center;
                color: #f44336;
            }
            @media screen and (max-width: 300px) {
                span.psw {
                    display: block;
                    float: none;
                }
                .cancelbtn {
                    width: 100%;
                }
            }
        </style>
        <div class="form1">

            <form action="LoginControl" method="post">
                <div class="imgcontainer">
                    <img src="pictures/logo3.png" alt="Avatar" class="avatar">
                </div>
                <h2>Đăng Nhập</h2>

                <div class="container">
                    <div class="form">
                        <input type="text" class="form-input" placeholder=" " name="Username" value="${username}" required>
                        <label for="Username" class="form-label">Tên Đăng Nhập</label><br>
                    </div>
                    <div class="form">
                        <input type="password" class="form-input" name="password" id="pass" placeholder=" " required>
                        <label for="password" class="form-label">Mật Khẩu </label><br>


                    </div>
                    <div class="form">
                        <input id="ShowPass"  name="ShowPass" type="checkbox" onclick="myFunction()">
                        <label for="ShowPass" >Hiện mật khẩu</label>
                        <span class="Error">${error1}</span>
                    </div>
                    <button type="submit">Đăng Nhập</button>
                    <a href="Register.jsp" id="SignUp">Đăng Ký</a>
                </div>

                <div class="container" style="background-color:#f1f1f1">
                    <button type="button" class="cancelbtn"><a href="Guest" style="color: black;text-decoration: none">Huỷ</a></button>
                </div>
            </form>
        </div>
        <script>
            function myFunction() {
                var x = document.getElementById("pass");
                if (x.type === "password") {
                    x.type = "text";
                } else {
                    x.type = "password";
                }
            }
        </script>
    </body>

</html>