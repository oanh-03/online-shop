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

<sf:form action="/khach-hang/search" method="get" modelAttribute="searchForm">
    <div class="mb-3">
        <label class="form-label">Search</label>
        <sf:input path="keyword" class="form-control"/>
    </div>
    <div class="mb-3">
        <sf:select class="form-select" aria-label="Default select example" path="maHang">
            <c:forEach items="${hangKhachHang}" var="hang">
                <sf:option value="${hang.maHang}">${hang.tenHang} </sf:option>
            </c:forEach>
        </sf:select>
    </div>
    <button type="submit" class="btn btn-primary">Seach</button>
</sf:form>
</body>
</html>
