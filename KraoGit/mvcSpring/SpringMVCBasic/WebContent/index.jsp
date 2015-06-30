<!DOCTYPE HTML>
<!-- Website Template by freewebsitetemplates.com -->
<html>
<head>
	<meta charset="UTF-8">
	<title>Laboratory Website Template</title>
	<link rel="stylesheet" href="css/style.css" type="text/css">
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.0.min.js"></script>
	<script type="text/javascript">
	$(document).ready(function () {
	alert("document.ready");
	});
	</script>
</head>

<body>
	<div id="header">
		<a href="index.jsp" class="logo"><img src="images/keLogo.png" alt=""></a>
		<ul>
			<li class="selected">
				<a  onclick="showHome()">home</a>
			</li>
			<li>
				<a  onclick="showAbout()">about</a>
			</li>
			<li>
				<a onclick="showServices()">services</a>
			</li>
			<li>
				<a onclick="showLocation()">our locations</a>
			</li>
			<!-- <li>
				<a onclick="showBlog()">blog</a>
			</li> -->
			<li>
				<a onclick="showContact()">contact</a>
			</li>
			
		</ul>
	</div>
	<div id="section">
		<div>
			<div>
				<h1>accurate.reliable.fast</h1>
				<p>
					When it comes to finding answers to questions and getting results. Illumelabs is number one. No other diagnostic laboratory is faster, more reliable and accurate. Choose Illumelabs.
				</p>
			</div>
		</div>
	</div>
	<div id="featured">
		<div>
			<div class="article">
				<h2>Welcome to Illumelabs Diagnostic Center</h2>
				<img src="images/diagnostic-center.jpg" alt="">
				<p>
					This website template hahs been designed by <a href="http://www.freewebsitetemplates.com/">Free Website Templates</a> for you, for free. You can replace all this text with your own text.
				</p>
				<p>
					You can remove any link to our website from this website template, you're free to use this website template without linking back to us.
				</p>
				<p>
					f you're having problems editing this website template, then don't hesitate to ask for help on the <a href="http://www.freewebsitetemplates.com/forums/">Forums</a>.
				</p>
			</div>
			<ul>
				<li>
					<h3>hematology</h3>
					<div>
						<p>
							Blood extraction using seismic energy for painless testing.
						</p>
						<a href="blog.jsp" class="more">read more</a>
					</div>
					<img src="images/hematology.jpg" alt="">
				</li>
				<li>
					<h3>urine &amp; drug testing</h3>
					<div>
						<p>
							Accurate and secure testing of urine for diseases and drugs and medicines.
						</p>
						<a href="blog.jsp" class="more">read more</a>
					</div>
					<img src="images/urine-and-drug-testing.jpg" alt="">
				</li>
				<li>
					<h3>x-ray</h3>
					<div>
						<p>
							Fast and clear x-ray results. You’ll be assisted by our friendly staff all the way.
						</p>
						<a href="blog.jsp" class="more">read more</a>
					</div>
					<img src="images/x-ray.jpg" alt="">
				</li>
				<li>
					<h3>pathology and dna</h3>
					<div>
						<p>
							State of the art testing for DNA that’s sure to be have fast and accurate results.
						</p>
						<a href="blog.jsp" class="more">read more</a>
					</div>
					<img src="images/pathology-and-dna.jpg" alt="">
				</li>
			</ul>
		</div>
	</div>
	<div id="footer">
		<div>
			<p>
				<span>2023 &copy; Illumelabs Diagnostic Center.</span><a href="#" >Terms of Service</a> | <a href="#" >Privacy Policy</a>
			</p>
			<ul>
				<li id="facebook">
					<a href="http://freewebsitetemplates.com/go/facebook/">facebook</a>
				</li>
				<li id="twitter">
					<a href="http://freewebsitetemplates.com/go/twitter/">twitter</a>
				</li>
				<li id="googleplus">
					<a href="http://freewebsitetemplates.com/go/googleplus/">googleplus</a>
				</li>
				<li id="rss">
					<a href="#" >rss</a>
				</li>
			</ul>
		</div>
	</div>
	
	<script type="text/javascript">
		function showHome(){
			alert("show index function");
			$.ajax({
				type: "POST",
				url: "index",
				data: {show : "show"},
				success: function(data){
					alert(data);
					if(data=='success'){
						alert("called ajax");
						window.location.href='index.jsp';
					}
				},																					
				error: function(e){
					console.log( e);																				
				} 
			});
		}
		
		function showAbout(){
			alert('in about function');
			$.ajax({
				type: "GET",
				 url: "about",
			 success: function(data){
				 		alert('in about data is :'+data);
			 }
			});
		}
		
		function showServices(){
			alert('in services function');
			$.ajax({
				type: "GET",
				 url: "services",
			 success: function(data){
				 		alert('in services data is '+data);
			 }
			 });
		}
		
		function showLocation(){
			alert('in location function');
			$.ajax({
				type: "GET",
				 url: "location",
			 success:  function(data){
				 		alert('in location data is '+data);
			 }
			});
		}
		
		function showContact(){
			alert('in contact function');
			$.ajax({
				type: "GET",
				url : "contact",
			success : function(data){
					alert('in contact data is '+data);
			}
			});
		}
		
		function showBlog(){
			alert('in blog function');
			$.ajax({
				type: "GET",
				url : "blog",
			success : function(data){
				alert('in blog data is '+data);
			}
			})
		}
		
	</script>
</body>
</html>