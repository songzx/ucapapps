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
int firstresult = ValidateUtil.getInstance().checkInt(request.getParameter("firstresult"), 0, 0);
String name = request.getParameter("name")==null?"":request.getParameter("name");

try{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("authorityunit");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	List<SingleTable> singleTables = entityManager.createQuery("select s from SingleTable s where s.name like :name", SingleTable.class).setParameter("name","%"+ name+"%").setMaxResults(maxresults).setFirstResult(firstresult).getResultList();
	for(SingleTable singleTable : singleTables){
		out.println(singleTable.getName()+"|"+singleTable.getId());
	}
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