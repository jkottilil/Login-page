<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up Form</title>
 </head>
  <body>
   <h1> Sign Up Here! </h1> 
   <center>
   		<h2>Registration Details</h2>
   		<form action="LoginController" method="post">
     	<br/>First Name:<input type="text" name="first_name">
     	<br/>Last Name:<input type="text" name="last_name">
     	</br/>Address:<input type="text" name="address">
     	</br/>Contact No:<input type="text" name="number">
     	</br/>Age:<input type="text" name="age">
     	</br/>Gender:<input type="text" name="gender">
     	<br/>Username:<input type="text" name="username">
     	 <br/>Password:<input type="password" name="password">
     	 <br>
     	  <br/><a href="welcome.html">Sign Up</a>
     	  </form>

    </center>
    <br>
    <br>
    <br>
    <a href="login.jsp">If you are already registered, log in here!</a>
  </body>
</html>