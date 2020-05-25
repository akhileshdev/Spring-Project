<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"%>

<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>    
<%@ taglib prefix = "cor" uri = "http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Employee</title>
</head>
<body>
      
      <table border = "2" width = "70%" cellpadding = "2">
        <tr>
         <th>ID</th>
         <th>Name </th>
         <th>Salary</th>
         <th>Designation</th>
         <th>Edit</th>
         <th>Delete</th>
        </tr> 
        
        <cor:forEach var = emp items = "${list}">
          <tr>
             <td>${emp.id}</td>
             <td>${emp.name}</td>
             <td>${emp.salary}</td>
             <td>${emp.disignation}</td>
             <td><a href = "editemp">Edit</a></td>
             <td><a href = "deleteemp">Delete</a></td>
          </tr>
        
        </cor:forEach>      
      </table>
      
      <br><br>
      
      <a href = "empform">Add New Employee</a>
      
</body>
</html>