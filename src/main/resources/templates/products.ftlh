<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Javito - Маркетплейс</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        header {
            background-color: #ff6600;
            color: white;
            padding: 10px 0;
            text-align: center;
        }
        header h1 {
            margin: 0;
            font-size: 2em;
        }
        .container {
            padding: 20px;
        }
        .product {
            background-color: white;
            border: 1px solid #ddd;
            margin-bottom: 20px;
            padding: 10px;
            border-radius: 5px;
        }
        .product h2 {
            margin-top: 0;
        }
        .product p {
            margin: 5px 0;
        }
        .product img {
            max-width: 100%;
            height: auto;
            border-radius: 5px;
        }
    </style>
</head>
<body>
    <header>
        <h1>Javito</h1>
    </header>
    <div class="container">
        <div class="product">
            <h2>Товар 1</h2>
            <img src="https://via.placeholder.com/150" alt="Товар 1">
            <p>Описание товара 1. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
            <p>Цена: 1000 руб.</p>
        </div>
        <div class="product">
            <h2>Товар 2</h2>
            <img src="https://via.placeholder.com/150" alt="Товар 2">
            <p>Описание товара 2. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
            <p>Цена: 2000 руб.</p>
        </div>
        <div class="product">
            <h2>Товар 3</h2>
            <img src="https://via.placeholder.com/150" alt="Товар 3">
            <p>Описание товара 3. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
            <p>Цена: 3000 руб.</p>
        </div>
    </div>
</body>
</html>
