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

<style>
    .er {
        color: red;
    }
</style>
<body>
<div class="container">
            <jsp:include page="_search.jsp"/>
    <sf:form action="${action}"  method="post"  modelAttribute="data">
        <label class="form-label">Gioi tính</label>
        <div class="mb-3">
            <label class="form-label">Nam</label>
            <sf:radiobutton path="gioiTinh" value="true"/>
            <br>
            <label class="form-label">Nu</label>
            <sf:radiobutton path="gioiTinh" value="false" checked="checked"/>
        </div>
        <div class="mb-3">
            <sf:select class="form-select" aria-label="Default select example" path="hangKhachHang.maHang">
                <c:forEach items="${hangKhachHang}" var="hang">
                    <sf:option value="${hang.maHang}">${hang.maHang} </sf:option>
                </c:forEach>
            </sf:select>
        </div>
        <div>
            <com
        </div>
        <div class="mb-3">
            <label class="form-label">Sđt khách hàng</label>
            <sf:input path="sdt" id="sdt" class="form-control"/>
            <sf:errors path="sdt" cssClass="er"/>
        </div>
        <div class="mb-3">
            <label class="form-label">Tên khách hàng</label>
            <sf:input path="tenKhachHang" class="form-control"/>
            <sf:errors path="tenKhachHang" cssClass="er"/>
        </div>
        <button type="submit" class="btn btn-primary" onclick="return confirmAdd()">Add</button>
    </sf:form>

    <a href="/khach-hang/sort" class="btn btn-primary">Sort</a>

    <c:if test="${not empty message}">
        <div class="alert alert-success" role="alert" id="successMessage">
                ${message}
        </div>
    </c:if>
    <c:if test="${lstKH.totalElements == 0}">
        <div class="alert alert-success" role="alert" id="successMessage">
                Khong co ban ghi nao
        </div>
    </c:if>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Tên khách hàng</th>
            <th scope="col">Sđt</th>
            <th scope="col">Gioi tinh</th>
            <th scope="col">Mã hạng</th>
            <th scope="col">Tên hạng</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${lstKH.content}" var="kh" varStatus="i">
            <tr>
                <td>${lstKH.number * lstKH.size + i.index + 1}</td>
                <td>${kh.tenKhachHang}</td>
                <td>${kh.sdt}</td>
                <td>${kh.gioiTinh==true?"Nam":"Nu"}</td>
                <td>${kh.hangKhachHang.maHang}</td>
                <td>${kh.hangKhachHang.tenHang}</td>
                <td>
                    <a href="/khach-hang/delete/${kh.maKhachHang}" class="btn btn-primary"  onclick="return confirmAdd1()">Remove</a>
                    <a href="/khach-hang/detail/${kh.maKhachHang}" class="btn btn-primary"  >Detail</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <nav aria-label="Page navigation example">
        <ul class="pagination">
            <li class="page-item"><a class="page-link" href="/khach-hang/hien-thi?p=0">Previous</a></li>
            <li class="page-item"><a class="page-link" href="/khach-hang/hien-thi?p=${lstKH.number >0 ? lstKH.number -1 :0}">1</a></li>
            <li class="page-item"><a class="page-link" href="/khach-hang/hien-thi?p=${lstKH.number +1}">2</a></li>
            <li class="page-item"><a class="page-link" href="/khach-hang/hien-thi?p=${lstKH.totalPages -1}">Next</a></li>
        </ul>
    </nav>

    <script>
        function confirmAdd() {
            if (confirm("Bạn có muốn add không?")) {
                return true;
            } else {
                return false;
            }
        }
    </script> <script>
        function confirmAdd1() {
            if (confirm("Bạn có muốn xóa không?")) {
                return true;
            } else {
                return false;
            }
        }
    </script>
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