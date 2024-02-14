<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course</title>
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
<h1>Your Details </h1>

<h2>Your Id: ${mytrainer.idtrainer}</h2>
<h2>Name: ${mytrainer.trainername}</h2>
<h2>Qualification: ${mytrainer.trainerQualification}</h2>
<h2>Experience: ${mytrainer.experience}</h2>
<h2>Description: ${mytrainer.description}</h2>
<h2>Email: ${mytrainer.email}</h2>
<h2>Mobile : ${mytrainer.phno}</h2>

</body>
</html>