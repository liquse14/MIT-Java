<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% System.out.println("테스트 중입니다");
   String uploadPath="c:/upload";
   System.out.println(uploadPath);
   int size=1024*1024*10;
   MultipartRequest multi =null;
   String name="";
	String subject="";
	String filename1="";
	String ofile1="";
	String filename2="";
	String ofile2="";
   
   try{
	   
   multi= new MultipartRequest(request,uploadPath,size,"UTF-8",
   new DefaultFileRenamePolicy());
   name= multi.getParameter("name");
   subject= multi.getParameter("subject");
   
   Enumeration file= multi.getFileNames();  
   
   String file1=(String)file.nextElement();
   filename1 =multi.getFilesystemName(file1);
   ofile1=multi.getOriginalFileName(file1);   
   
   String file2=(String)file.nextElement();
   filename2 =multi.getFilesystemName(file2);
   ofile2=multi.getOriginalFileName(file2);   
   
   }catch(Exception e){
	   e.printStackTrace();
   }
   
   
   
   %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
      <form	action="fileuploadcheck.jsp" method="post">
	<input type="hidden" name="name" value="<%=name %>">
	<input type="hidden" name="subject" value="<%=subject %>">
	<input type="hidden" name="filename1" value="<%=filename1 %>">
	<input type="hidden" name="ofile1" value="<%=ofile1 %>">
	<input type="hidden" name="filename2" value="<%=filename2 %>">
	<input type="hidden" name="ofile2" value="<%=ofile2 %>">
	<input type="submit" value="업로드 확인 및 다운로드">
</form>
</body>
</html>