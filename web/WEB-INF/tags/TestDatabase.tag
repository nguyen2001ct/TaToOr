<%-- 
    Document   : TestDatabase
    Created on : Oct 19, 2021, 12:04:26 PM
    Author     : nguye
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="tenBang"%>

<%-- any content can be specified here e.g.: --%>
<sql:setDataSource var="db" url="jdbc:sqlserver://localhost:1433;databaseName=TaToOrDatabase;integratedSecurity=true" 
                   driver="com.microsoft.sqlserver.jdbc.SQLServerDriver" user="sa" password="123456"/>
<sql:query var="user" dataSource="${db}">
    select * from NguoiDung
</sql:query> 

<c:forEach var="table"  items="${user.rows}">
    Username: <c:out value="${table.NguoiDung_ID}"/><br>
    Password: <c:out value="${table.NguoiDung_MatKhau}"/><br>
    LoaiNguoiDung: <c:if test="${table.NguoiDung_QuanTri==1}"> Admin<br></c:if>
    <c:if test="${table.NguoiDung_KhachHang==1}"> Khách Hàng <br> </c:if>
</c:forEach>