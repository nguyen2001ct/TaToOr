<%-- 
    Document   : UpdateProduct
    Created on : 01/11/2021, 11:13:17 PM
    Author     : Nguyethingocyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html :class="{ 'theme-dark': dark }" x-data="data()" lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Chỉnh sửa thông tin sản phẩm</title>
        <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700;800&display=swap" rel="stylesheet"/>
        <link rel="stylesheet" href="./css/tailwind.output.css" />
        <script src="https://cdn.jsdelivr.net/gh/alpinejs/alpine@v2.x.x/dist/alpine.min.js" defer></script>
        <link rel="ICON" href="./pictures/logo3.png" type="image/ico" />
        <script src="./js/init-alpine.js"></script>
    </head>
    <body>
        <div class="flex h-screen bg-gray-50 dark:bg-gray-900" :class="{ 'overflow-hidden': isSideMenuOpen}" >
             <!-- Desktop sidebar -->
             <aside class="z-20 flex-shrink-0 hidden w-64 overflow-y-auto bg-white dark:bg-gray-800 md:block">
                <div class="py-4 text-gray-500 dark:text-gray-400">
                    <a class="ml-6 text-lg font-bold text-gray-800 dark:text-gray-200" href="index.jsp" >Trang chủ</a>
                    <ul class="mt-6">
                        <li class="relative px-6 py-3">
                            <a class="inline-flex items-center w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200" href="ShowUser">
                                <svg
                                    class="w-5 h-5"
                                    aria-hidden="true"
                                    fill="none"
                                    stroke-linecap="round"
                                    stroke-linejoin="round"
                                    stroke-width="2"
                                    viewBox="0 0 24 24"
                                    stroke="currentColor">
                                <path d="M3 12l2-2m0 0l7-7 7 7M5 10v10a1 1 0 001 1h3m10-11l2 2m-2-2v10a1 1 0 01-1 1h-3m-6 0a1 1 0 001-1v-4a1 1 0 011-1h2a1 1 0 011 1v4a1 1 0 001 1m-6 0h6"></path>
                                </svg>
                                <span class="ml-4">Quản lý người dùng</span>
                            </a>
                        </li>
                    </ul>
                    <ul>
                        <li class="relative px-6 py-3">
                            <a class="inline-flex items-center w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200" href="forms.html" >
                                <svg
                                    class="w-5 h-5"
                                    aria-hidden="true"
                                    fill="none"
                                    stroke-linecap="round"
                                    stroke-linejoin="round"
                                    stroke-width="2"
                                    viewBox="0 0 24 24"
                                    stroke="currentColor"
                                    >
                                <path
                                    d="M9 5H7a2 2 0 00-2 2v12a2 2 0 002 2h10a2 2 0 002-2V7a2 2 0 00-2-2h-2M9 5a2 2 0 002 2h2a2 2 0 002-2M9 5a2 2 0 012-2h2a2 2 0 012 2m-3 7h3m-3 4h3m-6-4h.01M9 16h.01"
                                    ></path>
                                </svg>
                                <span class="ml-4">Quản lý hóa đơn</span>
                            </a>
                        </li>
                        <li class="relative px-6 py-3">
                            <a class="inline-flex items-center w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200"
                               href="ShowReview">
                                <svg
                                    class="w-5 h-5"
                                    aria-hidden="true"
                                    fill="none"
                                    stroke-linecap="round"
                                    stroke-linejoin="round"
                                    stroke-width="2"
                                    viewBox="0 0 24 24"
                                    stroke="currentColor"
                                    >
                                <path
                                    d="M15 15l-2 5L9 9l11 4-5 2zm0 0l5 5M7.188 2.239l.777 2.897M5.136 7.965l-2.898-.777M13.95 4.05l-2.122 2.122m-5.657 5.656l-2.12 2.122"
                                    ></path>
                                </svg>
                                <span class="ml-4">Quản lý đánh giá</span>
                            </a>
                        </li>
                        <li class="relative px-6 py-3">
                            <span
                                class="absolute inset-y-0 left-0 w-1 bg-purple-600 rounded-tr-lg rounded-br-lg"
                                aria-hidden="true"
                                ></span>
                            <a class="inline-flex items-center w-full text-sm font-semibold text-gray-800 transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200 dark:text-gray-100"
                                href="ShowProduct">
                                <svg
                                    class="w-5 h-5"
                                    aria-hidden="true"
                                    fill="none"
                                    stroke-linecap="round"
                                    stroke-linejoin="round"
                                    stroke-width="2"
                                    viewBox="0 0 24 24"
                                    stroke="currentColor">
                                <path d="M4 6h16M4 10h16M4 14h16M4 18h16"></path>
                                </svg>
                                <span class="ml-4">Quản lý sản phẩm</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </aside>
            <!-- Mobile sidebar -->
            
            <div class="flex flex-col flex-1">
                <header class="z-10 py-4 bg-white shadow-md dark:bg-gray-800">
                    <div
                        class="container flex items-center justify-between h-full px-6 mx-auto text-purple-600 dark:text-purple-300"
                        >
                        <!-- Mobile hamburger -->
                        <button
                            class="p-1 -ml-1 mr-5 rounded-md md:hidden focus:outline-none focus:shadow-outline-purple"
                            @click="toggleSideMenu"
                            aria-label="Menu"
                            >
                            <svg
                                class="w-6 h-6"
                                aria-hidden="true"
                                fill="currentColor"
                                viewBox="0 0 20 20"
                                >
                            <path
                                fill-rule="evenodd"
                                d="M3 5a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 10a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 15a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1z"
                                clip-rule="evenodd"
                                ></path>
                            </svg>
                        </button>
                        <!-- Search input -->
                        <div class="flex justify-center flex-1 lg:mr-32">
                            <img src="img/footer-logo.png" width="180px">
                        </div>
                        <ul class="flex items-center flex-shrink-0 space-x-6">
                            <!-- Theme toggler -->
                            <li class="flex">
                                <button
                                    class="rounded-md focus:outline-none focus:shadow-outline-purple"
                                    @click="toggleTheme"
                                    aria-label="Toggle color mode"
                                    >
                                    <template x-if="!dark">
                                        <svg
                                            class="w-5 h-5"
                                            aria-hidden="true"
                                            fill="currentColor"
                                            viewBox="0 0 20 20"
                                            >
                                        <path
                                            d="M17.293 13.293A8 8 0 016.707 2.707a8.001 8.001 0 1010.586 10.586z"
                                            ></path>
                                        </svg>
                                    </template>
                                    <template x-if="dark">
                                        <svg
                                            class="w-5 h-5"
                                            aria-hidden="true"
                                            fill="currentColor"
                                            viewBox="0 0 20 20"
                                            >
                                        <path
                                            fill-rule="evenodd"
                                            d="M10 2a1 1 0 011 1v1a1 1 0 11-2 0V3a1 1 0 011-1zm4 8a4 4 0 11-8 0 4 4 0 018 0zm-.464 4.95l.707.707a1 1 0 001.414-1.414l-.707-.707a1 1 0 00-1.414 1.414zm2.12-10.607a1 1 0 010 1.414l-.706.707a1 1 0 11-1.414-1.414l.707-.707a1 1 0 011.414 0zM17 11a1 1 0 100-2h-1a1 1 0 100 2h1zm-7 4a1 1 0 011 1v1a1 1 0 11-2 0v-1a1 1 0 011-1zM5.05 6.464A1 1 0 106.465 5.05l-.708-.707a1 1 0 00-1.414 1.414l.707.707zm1.414 8.486l-.707.707a1 1 0 01-1.414-1.414l.707-.707a1 1 0 011.414 1.414zM4 11a1 1 0 100-2H3a1 1 0 000 2h1z"
                                            clip-rule="evenodd"
                                            ></path>
                                        </svg>
                                    </template>
                                </button>
                            </li>
                            <!-- Notifications menu -->
                            <!-- Profile menu -->
                        </ul>
                    </div>
                </header>
                <!-- Chỉnh sửa người dùng-->
                <main class="h-full pb-16 overflow-y-auto">
                    <div class="container px-6 mx-auto grid">
                        <h4 class="flex items-center justify-between p-4 mb-8 text-sm font-semibold text-purple-100 bg-purple-600 rounded-lg shadow-md focus:outline-none focus:shadow-outline-purple my-6 text-2xl font-semibold text-gray-700 dark:text-gray-200">
                            Chỉnh sửa thông tin của sản phẩm</h4>
                        <div class="px-4 py-3 mb-8 bg-white rounded-lg shadow-md dark:bg-gray-800">
                            <!--Thông tin người dùng-->
                            <form action="UpdateProduct" method="POST">
                                <label class="block text-sm">
                                    <span class="text-gray-700 dark:text-gray-400">ID sản phẩm</span>
                                    <input class="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input"
                                           value="<fmt:formatNumber type="number" maxFractionDigits="0" value="${product.id}"></fmt:formatNumber>" type="text" name="id" readonly />
                                </label>
                                <label class="block text-sm">
                                    <span class="text-gray-700 dark:text-gray-400">Tên sản phẩm</span>
                                    <input class="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input"
                                           value="${product.ten}" type="text" name="ten"/>
                                </label>
                                <label class="block text-sm">
                                    <span class="text-gray-700 dark:text-gray-400">Giá tiền sản phẩm</span>
                                    <input class="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input"
                                           value="<fmt:formatNumber type="number" maxFractionDigits="0" value="${product.giatien}"></fmt:formatNumber>" type="number" name="giaTien"/>
                                    </label>
                                    <div class="mt-4 text-sm">
                                        <span class="text-gray-700 dark:text-gray-400">Thuộc tính sản phẩm</span>
                                        <div class="mt-2">
                                            <label class="inline-flex items-center text-gray-600 dark:text-gray-400">
                                                <input class="text-purple-600 form-radio focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray"
                                                       type="radio" name="thuocTinh" value="Ăn Chính" ${product.thuoctinh.contains("Ăn Chính")? "checked":""}/>
                                            <span class="ml-2">Ăn chính</span>
                                        </label>
                                        <label class="inline-flex items-center ml-6 text-gray-600 dark:text-gray-400">
                                            <input class="text-purple-600 form-radio focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray"
                                                   type="radio" name="thuocTinh" value="Ăn Vặt" ${product.thuoctinh.contains("Ăn Vặt")? "checked":""}/>
                                            <span class="ml-2">Ăn vặt</span>
                                        </label>
                                        <label class="inline-flex items-center ml-6 text-gray-600 dark:text-gray-400">
                                            <input class="text-purple-600 form-radio focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray"
                                                   type="radio" name="thuocTinh" value="Tráng Miệng" ${product.thuoctinh.contains("Tráng Miệng")? "checked":""}/>
                                            <span class="ml-2">Tráng miệng</span>
                                        </label>
                                    </div>
                                </div>
                                <span><br></span>
                                <label class="block text-sm">
                                    <span class="text-gray-700 dark:text-gray-400">Mô tả sản phẩm</span>
                                    <input class="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input"
                                           value="${product.mota}" type="text" name="moTa"/>
                                </label> 
                                <label class="block text-sm">
                                    <span class="text-gray-700 dark:text-gray-400">Đánh giá sản phẩm</span>
                                    <input class="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input"
                                           value="${product.danhgia}" type="text" name="danhGia"/>
                                </label>
                                <label class="block text-sm">
                                    <span class="text-gray-700 dark:text-gray-400">Hình ảnh sản phẩm</span>
                                    <input class="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input"
                                           value="${product.anh}" type="text" name="anh"/>
                                </label>
                                <span><br></span>
                                <label class="center">
                                    <input class="dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input"
                                           value="Reset" type="reset"/>
                                </label> 
                                <label class="center">
                                    <input class="dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input"
                                           value="Update" type="submit"/>
                                </label> 
                            </form>
                        </div>
                    </div>
            </div>   
        </div>
    </main>

</div>
</div>
</body>
</html>
