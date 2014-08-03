var ucaptool = {
	checkboxall : function($_checkbox) {
		$_checkbox.click(function() {
			var chkname = $(this).attr('selectname');
			if ($(this).attr('checked')) {
				alert($('input:checkbox[name=' + chkname + ']'));
				$.each($('input:checkbox[name=' + chkname + ']'), function() {
					$(this).parent().addClass('checked');
					// $(this).attr('checked',true);
				});
			} else {
				$.each($('input:checkbox[name=' + chkname + ']'), function() {
					$(this).parent().removeClass('checked');
					// $(this).attr('checked',false);
				});
			}
		});
	}
};

var component = {
	load : function(name, url) {
		$('select[name=' + name + ']').empty();
		$.ajax({
			type : "POST",
			url : url,
			dataType : 'json',
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


