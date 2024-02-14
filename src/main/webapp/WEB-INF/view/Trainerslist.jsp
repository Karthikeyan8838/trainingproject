<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
            display: center;
            align-items: center;
            justify-content: center;
            height: 100vh;
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
<table border="2" width="70%" cellpadding="2">
<tr><th>Trainer ID </th><th>Trainer Name</th><th>Trainer Qualification </th><th>Trainer Experience</th><th>Trainer Description</th><th>Email</th><th>Mobile</th><th>Password</th><th>Edit</th><th>Delete</th></tr> 
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
   <td><a href="deletetrainer/${trainer.idtrainer}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>   
   </body>
</html>