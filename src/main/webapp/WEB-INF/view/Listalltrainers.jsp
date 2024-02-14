<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Trainer List</title>
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
        table {
            width: 70%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            border: 2px solid #333;
            padding: 10px;
            text-align: left;
            text-color: black;
        }

        th {
            background-color: white;
            color: black;
        }

        tr:nth-child(even) {
            background-color: white;
            color: black;
        }

        a {
            text-decoration: none;
            color:black;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
    <script>
        function confirmDelete(trainerId) {
            var result = confirm("Are you sure you want to delete Trainer ID " + trainerId + "?");
            if (result) {
                window.location.href = "deletetrainer/" + trainerId;
            }
        }
    </script>
</head>
<body>
<h2>Trainer's List</h2>
    <table border="2" width="70%" cellpadding="2">
        <tr>
            <th>Trainer ID</th>
            <th>Trainer Name</th>
            <th>Trainer Qualification</th>
            <th>Trainer Experience</th>
            <th>Trainer Description</th>
            <th>Email</th>
            <th>Mobile</th>
            <th>Password</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr> 
        <c:forEach var="trainer" items="${trlist}">   
            <tr>  
                <td>${trainer.idtrainer}</td>  
                <td>${trainer.trainername}</td>  
                <td>${trainer.trainerQualification}</td> 
                <td>${trainer.experience}</td>
                <td>${trainer.description }</td> 
                <td>${trainer.email }</td> 
                <td>${trainer.phno }</td> 
                <td>${trainer.password }</td> 
                <td><a href="edittrainer/${trainer.idtrainer}">Edit</a></td>  
                <td>
                    <a href="javascript:void(0);" onclick="confirmDelete(${trainer.idtrainer})">Delete</a>
                </td>  
            </tr>  
        </c:forEach>  
    </table>  
    <br/>   
</body>
</html>
