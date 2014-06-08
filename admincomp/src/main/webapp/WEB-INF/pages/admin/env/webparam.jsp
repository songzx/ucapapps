<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="<c:url value="/admin/media/css/env.css"/>" rel="stylesheet" type="text/css" />
<script src="<c:url value="/admin/media/js/env.js"/>" type="text/javascript"></script>
<script type="text/javascript">
	jQuery(document).ready(function() {
		Env.init('<c:url vlaue="/ucapadmin/env/getwebparam"/>');
	});
</script>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<h4 class="page-title">
				应用环境 <small>查看应用服务相关参数值</small>
			</h4>
			<ul class="breadcrumb">
				<li><i class="icon-home"></i><a href="index" target="_top">首页</a> <i class="icon-angle-right"></i></li>
				<li><a href="#">应用运维</a> <i class="icon-angle-right"></i></li>
				<li class="active">应用环境</li>
			</ul>
		</div>
	</div>
	<div class="row-fluid">
		<div class="span12 tabbable-custom">
			<ul class="nav nav-tabs">
				<li class="active"><a href="#tab_1_1" data-toggle="tab">应用服务器</a></li>
				<li class=""><a href="#tab_1_2" data-toggle="tab">Profile Info</a></li>
				<li class=""><a href="#tab_1_3" data-toggle="tab">Account</a></li>
				<li class=""><a href="#tab_1_4" data-toggle="tab">Projects</a></li>
			</ul>
			<div class="tab-content">
				<div class="tab-pane row-fluid active" id="tab_1_1">
					<ul class="unstyled span12">
						<li><span>操作系统:</span> <span class=""></span></li>

						<li><span>First Name:</span> John</li>

						<li><span>Last Name:</span> Doe</li>

						<li><span>Counrty:</span> Spain</li>

						<li><span>Birthday:</span> 18 Jan 1982</li>

						<li><span>Occupation:</span> Web Developer</li>

						<li><span>Email:</span> <a href="#">john@mywebsite.com</a></li>

						<li><span>Interests:</span> Design, Web etc.</li>

						<li><span>Website Url:</span> <a href="#">http://www.mywebsite.com</a></li>

						<li><span>Mobile Number:</span> +1 646 580 DEMO (6284)</li>

						<li><span>About:</span> Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia
							aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod pariatur cliche reprehenderit, enim eiusmod high life
							accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum
							eiusmod.</li>

					</ul>
				</div>
				<!--end tab-pane-->
				<div class="tab-pane row-fluid" id="tab_1_2">22</div>
				<!--tab_1_2-->
				<div class="tab-pane row-fluid" id="tab_1_3">33</div>
				<!--end tab-pane-->
				<div class="tab-pane" id="tab_1_4">44</div>
				<!--end tab-pane-->
			</div>
		</div>
	</div>
</div>