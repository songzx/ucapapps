<%@page import="com.ucap.ucapmetamodel.example.SingleTable"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("authorityunit");
EntityManager entityManager = entityManagerFactory.createEntityManager();
try {
	entityManager.getTransaction().begin();
	for(int i = 0; i < 1000; i ++ ){
		SingleTable singleTable = new SingleTable();
		singleTable.setName("测试");
		entityManager.persist(singleTable);
	}
	entityManager.getTransaction().commit();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

%>
</body>
</html>