<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<html>
<head>

<meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
	
	<link href="css/bootstrap.min.css" rel="stylesheet">
   	<link href="css/sidebar.css" rel="stylesheet">
   	<link rel="stylesheet" href="css/style.css">
   	
</head>
<body>
<div id="wrapper">
		<style>
			.sidebar_menu:first-Child{
				margin-top:35px;
				padding-top:0px;
			}
			
			.sidebar_menu > li:first-Child{
				padding-top:5px;
			}
			
			.sidebar_menu{
				margin-top: 25px;
				
				display: inline-block;
				padding-left: 10px;
				font-size: 20px;
				font-weight:400;
				width:100%;
			}
			
			.sub_menu{
				display: inline-block;
				padding-left: 20px;
				list-style:none;
				width:100%;
				font-size:16px;
				line-height: 30px;
			}
			
			#miniCal{
					margin-top:5px;
				    text-indent: 0px;
				    line-height: 12px;
				}
				
			.sidebar-nav .glyphicon{
				color:white;
			}
		</style>
        <!-- Sidebar -->
        <div id="sidebar-wrapper" class="scrollable">
            <ul class="sidebar-nav">
            	<ul class="sidebar_menu">
                   <span class="glyphicon glyphicon-dashboard" aria-hidden="true"></span>
                   <a href="dashboard.jsp">Dashboard</a>
                </ul>
                <ul class="sidebar_menu">
                    <span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span>
                    <a href="#">Kalender</a>
                    
                    
                    	<jsp:include page="miniCal.html"></jsp:include>
                    
                    
                </ul>
                <ul class="sidebar_menu">
                    <span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span>
                    <a href="#">Termine</a>
	                <li class="sub_menu">
	                    <a href="#">Übersicht</a>
	                </li>
	                <li class="sub_menu">
	                    <a href="#">Termin planen</a>
	                </li>
                </ul>
                <ul class="sidebar_menu">
                    <span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span>
                    <a href="#">Firmen</a>
	                <li class="sub_menu">
	                    <a href="#">Firmenübersicht</a>
	                </li>
	                <li class="sub_menu">
	                    <a href="#">Ansprechpartner</a>
	                </li>
	            </ul>
                <ul class="sidebar_menu">
                    <span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span>
                    <a href="#">Profil</a>
	                    
	                <li class="sub_menu">
	                    <a href="#">Mein Profil</a>
	                </li>
	                <li class="sub_menu">
	                    <a href="#">Passwort zurücksetzen</a>
	                </li>
           		</ul>
        </div>
        <!-- /#sidebar-wrapper -->

        <!-- Page Content -->
        <div id="page-content-wrapper">
        	<div class="container-fluid">
        		<a href="#menu-toggle" class="" id="menu-toggle"><span class="glyphicon glyphicon-menu-hamburger" aria-hidden="true"></span></a>
        	</div>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12" style="margin-top:30px;">
                        

</html>