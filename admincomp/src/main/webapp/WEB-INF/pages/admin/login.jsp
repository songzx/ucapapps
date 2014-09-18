<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>monitor sytem v1.0</title>
<meta content="monitor sytem v1.0" name="description" />
<meta content="monitor" name="author" />
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link href="<c:url value="/admin/media/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/admin/media/css/bootstrap-responsive.min.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/admin/media/css/font-awesome.min.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/admin/media/css/style-metro.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/admin/media/css/style.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/admin/media/css/style-responsive.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/admin/media/css/default.css"/>" rel="stylesheet" type="text/css" id="style_color" />
<link href="<c:url value="/admin/media/css/uniform.default.css"/>" rel="stylesheet" type="text/css" />
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL STYLES -->
<link href="<c:url value="/admin/media/css/login.css"/>" rel="stylesheet" type="text/css" />
<!-- END PAGE LEVEL STYLES -->
<link rel="shortcut icon" href="<c:url value="/admin/media/image/favicon.ico"/>" />
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<script src="<c:url value="/admin/media/js/jquery-1.10.1.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery-migrate-1.2.1.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery-ui-1.10.1.custom.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/bootstrap.min.js"/>" type="text/javascript"></script>
<!--[if lt IE 9]>
	<script src="<c:url value="/admin/media/js/excanvas.min.js"/>"></script>
	<script src="<c:url value="/admin/media/js/respond.min.js"/>"></script>  
	<![endif]-->
<script src="<c:url value="/admin/media/js/jquery.slimscroll.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery.blockui.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery.cookie.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery.uniform.min.js"/>" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="<c:url value="/admin/media/js/jquery.validate.min.js"/>" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="<c:url value="/admin/media/js/app.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/login.js"/>" type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<script>
	jQuery(document).ready(function() {
		App.init();
		Login.init();
	});
</script>
<!-- END JAVASCRIPTS -->
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="login">
	<!-- BEGIN LOGO -->
	<div class="logo">
		<h4 style="color:#fff;">monitor System v1.0</h4>
	</div>
	<!-- END LOGO -->
	<!-- BEGIN LOGIN -->
	<div class="content">
		<!-- BEGIN LOGIN FORM -->
		<form class="form-vertical login-form" action="index" method="post">
			<h4 class="form-title">登 陆</h4>
			<div class="alert alert-error hide">
				<button class="close" data-dismiss="alert"></button>
				<span>帐号与密码不符合规范.</span>
			</div>
			<div class="control-group">
				<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
				<label class="control-label visible-ie8 visible-ie9">帐号:</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-user"></i> <input class="m-wrap placeholder-no-fix" type="text" placeholder="帐号" name="username" />
					</div>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label visible-ie8 visible-ie9">密码:</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-lock"></i> <input class="m-wrap placeholder-no-fix" type="password" placeholder="密码" name="password" />
					</div>
				</div>
			</div>
			<div class="form-actions">
				<label class="checkbox"> <input type="checkbox" name="remember" value="1" /> 记住我
				</label>
				<button type="submit" class="btn green pull-right">
					登 陆 <i class="m-icon-swapright m-icon-white"></i>
				</button>
			</div>
			<div class="forget-password">
				<h4>忘记密码 ?</h4>
				<p>
					点击 <a href="javascript:;" class="" id="forget-password">这里</a> 重设密码.
				</p>
			</div>
		</form>
		<!-- END LOGIN FORM -->
	</div>
	<!-- END LOGIN -->
	<!-- BEGIN COPYRIGHT -->
	<div class="copyright">2014 &copy; monitor System v1.0.</div>
	<!-- END COPYRIGHT -->
	<!-- END BODY -->
</html>
