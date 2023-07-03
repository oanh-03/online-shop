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
<sf:form action="${action}" method="post"
         modelAttribute="data">
    <div>
        <label>Ten phieu</label>
        <div>
            <sf:input path="tenPhieu" class="form-control"/>
            <sf:errors path="tenPhieu" cssStyle="color: red"/>
        </div>
    </div>
    <div>
        <label>Gia tri giam</label>
        <div>
            <sf:input path="giaTriGiam" class="form-control"/>
            <sf:errors path="giaTriGiam" cssStyle="color: red"/>
        </div>
    </div>
    <div>
        <label>Trạng thái</label>
        <div>
            <label>Bắt đầu</label>
            <sf:radiobutton path="trangThai" value="1" checked="checked"/>
            <br>
            <label>Kết thúc</label>
            <sf:radiobutton path="trangThai" value="0"/>
            <br>
            <sf:errors path="trangThai" cssStyle="color: red"/>
        </div>
    </div>
    <div>
        <label>Ngay bat dau</label>
        <div>
            <sf:input path="ngayBatDau" type="date" class="form-control"/>
            <sf:errors path="ngayBatDau" cssStyle="color: red"/>
        </div>
        <div>${dateError}</div>
    </div>
    <div>
        <label>Ngay ket thuc </label>
        <div>
            <sf:input path="ngayKetThuc" type="date" class="form-control"/>
            <sf:errors path="ngayKetThuc" cssStyle="color: red"/>
        </div>
    </div>
    <label>Khách hàng</label>
    <sf:select class="form-select" aria-label="Default select example" path="khachHang.maKhachHang">
        <c:forEach items="${khachhangs}" var="kh">
            <sf:option value="${kh.maKhachHang}">${kh.tenKhachHang}</sf:option>
        </c:forEach>
    </sf:select>
    <br>
    <br>
    <button class="btn btn-primary">Update</button>
</sf:form>
</body>
</html>
