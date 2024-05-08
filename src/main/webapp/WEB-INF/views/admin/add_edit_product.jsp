<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Add Employee</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>SB Admin 2 - Register</title>

        <!-- Custom fonts for this template-->
        <link href="${pageContext.request.contextPath}/admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

        <!-- Custom styles for this template-->
        <link href="${pageContext.request.contextPath}/admin/css/sb-admin-2.min.css" rel="stylesheet">
</head>
<body>

     <div id="wrapper">

        <%@ include file="sidebar.jsp" %>



            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

            <%@ include file="topbar.jsp" %>

                <!-- Main Content -->
                <div id="content" class=" ml-2 justify-content-center">


                    <div class="m-2">
                    <h2 style="color: #333;">Product</h2>
                    </div>
                    <div class="m-2">
                    <p style="color: #333;"> You can add your products here </p>
                    </div>
                    <form action="/admin/submit_product" method="post" enctype="multipart/form-data">
                        <input name="productId" value="${product.productId}" type="hidden">
                        <input name="categoryId" type="hidden">

                        <div class="row">
                            <div class="col-sm-3 m-2">
                                <input name="name" value="${product.name}" type="text" class="form-control form-control-user" placeholder="Name">
                            </div>
                            <div class="col-sm-3 m-2">
                                <input name="price" value="${product.price}" type="number" class="form-control form-control-user" placeholder="Price">
                            </div>
                            <div class="col-sm-3 m-2">
                                <select name="category" value="${product.category}" class="form-control form-control-user" required>
                                    <option value="" disabled selected hidden> Select Category...</option>
                                    <option value="fruits">Fruits</option>
                                    <option value="vegetables">Vegetables</option>
                                    <option value="bread">Bread</option>
                                    <option value="meat">Meat</option>
                                </select>
                            </div>
                            <div class="col-sm-3 m-2">
                                <input name="description" value="${product.descripiton}" name="description" rows="4" cols="50" class="form-control form-control-user" placeholder="Description">
                            </div>
                            <div class="col-sm-3 m-2">
                                <input name="weight" value="${product.weight}" type="number" step="0.01" class="form-control form-control-user" placeholder="Weight">
                            </div>
                            <div class="col-sm-3 m-2">
                                <input name="countryOfOrigin" value="${product.countryOfOrigin}" type="text" class="form-control form-control-user" placeholder="Country of Origin">
                            </div>

                            <div class="col-sm-3 m-2">
                                <input name="quality" value="${product.quality}" type="text" placeholder="Quality" class="form-control form-control-user">
                            </div>
                            <div class="col-sm-3 m-2">
                                <input type="number" value="${product.min_weight}" name="minWeight" step="0.01" placeholder="Minimum Weight" class="form-control form-control-user">
                            </div>

                             <div class="col-sm-3 m-2">
                                  <input type="file" name="file" accept="image/*" placeholder="Phone" class="form-control form-control-user">
                             </div>

                            <input type="hidden"
                            	name="${_csrf.parameterName}"
                            	value="${_csrf.token}"/>
                        </div>

                        <div class="mt-3 row justify-content-center">
                            <div class="col-sm-6">
                                <button name="submit" class="btn btn-primary ml-5 pl-5 pr-5">Submit</button>
                            </div>
                        </div>
                    </form>

                    <img src="${pageContext.request.contextPath}/${image_url}" class="img-fluid rounded" style="width: 100px; height: 100px;" alt="">
                    </div>
                    <%@ include file="footer.jsp" %>
                </div></div>


</body>
</html>