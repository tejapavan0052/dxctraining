<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
</head>
<body>
<h1>
welcome to ${showroom.name }

</h1>

<p> Cars Available are </p>

<table border="border" width="80%">
<tr> <td> Name </td> <td> Brand </td> <td> Colour </td>  </tr>
<c:forEach items="${showroom.cars}" var="car">

<tr>

<td> ${car.name}</td>
<td> ${car.brand} </td>
<td> ${car.colour} </td>
</tr>


</c:forEach>

</table>
</body>
</html>