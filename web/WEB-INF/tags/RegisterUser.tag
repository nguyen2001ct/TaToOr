<%-- 
    Document   : RegisterUser
    Created on : Oct 19, 2021, 12:38:32 PM
    Author     : nguye
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="username"%>
<%@attribute name="password"%>
<c:set var="count" value="0" />
<%-- any content can be specified here e.g.: --%>
<sql:setDataSource var="db" url="jdbc:sqlserver://localhost:1433;databaseName=TaToOrDatabase;integratedSecurity=true" 
                   driver="com.microsoft.sqlserver.jdbc.SQLServerDriver" user="sa" password="123456"/>
<sql:query var="user" dataSource="${db}">
    select * from NguoiDung
</sql:query>
<c:forEach var="table"  items="${user.rows}">
    Username: <c:out value="${table.NguoiDung_ID}"/><br>
    <c:if test="${table.NguoiDung_ID==username}"> Tài Khoản Bạn Nhập Đã Có Trong Hệ Thống <br>
        <c:set var="count" value="1"/>
    </c:if>
</c:forEach>
        <c:out value="${count}"> </c:out>

<c:out value="Bạn đã thêm thành công tài khoản ${username} vào hệ thống!!!"/>
