<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Page</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f2f2f2; /* Light grey background */
            background-image: url('https://i.pinimg.com/originals/e5/cb/54/e5cb542c2350ab2fdf519b1346ee982f.jpg'); /* Subtle background pattern */
            text-align: center;
            color: #004080; /* Dark blue text color */
        }

           header {
            background-color:  rgba(0, 64, 128, 0.8);
            padding: 10px;
            border-radius: 0 0 8px 8px;
            width: 100%;
            text-align: center;
            margin-bottom: 100px;
        }

        header a {
            color: #fff;
            text-decoration: none;
            margin-right: 20px;
            font-size: 18px;
        }

        h1 {
            color: #fff;
            margin-top: 20px; /* Adjusted margin to place it above the buttons */
            font-size: 30px;
        }

        .button-container {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            margin-top: 20px;
        }

        .button-box {
            background-color: rgba(255, 99, 71, 0.8);
            border-radius: 8px;
            padding: 20px;
            margin: 10px;
            text-align: center;
            width: 200px;
        }

        .icon {
            font-size: 24px;
            margin-bottom: 10px;
        }

        .button-box a {
            color: #333;
            text-decoration: none;
            font-weight: bold;
        }

        p {
            margin-top: 10px;
            color: #fff;
        }
    </style>
</head>
<body>
    <header>
    <h1> Welcome ${name}</h1>
        <a href="logout">Logout</a>
    </header>

    <div class="button-container">
        <div class="button-box">
            <i class="icon fas fa-chalkboard-teacher"></i>
            <a href="searchtrainingschedule/${idtrainer }">Training Schedule</a>
            <p>View training Schedule</p>
        </div>
        <div class="button-box">
            <i class="icon fas fa-chalkboard-teacher"></i>
            <a href="showallcourse2">View Course</a>
            <p>View Course Details</p>
        </div>
        <div class="button-box">
            <i class="icon fas fa-graduation-cap"></i>
            <a href="trainerdetails/${idtrainer }">View Profile Trainer</a>
            <p>View Profile Trainer.</p>
        </div>
  
    </div>

</body>
</html>