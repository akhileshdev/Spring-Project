<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>      
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
   <title>Registration Page</title>
</head>

<body>
     <form:form action = "submitForm" modelAttribute = "reservation">
       First Name : <form:input type = "text" path = "firstName"/>
       <br>
       <br>
       Last Name : <form:input type = "text" path = "lastName"/>
       <br>
       <br>
       <input type = "submit" value = "Submit">
       
       
       </form:form>
</body>

</html>
  