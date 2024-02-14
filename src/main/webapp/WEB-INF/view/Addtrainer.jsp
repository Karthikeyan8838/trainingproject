<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Trainer</title>
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

input, select {
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

input:focus, select:focus {
    background-color: #d5d8dc;
}

input[type="submit"] {
    width: 100%;
    background-color: #2ecc71;
    color: white;
    cursor: pointer;
    transition: background-color 0.3s ease-in-out;
}

input[type="submit"]:hover {
    background-color: #45a049;
}
        </style>
         <script>
        function validateTrainerId() {
            var trainerIdInput = document.getElementById('idtrainer');
            var enteredTrainerId = parseInt(trainerIdInput.value, 10);

            if (enteredTrainerId <= 5000) {
                alert('Trainer ID must be greater than 5000');
                trainerIdInput.value = ''; // Clear the input field or take appropriate action
                return false;
            }

            return true;
        }
    </script>
</head>
<body>
    <h2>Trainer Information Form</h2>
    <form:form action="addtrainerpost" method="post" modelAttribute = "trainer" onsubmit="return validateTrainerId();">
        <label for="idtrainer">Trainer ID:</label>
        <form:input path = "idtrainer" required = "required" id="idtrainer" /><br>

        <label for="trainername">Trainer Name:</label>
        <form:input path = "trainername" required = "required"/><br>

        <label for="trainerQualification">Trainer Qualification:</label>
        <form:input path = "trainerQualification" required = "required"/><br>

        <label for="experience">Experience:</label>
        <form:input path = "experience" required = "required"/><br>

        <label for="description">Description:</label>
        <form:input path = "description" rows="4" cols="50" required = "required"/><br>

        <label for="email">Email:</label>
        <form:input path = "email" type="email" name="emailId" placeholder = "abc@gmail.com" pattern="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,}$" title="Check the email format it should be like ram@gmail.com" required = "required"/><br>

        <label for="phno">Phone Number:</label>
        <form:input path = "phno" type="tel" required = "required" pattern="[0-9]{10}"/><br>

        <label for="password">Password:</label>
        <form:input path = "password" required = "required"/><br>

        <input type="submit" value="Submit">
    </form:form>
</body>
</html>