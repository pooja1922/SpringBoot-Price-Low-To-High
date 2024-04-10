<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,com.model.Product"%>

<!DOCTYPE html>
<html>

<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
        crossorigin="anonymous">
    <meta charset="ISO-8859-1">
    <title>Product Details</title>
<style>
    body {
        background-color: black;
        color: white;
        font-family: 'Arial', sans-serif;
    }

    h3 {
        color: #ffcc00;
        text-shadow: 2px 2px 4px #000000;
    }

    .custom-link {
        color: #007bff;
        text-decoration: none;
        padding: 5px 10px;
        margin-right: 20px;
        border: 1px solid #007bff;
        border-radius: 5px;
        transition: background-color 0.3s;
    }

    .custom-link:hover {
        background-color: #007bff;
        color: white;
    }

    table {
        background-color: #444;
        color: white;
        margin-bottom: 20px; /* Add space between table and links */
    }

    th, td {
        border: 1px solid #666;
        padding: 10px;
    }

    .pagination {
        margin-top: 20px;
    }

    .page-link {
        color: #ffcc00;
        background-color: #333;
        border: 1px solid #555;
        padding: 5px 10px;
        margin: 0 5px;
        text-decoration: none;
    }

    .page-link:hover {
        background-color: red;
    }
</style>
    
</head>

<body>
    <% List<Product> pList = (List<Product>) request.getAttribute("data"); %>

    <h3 class="display-6 text-center">-------------------Product Details-------------------</h3>

    <div class="container">
    <a href="LowToHigh" class="custom-link">Price: Low To High</a>
    <a href="HighToLow" class="custom-link">Price: High To Low</a>
    <a href="insertData"class="custom-link">Insert-product</a>
    <a href="updateData"class="custom-link">Update-product</a>
    <a href="deleteData"class="custom-link">Delete-product</a>
        <div class="row justify-content-center">
            <table border=1 cellspacing=0 cellpadding=10 class="table table-light">
                <tr>
                    <th>Product Id</th>
                    <th>Product Name</th>
                    <th>Product Price</th>
                    <th>Product Category</th>
                </tr>
                <% for (Product product : pList) { %>
                <tr>
                    <td><%=product.getPid()%></td>
                    <td><%=product.getPname()%></td>
                    <td><%=product.getPrice()%></td>
                    <td><%=product.getPcategory()%></td>
                </tr>
                <% } %>
            </table>
            <nav aria-label="Page navigation example">
                <ul class="pagination justify-content-center">
                    <li class="page-item"><a class="page-link" href="success">All Data</a></li>
                    <li class="page-item"><a class="page-link" href="firstFour">1</a></li>
                    <li class="page-item"><a class="page-link" href="secondfour">2</a></li>
                    <li class="page-item"><a class="page-link" href="thirdfour">3</a></li>
                    <li class="page-item"><a class="page-link" href="success">Next</a></li>
                </ul>
            </nav>
        </div>
    </div>
</body>

</html>
