<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Javito - Маркетплейс</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <header>
        <h1>Javito</h1>
    </header>
    <div class="container">
        <#list products as product>
            <div class="product">
                <h2>${product.title}</h2>
                <p>${product.description}</p>
                <p>Цена: ${product.price} руб.</p>
            </div>
        </#list>
    </div>
</body>
</html>
