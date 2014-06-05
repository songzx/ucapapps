<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
	<meta charset="utf-8" />
	<title>Metronic | UI Features - General</title>
	<meta content="width=device-width, initial-scale=1.0" name="viewport" />
	<meta content="" name="description" />
	<meta content="" name="author" />
	<!-- BEGIN GLOBAL MANDATORY STYLES -->
	<link href="media/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
	<link href="media/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
	<link href="media/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
	<link href="media/css/style-metro.css" rel="stylesheet" type="text/css"/>
	<link href="media/css/style.css" rel="stylesheet" type="text/css"/>
	<link href="media/css/style-responsive.css" rel="stylesheet" type="text/css"/>
	<link href="media/css/default.css" rel="stylesheet" type="text/css" id="style_color"/>
	<link href="media/css/uniform.default.css" rel="stylesheet" type="text/css"/>
	<!-- END GLOBAL MANDATORY STYLES -->
	<!-- BEGIN PAGE LEVEL STYLES -->
	<link href="media/css/jquery.gritter.css" rel="stylesheet" type="text/css"/>
	<!-- END PAGE LEVEL STYLES -->
	<link rel="shortcut icon" href="media/image/favicon.ico" />
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed">
	<!-- BEGIN HEADER -->
	<div class="header navbar navbar-inverse navbar-fixed-top">
		<!-- BEGIN TOP NAVIGATION BAR -->
		<div class="navbar-inner">
			<div class="container-fluid">
				<!-- BEGIN LOGO -->
				<a class="brand" href="index.html">
				<img src="media/image/logo.png" alt="logo" />
				</a>
				<!-- END LOGO -->
				<!-- BEGIN RESPONSIVE MENU TOGGLER -->
				<a href="javascript:;" class="btn-navbar collapsed" data-toggle="collapse" data-target=".nav-collapse">
				<img src="media/image/menu-toggler.png" alt="" />
				</a>          
				<!-- END RESPONSIVE MENU TOGGLER -->            
				<!-- BEGIN TOP NAVIGATION MENU -->              
				<ul class="nav pull-right">
					<!-- BEGIN NOTIFICATION DROPDOWN -->   
					<li class="dropdown" id="header_notification_bar">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						<i class="icon-warning-sign"></i>
						<span class="badge">6</span>
						</a>
						<ul class="dropdown-menu extended notification">
							<li>
								<p>You have 14 new notifications</p>
							</li>
							<li>
								<a href="#">
								<span class="label label-success"><i class="icon-plus"></i></span>
								New user registered. 
								<span class="time">Just now</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-important"><i class="icon-bolt"></i></span>
								Server #12 overloaded. 
								<span class="time">15 mins</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-warning"><i class="icon-bell"></i></span>
								Server #2 not respoding.
								<span class="time">22 mins</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-info"><i class="icon-bullhorn"></i></span>
								Application error.
								<span class="time">40 mins</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-important"><i class="icon-bolt"></i></span>
								Database overloaded 68%. 
								<span class="time">2 hrs</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-important"><i class="icon-bolt"></i></span>
								2 user IP blocked.
								<span class="time">5 hrs</span>
								</a>
							</li>
							<li class="external">
								<a href="#">See all notifications <i class="m-icon-swapright"></i></a>
							</li>
						</ul>
					</li>
					<!-- END NOTIFICATION DROPDOWN -->
					<!-- BEGIN INBOX DROPDOWN -->
					<li class="dropdown" id="header_inbox_bar">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						<i class="icon-envelope"></i>
						<span class="badge">5</span>
						</a>
						<ul class="dropdown-menu extended inbox">
							<li>
								<p>You have 12 new messages</p>
							</li>
							<li>
								<a href="inbox.html?a=view">
								<span class="photo"><img src="media/image/avatar2.jpg" alt="" /></span>
								<span class="subject">
								<span class="from">Lisa Wong</span>
								<span class="time">Just Now</span>
								</span>
								<span class="message">
								Vivamus sed auctor nibh congue nibh. auctor nibh
								auctor nibh...
								</span>  
								</a>
							</li>
							<li>
								<a href="inbox.html?a=view">
								<span class="photo"><img src="media/image/avatar3.jpg" alt="" /></span>
								<span class="subject">
								<span class="from">Richard Doe</span>
								<span class="time">16 mins</span>
								</span>
								<span class="message">
								Vivamus sed congue nibh auctor nibh congue nibh. auctor nibh
								auctor nibh...
								</span>  
								</a>
							</li>
							<li>
								<a href="inbox.html?a=view">
								<span class="photo"><img src="media/image/avatar1.jpg" alt="" /></span>
								<span class="subject">
								<span class="from">Bob Nilson</span>
								<span class="time">2 hrs</span>
								</span>
								<span class="message">
								Vivamus sed nibh auctor nibh congue nibh. auctor nibh
								auctor nibh...
								</span>  
								</a>
							</li>
							<li class="external">
								<a href="inbox.html">See all messages <i class="m-icon-swapright"></i></a>
							</li>
						</ul>
					</li>
					<!-- END INBOX DROPDOWN -->
					<!-- BEGIN TODO DROPDOWN -->
					<li class="dropdown" id="header_task_bar">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						<i class="icon-tasks"></i>
						<span class="badge">5</span>
						</a>
						<ul class="dropdown-menu extended tasks">
							<li>
								<p>You have 12 pending tasks</p>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">New release v1.2</span>
								<span class="percent">30%</span>
								</span>
								<span class="progress progress-success ">
								<span style="width: 30%;" class="bar"></span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">Application deployment</span>
								<span class="percent">65%</span>
								</span>
								<span class="progress progress-danger progress-striped active">
								<span style="width: 65%;" class="bar"></span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">Mobile app release</span>
								<span class="percent">98%</span>
								</span>
								<span class="progress progress-success">
								<span style="width: 98%;" class="bar"></span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">Database migration</span>
								<span class="percent">10%</span>
								</span>
								<span class="progress progress-warning progress-striped">
								<span style="width: 10%;" class="bar"></span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">Web server upgrade</span>
								<span class="percent">58%</span>
								</span>
								<span class="progress progress-info">
								<span style="width: 58%;" class="bar"></span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">Mobile development</span>
								<span class="percent">85%</span>
								</span>
								<span class="progress progress-success">
								<span style="width: 85%;" class="bar"></span>
								</span>
								</a>
							</li>
							<li class="external">
								<a href="#">See all tasks <i class="m-icon-swapright"></i></a>
							</li>
						</ul>
					</li>
					<!-- END TODO DROPDOWN -->
					<!-- BEGIN USER LOGIN DROPDOWN -->
					<li class="dropdown user">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						<img alt="" src="media/image/avatar1_small.jpg" />
						<span class="username">Bob Nilson</span>
						<i class="icon-angle-down"></i>
						</a>
						<ul class="dropdown-menu">
							<li><a href="extra_profile.html"><i class="icon-user"></i> My Profile</a></li>
							<li><a href="page_calendar.html"><i class="icon-calendar"></i> My Calendar</a></li>
							<li><a href="inbox.html"><i class="icon-envelope"></i> My Inbox(3)</a></li>
							<li><a href="#"><i class="icon-tasks"></i> My Tasks</a></li>
							<li class="divider"></li>
							<li><a href="extra_lock.html"><i class="icon-lock"></i> Lock Screen</a></li>
							<li><a href="login.html"><i class="icon-key"></i> Log Out</a></li>
						</ul>
					</li>
					<!-- END USER LOGIN DROPDOWN -->
				</ul>
				<!-- END TOP NAVIGATION MENU --> 
			</div>
		</div>
		<!-- END TOP NAVIGATION BAR -->
	</div>
	<!-- END HEADER -->
	<!-- BEGIN CONTAINER -->
	<div class="page-container row-fluid">
		<!-- BEGIN SIDEBAR -->
		<div class="page-sidebar nav-collapse collapse">
			<!-- BEGIN SIDEBAR MENU -->        
			<ul class="page-sidebar-menu">
				<li>
					<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
					<div class="sidebar-toggler hidden-phone"></div>
					<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
				</li>
				<li>
					<!-- BEGIN RESPONSIVE QUICK SEARCH FORM -->
					<form class="sidebar-search">
						<div class="input-box">
							<a href="javascript:;" class="remove"></a>
							<input type="text" placeholder="Search..." />
							<input type="button" class="submit" value=" " />
						</div>
					</form>
					<!-- END RESPONSIVE QUICK SEARCH FORM -->
				</li>
				<li class="start ">
					<a href="index.html">
					<i class="icon-home"></i> 
					<span class="title">Dashboard</span>
					</a>
				</li>
				<li class="">
					<a href="javascript:;">
					<i class="icon-cogs"></i> 
					<span class="title">Layouts</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li >
							<a href="layout_horizontal_sidebar_menu.html">
							Horzontal & Sidebar Menu</a>
						</li>
						<li >
							<a href="layout_horizontal_menu1.html">
							Horzontal Menu 1</a>
						</li>
						<li >
							<a href="layout_horizontal_menu2.html">
							Horzontal Menu 2</a>
						</li>
						<li >
							<a href="layout_promo.html">
							Promo Page</a>
						</li>
						<li >
							<a href="layout_email.html">
							Email Templates</a>
						</li>
						<li >
							<a href="layout_ajax.html">
							Content Loading via Ajax</a>
						</li>
						<li >
							<a href="layout_sidebar_closed.html">
							Sidebar Closed Page</a>
						</li>
						<li >
							<a href="layout_blank_page.html">
							Blank Page</a>
						</li>
						<li >
							<a href="layout_boxed_page.html">
							Boxed Page</a>
						</li>
						<li >
							<a href="layout_boxed_not_responsive.html">
							Non-Responsive Boxed Layout</a>
						</li>
					</ul>
				</li>
				<li class="active ">
					<a href="javascript:;">
					<i class="icon-bookmark-empty"></i> 
					<span class="title">UI Features</span>
					<span class="selected"></span>
					<span class="arrow open"></span>
					</a>
					<ul class="sub-menu">
						<li class="active">
							<a href="ui_general.html">
							General</a>
						</li>
						<li >
							<a href="ui_buttons.html">
							Buttons</a>
						</li>
						<li >
							<a href="ui_modals.html">
							Enhanced Modals</a>
						</li>
						<li >
							<a href="ui_tabs_accordions.html">
							Tabs & Accordions</a>
						</li>
						<li >
							<a href="ui_jqueryui.html">
							jQuery UI Components</a>
						</li>
						<li >
							<a href="ui_sliders.html">
							Sliders</a>
						</li>
						<li >
							<a href="ui_tiles.html">
							Tiles</a>
						</li>
						<li >
							<a href="ui_typography.html">
							Typography</a>
						</li>
						<li >
							<a href="ui_tree.html">
							Tree View</a>
						</li>
						<li >
							<a href="ui_nestable.html">
							Nestable List</a>
						</li>
					</ul>
				</li>
				<li class="">
					<a href="javascript:;">
					<i class="icon-table"></i> 
					<span class="title">Form Stuff</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li >
							<a href="form_layout.html">
							Form Layouts</a>
						</li>
						<li >
							<a href="form_samples.html">
							Advance Form Samples</a>
						</li>
						<li >
							<a href="form_component.html">
							Form Components</a>
						</li>
						<li >
							<a href="form_wizard.html">
							Form Wizard</a>
						</li>
						<li >
							<a href="form_validation.html">
							Form Validation</a>
						</li>
						<li >
							<a href="form_fileupload.html">
							Multiple File Upload</a>
						</li>
						<li >
							<a href="form_dropzone.html">
							Dropzone File Upload</a>
						</li>
					</ul>
				</li>
				<li class="">
					<a href="javascript:;">
					<i class="icon-briefcase"></i> 
					<span class="title">Pages</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li >
							<a href="page_timeline.html">
							<i class="icon-time"></i>
							Timeline</a>
						</li>
						<li >
							<a href="page_coming_soon.html">
							<i class="icon-cogs"></i>
							Coming Soon</a>
						</li>
						<li >
							<a href="page_blog.html">
							<i class="icon-comments"></i>
							Blog</a>
						</li>
						<li >
							<a href="page_blog_item.html">
							<i class="icon-font"></i>
							Blog Post</a>
						</li>
						<li >
							<a href="page_news.html">
							<i class="icon-coffee"></i>
							News</a>
						</li>
						<li >
							<a href="page_news_item.html">
							<i class="icon-bell"></i>
							News View</a>
						</li>
						<li >
							<a href="page_about.html">
							<i class="icon-group"></i>
							About Us</a>
						</li>
						<li >
							<a href="page_contact.html">
							<i class="icon-envelope-alt"></i>
							Contact Us</a>
						</li>
						<li >
							<a href="page_calendar.html">
							<i class="icon-calendar"></i>
							Calendar</a>
						</li>
					</ul>
				</li>
				<li class="">
					<a href="javascript:;">
					<i class="icon-gift"></i> 
					<span class="title">Extra</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li >
							<a href="extra_profile.html">
							User Profile</a>
						</li>
						<li >
							<a href="extra_lock.html">
							Lock Screen</a>
						</li>
						<li >
							<a href="extra_faq.html">
							FAQ</a>
						</li>
						<li >
							<a href="inbox.html">
							Inbox</a>
						</li>
						<li >
							<a href="extra_search.html">
							Search Results</a>
						</li>
						<li >
							<a href="extra_invoice.html">
							Invoice</a>
						</li>
						<li >
							<a href="extra_pricing_table.html">
							Pricing Tables</a>
						</li>
						<li >
							<a href="extra_image_manager.html">
							Image Manager</a>
						</li>
						<li >
							<a href="extra_404_option1.html">
							404 Page Option 1</a>
						</li>
						<li >
							<a href="extra_404_option2.html">
							404 Page Option 2</a>
						</li>
						<li >
							<a href="extra_404_option3.html">
							404 Page Option 3</a>
						</li>
						<li >
							<a href="extra_500_option1.html">
							500 Page Option 1</a>
						</li>
						<li >
							<a href="extra_500_option2.html">
							500 Page Option 2</a>
						</li>
					</ul>
				</li>
				<li>
					<a class="active" href="javascript:;">
					<i class="icon-sitemap"></i> 
					<span class="title">3 Level Menu</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="javascript:;">
							Item 1
							<span class="arrow"></span>
							</a>
							<ul class="sub-menu">
								<li><a href="#">Sample Link 1</a></li>
								<li><a href="#">Sample Link 2</a></li>
								<li><a href="#">Sample Link 3</a></li>
							</ul>
						</li>
						<li>
							<a href="javascript:;">
							Item 1
							<span class="arrow"></span>
							</a>
							<ul class="sub-menu">
								<li><a href="#">Sample Link 1</a></li>
								<li><a href="#">Sample Link 1</a></li>
								<li><a href="#">Sample Link 1</a></li>
							</ul>
						</li>
						<li>
							<a href="#">
							Item 3
							</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="javascript:;">
					<i class="icon-folder-open"></i> 
					<span class="title">4 Level Menu</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="javascript:;">
							<i class="icon-cogs"></i> 
							Item 1
							<span class="arrow"></span>
							</a>
							<ul class="sub-menu">
								<li>
									<a href="javascript:;">
									<i class="icon-user"></i>
									Sample Link 1
									<span class="arrow"></span>
									</a>
									<ul class="sub-menu">
										<li><a href="#"><i class="icon-remove"></i> Sample Link 1</a></li>
										<li><a href="#"><i class="icon-pencil"></i> Sample Link 1</a></li>
										<li><a href="#"><i class="icon-edit"></i> Sample Link 1</a></li>
									</ul>
								</li>
								<li><a href="#"><i class="icon-user"></i>  Sample Link 1</a></li>
								<li><a href="#"><i class="icon-external-link"></i>  Sample Link 2</a></li>
								<li><a href="#"><i class="icon-bell"></i>  Sample Link 3</a></li>
							</ul>
						</li>
						<li>
							<a href="javascript:;">
							<i class="icon-globe"></i> 
							Item 2
							<span class="arrow"></span>
							</a>
							<ul class="sub-menu">
								<li><a href="#"><i class="icon-user"></i>  Sample Link 1</a></li>
								<li><a href="#"><i class="icon-external-link"></i>  Sample Link 1</a></li>
								<li><a href="#"><i class="icon-bell"></i>  Sample Link 1</a></li>
							</ul>
						</li>
						<li>
							<a href="#">
							<i class="icon-folder-open"></i>
							Item 3
							</a>
						</li>
					</ul>
				</li>
				<li class="">
					<a href="javascript:;">
					<i class="icon-user"></i> 
					<span class="title">Login Options</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li >
							<a href="login.html">
							Login Form 1</a>
						</li>
						<li >
							<a href="login_soft.html">
							Login Form 2</a>
						</li>
					</ul>
				</li>
				<li class="">
					<a href="javascript:;">
					<i class="icon-th"></i> 
					<span class="title">Data Tables</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li >
							<a href="table_basic.html">
							Basic Tables</a>
						</li>
						<li >
							<a href="table_responsive.html">
							Responsive Tables</a>
						</li>
						<li >
							<a href="table_managed.html">
							Managed Tables</a>
						</li>
						<li >
							<a href="table_editable.html">
							Editable Tables</a>
						</li>
						<li >
							<a href="table_advanced.html">
							Advanced Tables</a>
						</li>
					</ul>
				</li>
				<li class="">
					<a href="javascript:;">
					<i class="icon-file-text"></i> 
					<span class="title">Portlets</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li >
							<a href="portlet_general.html">
							General Portlets</a>
						</li>
						<li >
							<a href="portlet_draggable.html">
							Draggable Portlets</a>
						</li>
					</ul>
				</li>
				<li class="">
					<a href="javascript:;">
					<i class="icon-map-marker"></i> 
					<span class="title">Maps</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li >
							<a href="maps_google.html">
							Google Maps</a>
						</li>
						<li >
							<a href="maps_vector.html">
							Vector Maps</a>
						</li>
					</ul>
				</li>
				<li class="last ">
					<a href="charts.html">
					<i class="icon-bar-chart"></i> 
					<span class="title">Visual Charts</span>
					</a>
				</li>
			</ul>
			<!-- END SIDEBAR MENU -->
		</div>
		<!-- END SIDEBAR -->
		<!-- BEGIN PAGE -->
		<div class="page-content">
			<!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
			<div id="portlet-config" class="modal hide">
				<div class="modal-header">
					<button data-dismiss="modal" class="close" type="button"></button>
					<h3>Widget Settings</h3>
				</div>
				<div class="modal-body">
					<p>Here will be a configuration form</p>
				</div>
			</div>
			<!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->
			<div class="container-fluid">
				<!-- BEGIN PAGE HEADER-->
				<div class="row-fluid">
					<div class="span12">
						<!-- BEGIN STYLE CUSTOMIZER -->
						<div class="color-panel hidden-phone">
							<div class="color-mode-icons icon-color"></div>
							<div class="color-mode-icons icon-color-close"></div>
							<div class="color-mode">
								<p>THEME COLOR</p>
								<ul class="inline">
									<li class="color-black current color-default" data-style="default"></li>
									<li class="color-blue" data-style="blue"></li>
									<li class="color-brown" data-style="brown"></li>
									<li class="color-purple" data-style="purple"></li>
									<li class="color-grey" data-style="grey"></li>
									<li class="color-white color-light" data-style="light"></li>
								</ul>
								<label>
									<span>Layout</span>
									<select class="layout-option m-wrap small">
										<option value="fluid" selected>Fluid</option>
										<option value="boxed">Boxed</option>
									</select>
								</label>
								<label>
									<span>Header</span>
									<select class="header-option m-wrap small">
										<option value="fixed" selected>Fixed</option>
										<option value="default">Default</option>
									</select>
								</label>
								<label>
									<span>Sidebar</span>
									<select class="sidebar-option m-wrap small">
										<option value="fixed">Fixed</option>
										<option value="default" selected>Default</option>
									</select>
								</label>
								<label>
									<span>Footer</span>
									<select class="footer-option m-wrap small">
										<option value="fixed">Fixed</option>
										<option value="default" selected>Default</option>
									</select>
								</label>
							</div>
						</div>
						<!-- END BEGIN STYLE CUSTOMIZER -->             
						<!-- BEGIN PAGE TITLE & BREADCRUMB-->
						<h3 class="page-title">
							General <small>general ui components</small>
						</h3>
						<ul class="breadcrumb">
							<li>
								<i class="icon-home"></i>
								<a href="index.html">Home</a> 
								<i class="icon-angle-right"></i>
							</li>
							<li>
								<a href="#">UI Features</a>
								<i class="icon-angle-right"></i>
							</li>
							<li><a href="#">General</a></li>
						</ul>
						<!-- END PAGE TITLE & BREADCRUMB-->
					</div>
				</div>
				<!-- END PAGE HEADER-->
				<!-- BEGIN PAGE CONTENT-->
				<div class="row-fluid">
					<div class="span12">
						<!-- BEGIN ALERTS PORTLET-->
						<div class="portlet ">
							<div class="portlet-title">
								<div class="caption"><i class="icon-cogs"></i>Alerts</div>
								<div class="tools">
									<a href="javascript:;" class="collapse"></a>
									<a href="#portlet-config" data-toggle="modal" class="config"></a>
									<a href="javascript:;" class="reload"></a>
									<a href="javascript:;" class="remove"></a>
								</div>
							</div>
							<div class="portlet-body">
								<div class="alert">
									<button class="close" data-dismiss="alert"></button>
									<strong>Warning!</strong> Your monthly traffic is reaching limit.
								</div>
								<div class="alert alert-success">
									<button class="close" data-dismiss="alert"></button>
									<strong>Success!</strong> The page has been added.
								</div>
								<div class="alert alert-info">
									<button class="close" data-dismiss="alert"></button>
									<strong>Info!</strong> You have 198 unread messages.
								</div>
								<div class="alert alert-error">
									<button class="close" data-dismiss="alert"></button>
									<strong>Error!</strong> The daily cronjob has failed.
								</div>
							</div>
						</div>
						<!-- END ALERTS PORTLET-->
					</div>
				</div>
				<div class="row-fluid">
					<div class="span6">
						<!-- BEGIN INLINE NOTIFICATIONS PORTLET-->
						<div class="portlet box blue">
							<div class="portlet-title">
								<div class="caption"><i class="icon-cogs"></i>Inline Notifications</div>
								<div class="tools">
									<a href="javascript:;" class="collapse"></a>
									<a href="#portlet-config" data-toggle="modal" class="config"></a>
									<a href="javascript:;" class="reload hidden-phone"></a>
									<a href="javascript:;" class="remove hidden-phone"></a>
								</div>
							</div>
							<div class="portlet-body">
								<div class="alert alert-block alert-error fade in">
									<button type="button" class="close" data-dismiss="alert"></button>
									<h4 class="alert-heading">Error!</h4>
									<p>
										Duis mollis, est non commodo luctus, 
										nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum.
									</p>
									<p>
										<a class="btn red" href="#">Do this</a> <a class="btn blue" href="#">Or do this</a>
									</p>
								</div>
								<div class="alert alert-block alert-success fade in">
									<button type="button" class="close" data-dismiss="alert"></button>
									<h4 class="alert-heading">Success!</h4>
									<p>
										Duis mollis, est non commodo luctus, 
										nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum.
									</p>
									<p>
										<a class="btn green" href="#">Do this</a> <a class="btn black" href="#">Or do this</a>
									</p>
								</div>
								<div class="alert alert-block alert-info fade in">
									<button type="button" class="close" data-dismiss="alert"></button>
									<h4 class="alert-heading">Info!</h4>
									<p>
										Duis mollis, est non commodo luctus, 
										nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum.
									</p>
									<p>
										<a class="btn purple" href="#">Do this</a> <a class="btn black" href="#">Or do this</a>
									</p>
								</div>
								<div class="alert alert-block alert-warning fade in">
									<button type="button" class="close" data-dismiss="alert"></button>
									<h4 class="alert-heading">Warning!</h4>
									<p>
										Duis mollis, est non commodo luctus, 
										nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum.
									</p>
									<p>
										<a class="btn red" href="#">Do this</a> <a class="btn blue" href="#">Or do this</a>
									</p>
								</div>
							</div>
						</div>
						<!-- END INLINE NOTIFICATIONS PORTLET-->
						<!-- BEGIN GRITTER NOTIFICATIONS PORTLET-->
						<div class="portlet box green">
							<div class="portlet-title">
								<div class="caption"><i class="icon-cogs"></i>Gritter Notifications</div>
								<div class="tools">
									<a href="javascript:;" class="collapse"></a>
									<a href="#portlet-config" data-toggle="modal" class="config"></a>
									<a href="javascript:;" class="reload hidden-phone"></a>
									<a href="javascript:;" class="remove hidden-phone"></a>
								</div>
							</div>
							<div class="portlet-body">
								<h5>Click on below buttons to check it out.</h5>
								<p>   
									<a href="javascript:;" class="btn " id="gritter-regular">Regular</a>
									<a href="javascript:;" class="btn green" id="gritter-sticky">Sticky</a>
									<a href="javascript:;" class="btn blue" id="gritter-without-image">Imageless</a>
								</p>
								<p>
									<a href="javascript:;" class="btn purple" id="gritter-light">Light</a>
									<a href="javascript:;" class="btn black" id="gritter-max">Max of 3</a>
									<a href="javascript:;" class="btn blue" id="gritter-remove-all">Remove all</a>
								</p>
							</div>
						</div>
						<!-- END GRITTER NOTIFICATIONS PORTLET-->
						<!-- BEGIN PULSATE PORTLET-->
						<div class="portlet box grey">
							<div class="portlet-title">
								<div class="caption"><i class="icon-cogs"></i>Pulsate</div>
								<div class="tools">
									<a href="javascript:;" class="collapse"></a>
									<a href="#portlet-config" data-toggle="modal" class="config"></a>
									<a href="javascript:;" class="reload"></a>
									<a href="javascript:;" class="remove"></a>
								</div>
							</div>
							<div class="portlet-body">
								<h5>Pulsate any page elements.</h5>
								<div id="pulsate-regular" style="padding:5px;">
									Repeating Pulsate
								</div>
								<div class="space20"></div>
								<button class="btn green" id="pulsate-once">Pulsate Once</button>
								<button class="btn red" id="pulsate-crazy">Crazy Pulsate :)</button>
								<div class="space10"></div>
								<span class="label label-important">NOTE!</span>
								<span>
								Pulsate is
								supported in Latest Firefox, Chrome, Opera, 
								Safari and Internet Explorer 9 and Internet Explorer 10 only.
								</span>
							</div>
						</div>
						<!-- END PULSATE PORTLET-->
						<!-- BEGIN MODAL DIALOG PORTLET-->
						<div class="portlet box purple">
							<div class="portlet-title">
								<div class="caption"><i class="icon-cogs"></i>Modal Dialogs</div>
								<div class="tools">
									<a href="javascript:;" class="collapse"></a>
									<a href="#portlet-config" data-toggle="modal" class="config"></a>
									<a href="javascript:;" class="reload"></a>
									<a href="javascript:;" class="remove"></a>
								</div>
							</div>
							<div class="portlet-body">
								<h5>Click on below buttons to check it out.</h5>
								<!-- Button to trigger modal -->
								<a href="#myModal1" role="button" class="btn btn-primary" data-toggle="modal">Modal Dialog</a>
								<a href="#myModal2" role="button" class="btn btn-danger" data-toggle="modal">Alert</a>
								<a href="#myModal3" role="button" class="btn btn-warning" data-toggle="modal">Confirm</a>
								<!-- Modal -->
								<div id="myModal1" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel1" aria-hidden="true">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
										<h3 id="myModalLabel1">Modal Header</h3>
									</div>
									<div class="modal-body">
										<p>Body goes here...</p>
									</div>
									<div class="modal-footer">
										<button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
										<button class="btn yellow">Save</button>
									</div>
								</div>
								<div id="myModal2" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel2" aria-hidden="true">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
										<h3 id="myModalLabel2">Alert Header</h3>
									</div>
									<div class="modal-body">
										<p>Body goes here...</p>
									</div>
									<div class="modal-footer">
										<button data-dismiss="modal" class="btn green">OK</button>
									</div>
								</div>
								<div id="myModal3" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel3" aria-hidden="true">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
										<h3 id="myModalLabel3">Confirm Header</h3>
									</div>
									<div class="modal-body">
										<p>Body goes here...</p>
									</div>
									<div class="modal-footer">
										<button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
										<button data-dismiss="modal" class="btn blue">Confirm</button>
									</div>
								</div>
							</div>
						</div>
						<!-- END MODAL DIALOG PORTLET-->
						<!-- BEGIN TOOLTIPS PORTLET-->
						<div class="portlet box red">
							<div class="portlet-title">
								<div class="caption"><i class="icon-cogs"></i>Tooltips</div>
								<div class="tools">
									<a href="javascript:;" class="collapse"></a>
									<a href="#portlet-config" data-toggle="modal" class="config"></a>
									<a href="javascript:;" class="reload"></a>
									<a href="javascript:;" class="remove"></a>
								</div>
							</div>
							<div class="portlet-body">
								<p>
									Tight pants next level keffiyeh 
									<a href="#" class="tooltips" data-original-title="Default tooltip">you probably</a> 
									haven't heard of them. 
									Photo booth beard raw denim letterpress vegan messenger bag stumptown. Farm-to-table seitan, mcsweeney's fixie sustainable quinoa 8-bit american apparel 
									<a href="#" class="tooltips" data-original-title="Another tooltip">have a</a> 
									terry richardson vinyl chambray.
									<a href="#" class="tooltips" title="12" data-original-title="The last tip!">twitter handle</a> 
									freegan cred raw denim single-origin coffee viral.
								</p>
								<p>
									<button class="btn tooltips" data-placement="top" data-original-title="Tooltip in top">Top</button>
									<button class="btn tooltips" data-placement="left" data-original-title="Tooltip in left">Left</button>
									<button class="btn tooltips" data-placement="right" data-original-title="Tooltip in right">Right</button>
									<button class="btn tooltips" data-placement="bottom" data-original-title="Tooltip in bottom">Bottom</button>
								</p>
							</div>
						</div>
						<!-- END TOOLTIPS PORTLET-->
						<!-- BEGIN POPOVERS PORTLET-->
						<div class="portlet box yellow">
							<div class="portlet-title">
								<div class="caption"><i class="icon-cogs"></i>Popovers</div>
								<div class="tools">
									<a href="javascript:;" class="collapse"></a>
									<a href="#portlet-config" data-toggle="modal" class="config"></a>
									<a href="javascript:;" class="reload"></a>
									<a href="javascript:;" class="remove"></a>
								</div>
							</div>
							<div class="portlet-body">
								<p>
									Tight pants next level keffiyeh 
									<a href="javascript:;" class="popovers" data-content="Popover body goes here! Popover body goes here!" data-original-title="Default Popover">trigger me on click</a> haven't heard of them. 
									Photo booth beard raw denim letterpress vegan messenger bag stumptown. Farm-to-table seitan, mcsweeney's fixie sustainable quinoa 8-bit american apparel 
									<a href="javascript:;" class="popovers" data-trigger="hover" data-content="Popover body goes here! Popover body goes here!" data-original-title="Another Popover">trigger me on hover</a> 
									terry richardson vinyl chambray. Beard stumptown, cardigans banh mi lomo thundercats. Tofu biodiesel williamsburg marfa.
								</p>
								<p>
									<button class="btn popovers" id="test" data-trigger="hover" data-placement="top" data-content="Popover body goes here! Popover body goes here!" data-original-title="Popover in top">Top</button>
									<button class="btn popovers" data-trigger="hover" data-placement="left" data-content="Popover body goes here! Popover body goes here!" data-original-title="Popover in left">Left</button>
									<button class="btn popovers" data-trigger="hover" data-placement="right" data-content="Popover body goes here! Popover body goes here!" data-original-title="Popover in right">Right</button>
									<button class="btn popovers" data-trigger="hover" data-placement="bottom" data-content="Popover body goes here! Popover body goes here!" data-original-title="Popover in bottom">Bottom</button>
								</p>
							</div>
						</div>
						<!-- END POPOVERS PORTLET-->
					</div>
					<div class="span6">
						<!-- BEGIN PROGRESS BARS PORTLET-->
						<div class="portlet box green">
							<div class="portlet-title">
								<div class="caption"><i class="icon-cogs"></i>Popovers</div>
								<div class="tools">
									<a href="javascript:;" class="collapse"></a>
									<a href="#portlet-config" data-toggle="modal" class="config"></a>
									<a href="javascript:;" class="reload"></a>
									<a href="javascript:;" class="remove"></a>
								</div>
							</div>
							<div class="portlet-body">
								<div class="alert">
									Progress bars use CSS3 gradients, transitions, and animations to achieve all their effects. These features are not supported in IE7-9 or older versions of Firefox. Versions earlier than Internet Explorer 10 and Opera 12 do not support animations.
								</div>
								<h3>Basic</h3>
								<div class="progress">
									<div style="width: 60%;" class="bar"></div>
								</div>
								<div class="progress progress-success">
									<div style="width: 60%;" class="bar"></div>
								</div>
								<div class="progress progress-warning">
									<div style="width: 60%;" class="bar"></div>
								</div>
								<div class="progress progress-danger">
									<div style="width: 60%;" class="bar"></div>
								</div>
								<h3>Striped</h3>
								<div class="progress progress-striped">
									<div style="width: 60%;" class="bar"></div>
								</div>
								<div class="progress progress-striped progress-success">
									<div style="width: 60%;" class="bar"></div>
								</div>
								<div class="progress progress-striped progress-warning">
									<div style="width: 60%;" class="bar"></div>
								</div>
								<div class="progress progress-striped progress-danger">
									<div style="width: 60%;" class="bar"></div>
								</div>
								<h3>Animated</h3>
								<div class="progress progress-striped active">
									<div style="width: 60%;" class="bar"></div>
								</div>
								<div class="progress progress-striped progress-success active">
									<div style="width: 60%;" class="bar"></div>
								</div>
								<div class="progress progress-striped progress-warning active">
									<div style="width: 60%;" class="bar"></div>
								</div>
								<div class="progress progress-striped progress-danger active">
									<div style="width: 60%;" class="bar"></div>
								</div>
								<h3>Stacked</h3>
								<div class="progress">
									<div class="bar bar-success" style="width: 35%;"></div>
									<div class="bar bar-warning" style="width: 20%;"></div>
									<div class="bar bar-danger" style="width: 10%;"></div>
								</div>
							</div>
						</div>
						<!-- END PROGRESS BARS PORTLET-->
						<!-- BEGIN LABELS AND BADGES PORTLET-->
						<div class="portlet box blue">
							<div class="portlet-title">
								<div class="caption"><i class="icon-cogs"></i>Labels and Badges</div>
								<div class="tools">
									<a href="javascript:;" class="collapse"></a>
									<a href="#portlet-config" data-toggle="modal" class="config"></a>
									<a href="javascript:;" class="reload"></a>
									<a href="javascript:;" class="remove"></a>
								</div>
							</div>
							<div class="portlet-body">
								<table class="table table-bordered table-striped">
									<thead>
										<tr>
											<th>Name</th>
											<th>Labels</th>
											<th>Badges</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>
												Default
											</td>
											<td>
												<span class="badge">1</span>
											</td>
											<td>
												<span class="label">Default</span>
											</td>
										</tr>
										<tr>
											<td>
												Success
											</td>
											<td>
												<span class="badge badge-success">2</span>
											</td>
											<td>
												<span class="label label-success">Success</span>
											</td>
										</tr>
										<tr>
											<td>
												Warning
											</td>
											<td>
												<span class="badge badge-warning">4</span>
											</td>
											<td>
												<span class="label label-warning">Warning</span>
											</td>
										</tr>
										<tr>
											<td>
												Important
											</td>
											<td>
												<span class="badge badge-important">6</span>
											</td>
											<td>
												<span class="label label-important">Important</span>
											</td>
										</tr>
										<tr>
											<td>
												Info
											</td>
											<td>
												<span class="badge badge-info">8</span>
											</td>
											<td>
												<span class="label label-info">Info</span>
											</td>
										</tr>
										<tr>
											<td>
												Inverse
											</td>
											<td>
												<span class="badge badge-inverse">10</span>
											</td>
											<td>
												<span class="label label-inverse">Inverse</span>
											</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
						<!-- END LABELS AND BADGES PORTLET-->
						<!-- BEGIN PAGINATION PORTLET-->
						<div class="portlet box purple">
							<div class="portlet-title">
								<div class="caption"><i class="icon-cogs"></i>Pagination</div>
								<div class="tools">
									<a href="javascript:;" class="collapse"></a>
									<a href="#portlet-config" data-toggle="modal" class="config"></a>
									<a href="javascript:;" class="reload"></a>
									<a href="javascript:;" class="remove"></a>
								</div>
							</div>
							<div class="portlet-body">
								<div class="pagination pagination-large">
									<ul>
										<li><a href="#">«</a></li>
										<li><a href="#">1</a></li>
										<li><a href="#">2</a></li>
										<li><a href="#">3</a></li>
										<li><a href="#">»</a></li>
									</ul>
								</div>
								<div class="pagination">
									<ul>
										<li><a href="#">«</a></li>
										<li><a href="#">1</a></li>
										<li><a href="#">2</a></li>
										<li><a href="#">3</a></li>
										<li><a href="#">4</a></li>
										<li><a href="#">»</a></li>
									</ul>
								</div>
								<div class="pagination pagination-small">
									<ul>
										<li><a href="#">«</a></li>
										<li><a href="#">1</a></li>
										<li><a href="#">2</a></li>
										<li><a href="#">3</a></li>
										<li><a href="#">4</a></li>
										<li><a href="#">»</a></li>
									</ul>
								</div>
								<div class="pagination pagination-mini">
									<ul>
										<li><a href="#">«</a></li>
										<li><a href="#">1</a></li>
										<li><a href="#">2</a></li>
										<li><a href="#">3</a></li>
										<li><a href="#">4</a></li>
										<li><a href="#">»</a></li>
									</ul>
								</div>
							</div>
						</div>
						<!-- END PAGINATION PORTLET-->
						<!-- BEGIN PAGINATION PORTLET-->
						<div class="portlet box purple">
							<div class="portlet-title">
								<div class="caption"><i class="icon-cogs"></i>Dynamic Pagination</div>
								<div class="tools">
									<a href="javascript:;" class="collapse"></a>
									<a href="#portlet-config" data-toggle="modal" class="config"></a>
								</div>
							</div>
							<div class="portlet-body">
								<div>
									<h4>Basic Pagination</h4>
									<p id="dynamic_pager_content1" class="well">Page 1 content here</p>
									<p id="dynamic_pager_demo1" class="pagination"></p>
								</div>
								<hr>
								<div>
									<h4>Advance Pagination</h4>
									<p id="dynamic_pager_content2" class="well">Page 1 content here</p>
									<p id="dynamic_pager_demo2" class="pagination"></p>
								</div>
							</div>
						</div>
						<!-- END PAGINATION PORTLET-->
					</div>
				</div>
				<!-- END PAGE CONTENT-->
			</div>
			<!-- END PAGE CONTAINER-->       
		</div>
		<!-- BEGIN PAGE -->     
	</div>
	<!-- END CONTAINER -->
	<!-- BEGIN FOOTER -->
	<div class="footer">
		<div class="footer-inner">
			2013 &copy; Metronic by keenthemes.
		</div>
		<div class="footer-tools">
			<span class="go-top">
			<i class="icon-angle-up"></i>
			</span>
		</div>
	</div>
	<!-- END FOOTER -->
	<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
	<!-- BEGIN CORE PLUGINS -->
	<script src="media/js/jquery-1.10.1.min.js" type="text/javascript"></script>
	<script src="media/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
	<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
	<script src="media/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>      
	<script src="media/js/bootstrap.min.js" type="text/javascript"></script>
	<!--[if lt IE 9]>
	<script src="media/js/excanvas.min.js"></script>
	<script src="media/js/respond.min.js"></script>  
	<![endif]-->   
	<script src="media/js/jquery.slimscroll.min.js" type="text/javascript"></script>
	<script src="media/js/jquery.blockui.min.js" type="text/javascript"></script>  
	<script src="media/js/jquery.cookie.min.js" type="text/javascript"></script>
	<script src="media/js/jquery.uniform.min.js" type="text/javascript" ></script>
	<!-- END CORE PLUGINS -->
	<!-- BEGIN PAGE LEVEL PLUGINS -->
	<script type="text/javascript" src="media/js/jquery.gritter.js"></script>
	<script type="text/javascript" src="media/js/jquery.pulsate.min.js"></script>
	<script type="text/javascript" src="media/js/jquery.bootpag.min.js"></script>
	<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN PAGE LEVEL SCRIPTS -->
	<script src="media/js/app.js"></script>
	<script src="media/js/ui-general.js"></script>     
	<!-- END PAGE LEVEL SCRIPTS -->
	<script>
		jQuery(document).ready(function() {       
		   // initiate layout and plugins
		   App.init();
		   UIGeneral.init();
		});
	</script>
	<!-- END JAVASCRIPTS -->
<script type="text/javascript">  var _gaq = _gaq || [];  _gaq.push(['_setAccount', 'UA-37564768-1']);  _gaq.push(['_setDomainName', 'keenthemes.com']);  _gaq.push(['_setAllowLinker', true]);  _gaq.push(['_trackPageview']);  (function() {    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;    ga.src = ('https:' == document.location.protocol ? 'https://' : 'http://') + 'stats.g.doubleclick.net/dc.js';    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);  })();</script></body>
<!-- END BODY -->
</html>