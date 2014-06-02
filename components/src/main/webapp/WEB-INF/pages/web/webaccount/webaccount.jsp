<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<link href="<c:url value="/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet" media="screen" />
<link href="<c:url value="/bootstrap/css/bootstrap-responsive.min.css"/>" rel="stylesheet" media="screen" />
<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="<c:url value="/js/jquery-1.9.0.min.js"/>"></script>
 <![endif]-->
<script src="<c:url value="/js/jquery-2.1.1.js"/>"></script>
<script src="<c:url value="/bootstrap/js/bootstrap.min.js"/>"></script>
</head>
<body>
	<div class="container">
		<div class="span8">
			<form class="form-horizontal" method="post" action="<c:url value="/restful/webaccount/regedit"/>">
				<fieldset>
					<legend>用户注册</legend>
					<div class="control-group">
						<label class="control-label" for="account">帐号:</label>
						<div class="controls">
							<div class="input-prepend">
								<span class="add-on"><i class="icon-user"></i></span> <input type="text" id="account" name="account" placeholder="登陆帐号" />
							</div>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="accountalise">别名:</label>
						<div class="controls">
							<div class="input-prepend">
								<span class="add-on"><i class="icon-user"></i></span> <input type="text" id="accountalise" name="accountalise" placeholder="显示名" />
							</div>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="email">邮箱:</label>
						<div class="controls">
							<div class="input-prepend">
								<span class="add-on"><i class="icon-envelope"></i></span> <input type="text" id="email" name="email" placeholder="用于找回密码" />
							</div>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="passwd">密码:</label>
						<div class="controls">
							<div class="input-prepend">
								<span class="add-on"><i class="icon-lock"></i></span> <input type="password" id="passwd" name="passwd" placeholder="密码" />
							</div>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="repasswd">重复密码:</label>
						<div class="controls">
							<div class="input-prepend">
								<span class="add-on"><i class="icon-lock"></i></span> <input type="password" id="repasswd" name="repasswd" placeholder="重新输一次密码" />
							</div>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="loves">爱好:</label>
						<div class="controls">
							<div class="input-prepend">
								<label class="checkbox"> <input type="checkbox" name="loves" value="1">爱好一
								</label> <label class="checkbox"><input type="checkbox" name="loves" value="2"> 爱好二</label> <label class="checkbox"><input
									type="checkbox" name="loves" value="3"> 爱好二</label>
							</div>
						</div>
					</div>

					<div class="control-group">
						<div class="controls">
							<button type="submit" class="btn">注 册</button>
						</div>
					</div>
				</fieldset>
			</form>
		</div>
	</div>
</body>
</html>