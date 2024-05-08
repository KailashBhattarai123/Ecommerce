<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Signup</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&family=Raleway:wght@600;800&display=swap" rel="stylesheet">

    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom Styles -->
    <style>
        body {
            background-color: #f8f9fa;
            font-family: 'Open Sans', sans-serif;
        }


        .card {
            border: none;
            border-radius: 15px;
            box-shadow: 0px 5px 15px rgba(0, 0, 0, 0.1);
        }

        .btn-primary {
            background-color: #007bff;
            border-color: #007bff;
        }

        .btn-primary:hover {
            background-color: #0056b3;
            border-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-body">
                        <h3 class="text-center mb-4">E-Sewa Payment</h3>
                        <form action="https://rc-epay.esewa.com.np/api/epay/main/v2/form" method="POST">
                        <input type="text" id="amount" name="amount" value="${pm.amount}" required>
                        <input type="text" id="tax_amount" name="tax_amount" value ="${pm.taxAmount}" required>
                        <input type="text" id="total_amount" name="total_amount" value="${pm.totalAmount}" required>
                        <input type="text" id="transaction_uuid" name="transaction_uuid" value="${pm.transactionUUID}" required>
                        <input type="text" id="product_code" name="product_code" value ="${pm.productCode}" required>
                        <input type="text" id="product_service_charge" name="product_service_charge" value="${pm.psc}" required>
                        <input type="text" id="product_delivery_charge" name="product_delivery_charge" value="${pm.pdc}" required>
                        <input type="text" id="success_url" name="success_url" value="https://esewa.com.np" required>
                        <input type="text" id="failure_url" name="failure_url" value="https://google.com" required>
                        <input type="text" id="signed_field_names" name="signed_field_names" value="total_amount,transaction_uuid,product_code" required>
                        <input type="text" id="signature" name="signature" value="${pm.signature}" required>
                        <input value="Submit" type="submit">
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS and dependencies (optional) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>