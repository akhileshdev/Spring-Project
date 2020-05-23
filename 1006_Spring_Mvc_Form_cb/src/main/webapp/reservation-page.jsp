<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
        
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Reservation Page</title>
</head>

<body>
    <form:form action = "submitForm" modelAttribute = "reservation">
        First Name : <form:input path="firstName"/>
                     <br><br>
        
        Last Name :  <form:input path = "lastName"/>
                     <br><br>
                                     
        Gender : 
                Male <form:radiobutton path="gender" value = "Male"/>
                Female <form:radiobutton path="gender" vale = "Female"/>
                <br><br>
        
        Food : 
               Breakfast <form:checkbox path="food" value = "Breakfast"/>
               Lunch <form:checkbox path="food" value = "Lunch"/> 
               Snacks <form:checkbox path="food" value = "Snacks"/>
               Dinner <form:checkbox path="food" value = "Dinner"/>
               <br><br>
         
         <input type = "submit" value = "Submit"/>             
        
    </form:form>
</body>

</html>