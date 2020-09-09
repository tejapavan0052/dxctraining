<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
</head>
<body>
<h1>

Welcome to Spring MVC
</h1>

<P>Name : ${student.name}</P>
<P>Student Id : ${student.studentId}</P>
<P>Address : ${student.address}</P>
<P>Sem : ${student.sem}</P>

<P>Sem : ${student.studentDob}</P>


<P>Sem : ${student.address.city}</P>

<P>Sem : ${student.address.state}</P>


prefered Location
<c:forEach items="${student.plocation}" var="loc">

${loc},
</c:forEach>

</body>
</html>
