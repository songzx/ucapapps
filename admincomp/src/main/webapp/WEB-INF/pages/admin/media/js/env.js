/**
 * env 配置
 */
var Env = function() {
	var data = [];
	var totalPoints = 250;
	// random data generator for plot charts
	function getRandomData() {
		if (data.length > 0)
			data = data.slice(1);
		// do a random walk
		while (data.length < totalPoints) {
			var prev = data.length > 0 ? data[data.length - 1] : 50;
			var y = prev + Math.random() * 10 - 5;
			if (y < 0)
				y = 0;
			if (y > 100)
				y = 100;
			data.push(y);
		}
		// zip the generated y values with the x values
		var res = [];
		for (var i = 0; i < data.length; ++i)
			res.push([ i, data[i] ]);
		return res;
	}

	return {
		init : function(url) {
			$.ajax({
				url : url,
				type : 'get',
				dataType : 'json',
				success : function(data) {
					$('#tab_1_1 .osname').html(data['jvmproperty']['os.name']);
					$('#tab_1_1 .javaversion').html(data['jvmproperty']['java.version']);
					$('#tab_1_1 .javahome').html(data['jvmproperty']['java.home']);
					$('#tab_1_1 .fileencoding').html(data['jvmproperty']['file.encoding']);
					$('#tab_1_1 .fileseparator').html(data['jvmproperty']['file.separator']);

					// server load
					$('#load_memory_loading').hide();
					$('#load_memory_content').show();
					
					$('#load_memory_content').highcharts({
						chart:{
							events:{
								load:function(){
									var series = this.series;
									setInterval(function(){
										$.ajax({
											url:url,
											dataType:"json",
											success: function(data){
												series[0].addPoint(data['memory']['used']/data['memory']['total']);
												series[1].addPoint(data['memory']['swapused']/data['memory']['swaptotal']);
											}
										});
									},60000);
								}
							}
						},
						title : {
							text : '内存运行情况('+(Highcharts.numberFormat(data['memory']['total']/1024,0))+'MB)'
						},
						yAxis : {
							max : 1,
							title : {
								text : '运行百分比(%)'
							},
							labels : {
								formatter : function() {
									return ((this.value - 0) * 100)  + '%';
								}
							}
						},
						xAxis : {
							labels :{
								formatter : function(){
									return this.value;
								}
							},
							title : {
								text : '每分钟'
							}
						},
						series : [ {
							type : 'area',
							name : '内存每分钟监控'
						},{
							type : 'line',
							name : '临时内存每分钟监控'
						} ]
					});
					
					
					// $('#tab_1_2').html();
					// $('#tab_1_3').html();
					// $('#tab_1_4').html();
				}
			});
		}
	};
}();
