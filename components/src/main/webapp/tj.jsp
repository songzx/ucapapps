<%@page import="java.util.UUID"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.ucap.ucapmetamodel.example.SingleTable"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id")==null?"":request.getParameter("id").trim();
	String hits = request.getParameter("hits")==null?"":request.getParameter("hits").trim();
	String oper = request.getParameter("oper")==null?"":request.getParameter("oper").trim();
	if("".equals(id)){
		return;
	}
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try{
		Map<String,String> result = new HashMap<String,String>();
		if("add".equals(oper)){
			pstmt = conn.prepareStatement("insert into WEBTS_TJ(id,WEBTS_ID,HITS) values(?,?,?)");			
			pstmt.setString(1, UUID.randomUUID().toString().replace("-", ""));
			pstmt.setString(2, id);
			pstmt.setString(3, hits);
			pstmt.executeUpdate();
		}
		
		pstmt = conn.prepareStatement("select count(tj.hits) count,tj.hits from WEBTS_TJ tj where tj.webts_id = '1' group by tj.webts_id, tj.hits order by tj.hits");			
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		while(rs.next()){
			result.put(rs.getString("hits"), rs.getString("count"));
		}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="<%=request.getContextPath()%>/js/jquery-1.5.js" language="JavaScript" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/highcharts.js" language="JavaScript" type="text/javascript"></script>
<script type="text/javascript">
	$(function() {
		$('#container')
				.highcharts(
						{
							chart : {
								plotBackgroundColor : null,
								plotBorderWidth : null,
								plotShadow : false
							},
							title : {
								text : '回复的评价统计'
							},
							tooltip : {
								pointFormat : '{series.name}: <b>{point.percentage:.1f}%</b>'
							},
							plotOptions : {
								pie : {
									allowPointSelect : true,
									cursor : 'pointer',
									dataLabels : {
										enabled : true,
										format : '<b>{point.name}</b>: {point.percentage:.1f} %',
										style : {
											color : (Highcharts.theme && Highcharts.theme.contrastTextColor)
													|| 'black'
										}
									}
								}
							},
							series : [ {
								type : 'pie',
								name : 'Browser share',
								data : [ 
								   	[ '合格', 45.0 ], 
								   	[ '良好', 26.8 ], {
									name : '优秀',
									y : 12.8,
									sliced : true,
									selected : true
								}]
							} ]
						});
	});
</script>
</head>
<body>
	<div style="margin: 0px auto;text-align: left;">
		<form action="tj.jsp?oper=add" method="post">
			你对些回复的评价:<select name="hits">
				<option value="">--请选择--</option>
				<option value="1">优秀</option>
				<option value="2">良好</option>
				<option value="3">合格</option>
			</select><input type="submit" value="提	交" />
		</form>
		<div id="container" style="min-width: 310px; height: 400px; max-width: 600px; margin: 0 auto"></div>

	</div>

</body>
</html>
<%
	}catch(Exception ex){
		ex.printStackTrace();
	}finally{
		if(pstmt != null){
			pstmt.close();
			pstmt = null;
		}
		if(rs != null){
			rs.close();
			rs = null;
		}
		if(conn != null){
			conn.close();
			conn = null;
		}
	}
%>