<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OOPS!!!</title>
</head>
<body>
<form class="form-signin" action="index.jsp">  
    <img class="make-it-fit" src="pictures\error.jpg">
    <button type="submit" style="height:80px;width:300px" class="button1">Go to Home Page</button>
    <style>
		.imagewrap {display:inline-block;position:relative;}
		.button1 {
	           	position:absolute;bottom:22%;left:15%;
			    -moz-box-shadow: 3px 4px 0px 0px #899599;
			    -webkit-box-shadow: 3px 4px 0px 0px #899599;
			    box-shadow: 3px 4px 0px 0px #899599;
			    background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #ededed), color-stop(1, #bab1ba));
			    background:-moz-linear-gradient(top, #ededed 5%, #bab1ba 100%);
			    background:-webkit-linear-gradient(top, #ededed 5%, #bab1ba 100%);
			    background:-o-linear-gradient(top, #ededed 5%, #bab1ba 100%);
			    background:-ms-linear-gradient(top, #ededed 5%, #bab1ba 100%);
			    background:linear-gradient(to bottom, #ededed 5%, #bab1ba 100%);
			    filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#ededed', endColorstr='#bab1ba',GradientType=0);
			    background-color:#ededed;
			    -moz-border-radius:15px;
			    -webkit-border-radius:15px;
			    border-radius:15px;
			    border:1px solid #d6bcd6;
			    display:inline-block;
			    cursor:pointer;
			    color:#3a8a9e;
			    font-family:Arial;
			    font-size:25px;
			    padding:7px 25px;
			    text-decoration:none;
			    text-shadow:0px 1px 0px #e1e2ed;
         }
         .button1:hover {
			    background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #bab1ba), color-stop(1, #ededed));
			    background:-moz-linear-gradient(top, #bab1ba 5%, #ededed 100%);
			    background:-webkit-linear-gradient(top, #bab1ba 5%, #ededed 100%);
			    background:-o-linear-gradient(top, #bab1ba 5%, #ededed 100%);
			    background:-ms-linear-gradient(top, #bab1ba 5%, #ededed 100%);
			    background:linear-gradient(to bottom, #bab1ba 5%, #ededed 100%);
			    filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#bab1ba', endColorstr='#ededed',GradientType=0);
			    background-color:#bab1ba;
          }

		div.fill-screen {
			    position: fixed;
			    left: 0;
			    right: 0;
			    top: 0;
			    bottom: 0;
			    text-align: center;
		}

        img.make-it-fit {
			    max-width: 105%;
			    max-height: 105%;
        }	
    </style>
  </form>
</body>
</html>