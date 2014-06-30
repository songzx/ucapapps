<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form action="<c:url value="/admin/account/add"/>" method="post">
用户：<input type="text" name="aliasname" />
帐号：<input type="text" name="account" />
密码：<input type="password" name="passwd" />
<button type="submit">保 存</button>
</form>
