<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.0.min.js"></script>
<script type="text/javascript">
	$(document).ready(function () {
			alert("document.ready");
	});
</script>

</head>
	<body>
	<p> ${msg}</p>
	
	<input  type="submit" value='logout' id='go-out' onclick='outProfile()' />
	<script type="text/javascript">
	function outProfile(){
	alert("log out");
	$.ajax({
		type: "GET",
		url: "logout",
		success: function(data){
			alert(data);
			if(data=='success'){
				window.location.href='loginPage';
			}
		}
	});
	}
	</script>
	</body>
</html>