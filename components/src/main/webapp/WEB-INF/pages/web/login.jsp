<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
<link href="<c:url value="/bootstrap/css/bootstrap.min.css"/>"
	rel="stylesheet" media="screen" />
<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="<c:url value="/js/jquery-1.9.0.min.js"/>"></script>
 <![endif]-->
<script src="<c:url value="/js/jquery-2.1.1.js"/>"></script>
<script src="<c:url value="/bootstrap/js/bootstrap.min.js"/>"></script>
<style type="text/css">
body {
	padding-top: 40px;
	padding-bottom: 40px;
	background-color: #f5f5f5;
}
.form-signin {
	max-width: 300px;
	padding: 19px 29px 29px;
	margin: 0 auto 20px;
	background-color: #fff;
	border: 1px solid #e5e5e5;
	-webkit-border-radius: 5px;
	-moz-border-radius: 5px;
	border-radius: 5px;
	-webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
	-moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
	box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
}

.form-signin .form-signin-heading,.form-signin .checkbox {
	margin-bottom: 10px;
}

.form-signin input[type="text"],.form-signin input[type="password"] {
	font-size: 16px;
	height: auto;
	margin-bottom: 15px;
	padding: 7px 9px;
}
</style>
</head>
<body>
	<div class="container">
		<form class="form-signin" action="<c:url value="/restful/webaccount/login"/>" method="post"">
			<h3 class="form-signin-heading">UCAP System V1.0</h3>
			<input type="text" name="account" class="input-block-level" placeholder="帐号" value="<c:out value="${account }"/>"/> 
			<input type="password" name="passwd" class="input-block-level" placeholder="密码" value="<c:out value="${passwd }"/>"/> 
			<label class="checkbox"> <input type="checkbox" value="remember-me" />
				保存密码
			</label>
			<button class="btn btn-small btn-primary" type="submit">登	陆</button>
			<a href="<c:url value="/restful/web/webaccount_webaccount"/>" class="btn btn-primary">注册 &raquo;</a>
		</form>
	</div>
</body>
</html>