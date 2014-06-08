/**
 * env 配置
 */
var Env = function(){
	return{
		init:function(url){
			$.ajax({
				url : url,
				type : 'get',
				dataType : 'json',
				success : function(data){
					$('#tab_1_1 .osname').html(data['webserver']['os.name']);
					
					$('#tab_1_2').html();
					$('#tab_1_3').html();
					$('#tab_1_4').html();
				}
			});
		}
	};
}();
