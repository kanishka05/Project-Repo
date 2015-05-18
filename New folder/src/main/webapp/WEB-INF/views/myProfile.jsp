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
<title>My Profile</title>
</head>
<body>
<table>
<tr>
	<td> Name</td>
	<td> <input type="text" id="profileName" /> </td> 
</tr>

<tr>
	<td> Date of birth </td>
	<td> <input type="text" id="profileDOB" /> </td> 
</tr>

<tr>
	<td>From</td>
	<td> <input type="text" id="profileFromPlace" /> </td> 
</tr>

<tr>
	<td> Recently Living</td>
	<td> <input type="text" id="profileRecentlyLiving" /> </td> 
</tr>

<tr>
	<td> <input type="submit" id="profilePageOneSubmit"  value="next" onclick="profilePageOne()"/> </td> 
</tr>
</table>

<script type="text/javascript">
	function profilePageOne(){
		alert("profilePageOne");
		var profileName=document.getElementById("profileName").value;
		var profileDOB=document.getElementById("profileDOB").value;
		var profileFromPlace=document.getElementById("profileFromPlace").value;
		var profileRecentlyLiving=document.getElementById("profileRecentlyLiving").value;
		
		$.ajax({
			type: "POST",
			url: "profilePageOne",
			data :{profileName:profileName,profileDOB:profileDOB,profileFromPlace:profileFromPlace,profileRecentlyLiving:profileRecentlyLiving},
			success: function(data){
				alert("profile :::: ");
				
			}
		});
	}
	

</script>
</body>
</html>