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
        function validateStudentId() {
            var studentIdInput = document.getElementById('studentid');
            var enteredStudentId = parseInt(studentIdInput.value, 10);

            if (enteredStudentId <= 10000) {
                alert('Enter valid Student ID');
                studentIdInput.value = ''; // Clear the input field or take appropriate action
                return false;
            }

            return true;
        }
    </script>
</head>
<body>
	<h2>Feedback Form</h2>
    <form:form action="addfeedbackpost" method="post" modelAttribute = "feedback" onsubmit="return validateStudentId();">
        
        <label for="studentid">Student ID:</label>
        <form:input path="studentid" required="required" />
        <br>
        
        <label for="trainingcontent">Delivery of Training Content:</label>
        <form:select path="trainingcontent" required="required">
         <form:option value="0">Select</form:option>
            <form:option value="Poor">Poor</form:option>
            <form:option value="Fair">Fair</form:option>
            <form:option value="Good">Good</form:option>
            <form:option value="Very Good">Very Good</form:option>
            <form:option value="Excellent">Excellent</form:option>
        </form:select>
        <br>

        <label for="trainerevaluation">Trainer Evaluation:</label>
        <form:select path="trainerevaluation" required="required">
         <form:option value="0">Select</form:option>
            <form:option value="Poor">Poor</form:option>
            <form:option value="Fair">Fair</form:option>
            <form:option value="Good">Good</form:option>
            <form:option value="Very Good">Very Good</form:option>
            <form:option value="Excellent">Excellent</form:option>
        </form:select>
        <br>
        
        <label for="logisticssupport">Logistic Support:</label>
        <form:select path="logisticssupport" required="required">
         <form:option value="0">Select</form:option>
            <form:option value="Poor">Poor</form:option>
            <form:option value="Fair">Fair</form:option>
            <form:option value="Good">Good</form:option>
            <form:option value="Very Good">Very Good</form:option>
            <form:option value="Excellent">Excellent</form:option>
        </form:select>
        <br>
        
        <label for="overallsatisfication">Overall Satisfaction:</label>
        <form:select path="overallsatisfication" required="required">
            <form:option value="0">Select</form:option>
            <form:option value="Poor">Poor</form:option>
            <form:option value="Fair">Fair</form:option>
            <form:option value="Good">Good</form:option>
            <form:option value="Very Good">Very Good</form:option>
            <form:option value="Excellent">Excellent</form:option>
        </form:select>
        <br>
        
        <label for="idtrainer"> Trainer Id:</label>
       <!--  <form:input path="idtrainer" required = "required" /><br> -->
         <form:select path="idtrainer" required="required">
         <form:option value ="0" >Select Trainer</form:option>
            <c:forEach items="${trainerList}" var="trainer">
                <form:option value="${trainer.idtrainer}" label="${trainer.trainername}" />
            </c:forEach>
        </form:select><br>
        
        <input type="submit" value="Submit">
     </form:form>
</body>
</html>