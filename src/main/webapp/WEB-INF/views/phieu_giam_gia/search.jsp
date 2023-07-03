<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>SD17313 - Thêm mới Nhân viên</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

</head>
<body>
<sf:form action="/phieu-giam-gia/hien-thi" method="post" modelAttribute="searchForm">
    <p>Từ ngày:<sf:input placeholder="dd/MM/yyyy" path="fromDate"/></p>
    <p>Đến ngày:<sf:input placeholder="dd/MM/yyyy" path="toDate"/></p>
    <label>Khách hàng</label>
    <sf:select class="form-select" aria-label="Default select example" path="maKhachHang">
        <c:forEach items="${khachhangs}" var="kh">
            <sf:option value="${kh.maKhachHang}">${kh.tenKhachHang}</sf:option>
        </c:forEach>
    </sf:select>
    <p><button type="submit">Tìm</button></p>
</sf:form>

</body>
</html>

