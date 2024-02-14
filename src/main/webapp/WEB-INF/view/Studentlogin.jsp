<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Login</title>
<style>
    body {
    background: url('https://w0.peakpx.com/wallpaper/191/992/HD-wallpaper-negative-laptop-pens-books-macbook-iphone-apple-inc-and-mobile-background.jpg');
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
        background-color: rgba(255, 255, 255, 0.5); /* Transparency added to the container */
        border-radius: 10px;
        padding: 20px;
        box-shadow: 0 0 20px rgba(0, 0, 0, 0.5);
    }

    h1 {
        color: white;
        margin-bottom: 20px;
    }

    form {
        width: 350px;
        margin: 0 auto;
        background-color: #fff;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    label {
        display: block;
        margin-bottom: 8px;
        color: #333;
        text-align: left;
    }

    input {
        width: 100%;
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    input[type="submit"] {
        background-color: #4caf50;
        color: #fff;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
    }

    h5 {
        color: #333;
        margin-top: 10px;
    }

    a {
        color: #007bff;
        text-decoration: none;
    }

    a:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>
 <h1>Student Login</h1>
<form action="studentloginpost" method="post">
Username:<input type="text" name="studentid" placeholder="Enter Username"/><br/>
Password: <input type="password" name="password" placeholder="Enter password"/><br/>
<input type="submit" value="Login"/>
<h4 style="color:red;">${error} </h4>
</form>


</body>
</html>