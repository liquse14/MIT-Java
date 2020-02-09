
<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.FileInputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String fileName =request.getParameter("file_name"); //파일이름 받기
    String savePath="c:/upload"; // 서버에 업로드된 파일 경로
    //ServletContext context =getServletContext();
    //String sDownloadPath = context.getRealPath(savePath); // 물리적 경로
    //System.out.println(sDownloadPath);
    String sFilePath= savePath+"\\"+fileName;//풀 경로
    
    byte b[] = new byte[4096];
    FileInputStream in  =new FileInputStream(sFilePath);
    String sMimeType = getServletContext().getMimeType(sFilePath);
    
    if(sMimeType ==null)
    	sMimeType="application /octet-stream";
        response.setContentType(sMimeType); 	
        
        fileName= URLEncoder.encode(fileName,"UTF-8").replace("\\+","%20");//파일다운로드시 한글안깨지게 하기위해
        
        
      
        response.setHeader("Context-Disposition", "attachment; filename"+fileName);
        out.clear();  //jsp 에서 처리하기때문에 넣어줌 
        out =pageContext.pushBody();//jsp는 기본적으로getOutputStream이 out 만들어진다
        ServletOutputStream out2= response.getOutputStream();
        
        int numRead;
        while((numRead=in.read(b,0,b.length)) !=-1){
        out2.write(b,0,numRead);
        	
        }
        out2.flush();
        out2.close();
        in.close();
    
%>
<html>
<head>
<meta http-equiv="Content-Type"  content="text/html; charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     
</body>
</html>