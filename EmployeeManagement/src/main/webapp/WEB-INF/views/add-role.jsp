<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
      integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
      crossorigin="anonymous">
      
<title>Add Role</title>
</head>
<body>
<div class="container">
    <p class="h4 mb-4">Enter Role</p>
    <form action="/EmpMngt/roles/addRole" method="POST">
        
        <input type="hidden" name="id" value="${Roles.id}"/>
        <div class="form-inline">
            <input type="text" name="name" value="${Roles.name}" class="form-control sm-4 sm-4" placeholder="Role">
        </div>
        <br>
        <button type="submit" class="btn btn-info col-2">Save</button>
    </form>
    
</div>
</body>
</html>