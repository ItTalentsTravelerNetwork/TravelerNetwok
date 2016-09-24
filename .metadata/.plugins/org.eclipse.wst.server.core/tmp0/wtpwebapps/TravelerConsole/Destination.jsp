<%@page import="functionality.UsersManager"%>
<%@page import="functionality.DestinationsManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import = "models.*" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page errorPage="Error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport"    content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author"      content="David & Yasen">
	<title>The Traveler Bulgaria</title>
	
	<link rel="shortcut icon" href="assets/images/gt_favicon.png">
	
	<link rel="stylesheet" media="screen" href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,700">
	<link rel="stylesheet" href="assets/css/bootstrap.min.css">
	<link rel="stylesheet" href="assets/css/font-awesome.min.css">

	<!-- Custom styles for our template -->
	<link rel="stylesheet" href="assets/css/bootstrap-theme.css" media="screen" >
	<link rel="stylesheet" href="assets/css/main.css">

	<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!--[if lt IE 9]>
	<script src="assets/js/html5shiv.js"></script>
	<script src="assets/js/respond.min.js"></script>
	<![endif]-->
</head>

<body>
	<%
   		response.addHeader("Cache-Control", "no-cache,no-store,private,must-revalidate,max-stale=0,post-check=0,pre-check=0"); 
   		response.addHeader("Pragma", "no-cache"); 
   		response.addDateHeader ("Expires", 0);
  	%>
	<!-- Fixed navbar -->
	<%if (request.getParameter("name") == null){ %>
		<%response.sendRedirect("AllDestinations.jsp"); %>
	<%} %>
	
	<div class="navbar navbar-inverse navbar-fixed-top headroom" >
		<div class="container">
			<div class="navbar-header">
				<!-- Button for smallest screens -->
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
				<a class="navbar-brand" href="index.jsp"><img src="assets/images/logo4.png" alt="The Traveler Bulgaria"></a>
			</div>
			
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav pull-right">
					<li><a href="index.jsp">Home</a></li>					
					<li><a href="AllDestinations.jsp">Destinations</a></li>
					<%if(request.getSession().getAttribute("user") == null){ %>
						<li><a class="btn" href="SignIn.jsp">SIGN IN / SIGN UP</a></li>
					<%}else{ %>
						<li><a class="btn" href="LogoutServlet">Logout</a></li>
						<li><a class="btn" href="profile.jsp">PROFILE</a></li>
					<%} %>
				</ul>
			</div><!--/.nav-collapse -->
		</div>
	</div> 
	<!-- /.navbar -->

	<header id="head" class="secondary"></header>

	<!-- container -->
	<div class="container">
		
		<ol class="breadcrumb">
			<li><a href="index.jsp">Home</a></li>
			<li class="active">Profile Page</li>
		</ol>

		<div class="row">
			
			<!-- Sidebar -->
			<% Destination dest = null; %>
			<%if (request.getParameter("name") != null){ %>
			<aside class="col-md-4 sidebar sidebar-left">
						<% dest = DestinationsManager.getInstance().getDestinationFromCache(request.getParameter("name")); %>
						<%if(dest == null){ %>
							<%request.getRequestDispatcher("AllDestinations.jsp").forward(request, response); %>
							
						<%} %>
				<div class="row widget">
					<div class="col-xs-12">	
							<h4><%out.println(request.getParameter("name")); %></h4>					
						
					</div>
				</div>
				<div class="row widget">
					<div class="col-xs-12">						
						<p><img src="DestinationPictureServlet?destination=<%=request.getParameter("name") %>" height="150" width="150" alt=""></p>
					</div>
				</div>
				<div class="row widget">
					<div class="col-xs-12">						
						<a class="btn" href="Comment.jsp?name=<%=dest.getName()%>">Add Comment</a>
					</div>
				</div>
				

			</aside>
			
			<!-- /Sidebar -->

			<!-- Article main content -->
			<article class="col-md-8 maincontent">
				<header class="page-header">
					<h1 class="page-title">Description</h1>
				</header>
					<h4><%out.print(dest.getDescription()); %></h4>
					
			</article>
				<%if(dest.getComments().size()>0){ %>
				<article class="col-md-8 maincontent">
					<header class="page-header">
						<h1 class="page-title">Comments</h1>
					</header>
						<table>
							<tr>	
								<%for(Comment comment : dest.getComments()){ %>				
										<td>
										<% User user = UsersManager.getInstance().getUserFromCache(comment.getAuthorEmail()); %>
											<h6><%= (user.getFirstName()+ " " + user.getLastName()) %></h6>
											<img src="PictureServlet?user=<%= user.getEmail()%>" height="60" width="60"/>
										</td>
										<td>
											<p><%=comment.getText() %></p>
										</td>
									</tr>
									<tr>
								<%} %>
							</tr>
						</table>
					
				</article>
				<%} %>
				
				<article class="col-md-8 maincontent">
					<br>
					
				</article>
			<!-- /Article -->

		</div>
		
		<div id="map" style="width:100% height:100%"></div>
		<%} %>
	</div>	<!-- /container -->
	
	

	<footer id="footer" class="top-space">

        <div class="footer1">
            <div class="container">
                <div class="row">
                    
                    <div class="col-md-3 widget">
                        <h3 class="widget-title">Contact</h3>
                        <div class="widget-body">
                            <p><br>
                                <a href="mailto:#">thetravellerbulgaria@gmail.com</a><br>
                                <br>
                                Infinity Tower, Sofia City, Bulgaria
                            </p>    
                        </div>
                    </div>

                    <div class="col-md-3 widget">
                        <h3 class="widget-title">Follow us</h3>
                        <div class="widget-body">
                            <p class="follow-me-icons">
                                <a href=""><i class="fa fa-twitter fa-2"></i></a>
                                <a href=""><i class="fa fa-dribbble fa-2"></i></a>
                                <a href=""><i class="fa fa-github fa-2"></i></a>
                                <a href="https://www.facebook.com/TheTravellerBulgaria/"><i class="fa fa-facebook fa-2"></i></a>
                            </p>    
                        </div>
                    </div>

                    <div class="col-md-6 widget">
                        <h3 class="widget-title">Our motto</h3>
                        <div class="widget-body">
                            <p>"The whole object of travel is not to set foot on foreign land; it is to set foot on one's own country as on a foreign land." - G.K. Chesterton</p>
                            <p>So keep moving! But don't forget to take time to stop and smell the roses!</p>
                        </div>
                    </div>

                </div> <!-- /row of widgets -->
            </div>
        </div>

        <div class="footer2">
            <div class="container">
                <div class="row">
                    
                    <div class="col-md-6 widget">
                        <div class="widget-body">
                            <p class="simplenav">
                                <a href="#">Home</a> | 
                                <a href="SectionUnderConstructionPage.html">About</a> |
                                <a href="SectionUnderConstructionPage.html">Sidebar</a> |
                                <a href="SectionUnderConstructionPage.html">Contact</a> |
                                <b><a href="signup.html">Sign up</a></b>
                            </p>
                        </div>
                    </div>

                    <div class="col-md-6 widget">
                        <div class="widget-body">
                            <p class="text-right">
                                Copyright &copy; 2016, The Traveler Bulgaria. Designed by David & Yasen</a> 
                            </p>
                        </div>
                    </div>

                </div> <!-- /row of widgets -->
            </div>
        </div>

    </footer>
		




	<!-- JavaScript libs are placed at the end of the document so the pages load faster -->
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
	<script src="assets/js/headroom.min.js"></script>
	<script src="assets/js/jQuery.headroom.min.js"></script>
	<script src="assets/js/template.js"></script>
	
	<script>
		function myMap() {
			<%if (request.getParameter("name") != null){ %>
			var myCenter = new google.maps.LatLng(<%= dest.getLocation().getLattitude()%>,<%= dest.getLocation().getLongitude()%>);
			  var mapCanvas = document.getElementById("map");
			  var mapOptions = {
				  	center: myCenter, zoom: 7,
				    panControl: true,
				    zoomControl: true,
				    mapTypeControl: true,
				    scaleControl: true,
				    streetViewControl: true,
				    overviewMapControl: true,
				    rotateControl: true
				}
			  
			  var map = new google.maps.Map(mapCanvas, mapOptions);
			  var marker = new google.maps.Marker({position:myCenter});
			  marker.setMap(map);
			 <%}%>
		}
	</script>
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBQKyIgPewrgRCgagA1sDItFSRZh5hZlL4&callback=myMap"></script>
	
</body>
</html>