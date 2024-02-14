<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Training List</title>
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
        }

        th {
            background-color: #4caf50;
            color: #fff;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        a {
            text-decoration: none;
            color: #007bff;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
    
</head>
<body>
<h2>Training Details</h2>
    <table border="2" width="70%" cellpadding="2">
        <tr>
            <th>Training ID</th>
            <th>Training Start Date</th>
            <th>Training End Date</th>
            <th>Course Id</th>
            <th>Trainer Id</th>
        </tr> 
        
            <tr>  
               <td>${mytraining.trainingid}</td>  
                <td>${mytraining.trainingstartdate}</td>  
                <td>${mytraining.trainingenddate}</td> 
                
                <td>${mytraining.courseid }</td> 
                <td>${mytraining.idtrainer}</td> 
            </tr>  
       
    </table>  
    <br/>   
</body>
</html>
