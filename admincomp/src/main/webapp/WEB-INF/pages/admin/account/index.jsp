<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="<c:url value="/admin/media/css/account.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/admin/media/css/DT_bootstrap.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/admin/media/css/select2_metro.css"/>" rel="stylesheet" type="text/css" />
<script src="<c:url value="/admin/media/js/select2.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery.dataTables.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/table-advanced.js"/>" type="text/javascript"></script>
<script>
	jQuery(document).ready(function() {
		alert(/blockquote/i.test(('#div2').html()));
		TableAdvanced.init();
		
	});
</script>
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
	<div id="div2">
	<blockquote style="MARGIN-RIGHT: 0px" dir=ltr>
<blockquote style="MARGIN-RIGHT: 0px" dir=ltr>
<blockquote style="MARGIN-RIGHT: 0px" dir=ltr>
<blockquote style="MARGIN-RIGHT: 0px" dir=ltr>
<blockquote style="MARGIN-RIGHT: 0px" dir=ltr>　　 本项目完成研发政府网站资源云服务平台，能支撑广州市各区县级市、各直属机构单位网站群的建设；并基于政府网站资源云服务平台，完成建设从化市政府门户主站。 <br>
<blockquote style="MARGIN-RIGHT: 0px" dir=ltr></blockquote><br>
　　 从化市人民政府门户网站群是从化市政府信息化建设的重要内容，是政务信息公开、方便公众网上办事、政民互动的重要载体、展示政府和谐<strong>、阳光形象的重要窗口。做好从化市政府网站群对加强从化市的宣传，保障公众知情权、参与权和监督权，提高政府、局委各部门的服务质量和</strong>效率，减轻基层办事负担，建设信用化、信息化、服务型政府有不可替代的作用。从化市政府网站群系统依托中国广州门户网站群平台搭建，是以政府门户网站为核心，涵盖各部门子站的网<strong>站群系统，</strong>实现宣传从化、政务公开（政府信息公开）、交流互动、网上办事、资源共享五大功能，具有政务信息化、资源共享化、服务公开化、互动多样化、应用集成化等特点，为建立阳光政府、服务型政府、构建和谐从化作贡献。 <br>
<br>
　　 本项目以从化市人民政府门户网站群为典型应用，将来可拓宽到全市区县、各委办局及下属单位的应用。 <br>
</blockquote></blockquote></blockquote></blockquote></blockquote>
	</div>
	<div class="row-fluid">
		<div class="span12 tabbable-custom">
			<div class="portlet box green">
				<div class="portlet-title">
					<div class="caption">
						<i class="icon-globe"></i>用户管理
					</div>
					<div class="tools">
						<a href="javascript:;" class="reload"></a> <a href="javascript:;" class="remove"></a>
					</div>
				</div>
				<div class="portlet-body">
					<table class="table table-striped table-bordered table-hover table-full-width" id="sample_1">
						<thead>
							<tr>
								<th>Rendering engine</th>
								<th>Browser</th>
								<th class="hidden-480">Platform(s)</th>
								<th class="hidden-480">Engine version</th>
								<th class="hidden-480">CSS grade</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>Trident</td>
								<td>Internet Explorer 4.0</td>
								<td class="hidden-480">Win 95+</td>
								<td class="hidden-480">4</td>
								<td class="hidden-480">X</td>
							</tr>
							<tr>
								<td>Trident</td>
								<td>Internet Explorer 5.0</td>
								<td class="hidden-480">Win 95+</td>
								<td class="hidden-480">5</td>
								<td class="hidden-480">C</td>
							</tr>
							<tr>
								<td>Trident</td>
								<td>Internet Explorer 5.5</td>
								<td class="hidden-480">Win 95+</td>
								<td class="hidden-480">5.5</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Trident</td>
								<td>Internet Explorer 6</td>
								<td class="hidden-480">Win 98+</td>
								<td class="hidden-480">6</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Trident</td>
								<td>Internet Explorer 7</td>
								<td class="hidden-480">Win XP SP2+</td>
								<td class="hidden-480">7</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Trident</td>
								<td>AOL browser (AOL desktop)</td>
								<td class="hidden-480">Win XP</td>
								<td class="hidden-480">6</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Gecko</td>
								<td>Firefox 1.0</td>
								<td class="hidden-480">Win 98+ / OSX.2+</td>
								<td class="hidden-480">1.7</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Gecko</td>
								<td>Firefox 1.5</td>
								<td class="hidden-480">Win 98+ / OSX.2+</td>
								<td class="hidden-480">1.8</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Gecko</td>
								<td>Firefox 2.0</td>
								<td class="hidden-480">Win 98+ / OSX.2+</td>
								<td class="hidden-480">1.8</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Gecko</td>
								<td>Firefox 3.0</td>
								<td class="hidden-480">Win 2k+ / OSX.3+</td>
								<td class="hidden-480">1.9</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Gecko</td>
								<td>Camino 1.0</td>
								<td class="hidden-480">OSX.2+</td>
								<td class="hidden-480">1.8</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Gecko</td>
								<td>Camino 1.5</td>
								<td class="hidden-480">OSX.3+</td>
								<td class="hidden-480">1.8</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Gecko</td>
								<td>Netscape 7.2</td>
								<td class="hidden-480">Win 95+ / Mac OS 8.6-9.2</td>
								<td class="hidden-480">1.7</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Gecko</td>
								<td>Netscape Browser 8</td>
								<td class="hidden-480">Win 98SE+</td>
								<td class="hidden-480">1.7</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Gecko</td>
								<td>Netscape Navigator 9</td>
								<td class="hidden-480">Win 98+ / OSX.2+</td>
								<td class="hidden-480">1.8</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Gecko</td>
								<td>Mozilla 1.0</td>
								<td class="hidden-480">Win 95+ / OSX.1+</td>
								<td class="hidden-480">1</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Gecko</td>
								<td>Mozilla 1.1</td>
								<td class="hidden-480">Win 95+ / OSX.1+</td>
								<td class="hidden-480">1.1</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Gecko</td>
								<td>Mozilla 1.2</td>
								<td class="hidden-480">Win 95+ / OSX.1+</td>
								<td class="hidden-480">1.2</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Gecko</td>
								<td>Mozilla 1.3</td>
								<td class="hidden-480">Win 95+ / OSX.1+</td>
								<td class="hidden-480">1.3</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Gecko</td>
								<td>Mozilla 1.4</td>
								<td class="hidden-480">Win 95+ / OSX.1+</td>
								<td class="hidden-480">1.4</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Gecko</td>
								<td>Mozilla 1.5</td>
								<td class="hidden-480">Win 95+ / OSX.1+</td>
								<td class="hidden-480">1.5</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Gecko</td>
								<td>Mozilla 1.6</td>
								<td class="hidden-480">Win 95+ / OSX.1+</td>
								<td class="hidden-480">1.6</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Gecko</td>
								<td>Mozilla 1.7</td>
								<td class="hidden-480">Win 98+ / OSX.1+</td>
								<td class="hidden-480">1.7</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Gecko</td>
								<td>Mozilla 1.8</td>
								<td class="hidden-480">Win 98+ / OSX.1+</td>
								<td class="hidden-480">1.8</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Gecko</td>
								<td>Seamonkey 1.1</td>
								<td class="hidden-480">Win 98+ / OSX.2+</td>
								<td class="hidden-480">1.8</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Gecko</td>
								<td>Epiphany 2.20</td>
								<td class="hidden-480">Gnome</td>
								<td class="hidden-480">1.8</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Webkit</td>
								<td>Safari 1.2</td>
								<td class="hidden-480">OSX.3</td>
								<td class="hidden-480">125.5</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Webkit</td>
								<td>Safari 1.3</td>
								<td class="hidden-480">OSX.3</td>
								<td class="hidden-480">312.8</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Webkit</td>
								<td>Safari 2.0</td>
								<td class="hidden-480">OSX.4+</td>
								<td class="hidden-480">419.3</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Webkit</td>
								<td>Safari 3.0</td>
								<td class="hidden-480">OSX.4+</td>
								<td class="hidden-480">522.1</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Webkit</td>
								<td>OmniWeb 5.5</td>
								<td class="hidden-480">OSX.4+</td>
								<td class="hidden-480">420</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Webkit</td>
								<td>iPod Touch / iPhone</td>
								<td class="hidden-480">iPod</td>
								<td class="hidden-480">420.1</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Webkit</td>
								<td>S60</td>
								<td class="hidden-480">S60</td>
								<td class="hidden-480">413</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Presto</td>
								<td>Opera 7.0</td>
								<td class="hidden-480">Win 95+ / OSX.1+</td>
								<td class="hidden-480">-</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Presto</td>
								<td>Opera 7.5</td>
								<td class="hidden-480">Win 95+ / OSX.2+</td>
								<td class="hidden-480">-</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Presto</td>
								<td>Opera 8.0</td>
								<td class="hidden-480">Win 95+ / OSX.2+</td>
								<td class="hidden-480">-</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Presto</td>
								<td>Opera 8.5</td>
								<td class="hidden-480">Win 95+ / OSX.2+</td>
								<td class="hidden-480">-</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Presto</td>
								<td>Opera 9.0</td>
								<td class="hidden-480">Win 95+ / OSX.3+</td>
								<td class="hidden-480">-</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Presto</td>
								<td>Opera 9.2</td>
								<td class="hidden-480">Win 88+ / OSX.3+</td>
								<td class="hidden-480">-</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Presto</td>
								<td>Opera 9.5</td>
								<td class="hidden-480">Win 88+ / OSX.3+</td>
								<td class="hidden-480">-</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Presto</td>
								<td>Opera for Wii</td>
								<td class="hidden-480">Wii</td>
								<td class="hidden-480">-</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Presto</td>
								<td>Nokia N800</td>
								<td class="hidden-480">N800</td>
								<td class="hidden-480">-</td>
								<td class="hidden-480">A</td>
							</tr>
							<tr>
								<td>Presto</td>
								<td>Nintendo DS browser</td>
								<td class="hidden-480">Nintendo DS</td>
								<td class="hidden-480">8.5</td>
								<td class="hidden-480">C/A<sup>1</sup></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>