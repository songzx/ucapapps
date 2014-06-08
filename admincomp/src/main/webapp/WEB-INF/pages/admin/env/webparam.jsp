<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="<c:url value="/admin/media/css/env.css"/>" rel="stylesheet" type="text/css" />
<script src="<c:url value="/admin/media/js/env.js"/>" type="text/javascript"></script>
<script type="text/javascript">
	jQuery(document).ready(function() {
		Env.init($('input[name=url]').val());
	});
</script>
<input type="hidden" name="url" value="/admincomp/ucapadmin/env/getwebparam" />
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
				<li class="active"><a href="#tab_1_1" data-toggle="tab">应用服务器环境</a></li>
				<li class=""><a href="#tab_1_2" data-toggle="tab">运行概览</a></li>
				<li class=""><a href="#tab_1_3" data-toggle="tab">Account</a></li>
				<li class=""><a href="#tab_1_4" data-toggle="tab">Projects</a></li>
			</ul>
			<div class="tab-content">
				<div class="tab-pane row-fluid active" id="tab_1_1">
					<ul class="unstyled span12">
						<li><span>操作系统:</span> <span class="osname"></span></li>
						<li><span>JDK版本:</span> <span class="javaversion"></span></li>
						<li><span>JDK路径:</span> <span class="javahome"></span></li>
						<li><span>文件编码:</span> <span class="fileencoding"></span></li>
						<li><span>文件分隔符:</span> <span class="fileseparator"></span></li>
					</ul>
				</div>
				<!--end tab-pane-->
				<div class="tab-pane row-fluid" id="tab_1_2">
					<div id="load_memory_loading">
						<img src="<c:url value="/admin/media/image/loading.gif"/>" alt="loading" />
					</div>
					<div id="load_memory_content" class="hide">
						
					</div>
				</div>
				<!--tab_1_2-->
				<div class="tab-pane row-fluid" id="tab_1_3">33</div>
				<!--end tab-pane-->
				<div class="tab-pane" id="tab_1_4">44</div>
				<!--end tab-pane-->
			</div>
		</div>
	</div>
</div>