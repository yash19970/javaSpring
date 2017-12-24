<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html> 
	<body>
		<h1> STUDENT ADMISSION FORM :</h1>
		<form:errors path="student1.*"/>
		<form action= "/FirstWebsite/submitAdmissionForm.html" method = "POST">
			<p> Student Name: <input type="text" name="studentName" /> </p>
			<p> Student Hobby: <input type="text" name="studentHobby" /> </p>
			<p> Student Mobile: <input type="text" name="studentMobile" /> </p>
			<input type="submit" value=" Submit" />
		</form>
	</body>
</html>