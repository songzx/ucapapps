var ucaptool = {
	checkboxall:function($_checkbox){
		$_checkbox.click(function(){
			var chkname = $(this).attr('selectname');
			if($(this).attr('checked')){
				alert($('input:checkbox[name='+chkname+']'));
				$.each($('input:checkbox[name='+chkname+']'),function(){
					//$(this).parent().addClass('checked');
					$(this).attr('checked',true);
				});
			}else{
				$.each($('input:checkbox[name='+chkname+']'),function(){
					//$(this).parent().removeClass('checked');
					$(this).attr('checked',false);
				});
			}
		});
	}
};