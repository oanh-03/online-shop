<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ page language="java" pageEncoding="UTF-8" %>--%>
<%--<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>--%>

<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"--%>
<%--          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">--%>
<%--    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>--%>
<%--</head>--%>
<%--<body>--%>
<%--<div class="container">--%>
<%--    <h1 style="color: green;text-align: center">CRUD KHÁCH HÀNG</h1>--%>
<%--    <a href="/khach-hang/create" class="btn btn-success">Add</a>--%>
<%--    <table class="table">--%>
<%--        <tr>--%>
<%--            <th scope="col">Mã</th>--%>
<%--            <th scope="col">Họ tên</th>--%>
<%--            <th scope="col">Sinh nhật</th>--%>
<%--            <th scope="col">Sđt</th>--%>
<%--            <th scope="col">Email</th>--%>
<%--            <th scope="col">Giới tính</th>--%>
<%--            <th scope="col">CMT</th>--%>
<%--            <th scope="col">CC</th>--%>
<%--            <th scope="col">Ảnh</th>--%>
<%--            <th scope="col">Trạng thái</th>--%>
<%--            <th scope="col">Điểm tích lũy</th>--%>
<%--            <th scope="col">Action</th>--%>
<%--        </tr>--%>
<%--        </thead>--%>
<%--        <tbody>--%>
<%--        <c:forEach items="${data}" var="kh">--%>
<%--            <tr>--%>
<%--                <td>${kh.maKhachHang}</td>--%>
<%--                <td>${kh.tenKhachHang}</td>--%>
<%--                <td>--%>
<%--                    <fmt:formatDate value="${kh.sinhNhat}" pattern="dd/MM/yyyy"/>--%>
<%--                </td>--%>
<%--                <td>${kh.sdt}</td>--%>
<%--                <td>${kh.email}</td>--%>
<%--                <td>${kh.gioiTinh==true?"Nam":"Nữ"}</td>--%>
<%--                <td>${kh.chungMinhThu}</td>--%>
<%--                <td>${kh.soCanCuoc}</td>--%>
<%--                <td>--%>
<%--                    <img src="${kh.anhDaiDien}" alt="Ảnh" width="100px">--%>
<%--                </td>--%>
<%--                <td>${kh.trangThai==1?"Đi làm":"Nghỉ làm"}</td>--%>
<%--                <td>${kh.diemTichLuy}</td>--%>
<%--                                    <td>--%>
<%--                                        <a href="/khach-hang/delete/${kh.maKhachHang}" class="btn btn-primary"--%>
<%--                                          >Delete</a>--%>
<%--                                        <a href="/khach-hang/edit/${kh.maKhachHang}" class="btn btn-primary">Update</a>--%>
<%--                                    </td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--        </tbody>--%>
<%--    </table>--%>
<%--    &lt;%&ndash;    <script>&ndash;%&gt;--%>
<%--    &lt;%&ndash;        function oncClickDelete(event) {&ndash;%&gt;--%>
<%--    &lt;%&ndash;            var check = confirm('Bạn muốn xóa?');&ndash;%&gt;--%>
<%--    &lt;%&ndash;            if (check === false) {&ndash;%&gt;--%>
<%--    &lt;%&ndash;                event.preventDefault()&ndash;%&gt;--%>
<%--    &lt;%&ndash;            } else if (check === true) {&ndash;%&gt;--%>
<%--    &lt;%&ndash;                alert("Xóa thành công!")&ndash;%&gt;--%>
<%--    &lt;%&ndash;            }&ndash;%&gt;--%>
<%--    &lt;%&ndash;        }&ndash;%&gt;--%>
<%--    &lt;%&ndash;    </script>&ndash;%&gt;--%>
<%--</div>--%>
<%--<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"--%>
<%--        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"--%>
<%--        crossorigin="anonymous"></script>--%>
<%--<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"--%>
<%--        integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"--%>
<%--        crossorigin="anonymous"></script>--%>
<%--<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"--%>
<%--        integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD"--%>
<%--        crossorigin="anonymous"></script>--%>
<%--</body>--%>
<%--</html>--%>