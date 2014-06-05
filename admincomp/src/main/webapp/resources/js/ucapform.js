/**
 * 
 */
var ucapform ={
		tags : {
			text : function(datajson){
				var v_input = '<input type="text" name="'+datajson.name+'" value="'+datajson.value+'" ';
				$.each(datajson.attrs.split(' '),function(index,data){
					var v_attrs = data.split(':');
					if(v_attrs.length == 2){
						v_input += v_attrs[0]+'="'+v_attrs[1]+'"';
					}else{
						//解析: style:{margin:0px 0px;}
					}
				});
				v_input += '/>';
				return v_input;
			},
			password : function(datajson){
				var v_input = '<input type="password" name="'+datajson.name+'" value="'+datajson.value+'" ';
				$.each(datajson.attrs.split(' '),function(index,data){
					var v_attrs = data.split(':');
					if(v_attrs.length == 2){
						v_input += v_attrs[0]+'="'+v_attrs[1]+'"';
					}else{
						//解析: style:{margin:0px 0px;}
					}
				});
				v_input += '/>';
				return v_input;
			},
			radio : function(datajson){
				var v_input = '';
				$.each(datajson.options,function(index,data){
					v_input += '<input type="radio" name="'+datajson.name+'" value="'+data.value+'"'+(datajson.value==data.value?' selected':'')+'/>'+data.text;
				})
				return v_input;
			},
			checkbox : function(datajson){
				var v_input = '';
				$.each(datajson.options,function(index,data){
					v_input += '<input type="checkbox" name="'+datajson.name+'" value="'+data.value+'"'+(datajson.value==data.value?' selected':'')+'/>'+data.text;
				})
				return v_input;
			},
			textarea : function(datajson){
				var v_textarea = '<textarea name="'+datajson.name+'" ';
				$.each(datajson.attrs.split(' '),function(index,data){
					var v_attrs = data.split(':');
					if(v_attrs.length == 2){
						v_textarea += v_attrs[0]+'="'+v_attrs[1]+'"';
					}else{
						//解析: style:{margin:0px 0px;}
					}
				});
				v_textarea += '>';
				v_textarea += datajson.value;
				v_textarea += '</textarea>';
				
				return v_textarea;
			},
			select : function(datajson){
				var v_select = '<select name="'+datajson.name+'" ';
				$.each(datajson.attrs.split(' '),function(index,data){
					var v_attrs = data.split(':');
					if(v_attrs.length == 2){
						v_select += v_attrs[0]+'="'+v_attrs[1]+'"';
					}else{
						//解析: style:{margin:0px 0px;}
					}
				});
				v_select += '>';
				var v_options = '<option value="">--请选择--</option>';
				$.each(datajson.options,function(index,data){
					v_options += '<option value="'+data.value+'"'+(datajson.value == data.value ? " selected":"")+'>'+data.text+'</option>';
				});
				v_select += v_options;
				v_select += '</select>';
				return v_select;
			},
			span : function(datajson){
				var v_input = '<span>'+datajson.value+'</span>';
				return v_input;
			}
		},
		read : function(json){
			var v_read = '';
			$.each(json.readform,function(index,data){
				v_read += '<tr><td align="right">'+data.title+':</td><td>'+data.value+'</td></tr>';
			});
			return v_read;
		},
		modify : function(json){
			var v_modify = '';
			$.each(json.modifyform,function(index,data){
				v_modify += '<tr><td align="right">'+data.title+':</td><td>'+ucapform.tags[data.tag](data)+'</td></tr>';
			});
			return v_modify;
		},
		fn_load : function(url,fn_success){
			$.ajax({
				url:url,
				success:fn_success
			});
		}
	};