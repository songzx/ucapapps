<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form action="" method="post">
用户：<input type="text" name="aliasname" value=""/>
帐号：<input type="text" name="account"  value=""/>
密码：<input type="password" name="passwd"  value=""/>
状态：<select name="status">
	<option>--请选择--</option>
	<option value="1">启用</option>
	<option value="2">禁用</option>
	<option value="3">过期</option>
	<option value="4">锁定</option>
</select>
<button type="submit">保 存</button>
</form>
