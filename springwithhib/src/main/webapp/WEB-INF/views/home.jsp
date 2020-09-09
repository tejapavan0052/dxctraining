<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
</head>
<body>
<h1>
Hello Author PLz Provide ur Details!  
</h1>
<form action="display">

Name:<input type="text" name="authorName">
<br>
Id:<input type="text" name="authorId">
<br>City: <input type="text" name="city">
<br>
<input type="submit" name="save author">
</form>

<form action="updatePage">
<input type="submit" value="Update">
</form>
</body>
</html>