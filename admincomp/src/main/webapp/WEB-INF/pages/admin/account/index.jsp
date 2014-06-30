<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="<c:url value="/admin/media/css/account.css"/>" rel="stylesheet" type="text/css" />
<input type="hidden" name="url" value="<c:url value="/ucapadmin/account/list"/>" />
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<ul class="breadcrumb">
				<li><i class="icon-home"></i><a href="index" target="_top">首页</a> <i class="icon-angle-right"></i></li>
				<li><a href="#">系统设置</a> <i class="icon-angle-right"></i></li>
				<li class="active">用户管理</li>
			</ul>
		</div>
	</div>
	<div class="row-fluid">
		<div class="span12 tabbable-custom">
			<div class="portlet box green">
				<div class="portlet-title">
					<div class="caption">
						<i class="icon-globe"></i>
							<form class="form-inline" style="margin: 0px 0px; padding: 0px 0px;">
								<input type="text" class="span6" placeholder="关键字">
								<button type="submit" class="btn red-stripe">查询</button>
							</form>
					</div>
					<div class="tools">
						<a href="javascript:;" style="color: #fff;font-size:14px;"><i class="icon-trash"></i> 删除</a>｜<a href="javascript:;" style="color: #fff;font-size:14px;"><i class="icon-edit"></i> 编辑</a>｜<a href="<c:url value="/ucapadmin/account_form"/>" style="color: #fff;font-size:14px;"><i class="icon-plus"></i> 新增</a>｜<i class="icon-list"></i> 总数(12)
					</div>
				</div>
				<div class="portlet-body">
					<table class="table table-hover table-striped">
						<thead>
							<tr>
								<th><input type="checkbox" name="all" selectname="id"/></th>
								<th>帐号</th>
								<th>别名</th>
								<th class="hidden-480">邮箱</th>
								<th class="hidden-480">最后登陆时间</th>
								<th class="hidden-480">状态</th>
							</tr>
						</thead>
						<tbody>
							<tr clasc="checkbox">
								<td><input type="checkbox" name="id"/></td>
								<td>Trident</td>
								<td>Internet Explorer 4.0</td>
								<td class="hidden-480">Win 95+</td>
								<td class="hidden-480">4</td>
								<td class="hidden-480">X</td>
							</tr>
							<tr>
								<td><input type="checkbox" name="id"/></td>
								<td>Trident</td>
								<td>Internet Explorer 4.0</td>
								<td class="hidden-480">Win 95+</td>
								<td class="hidden-480">4</td>
								<td class="hidden-480">X</td>
							</tr>
							<tr>
								<td><input type="checkbox" name="id"/></td>
								<td>Trident</td>
								<td>Internet Explorer 4.0</td>
								<td class="hidden-480">Win 95+</td>
								<td class="hidden-480">4</td>
								<td class="hidden-480">X</td>
							</tr>
							<tr>
								<td><input type="checkbox" name="id"/></td>
								<td>Trident</td>
								<td>Internet Explorer 4.0</td>
								<td class="hidden-480">Win 95+</td>
								<td class="hidden-480">4</td>
								<td class="hidden-480">X</td>
							</tr>
							<tr>
								<td><input type="checkbox" name="id"/></td>
								<td>Trident</td>
								<td>Internet Explorer 4.0</td>
								<td class="hidden-480">Win 95+</td>
								<td class="hidden-480">4</td>
								<td class="hidden-480">X</td>
							</tr>
							<tr>
								<td><input type="checkbox" name="id"/></td>
								<td>Trident</td>
								<td>Internet Explorer 4.0</td>
								<td class="hidden-480">Win 95+</td>
								<td class="hidden-480">4</td>
								<td class="hidden-480">X</td>
							</tr>
							<tr>
								<td><input type="checkbox" name="id"/></td>
								<td>Trident</td>
								<td>Internet Explorer 4.0</td>
								<td class="hidden-480">Win 95+</td>
								<td class="hidden-480">4</td>
								<td class="hidden-480">X</td>
							</tr>
							<tr>
								<td><input type="checkbox" name="id"/></td>
								<td>Trident</td>
								<td>Internet Explorer 4.0</td>
								<td class="hidden-480">Win 95+</td>
								<td class="hidden-480">4</td>
								<td class="hidden-480">X</td>
							</tr><tr>
								<td><input type="checkbox" name="id"/></td>
								<td>Trident</td>
								<td>Internet Explorer 4.0</td>
								<td class="hidden-480">Win 95+</td>
								<td class="hidden-480">4</td>
								<td class="hidden-480">X</td>
							</tr>
							<tr>
								<td><input type="checkbox" name="id"/></td>
								<td>Trident</td>
								<td>Internet Explorer 4.0</td>
								<td class="hidden-480">Win 95+</td>
								<td class="hidden-480">4</td>
								<td class="hidden-480">X</td>
							</tr>
							<tr>
								<td><input type="checkbox" name="id"/></td>
								<td>Trident</td>
								<td>Internet Explorer 4.0</td>
								<td class="hidden-480">Win 95+</td>
								<td class="hidden-480">4</td>
								<td class="hidden-480">X</td>
							</tr>
							<tr>
								<td><input type="checkbox" name="id"/></td>
								<td>Trident</td>
								<td>Internet Explorer 4.0</td>
								<td class="hidden-480">Win 95+</td>
								<td class="hidden-480">4</td>
								<td class="hidden-480">X</td>
							</tr>
						</tbody>
					</table>
					<div class="row-fluid">
						<div class="span4">
							<span class="text-center">当前记录1－10条，共21条</span>
						</div>
						<div class="span8">
							<div class="pagination pagination-right" style="margin:0px 0px;">
								<ul>
									<li><a href="#">&lt;&lt;</a></li>
									<li><a href="#">1</a></li>
									<li><a href="#">2</a></li>
									<li><a href="#">3</a></li>
									<li><a href="#">4</a></li>
									<li><a href="#">&gt;&gt;</a></li>
								</ul>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>
</div>
<script src="<c:url value="/js/ucaptool.js"/>" type="text/javascript"></script>
<script type="text/javascript">
$(function(){
	ucaptool.checkboxall($('input:checkbox[name=all]'));
});
</script>
