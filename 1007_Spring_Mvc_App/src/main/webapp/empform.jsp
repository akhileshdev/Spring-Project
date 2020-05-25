<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "core" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>

<body> 
       <h1>Add New Employee</h1>  
       
       <form:form action = "saveEmployee" method = "POST">
          <table>
               <tr>
                  <td>ID : </td>
                  <td><form:input path = "id"/></td>
               </tr>
               
               <tr>
                  <td>Name : </td>
                  <td><form:input path = "name"/></td>
               </tr>
               
               <tr>
                  <td>Salary : </td>
                  <td><form:input path = "salary"/></td>
               </tr>
               
               <tr>
                  <td>Designation : </td>
                  <td><form:input path = "designation"/></td>
               </tr>
               
               <tr>
                  <td>ID : </td>
                  <td><input type = "submit" value = "Save"/></td>
               </tr>
                            
          </table>
       
       </form:form>
          
</body>

</html>