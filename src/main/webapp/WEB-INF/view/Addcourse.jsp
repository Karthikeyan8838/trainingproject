<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Course</title>
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
 <script>
        // Add a function for courseid validation
        function validateCourseId() {
            var courseIdInput = document.getElementById('courseid');
            var enteredCourseId = parseInt(courseIdInput.value, 10);

            if (enteredCourseId <= 1000) {
                alert('Course ID must be greater than 1000');
                courseIdInput.value = ''; // Clear the input field or take appropriate action
                return false;
            }

            return true;
        }
    </script>
</head>
<body>
	<h2>Course Information Form</h2>
    <form:form action="addcoursepost" method="post" modelAttribute = "course" onsubmit="return validateCourseId();">
        <label for="courseid">Course ID:</label>
        <form:input path = "courseid" id="courseid" required = "required" />
        <form:errors path = "courseid" cssStyle="color:red"/>
        <br>
        
        <label for="coursename">Course Title:</label>
        <form:input path = "coursename" required = "required" />
        <form:errors path = "coursename" cssStyle="color:red"/>
        <br>
        
        <label for="coursedescription">Course Description:</label>
        <form:input path = "coursedescription" required = "required" />
        <form:errors path = "coursedescription" cssStyle="color:red"/>
        <br>

        <label for="coursebenefits">Course Benefits:</label>
        <form:input path= "coursebenefits"  required = "required"/>
        <form:errors path = "coursebenefits" cssStyle="color:red"/>
        <br>
        
        <label for="courseduration"> Course Duration:</label>
        <form:input path="courseduration" required = "required" />
        <br>
        
        <input type="submit" value="Submit">
     </form:form>
</body>
</html>