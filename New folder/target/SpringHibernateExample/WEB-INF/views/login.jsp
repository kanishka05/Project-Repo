<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.0.min.js"></script>
<script type="text/javascript">
$(document).ready(function () {
		alert("document.ready");
});

$(function(){
function function1() {
	alert("coming to function");
	var userName=document.getElementById("userName").value;
	alert(userName);
	var password=document.getElementById("password").value;
	alert(password);
	window.location="login?userName="+userName+"&password="+password;
}

});




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
<td><input type="submit" id="submit-login" value="get in" onclick="function1()"/> </td>
</tr>
</table>

<table>

<tr> 
<td> First Name </td>
<td><input type="text" id="firstName" />  </td>
</tr>

<tr>
<td> Last Name </td>
<td> <input type="text" id="lastName" />  </td>
</tr>

<tr>
<td> E-Mail </td>
<td> <input type="text" id="eMail" />  </td>
</tr>


<tr>
<td> Password </td>
<td> <input type="text" id="passReg" />  </td>
</tr>


<tr>
<td> Confirm Password </td>
<td><input type="text" id="passRegConfirm" />  </td>
</tr>


<tr>
<td> Date Of Birth </td>
<td> <input type="text" id="dob" />  </td>
</tr>

<tr>
<td><input type="submit" id="submit-register" value="register" onclick="functionRegister()"/> </td>
</tr>

</table>
<p> ${msg}</p>


<script type="text/javascript">
function functionRegister(){
	alert("register");
	var fname=document.getElementById("firstName").value;
	var lname=document.getElementById("lastName").value;
	var email=document.getElementById("eMail").value;
	var pass=document.getElementById("passReg").value;
	var dateOb=document.getElementById("dob").value;
	$.ajax({
		type: "POST",
		url: "register",
		data: {fname:fname,lname:lname,email:email,pass:pass,dateOb:dateOb},
		success: function(data){
			alert("here");
		},																					
		error: function(e){
			console.log( e);																				
		} 
	});  
}
</script>
</body>
</html>