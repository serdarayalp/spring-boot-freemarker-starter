<!DOCTYPE html>
<html lang="de">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Freemarker Test-Applikation</title>
    <link href="css/main.css" rel="stylesheet"/>
</head>
<body>
<h1>Herzlich Willkommen</h1>

<h2>Kunden:</h2>

<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Vorname</th>
        <th>Nachname</th>
        <th>Geburtsjahr</th>
    </tr>
    </thead>
    <tbody>
    <#list customers as customer>
        <tr>
            <td>${customer.id}</td>
            <td>${customer.firstname}</td>
            <td>${customer.lastname}</td>
            <td>${customer.birthyear?c}</td>
        </tr>
    </#list>
    </tbody>
</table>

</body>
</html>