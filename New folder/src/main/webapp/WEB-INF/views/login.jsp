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
<div id="div-text" ></div>
<div id="div-profile"></div>
<div id="div-logout"></div>

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
			alert(data);
			if(data=='success'){
				$("#div-text").append(data);
				$("#div-profile").append('<input type="submit" id="go-profile" value="Create Profile" onclick="createProfile()" />');
				
			}
		},																					
		error: function(e){
			console.log( e);																				
		} 
	});  
}

function createProfile(){
	alert("create profile");
	$.ajax({
		type: "GET",
		url: "myProfile",
		success: function(data){
			window.location.href="myProfile" ;
		}
		
	});
	
}

function function1() {
		alert("coming to function");
		var email=document.getElementById("userName").value;
		alert(userName);
		var password=document.getElementById("password").value;
		alert(password);
		$.ajax({
			type: "POST",
			url: "login",
			data :{email:email,password:password},
			success: function(data){
				alert("login : : "+data);
				if(data=='success'){
					alert('in if');
					window.location.href='homepage';
				}
				else{
					alert('in else');
					window.location.href='loginPage';
				}
			}
		});
}

function outProfile(){
	alert("log out");
	$.ajax({
		type: "GET",
		url: "logout",
		success: function(data){
			alert(data);
			if(data=='success'){
				alert('in log out if');
				window.location.href="login" ;
			}
		}
	});
}

</script>
</body>
</html>