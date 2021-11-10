<%-- 
    Document   : AdminIndex
    Created on : Oct 27, 2021, 9:01:26 PM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html :class="{ 'theme-dark': dark }" x-data="data()" lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Quản Lý Người Dùng</title>
        <link rel="ICON" href="./pictures/logo3.png" type="image/ico" />
        <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700;800&display=swap" rel="stylesheet"/>
        <link rel="stylesheet" href="./css/tailwind.output.css" />
        <script src="https://cdn.jsdelivr.net/gh/alpinejs/alpine@v2.x.x/dist/alpine.min.js" defer></script>
        <script src="./js/init-alpine.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.css"/>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.js" defer></script>
        <script src="./js/charts-lines.js" defer></script>
        <script src="./js/charts-pie.js" defer></script>

    </head>
    <body>
        <div class="flex h-screen bg-gray-50 dark:bg-gray-900":class="{ 'overflow-hidden': isSideMenuOpen }">
             <!-- Desktop sidebar -->
             <aside class="z-20 hidden w-64 overflow-y-auto bg-white dark:bg-gray-800 md:block flex-shrink-0">
                <div class="py-4 text-gray-500 dark:text-gray-400">
                    <a class="ml-6 text-lg font-bold text-gray-800 dark:text-gray-200"href="index.jsp"> Trang chủ</a>
                    <ul class="mt-6">
                        <li class="relative px-6 py-3">

                            <a class="inline-flex items-center w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200"
                               href="ShowUser">                                <svg
                                    class="w-5 h-5"
                                    aria-hidden="true"
                                    fill="none"
                                    stroke-linecap="round"
                                    stroke-linejoin="round"
                                    stroke-width="2"
                                    viewBox="0 0 24 24"
                                    stroke="currentColor"
                                    >
                                <path d="M3 12l2-2m0 0l7-7 7 7M5 10v10a1 1 0 001 1h3m10-11l2 2m-2-2v10a1 1 0 01-1 1h-3m-6 0a1 1 0 001-1v-4a1 1 0 011-1h2a1 1 0 011 1v4a1 1 0 001 1m-6 0h6" ></path>
                                </svg>
                                <span class="ml-4">Quản lý người dùng</span>
                            </a>
                        </li>
                    </ul>
                    <ul>
                        <li class="relative px-6 py-3">
                            <a class="inline-flex items-center w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200"
                               href="ShowBillAdmin">
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
                            <span class="absolute inset-y-0 left-0 w-1 bg-purple-600 rounded-tr-lg rounded-br-lg" aria-hidden="true"></span>
                            <a class="inline-flex items-center w-full text-sm font-semibold text-gray-800 transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200 dark:text-gray-100"
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
                            <a
                                class="inline-flex items-center w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200"
                                href="ShowProduct"
                                >
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
                                <path d="M4 6h16M4 10h16M4 14h16M4 18h16"></path>
                                </svg>
                                <span class="ml-4">Quản lý sản phẩm</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </aside>
            <!-- Mobile sidebar -->
            <!-- Backdrop -->
            <div
                x-show="isSideMenuOpen"
                x-transition:enter="transition ease-in-out duration-150"
                x-transition:enter-start="opacity-0"
                x-transition:enter-end="opacity-100"
                x-transition:leave="transition ease-in-out duration-150"
                x-transition:leave-start="opacity-100"
                x-transition:leave-end="opacity-0"
                class="fixed inset-0 z-10 flex items-end bg-black bg-opacity-50 sm:items-center sm:justify-center"
                ></div>
            <aside
                class="fixed inset-y-0 z-20 flex-shrink-0 w-64 mt-16 overflow-y-auto bg-white dark:bg-gray-800 md:hidden"
                x-show="isSideMenuOpen"
                x-transition:enter="transition ease-in-out duration-150"
                x-transition:enter-start="opacity-0 transform -translate-x-20"
                x-transition:enter-end="opacity-100"
                x-transition:leave="transition ease-in-out duration-150"
                x-transition:leave-start="opacity-100"
                x-transition:leave-end="opacity-0 transform -translate-x-20"
                @click.away="closeSideMenu"
                @keydown.escape="closeSideMenu"
                >
                <div class="py-4 text-gray-500 dark:text-gray-400">
                    <a class="ml-6 text-lg font-bold text-gray-800 dark:text-gray-200" href="#" >
                        Windmill
                    </a>
                    <ul class="mt-6">
                        <li class="relative px-6 py-3">
                            <span class="absolute inset-y-0 left-0 w-1 bg-purple-600 rounded-tr-lg rounded-br-lg" aria-hidden="true"></span>
                            <a
                                class="inline-flex items-center w-full text-sm font-semibold text-gray-800 transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200 dark:text-gray-100"
                                href="index.html"
                                >
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
                                    d="M3 12l2-2m0 0l7-7 7 7M5 10v10a1 1 0 001 1h3m10-11l2 2m-2-2v10a1 1 0 01-1 1h-3m-6 0a1 1 0 001-1v-4a1 1 0 011-1h2a1 1 0 011 1v4a1 1 0 001 1m-6 0h6"
                                    ></path>
                                </svg>
                                <span class="ml-4">Quản lý đánh giá</span>
                            </a>
                        </li>
                    </ul>
                    <ul>
                        <li class="relative px-6 py-3">
                            <a
                                class="inline-flex items-center w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200"
                                href="forms.html"
                                >
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
                                <span class="ml-4">Forms</span>
                            </a>
                        </li>
                        <li class="relative px-6 py-3">
                            <a
                                class="inline-flex items-center w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200"
                                href="cards.html"
                                >
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
                                    d="M19 11H5m14 0a2 2 0 012 2v6a2 2 0 01-2 2H5a2 2 0 01-2-2v-6a2 2 0 012-2m14 0V9a2 2 0 00-2-2M5 11V9a2 2 0 012-2m0 0V5a2 2 0 012-2h6a2 2 0 012 2v2M7 7h10"
                                    ></path>
                                </svg>
                                <span class="ml-4">Cards</span>
                            </a>
                        </li>
                        <li class="relative px-6 py-3">
                            <a
                                class="inline-flex items-center w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200"
                                href="buttons.html"
                                >
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
                                <span class="ml-4">Buttons</span>
                            </a>
                        </li>
                        <li class="relative px-6 py-3">
                            <a
                                class="inline-flex items-center w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200"
                                href="modals.html"
                                >
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
                                    d="M8 16H6a2 2 0 01-2-2V6a2 2 0 012-2h8a2 2 0 012 2v2m-6 12h8a2 2 0 002-2v-8a2 2 0 00-2-2h-8a2 2 0 00-2 2v8a2 2 0 002 2z"
                                    ></path>
                                </svg>
                                <span class="ml-4">Modals</span>
                            </a>
                        </li>

                        <li class="relative px-6 py-3">
                            <button
                                class="inline-flex items-center justify-between w-full text-sm font-semibold transition-colors duration-150 hover:text-gray-800 dark:hover:text-gray-200"
                                @click="togglePagesMenu"
                                aria-haspopup="true"
                                >
                                <span class="inline-flex items-center">
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
                                        d="M4 5a1 1 0 011-1h14a1 1 0 011 1v2a1 1 0 01-1 1H5a1 1 0 01-1-1V5zM4 13a1 1 0 011-1h6a1 1 0 011 1v6a1 1 0 01-1 1H5a1 1 0 01-1-1v-6zM16 13a1 1 0 011-1h2a1 1 0 011 1v6a1 1 0 01-1 1h-2a1 1 0 01-1-1v-6z"
                                        ></path>
                                    </svg>
                                    <span class="ml-4">Pages</span>
                                </span>
                                <svg
                                    class="w-4 h-4"
                                    aria-hidden="true"
                                    fill="currentColor"
                                    viewBox="0 0 20 20"
                                    >
                                <path
                                    fill-rule="evenodd"
                                    d="M5.293 7.293a1 1 0 011.414 0L10 10.586l3.293-3.293a1 1 0 111.414 1.414l-4 4a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414z"
                                    clip-rule="evenodd"
                                    ></path>
                                </svg>
                            </button>
                        </li>
                    </ul>

                </div>
            </aside>
            <div class="flex flex-col flex-1 w-full">
                <header class="z-10 py-4 bg-white shadow-md dark:bg-gray-800">
                    <div class="container flex items-center justify-between h-full px-6 mx-auto text-purple-600 dark:text-purple-300" >
                        <!-- Mobile hamburger -->
                        <button
                            class="p-1 mr-5 -ml-1 rounded-md md:hidden focus:outline-none focus:shadow-outline-purple"
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
                        </ul>
                    </div>
                </header>
                <main class="h-full overflow-y-auto">
                    <div class="container px-6 mx-auto grid">
                        <h2
                            class="my-6 text-2xl font-semibold text-gray-700 dark:text-gray-200"
                            >
                            Quản lý đánh giá
                        </h2>
                        <!-- CTA -->
                        <a
                            class="flex items-center justify-between p-4 mb-8 text-sm font-semibold text-purple-100 bg-purple-600 rounded-lg shadow-md focus:outline-none focus:shadow-outline-purple"
                            href="https://github.com/estevanmaito/windmill-dashboard"
                            >
                            <div class="flex items-center">
                                <svg
                                    class="w-5 h-5 mr-2"
                                    fill="currentColor"
                                    viewBox="0 0 20 20"
                                    >
                                <path
                                    d="M9.049 2.927c.3-.921 1.603-.921 1.902 0l1.07 3.292a1 1 0 00.95.69h3.462c.969 0 1.371 1.24.588 1.81l-2.8 2.034a1 1 0 00-.364 1.118l1.07 3.292c.3.921-.755 1.688-1.54 1.118l-2.8-2.034a1 1 0 00-1.175 0l-2.8 2.034c-.784.57-1.838-.197-1.539-1.118l1.07-3.292a1 1 0 00-.364-1.118L2.98 8.72c-.783-.57-.38-1.81.588-1.81h3.461a1 1 0 00.951-.69l1.07-3.292z"
                                    ></path>
                                </svg>
                                <span>Star this project on GitHub</span>
                            </div>
                            <span>View more &RightArrow;</span>
                        </a>
                        <!-- Cards -->

                        <div class="grid gap-6 mb-8 md:grid-cols-2 xl:grid-cols-4">
                            <!-- Card -->
                            <a href="ShowReview">
                                <div class="flex items-center p-4 bg-white rounded-lg shadow-xs dark:bg-gray-800" >
                                    <div class="p-3 mr-4 text-teal-500 bg-teal-100 rounded-full dark:text-teal-100 dark:bg-teal-500">
                                        <svg class="w-5 h-5" fill="currentColor" viewBox="0 0 20 20">
                                        <path
                                            fill-rule="evenodd"
                                            d="M18 5v8a2 2 0 01-2 2h-5l-5 4v-4H4a2 2 0 01-2-2V5a2 2 0 012-2h12a2 2 0 012 2zM7 8H5v2h2V8zm2 0h2v2H9V8zm6 0h-2v2h2V8z"
                                            clip-rule="evenodd"
                                            ></path>
                                        </svg>
                                    </div>
                                    <div>
                                        <p class="mb-2 text-sm font-medium text-gray-600 dark:text-gray-400" >
                                            Tổng Đánh Giá
                                        </p>
                                        <p class="text-lg font-semibold text-gray-700 dark:text-gray-200">
                                            <c:out default="lỗi" value="${tongdanhgia}"/>
                                        </p>
                                    </div>
                                </div>

                            </a>
                            <!-- Card -->
                            <a href="SortShowReviewAdmin?loaisao=3">
                                <div class="flex items-center p-4 bg-white rounded-lg shadow-xs dark:bg-gray-800" >
                                    <div class="p-3 mr-4 text-teal-500 bg-teal-100 rounded-full dark:text-teal-100 dark:bg-teal-500">
                                        <svg class="w-5 h-5" fill="currentColor" viewBox="0 0 20 20">
                                        <path
                                            fill-rule="evenodd"
                                            d="M18 5v8a2 2 0 01-2 2h-5l-5 4v-4H4a2 2 0 01-2-2V5a2 2 0 012-2h12a2 2 0 012 2zM7 8H5v2h2V8zm2 0h2v2H9V8zm6 0h-2v2h2V8z"
                                            clip-rule="evenodd"
                                            ></path>
                                        </svg>
                                    </div>
                                    <div>
                                        <p class="mb-2 text-sm font-medium text-gray-600 dark:text-gray-400" >
                                            Tổng Đánh Giá Thấp
                                        </p>
                                        <p class="text-lg font-semibold text-gray-700 dark:text-gray-200">
                                            <fmt:formatNumber var="SoChan" type="number" maxFractionDigits="0" value="${danhgiathap}"></fmt:formatNumber>
                                            <c:out value="${SoChan}"/>
                                        </p>
                                    </div>
                                </div>
                            </a>

                            <!-- Card -->
                            <a href="SortShowReviewAdmin?loaisao=4">
                                <div class="flex items-center p-4 bg-white rounded-lg shadow-xs dark:bg-gray-800" >
                                    <div class="p-3 mr-4 text-teal-500 bg-teal-100 rounded-full dark:text-teal-100 dark:bg-teal-500">
                                        <svg class="w-5 h-5" fill="currentColor" viewBox="0 0 20 20">
                                        <path
                                            fill-rule="evenodd"
                                            d="M18 5v8a2 2 0 01-2 2h-5l-5 4v-4H4a2 2 0 01-2-2V5a2 2 0 012-2h12a2 2 0 012 2zM7 8H5v2h2V8zm2 0h2v2H9V8zm6 0h-2v2h2V8z"
                                            clip-rule="evenodd"
                                            ></path>
                                        </svg>
                                    </div>
                                    <div>
                                        <p class="mb-2 text-sm font-medium text-gray-600 dark:text-gray-400" >
                                            Tổng Đánh Giá Cao
                                        </p>
                                        <p class="text-lg font-semibold text-gray-700 dark:text-gray-200">
                                            <fmt:formatNumber var="SoLe" type="number" maxFractionDigits="0" value="${danhgiacao}"></fmt:formatNumber>
                                            <c:out value="${SoLe}"/>
                                        </p>
                                    </div>
                                </div>
                            </a>
                            <!-- Card -->
                            
                                <div class="flex items-center p-4 bg-white rounded-lg shadow-xs dark:bg-gray-800" >
                                    <div class="p-3 mr-4 text-teal-500 bg-teal-100 rounded-full dark:text-teal-100 dark:bg-teal-500">
                                        <svg class="w-5 h-5" fill="currentColor" viewBox="0 0 20 20">
                                        <path
                                            fill-rule="evenodd"
                                            d="M18 5v8a2 2 0 01-2 2h-5l-5 4v-4H4a2 2 0 01-2-2V5a2 2 0 012-2h12a2 2 0 012 2zM7 8H5v2h2V8zm2 0h2v2H9V8zm6 0h-2v2h2V8z"
                                            clip-rule="evenodd"
                                            ></path>
                                        </svg>
                                    </div>
                                    <div>
                                       
                                        <p class="text-lg font-semibold text-gray-700 dark:text-gray-200">
                                            <fmt:formatNumber var="SoChuaDuyet" type="number" maxFractionDigits="0" value="${danhgiachuaduyet}"></fmt:formatNumber>
                                           Bạn có <c:out value="${SoChuaDuyet}"/> đánh giá chưa duyệt!
                                        </p>
                                    </div>
                                </div>
                            
                        </div>
                    </div>

                    <!-- New Table -->
                    <div class="w-full overflow-hidden rounded-lg shadow-xs">
                        <div class="w-full overflow-x-auto">

                            <table class="w-full whitespace-no-wrap">
                                <thead>
                                    <tr class="text-xs font-semibold tracking-wide text-left text-gray-500 uppercase border-b dark:border-gray-700 bg-gray-50 dark:text-gray-400 dark:bg-gray-800">
                                        <th class="px-4 py-3">Tên Khách Hàng</th>
                                        <th class="px-4 py-3">Tên Sản Phẩm</th>
                                        <th class="px-4 py-3">Sao</th>
                                        <th class="px-4 py-3">Nội Dung</th>
                                        <th class="px-4 py-3">Hiển Thị</th>
                                        <th class="px-4 py-3">Tùy Chọn</th>
                                    </tr>
                                </thead>
                                <tbody class="bg-white divide-y dark:divide-gray-700 dark:bg-gray-800">

                                    <c:forEach var="review" items="${listreview}">
                                        <c:forEach var="product" items="${listproduct}">
                                            <c:forEach var="user" items="${listuser}">
                                                <c:if test="${fn:trim(review.nguoidung_id==user.id)}">
                                                    <c:if test="${fn:trim(review.sanpham_id==product.id)}"> 
                                                        <c:if test="${review.hienthi==0}">
                                                            <tr class="text-gray-700 dark:text-gray-400">
                                                                <td class="px-4 py-3">
                                                                    <div class="flex items-center text-sm">
                                                                        <!-- Avatar with inset shadow -->
                                                                        <div class="relative hidden w-8 h-8 mr-3 rounded-full md:block">
                                                                            <img class="object-cover w-full h-full rounded-full"
                                                                                 src="${product.anh}"
                                                                                 alt=""
                                                                                 loading="lazy"/>
                                                                            <div class="absolute inset-0 rounded-full shadow-inner" aria-hidden="true"></div>
                                                                        </div>
                                                                        <%--Show Ten--%>
                                                                        <div>
                                                                            <p class="font-semibold">${user.ten}</p>
                                                                            <p class="text-xs text-gray-600 dark:text-gray-400">
                                                                                ID: <fmt:formatNumber type="number" maxFractionDigits="0" value="${user.id}"></fmt:formatNumber>
                                                                                </p>
                                                                            </div>
                                                                        </div>
                                                                    </td>
                                                                    <td class="px-4 py-3 text-sm">
                                                                    ${product.ten}
                                                                </td>
                                                                <td class="px-4 py-3 text-sm">
                                                                    <c:if test="${review.sao>=4}">
                                                                        <span class="px-2 py-1 font-semibold leading-tight text-green-700 bg-green-100 rounded-full dark:text-green-100 dark:bg-green-700">
                                                                            ${review.sao}
                                                                        </span> </c:if>
                                                                    <c:if test="${review.sao<=3}">
                                                                        <span class="px-2 py-1 font-semibold leading-tight text-red-700 bg-red-100 rounded-full dark:text-red-100 dark:bg-red-700">
                                                                            ${review.sao}
                                                                        </span> </c:if>
                                                                    </td>
                                                                    <td class="px-4 py-3 text-xs">
                                                                    ${review.binhluan}
                                                                </td>
                                                        <form action="UpdateReview?id=${review.id}" method="post">
                                                            <td class="px-4 py-3 text-sm">
                                                                <label class="inline-flex text-sm text-gray-700 dark:text-gray-400 form-check-label">
                                                                    <input class="text-purple-600 form-radio focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray"
                                                                           name ="anhien" value="0" class="form-check-input" type="radio" ${review.hienthi==0? "checked":""}> Ẩn
                                                                </label>
                                                                <label class="inline-flex text-sm text-gray-700 dark:text-gray-400">
                                                                    <input class="text-purple-600 form-radio focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray"
                                                                           name ="anhien" value="1" class="form-check-input" type="radio" ${review.hienthi==1? "checked":""}> Hiện
                                                                </label>
                                                            </td>
                                                            <td class="px-4 py-3 text-xs">
                                                                <span class="px-2 py-1 font-semibold leading-tight text-green-700 bg-green-100 rounded-full dark:text-green-100 dark:bg-green-700">
                                                                    <button type="submit">Cập Nhật</button>
                                                                </span>
                                                            </td>
                                                        </form>

                                                        </tr>
                                                    </c:if>

                                                </c:if>
                                            </c:if>
                                        </c:forEach>
                                    </c:forEach>
                                </c:forEach>
                                <c:forEach var="review" items="${listreview}">
                                    <c:forEach var="product" items="${listproduct}">
                                        <c:forEach var="user" items="${listuser}">
                                            <c:if test="${fn:trim(review.nguoidung_id==user.id)}">
                                                <c:if test="${fn:trim(review.sanpham_id==product.id)}"> 
                                                    <c:if test="${review.hienthi==1}">
                                                        <tr class="text-gray-700 dark:text-gray-400">
                                                            <td class="px-4 py-3">
                                                                <div class="flex items-center text-sm">
                                                                    <!-- Avatar with inset shadow -->
                                                                    <div class="relative hidden w-8 h-8 mr-3 rounded-full md:block">
                                                                        <img class="object-cover w-full h-full rounded-full"
                                                                             src="${product.anh}"
                                                                             alt=""
                                                                             loading="lazy"/>
                                                                        <div class="absolute inset-0 rounded-full shadow-inner" aria-hidden="true"></div>
                                                                    </div>
                                                                    <%--Show Ten--%>
                                                                    <div>
                                                                        <p class="font-semibold">${user.ten}</p>
                                                                        <p class="text-xs text-gray-600 dark:text-gray-400">
                                                                            ID: <fmt:formatNumber type="number" maxFractionDigits="0" value="${user.id}"></fmt:formatNumber>
                                                                            </p>
                                                                        </div>
                                                                    </div>
                                                                </td>
                                                                <td class="px-4 py-3 text-sm">
                                                                ${product.ten}
                                                            </td>
                                                            <td class="px-4 py-3 text-sm">
                                                                <c:if test="${review.sao>=4}">
                                                                    <span class="px-2 py-1 font-semibold leading-tight text-green-700 bg-green-100 rounded-full dark:text-green-100 dark:bg-green-700">
                                                                        ${review.sao}
                                                                    </span> </c:if>
                                                                <c:if test="${review.sao<=3}">
                                                                    <span class="px-2 py-1 font-semibold leading-tight text-red-700 bg-red-100 rounded-full dark:text-red-100 dark:bg-red-700">
                                                                        ${review.sao}
                                                                    </span> </c:if>
                                                                </td>
                                                                <td class="px-4 py-3 text-xs">
                                                                ${review.binhluan}
                                                            </td>
                                                        <form action="UpdateReview?id=${review.id}" method="post">
                                                            <td class="px-4 py-3 text-sm">
                                                                <label class="inline-flex text-sm text-gray-700 dark:text-gray-400 form-check-label">
                                                                    <input class="text-purple-600 form-radio focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray"
                                                                           name ="anhien" value="0" class="form-check-input" type="radio" ${review.hienthi==0? "checked":""}> Ẩn
                                                                </label>
                                                                <label class="inline-flex text-sm text-gray-700 dark:text-gray-400">
                                                                    <input class="text-purple-600 form-radio focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray"
                                                                           name ="anhien" value="1" class="form-check-input" type="radio" ${review.hienthi==1? "checked":""}> Hiện
                                                                </label>
                                                            </td>
                                                            <td class="px-4 py-3 text-xs">
                                                                <span class="px-2 py-1 font-semibold leading-tight text-green-700 bg-green-100 rounded-full dark:text-green-100 dark:bg-green-700">
                                                                    <button type="submit">Cập Nhật</button>
                                                                </span>
                                                            </td>
                                                        </form>

                                                        </tr>
                                                    </c:if>

                                                </c:if>
                                            </c:if>
                                        </c:forEach>
                                    </c:forEach>
                                </c:forEach>
                                </tbody>
                            </table>

                        </div>
                        <div class="grid px-4 py-3 text-xs font-semibold tracking-wide text-gray-500 uppercase border-t dark:border-gray-700 bg-gray-50 sm:grid-cols-9 dark:text-gray-400 dark:bg-gray-800">
                            <span class="flex items-center col-span-3">
                                Showing 21-30 of 100
                            </span>
                            <span class="col-span-2"></span>
                            <!-- Pagination -->
                            <span class="flex col-span-4 mt-2 sm:mt-auto sm:justify-end">
                                <nav aria-label="Table navigation">
                                    <ul class="inline-flex items-center">
                                        <li>
                                            <button
                                                class="px-3 py-1 rounded-md rounded-l-lg focus:outline-none focus:shadow-outline-purple"
                                                aria-label="Previous"
                                                >
                                                <svg
                                                    aria-hidden="true"
                                                    class="w-4 h-4 fill-current"
                                                    viewBox="0 0 20 20"
                                                    >
                                                <path
                                                    d="M12.707 5.293a1 1 0 010 1.414L9.414 10l3.293 3.293a1 1 0 01-1.414 1.414l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 0z"
                                                    clip-rule="evenodd"
                                                    fill-rule="evenodd"
                                                    ></path>
                                                </svg>
                                            </button>
                                        </li>
                                        <li>
                                            <button
                                                class="px-3 py-1 rounded-md focus:outline-none focus:shadow-outline-purple"
                                                >
                                                1
                                            </button>
                                        </li>
                                        <li>
                                            <button
                                                class="px-3 py-1 rounded-md focus:outline-none focus:shadow-outline-purple"
                                                >
                                                2
                                            </button>
                                        </li>
                                        <li>
                                            <button
                                                class="px-3 py-1 text-white transition-colors duration-150 bg-purple-600 border border-r-0 border-purple-600 rounded-md focus:outline-none focus:shadow-outline-purple"
                                                >
                                                3
                                            </button>
                                        </li>
                                        <li>
                                            <button
                                                class="px-3 py-1 rounded-md focus:outline-none focus:shadow-outline-purple"
                                                >
                                                4
                                            </button>
                                        </li>
                                        <li>
                                            <span class="px-3 py-1">...</span>
                                        </li>
                                        <li>
                                            <button
                                                class="px-3 py-1 rounded-md focus:outline-none focus:shadow-outline-purple"
                                                >
                                                8
                                            </button>
                                        </li>
                                        <li>
                                            <button
                                                class="px-3 py-1 rounded-md focus:outline-none focus:shadow-outline-purple"
                                                >
                                                9
                                            </button>
                                        </li>
                                        <li>
                                            <button
                                                class="px-3 py-1 rounded-md rounded-r-lg focus:outline-none focus:shadow-outline-purple"
                                                aria-label="Next"
                                                >
                                                <svg
                                                    class="w-4 h-4 fill-current"
                                                    aria-hidden="true"
                                                    viewBox="0 0 20 20"
                                                    >
                                                <path
                                                    d="M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z"
                                                    clip-rule="evenodd"
                                                    fill-rule="evenodd"
                                                    ></path>
                                                </svg>
                                            </button>
                                        </li>
                                    </ul>
                                </nav>
                            </span>
                        </div>
                    </div>
            </div>
        </div>
    </main>
</div>
</div>
</body>
</html>

