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
            font-size: 24px;
            color: #333;
            margin-bottom: 20px;
        }

        h2 {
            font-size: 25px;
            margin-top: 10px;
            color: #555;
        }
    </style>
</head>
<body>
<h1>Your Details </h1>

<h2>Your Id: ${mystudent.studentid}</h2>
<h2>Name: ${mystudent.name}</h2>
<h2>Age: ${mystudent.age}</h2>
<h2>DOB: ${mystudent.dob}</h2>
<h2>Batch no: ${mystudent.batchno}</h2>
<h2>Course id: ${mystudent.courseid}</h2>
<h2>Place : ${mystudent.place}</h2>
<h2>Qualification : ${mystudent.qualification}</h2>
<h2>CGPA : ${mystudent.cgpa}</h2>
<h2>Mobile : ${mystudent.phno}</h2>
<h2>Email : ${mystudent.mailid}</h2>


</body>
</html>