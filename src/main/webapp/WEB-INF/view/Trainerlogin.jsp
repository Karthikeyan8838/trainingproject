<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trainer Login</title>
<style>
    body {
    background: url('https://c0.wallpaperflare.com/preview/773/453/74/books-reading-learning-pen.jpg');
    background-repeat: no-repeat;
    background-size: cover; /* Make the background cover the entire page */
    color: black;
    font-family: 'Arial', sans-serif;
    margin: 0;
    padding: 0;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    min-height: 100vh;
}
    .container {
        background-color: rgba(255, 255, 255, 0.8); /* Slightly more opaque container */
        border-radius: 10px;
        padding: 30px;
        box-shadow: 0 0 20px rgba(0, 0, 0, 0.5);
        width: 350px;
    }

    h1 {
        color: white; 
        margin-bottom: 20px;
    }

    form {
        background-color: white;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    label {
        display: block;
        margin-bottom: 8px;
        color: black;
        text-align: left;
    }

    input {
        width: calc(100% - 22px); /* Adjusted width for better alignment */
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    input[type="submit"] {
        background-color: #4caf50;
        color: black;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
    }

    h5 {
        color: black;
        margin-top: 10px;
    }

    a {
        color: black;
        text-decoration: none;
    }

    a:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>
        
        <h1>Trainer Login</h1>
        <form action="trainerloginpost" method="post">
            User - ID: <input type="text" name="idtrainer" required><br>
   			Password: <input type="password" name="password" required><br>
            <input type="submit" value="Login"/>
            <h4 style="color:red;">${error} </h4>
        </form>
        
        
</body>
</html>