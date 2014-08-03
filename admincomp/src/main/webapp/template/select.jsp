<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>递归选择</title>
<script type="text/javascript" src="<c:url value="/js/jquery-1.9.0.min.js"/>" />
<script type="text/javascript">
$(function(){
	var component = {
			load : function(name, url) {
				$('select[name=' + name + ']').empty();
				$.ajax({
					type : "POST",
					url : url,
					dataType : 'xml',
					success : function(data) {
						var v_option = '<option value="">--请选择--</option>';
						$.each(data.result, function(index, item) {
							v_option += '<option value="' + item.CLASS_CODE + '">' + item.CLASS_NAME + '</option>';
						});
						$('select[name=' + name + ']').append(v_option);
					},
					error : function(data) {
						alert(data);
					}
				});
			},
			init : function($this){
				//$('div[class="select"] select') == $this
				$this.each(function() {
					if ($(this).attr('from') == "start") {
						component.load($(this).attr('name'), 'selectjson.jsp?code=' + $(this).attr('class'));
					}
					$(this).change(function() {
						if (!$(this).attr('to')) {
							return false;
						}
						component.load($(this).attr('to'), 'selectjson.jsp?code=' + $('option:selected', this).val());
					});

				});
			}
		};
	
	
});
</script>
</head>

<body>

</body>
</html>