<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored = "false"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   

   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
   <title>Confirmation Page</title>
</head>

<body>
          
     <p>Your reservation is confirmed successfully. Please, re-check the details.</p>
     <br>

     First Name : ${reservation.firstName}
     <br>
     
     Last Name  : ${reservation.lastName}
     <br>
     
     Gender : ${reservation.gender}
     
</body>

</html>