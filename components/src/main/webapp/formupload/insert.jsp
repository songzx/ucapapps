<%@page import="oracle.jdbc.OracleConnectionWrapper"%>
<%@page import="oracle.jdbc.OracleConnection"%>
<%@page import="oracle.sql.CLOB"%>
<%@page import="java.sql.Clob"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="org.apache.openjpa.jdbc.sql.Sized"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.Reader"%>
<%@page import="oracle.sql.BLOB"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.util.UUID"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="com.ucap.ucapmetamodel.example.SingleTable"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");

	boolean isMultipart = ServletFileUpload.isMultipartContent(request);
	String param = request.getParameter("param");
	if (!isMultipart) {
		out.println("非表单提交");
		return;
	}

	// Create a factory for disk-based file items
	DiskFileItemFactory factory = new DiskFileItemFactory();
	//DiskFileItemFactory factory = new DiskFileItemFactory(yourMaxMemorySize, yourTempDirectory);
	// Set factory constraints
	//factory.setSizeThreshold(yourMaxMemorySize);
	System.out.println(System.getProperty("java.io.tmpdir"));
	factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

	// Create a new file upload handler
	ServletFileUpload upload = new ServletFileUpload(factory);

	// Set overall request size constraint
	upload.setSizeMax(5*1024*1024);
	upload.setHeaderEncoding("UTF-8");
	// Parse the request
	List<FileItem> items = upload.parseRequest(request);

	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("authorityunit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String filedesc = "";
		String filename = "";
		InputStream byteinputStream = null;
		InputStream charinputStream = null;
		entityManager.getTransaction().begin();
		for(FileItem item : items){
			if (item.isFormField()) {
		        if(item.getFieldName().equals("filedesc")){
		        	filedesc = item.getString("UTF-8");
		        }
		    } else {
		    	byteinputStream = item.getInputStream();
		    	charinputStream = item.getInputStream();
		    	filename = item.getName();
		    }
			
		}
		
		int size = (int)charinputStream.available();
		
		
		// new Sized(clobReader,Integer.parseInt(size+""));
		//OracleConnection oracleConnection = new OracleConnectionWrapper();
		//CLOB clob = new CLOB(oracleConnection,chars);
		
		byte bytes[] = new byte[size];
		byteinputStream.read(bytes);
		charinputStream.close();
		byteinputStream.close();
		
		entityManager.createNativeQuery("insert into FORMUPLOAD(id,FILEDESC,CONTENTBLOB,CONTENTCLOB,filename) values(?,?,?,?,?)")
		.setParameter(1, UUID.randomUUID().toString())
		.setParameter(2, filedesc)	
		.setParameter(3,bytes)//byte
		.setParameter(4,null)//char[],openjpa不支持
		.setParameter(5,filename).executeUpdate();
		
		/*
		char chars[] = new char[size];
		Reader clobReader = new BufferedReader(new InputStreamReader(charinputStream, "UTF-8"));
		clobReader.read(chars);
		SingleTable singleTable = new SingleTable();
		singleTable.setChars(chars);
		singleTable.setName(filedesc);
		entityManager.persist(singleTable);
		
		*/
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
%>
