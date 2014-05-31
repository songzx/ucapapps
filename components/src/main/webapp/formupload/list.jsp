<%@page import="java.io.InputStream"%>
<%@page import="java.sql.Blob"%>
<%@page import="java.util.List"%>
<%@page import="com.ucap.ucaptools.validate.ValidateUtil"%>
<%@page import="com.ucap.ucapmetamodel.example.SingleTable"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int maxresults = ValidateUtil.getInstance().checkInt(request.getParameter("maxresults"), 10, 100);
int firstresult = ValidateUtil.getInstance().checkInt(request.getParameter("firstresult"),0);
String name = request.getParameter("name")==null?"":request.getParameter("name");

try{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("authorityunit");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	List<Object[]> lists = entityManager.createNativeQuery("select * from FORMUPLOAD where filedesc like ? ").setParameter(1,"%"+ name+"%").setMaxResults(maxresults).setFirstResult(firstresult).getResultList();
	for(Object[] objs : lists){
		InputStream inputStream = ((Blob)objs[4]).getBinaryStream();
		byte b[] = new byte[1024];
		StringBuffer sb = new StringBuffer("");
		while(inputStream.read(b) > -1){
			sb.append(new String(b,"UTF-8"));
		}
		out.println(objs[0]+"|"+objs[1]+"|"+objs[2]+"|"+objs[3]+"|"+sb.toString()+"|"+objs[5]+"<br/>");
		inputStream.close();
	}
	entityManager.close();
	entityManagerFactory.close();
}catch(Exception ex){
	ex.printStackTrace();
}
%>
<a href="form.jsp">form</a>
<form action="list.jsp" method="post">
	<input type="text" name="maxresults" value="<%=maxresults%>"/>
	<input type="text" name="firstresult" value="<%=firstresult%>"/>
	<input type="text" name="name" value="<%=name%>"/>
	<input type="submit" value="sumbit"/>
</form>

</body>
</html>