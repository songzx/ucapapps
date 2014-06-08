/**
 * env 配置
 */
var Env = function() {
	 var data = [];
     var totalPoints = 250;
     // random data generator for plot charts
     function getRandomData() {
         if (data.length > 0) data = data.slice(1);
         // do a random walk
         while (data.length < totalPoints) {
             var prev = data.length > 0 ? data[data.length - 1] : 50;
             var y = prev + Math.random() * 10 - 5;
             if (y < 0) y = 0;
             if (y > 100) y = 100;
             data.push(y);
         }
         // zip the generated y values with the x values
         var res = [];
         for (var i = 0; i < data.length; ++i) res.push([i, data[i]])
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
					var updateInterval = 30;
					var plot_statistics = $.plot($("#load_statistics"), [ getRandomData() ], {
						series : {
							shadowSize : 1
						},
						lines : {
							show : true,
							lineWidth : 0.2,
							fill : true,
							fillColor : {
								colors : [ {
									opacity : 0.1
								}, {
									opacity : 1
								} ]
							}
						},
						yaxis : {
							min : 0,
							max : 100,
							tickFormatter : function(v) {
								return v + "%";
							}
						},
						xaxis : {
							show : false
						},
						colors : [ "#e14e3d" ],
						grid : {
							tickColor : "#a8a3a3",
							borderWidth : 0
						}
					});

					// $('#tab_1_2').html();
					// $('#tab_1_3').html();
					// $('#tab_1_4').html();
				}
			});
		}
	};
}();
