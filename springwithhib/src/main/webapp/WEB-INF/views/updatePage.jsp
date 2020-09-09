<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Update</title>
</head>
<body>
<h1>
Hello Author PLz Update ur Details!  
</h1>
<form action="searchForUpdate">
Id:<input type="text" name="authorId" value="${author.authorId}">
<input type="submit" value="search">
</form>


<form action="updateData">
Name:<input type="text" name="authorName" value="${author.authorName}">
<br>
<br>City: <input type="text" name="city" value="${author.city}">
<br>
<input type="submit" value="update author">
</form>

</body>
</html>
