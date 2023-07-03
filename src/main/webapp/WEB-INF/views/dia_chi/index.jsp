<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
</head>
<body>
<div class="container">
    <a href="/dia-chi/create" class="btn btn-primary">Add</a>

    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Ma</th>
            <th scope="col">Ten</th>
            <th scope="col">Mo ta</th>
            <th scope="col">TP</th>
            <th scope="col">QH</th>
            <th scope="col">Xa</th>
            <th scope="col">DP</th>
            <th scope="col">Ten kh</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${lstDC.content}" varStatus="i"  var="dc">
            <tr>
                <td>${lstDC.number * lstDC.size + i.index+1}</td>
                <td>${dc.maDiaChi}</td>
                <td>${dc.tenDiaChi}</td>
                <td>${dc.moTaChiTiet}</td>
                <td>${dc.tinhThanhPho}</td>
                <td>${dc.quanHuyen}</td>
                <td>${dc.phuongXa}</td>
                <td>${dc.duongPho}</td>
                <td>${dc.khachHang.maKhachHang}</td>
                <td>
                    <a href="/dia-chi/delete/${dc.maDiaChi}" class="btn btn-primary">Delete</a>
                    <a href="/dia-chi/edit/${dc.maDiaChi}" class="btn btn-primary">Edit</a>
                </td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
    <nav aria-label="Page navigation example">
        <ul class="pagination">
            <li class="page-item"><a class="page-link" href="/dia-chi/index?p=0">Previous</a></li>
            <li class="page-item"><a class="page-link" href="/dia-chi/index?p=${lstDC.number > 0?  lstDC.number-1:0}">1</a></li>
            <li class="page-item"><a class="page-link" href="/dia-chi/index?p=${lstDC.number +1}">2</a></li>
            <li class="page-item"><a class="page-link" href="/dia-chi/index?p=${lstDC.totalPages -1}">Next</a></li>
        </ul>
    </nav>
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