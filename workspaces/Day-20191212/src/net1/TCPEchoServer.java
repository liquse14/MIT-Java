package net1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {
   //process 함수내 객체를 사용하기 위한  global변수로 선언
   ServerSocket server =null;
   
   
   //별도함수를 메인함수 안에 넝어 의존성을 줄인다. 
   public TCPEchoServer(int port) {
      try {
         server = new ServerSocket(port);
      }catch(IOException ioe) {
         ioe.printStackTrace();
      }
   }
   
   public void process() {
      //process의 생명 주기는  while이다. 
      while(true){
         try{
            //Socket 사용시 에러 발생 : ctrl+shift+O 키로 import
            Socket con=server.accept();
            
            //객체는  홀로 사용 못해 왼쪽 변수에 넣어야 한다. --> L value //Buffered Input/Output Stream : 처리단위별로  버퍼링을  하여 처리한다
            BufferedInputStream bis = new BufferedInputStream(con.getInputStream());     //함수 안에 객체 파라메터로 사용  : BufferInputStream 
            BufferedOutputStream bos = new BufferedOutputStream(con.getOutputStream());  
   
            String str="";
   
            byte buf[]=new byte[256];
            
            int len = 0;  //메모리는 처음 0 부터 시작해
            while((len=bis.read(buf,0,buf.length)) != -1 ) {
               str = str + new String(buf,0,len);
               bos.write(buf,0,len);  //출력
               bos.flush(); //비워주기
               if(str.indexOf("\n") != -1 ) {  //개행 처리문자가 없지 않으면  
                  break;
               }
            }
            
            System.out.println("수신한 메시지:"+ str );
            
            //종료해 주어야 한다.
            bos.close();
            bis.close();
            con.close();
            
         }catch(IOException ioe) {
            ioe.printStackTrace();
         }
      }
   }
   //네트워크 프로그램  Server
   public static void main(String[] args) {
      //      
      if(args.length != 1) {
         System.out.println("파라메터 : <포트번호>");
         System.exit(0);         //같이 기억해요
         
      }
      //ip는 없어도 되나 Port는 사용해야 한다. -형변형 Integer.parseInt(s)
      int port = Integer.parseInt( args[0]);
      
      TCPEchoServer server = new TCPEchoServer(port);
      
      //process: 실행되어지고 있거나  이거나  호출되어서 실행 되어져 있는 내부 함수에 기술이 되어져 있는 프로그램(절차)
      //특징 외부에서  침해 항경우 죽어버린다.
      server.process();

   }
   
   
   
}