<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>前台</title>
<link href="<c:url value="/bootstrap/css/bootstrap.min.css"/>"
	rel="stylesheet" media="screen" />
<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="<c:url value="/js/jquery-1.9.0.min.js"/>"></script>
 <![endif]-->
<script src="<c:url value="/js/jquery-2.1.1.js"/>"></script>
<script src="<c:url value="/bootstrap/js/bootstrap.min.js"/>"></script>
</head>
<body style="maring:0px 0px;padding: 0px 0px;">
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<button type="button" class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="brand" href="#">UCAP System V1.0</a>
				<div class="nav-collapse collapse">
					<ul class="nav">
						<li class="active"><a href="#">首 页</a></li>
						<li><a href="aboutus">关于我们</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">应用组件<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="#">个人门户</a></li>
								<li><a href="#">咨询投诉</a></li>
								<li><a href="#">报表统计</a></li>
							</ul></li>
					</ul>
					<form class="navbar-form pull-right" action="<c:url value="/restful/webaccount/login"/>" method="post">
						<input name="account" class="span2" type="text" placeholder="帐号"> 
						<input name="passwd" class="span2" type="password" placeholder="密码">
						<button type="submit" class="btn btn-primary">登 陆</button>
						<a href="<c:url value="/restful/web/webaccount_webaccount"/>" class="btn btn-primary">注册 &raquo;</a>
					</form>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>

	<div class="container">

		<!-- Main hero unit for a primary marketing message or call to action -->
		<div class="hero-unit">
			<h3>Hello, UCAP System V1.0!</h3>
			<p>This is a template for a simple marketing or informational
				website. It includes a large callout called the hero unit and three
				supporting pieces of content. Use it as a starting point to create
				something more unique.</p>
			<p>
				<a href="#" class="btn btn-primary btn-large">Learn more &raquo;</a>
			</p>
		</div>

		<!-- Example row of columns -->
		<div class="row">
			<div class="span4">
				<h3>关于权限</h3>
				<p><ul>
					<li>数据过滤权限</li>
					<li>菜单权限</li>
					<li>功能点权限</li>
					<li>流程配置权限</li>
				</ul></p>
				<p>
					<a class="btn" href="#">详细信息 &raquo;</a>
				</p>
			</div>
			<div class="span4">
				<h3>关于流程</h3>
				<p><ul>
					<li>基于JBPM5,配合流程角色进行流程的走向,可视化配置</li>
				</ul></p>
				<p>
					<a class="btn" href="#">详细信息 &raquo;</a>
				</p>
			</div>
			<div class="span4">
				<h3>关于组件</h3>
				<p><ul>
					<li>可视化配置定制组件,可配置数据过滤权限,流程走向权限</li>
				</ul></p>
				<p>
					<a class="btn" href="#">详细信息 &raquo;</a>
				</p>
			</div>
		</div>


	</div>
</body>
</html>