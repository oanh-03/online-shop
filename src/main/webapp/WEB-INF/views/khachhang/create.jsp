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
        <label>Ten</label>
        <div>
            <sf:input path="tenKhachHang" class="form-control"/>
            <sf:errors path="tenKhachHang" cssStyle="color: red"/>
        </div>
    </div>
    <div>
        <label>Sinh nhật</label>
        <div>
            <sf:input type="date" path="sinhNhat" class="form-control"/>
            <sf:errors path="sinhNhat" cssStyle="color: red"/>
        </div>
    </div>
    <label>Số điện thoại</label>
    <div>
        <sf:input path="sdt" class="form-control"/>
        <sf:errors path="sdt" cssStyle="color: red"/>
    </div>
    </div>
    <div>
        <label>Email</label>
        <div>
            <sf:input path="email" class="form-control"/>
            <sf:errors path="email" cssStyle="color: red"/>
        </div>
    </div>
    <div>
        <label>Giới tính</label>
        <div>
            <label>Nam</label>
            <sf:radiobutton path="gioiTinh" value="true"/>
            <br>
            <label>Nữ</label>
            <sf:radiobutton path="gioiTinh" value="false"  checked="checked" />
            <br>
<%--            <sf:errors path="gioiTinh" cssStyle="color: red"/>--%>
        </div>
    </div>

    <div>
        <label>CMT</label>
        <div>
            <sf:input path="chungMinhThu" class="form-control"/>
            <sf:errors path="chungMinhThu" cssStyle="color: red"/>
        </div>
    </div>
    <div>
        <label>Số cc</label>
        <div>
            <sf:input path="soCanCuoc" class="form-control"/>
            <sf:errors path="soCanCuoc" cssStyle="color: red"/>
        </div>
    </div>
    <div>
        <label>Ảnh đại diện</label>
        <div>
            <sf:input class="form-control" path="anhDaiDien" placeholder="Ảnh sản phẩm"/>
            <sf:errors path="anhDaiDien" cssClass="text-danger"/>
        </div>

    </div>
<%--    <sf:input class="form-control" path="trangThai" type="radio" value="1" checked />--%>

    <div>
        <label>Trạng thái</label>
        <div>
            <label>Đi làm</label>
            <sf:radiobutton path="trangThai" value="1" checked="checked"/>
            <br>
            <label>Nghỉ làm</label>
            <sf:radiobutton path="trangThai" value="0"/>
            <br>
            <sf:errors path="trangThai" cssStyle="color: red"/>
        </div>
    </div>
    <div>
        <label>Điểm tích lũy</label>
        <div>
            <sf:input path="diemTichLuy" class="form-control"/>
            <sf:errors path="diemTichLuy" cssStyle="color: red"/>
        </div>
    </div>
    <br>
    <button class="btn btn-primary">Add</button>
    <button class="btn btn-primary">Update</button>
</sf:form>
</body>
</html>
