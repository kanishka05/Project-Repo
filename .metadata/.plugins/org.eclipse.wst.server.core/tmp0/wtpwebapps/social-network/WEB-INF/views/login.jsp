<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function function1() {
	alert("coming to function");
	var userName=document.getElementById("userName").value;
	alert(userName);
	var password=document.getElementById("password").value;
	alert(password);
	window.location="login?userName="+userName+"&password="+password;
}
</script>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login here</title>
</head>
<body>

<table>
<tr>
<td> UserName </td>
<td> <input type="text" id="userName" /> </td>
</tr>
<tr> 
<td> Password</td>
<td> <input type="password" id="password" /> </td>
</tr>
<tr> 
<td> </td>
<td><input type="submit" id="submit" value="get in" onclick="function1()"/> </td>
</tr>
</table>

</body>
</html>