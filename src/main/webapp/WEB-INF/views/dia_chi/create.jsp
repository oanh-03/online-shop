<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>SD17313 - Thêm mới Nhân viên</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

</head>
<style>
    .err{
        color: red;
    }
</style>
<body>
<sf:form action="${action}" modelAttribute="data" method="post">
    <div>
        <label>Ten</label>
        <sf:input path="tenDiaChi" class="form-control"/>
        <sf:errors path="tenDiaChi" cssClass="err"/>
    </div>
    <div>
        <label>Mo ta</label>
        <sf:input path="moTaChiTiet" class="form-control"/>
        <sf:errors path="moTaChiTiet" cssClass="err"/>
    </div>
    <div>
        <label>TP</label>
        <sf:input path="tinhThanhPho" class="form-control"/>
        <sf:errors path="tinhThanhPho" cssClass="err"/>
    </div>
    <div>
        <label>QH</label>
        <sf:input path="quanHuyen" class="form-control"/>
        <sf:errors path="quanHuyen" cssClass="err"/>
    </div>
    <div>
        <label>XA</label>
        <sf:input path="phuongXa" class="form-control"/>
        <sf:errors path="phuongXa" cssClass="err"/>
    </div>
    <div>
        <label>DP</label>
        <sf:input path="duongPho" class="form-control"/>
        <sf:errors path="duongPho" cssClass="err"/>
    </div>
    </div>
    <div>
        <label>Ten KH</label>
        <sf:select path="khachHang.maKhachHang" class="form-select" aria-label="Default select example">
            <c:forEach items="${khachhangs}" var="kh">
                <sf:option value="${kh.maKhachHang}">
                    ${kh.tenKhachHang}
                </sf:option>
            </c:forEach>
        </sf:select>
    </div>
    <button class="btn btn-primary">Add</button>
    <button class="btn btn-primary">Update</button>

</sf:form>
</body>
</html>
