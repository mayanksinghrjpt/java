<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>
Your data is save:-<br>
Id Number:-${per.pid },<br>

 Person Name:-${per.pname}<br>
 
 <h3>Get the data by Id</h3>

<form action="getperson">
	
	    <label for="pid">Person ID:</label><br>
		<input type="text" id="pid" name="pid"  ><br> 
		
		<input type="submit"><br>
	</form>
</p>
</body>
</html>