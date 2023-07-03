<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1 style="color: green;text-align: center">HOME</h1>
    <jsp:include page="search.jsp"/>
    <a href="/phieu-giam-gia/sort" class="btn btn-primary">Sort</a>
    <table class="table">
        <tr>
            <th scope="col">STT</th>
            <th scope="col">Mã</th>
            <th scope="col">Tên phiếu</th>
            <th scope="col">Ngày bắt đầu</th>
            <th scope="col">Ngày kết thúc</th>
            <th scope="col">giá trị giảm</th>
            <th scope="col">Trạng thái</th>
            <th scope="col">Tên KH</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${data.content}" var="pg" varStatus="i">
            <tr>
                <td>${i.index+1}</td>
                <td>${pg.maPhieu}</td>
                <td>${pg.tenPhieu}</td>
                <td>
                    <fmt:formatDate value="${pg.ngayBatDau}" pattern="dd/MM/yyyy"/>
                </td>
                <td>
                    <fmt:formatDate value="${pg.ngayKetThuc}" pattern="dd/MM/yyyy"/>
                </td>
                <td>${pg.giaTriGiam}%</td>
                <td>${pg.trangThai==1?"Bắt đầu":"Kết thúc"}</td>
                <td>${pg.khachHang.tenKhachHang}</td>
                <td>
                    <a href="/phieu-giam-gia/delete/${pg.maPhieu}" class="btn btn-primary"
                    >Delete</a>
                    <a href="/phieu-giam-gia/edit/${pg.maPhieu}" class="btn btn-primary">Update</a>
                    <a href="/phieu-giam-gia/detail/${pg.maPhieu}" class="btn btn-primary">Detail</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <nav aria-label="Page navigation example">
        <ul class="pagination">
            <li class="page-item"><a class="page-link" href="/phieu-giam-gia/hien-thi?p=0">Previous</a></li>
            <li class="page-item"><a class="page-link" href="/phieu-giam-gia/hien-thi?p=${data.number > 0 ? data.number - 1 : 0}">1</a></li>
            <li class="page-item"><a class="page-link" href="/phieu-giam-gia/hien-thi?p=${data.number +1}">2</a></li>
            <li class="page-item"><a class="page-link" href="/phieu-giam-gia/hien-thi?p=${data.totalPages -1}">Next</a></li>
        </ul>
    </nav>
<%--    <script>--%>
    <%--        function oncClickDelete(event) {--%>
    <%--            var check = confirm('Bạn muốn xóa?');--%>
    <%--            if (check === false) {--%>
    <%--                event.preventDefault()--%>
    <%--            } else if (check === true) {--%>
    <%--                alert("Xóa thành công!")--%>
    <%--            }--%>
    <%--        }--%>
    <%--    </script>--%>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
        integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"
        integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD"
        crossorigin="anonymous"></script>
</body>
</html>