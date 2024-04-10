<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }

        label {
            display: block;
            margin-bottom: 8px;
        }

        input {
            width: calc(100% - 16px); /* Adjusted width to accommodate padding */
            padding: 8px;
            margin-bottom: 16px;
            box-sizing: border-box;
        }

        button {
            background-color: #4caf50;
            color: #fff;
            padding: 10px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            width: 100%; /* Set button width to match input width */
        }

        button:hover {
            background-color: #45a049;
        }

        #result {
            margin-top: 20px;
            font-weight: bold;
        }
    </style>
    <title>Product Form</title>
</head>
<body>

    <form id="productForm" action="insertData">
        <label for="pid">Product ID:</label>
        <input type="text" id="pid" name="pid" required>

        <label for="pname">Product Name:</label>
        <input type="text" id="pname" name="pname" required>

        <label for="price">Price:</label>
        <input type="text" id="price" name="price" required>

        <label for="pcategory">Category:</label>
        <input type="text" id="pcategory" name="pcategory" required>

        <button type="submit">Insert</button>
        <a href="/">Back</a>
    </form>

   

</body>
</html>
