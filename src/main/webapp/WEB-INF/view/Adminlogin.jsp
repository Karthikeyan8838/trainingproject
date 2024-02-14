<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Admin Login</title>
<style>
         body {
    background: url('https://tts.net.in/wp-content/uploads/2021/11/133-1024x597.jpg');
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
            color: white; /* Dark blue text color */
            margin-bottom: 20px;
        }

        form {
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
            width: calc(100% - 22px); /* Adjusted width for better alignment */
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
  <h1>Admin Login</h1>
  <form action = "adminlogin" method = "post">
    Username: <input type="text" name="Username" required><br>
    Password: <input type="password" name="Password" required><br>
    <input type="submit" value = "Login">
  </form>
  <h4 style="color:red;">${error} </h4>

</body>
</html>

