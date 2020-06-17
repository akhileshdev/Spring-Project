<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored = "false"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "cor" %>    

<html>
<head>
<title>View Employee</title>
</head>

<body>
       <table border="2" width="70%" cellpadding="2">
        <tr>
         <th>Id</th>
         <th>Name </th>
         <th>Salary </th>
         <th>Designation </th> 
         <th>Edit </th>
         <th>Delete</th>
        </tr> 
        
        <cor:forEach var = "empl" items= "${list}">
         <tr>
           <td>${empl.id}</td>
           <td>${empl.name}</td>
           <td>${empl.salary}</td>
           <td>${empl.designation}</td>
           
           <td><a href = "editemp/${empl.id}">Edit</a></td>
           <td><a href = "deleteemp/${empl.id}">Delete</a></td> 
          </tr>   
        </cor:forEach>
         
       </table>  
       <br/>
       
        <a href="empform">Add New Employee</a>  
</body>

</html>