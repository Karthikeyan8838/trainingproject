<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View all Students</title>
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
</head>
<body>
<h2>Student's List</h2>
<table border="2" width="70%" cellpadding="2">
<tr>
<th>Student ID </th>
<th>Student Name</th>
<th>Age</th>
<th>Date of Birth</th>
<th>Batch No</th>
<th>Course Id</th>
<th>Place</th>
<th>Qualification</th>
<th>CGPA</th>
<th>Mobile</th>
<th>Email</th>
<th>Password</th>
</tr> 
   <c:forEach var="student" items="${clist}">   
   <tr>  
   <td>${student.studentid}</td>  
   <td>${student.name}</td> 
   <td>${student.age}</td> 
   <td>${student.dob }</td> 
   <td>${student.batchno}</td>
   <td>${student.courseid}</td>
   <td>${student.place}</td>
   <td>${student.qualification}</td> 
   <td>${student.cgpa}</td>
   <td>${student.phno }</td> 
   <td>${student.mailid }</td> 
   <td>${student.password }</td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>   
</body>
</html>