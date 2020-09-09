<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
</head>
<body>
<h1>
Hello User !  
</h1>

<form action="display">

Student Name: <input type="text" name="name">
<br>
Student Id: <input type="text" name="studentId">
<br>

Student Sem: <input type="text" name="sem">
<br>


Preffered Location :
<select name="plocation" multiple="multiple">
<option>Bangalore</option>
<option>Mumbai</option>
<option>Delhi</option>
</select>
<br>

DOB: <input type="date" name="studentDob">
<br>

City: <input type="text" name="address.city">


State: <input type="text" name="address.state">


<input type="submit">
</form>


</body>
</html>