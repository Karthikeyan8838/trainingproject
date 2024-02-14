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
    background: url('https://i.pinimg.com/originals/e5/cb/54/e5cb542c2350ab2fdf519b1346ee982f.jpg');
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

        header {
            background-color: rgba(0, 64, 128, 0.8); /* Slightly transparent dark blue */
            padding: 10px;
            border-radius: 0 0 8px 8px;
            width: 100%;
            text-align: center; /* Center the header text */
            margin-bottom: 100px;
        }

        header a {
            color: #fff;
            text-decoration: none;
            justify-content: center;
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
    <h1>Welcome to Admin Dashboard</h1>
        <a href="logout">Logout</a>
        
    </header>

    

    <div class="button-container">
        <div class="button-box">
            <i class="icon fas fa-chalkboard-teacher"></i>
            <a href="addtrainer"> Add Trainer</a>
            <p>Add Trainer Details</p>
        </div>
        <div class="button-box">
            <i class="icon fas fa-chalkboard-teacher"></i>
            <a href="showalltrainer"> View all Trainer</a>
            <p>View Trainer Details</p>
        </div>
        <div class="button-box">
            <i class="icon fas fa-graduation-cap"></i>
            <a href="addstudent">Add Student</a>
            <p>Add Student Details.</p>
        </div>
        <div class="button-box">
            <i class="icon fas fa-graduation-cap"></i>
            <a href="updatestudent">Update Student</a>
            <p>Update Student Details.</p>
        </div>
        
        <div class="button-box">
            <i class="icon fas fa-graduation-cap"></i>
            <a href="deletestudent">Delete Student</a>
            <p>Delete Student Details.</p>
        </div>
        <div class="button-box">
            <i class="icon fas fa-book"></i>
            <a href="showallstudent">View All Student</a>
            <p>View All Student</p>
        </div>
        <div class="button-box">
            <i class="icon fas fa-book"></i>
            <a href="addcourse">Add Course</a>
            <p>Add courses.</p>
        </div>
        <div class="button-box">
            <i class="icon fas fa-book"></i>
            <a href="showallcourse">View All Course</a>
            <p>View All Course.</p>
        </div>
        <div class="button-box">
            <i class="icon fas fa-book"></i>
            <a href="addtraining">Add Training</a>
            <p>Add Training</p>
        </div>
        <div class="button-box">
            <i class="icon fas fa-book"></i>
            <a href="showalltraining">View All Training</a>
            <p>View All Training</p>
        </div>
        <div class="button-box">
            <i class="icon fas fa-book"></i>
            <a href="addenrollment">Add Enrollment</a>
            <p>Add Enrollment</p>
        </div>
        <div class="button-box">
            <i class="icon fas fa-book"></i>
            <a href="showallenrollment">Enrollment List</a>
            <p>Enrollment List</p>
        </div>
        <div class="button-box">
            <i class="icon fas fa-book"></i>
            <a href="showallfeedback">View All Feedback</a>
            <p>View All Feedback</p>
        </div>
        <div class="button-box">
            <i class="icon fas fa-book"></i>
            <a href="showallrequest">View All Student Request</a>
            <p>View All Student Request</p>
        </div>
        
  
    </div>

</body>
</html>