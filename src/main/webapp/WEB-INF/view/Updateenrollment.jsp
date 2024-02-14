<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Enrollment</title>
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

        form {
            max-width: 400px;
            width: 100%;
            padding: 30px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.3);
            background: white;
            border-radius: 10px;
            transition: transform 0.3s ease-in-out;
            box-sizing: border-box;
        }

        form:hover {
            transform: scale(1.02);
        }

        label {
            display: block;
            margin-bottom: 8px;
            color: black;
            font-size: 14px;
        }

        input {
            width: calc(100% - 24px);
            padding: 12px;
            margin-bottom: 16px;
            border: none;
            border-radius: 5px;
            background-color: #ecf0f1;
            color: black;
            box-sizing: border-box;
            transition: background-color 0.3s ease-in-out;
        }

        input:focus {
            background-color: #d5d8dc;
        }

        input[type="submit"] {
            width: 100%;
            background-color: #2ecc71;
            color:white;
            cursor: pointer;
            transition: background-color 0.3s ease-in-out;
        }
     

        input[type="submit"]:hover {
            background-color: #45a049;
        }
        </style>

</head>
<body>
    <h2>Enrollment Update Form</h2>
    <form:form action="/Trainingproject/enrollupdate" method="post" modelAttribute = "enrollment" >
        <label for="enrollmentId">Enrollment ID:</label>
        <form:input type = "number" path = "enrollmentId" readonly="true"/><br>

        <label for="studentId">Student Id:</label>
        <form:input path = "studentId"/><br>
        <label for="courseId">Course Id:</label>
        <form:input path = "courseId"  /><br>
        
        <label for="enrollmentDate">Enrollment Date:</label>
        <form:input path = "enrollmentDate"/><br>

        <label for="paid">Paid:</label>
        <form:input path= "paid" /><br>

        <label for="courseamount"> Course Amount:</label>
        <form:input path="courseamount" readonly="true"/><br>
        
        <label for="balence"> Balance:</label>
        <form:input path="balence" readonly="true" /><br>
        
        <input type="submit" value="Edit and Save">
     </form:form>
</body>
</html>