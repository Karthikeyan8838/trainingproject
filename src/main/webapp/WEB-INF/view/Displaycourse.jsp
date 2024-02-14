<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course</title>
<style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
            display: block;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        h1 {
            text-align: center;
            color: #333;
        }

        h2 {
            margin-top: 10px;
            color: #555;
        }
    </style>
</head>
<body>
<h1>Your Course Details are </h1>

<h2>Course Id: ${mycourse.courseid}</h2>
<h2>Title: ${mycourse.coursename}</h2>
<h2>Course Description: ${mycourse.coursedescription}</h2>
<h2>Course Benefits: ${mycourse.coursebenefits}</h2>
<h2>Course Duration: ${mycourse.courseduration}</h2>

</body>
</html>