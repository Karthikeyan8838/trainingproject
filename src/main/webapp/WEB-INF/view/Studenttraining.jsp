<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
        h2 {
            text-align: center;
            color: #0047AB;
            margin-bottom: 30px;
        }

        h1 {
            text-align: center;
            color: #333;
        }

       
    </style>
</head>

<body>
<h1>Your Training Schedule are </h1>

<h2>Training Id: ${studenttraining.trainingid}</h2>
<h2>Training Start Date: ${studenttraining.trainingstartdate}</h2>
<h2>Training End Date: ${studenttraining.trainingenddate}</h2>
<h2>Training Student ID: ${studenttraining.studentid}</h2>
<h2>Course Id: ${studenttraining.courseid}</h2>
<h2>Trainer Id: ${studenttraining.idtrainer }</h2>

</body>
</html>