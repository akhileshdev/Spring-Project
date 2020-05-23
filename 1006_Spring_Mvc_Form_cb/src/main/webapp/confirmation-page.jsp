<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false" %>

<%@taglib prefix="cor" uri="http://java.sun.com/jsp/jstl/core"%>      
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation Page</title>
</head>

<body>
    First Name : ${reservation.firstName}
    <br>
    <br>
    Last Name : ${reservation.lastName}
    <br>
    <br>
    Gender : ${reservation.gender}
    <br><br>
    
    Food : 
    <ul>
             <cor:forEach var = "meal" items = "${reservation.food}">
                 <li> ${meal} </li>           
             </cor:forEach>
    </ul>
    
    
</body>


</html>