<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
</head>
<body>
<h1>
Hello world!  
</h1>

<form action="addCars2">
<P> Car Name <input type="text" name="name">  </P>
<P> Brand <input type="text" name="brand">  </P>
<P> Colour <input type="text" name="colour">  </P>
<input type="submit" value="add car">
</form>

<form action="displayCars">
<input type="submit" value="submit">
</form>

</body>
</html>