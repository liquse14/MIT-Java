package net1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {
   //process �Լ��� ��ü�� ����ϱ� ����  global������ ����
   ServerSocket server =null;
   
   
   //�����Լ��� �����Լ� �ȿ� �վ� �������� ���δ�. 
   public TCPEchoServer(int port) {
      try {
         server = new ServerSocket(port);
      }catch(IOException ioe) {
         ioe.printStackTrace();
      }
   }
   
   public void process() {
      //process�� ���� �ֱ��  while�̴�. 
      while(true){
         try{
            //Socket ���� ���� �߻� : ctrl+shift+O Ű�� import
            Socket con=server.accept();
            
            //��ü��  Ȧ�� ��� ���� ���� ������ �־�� �Ѵ�. --> L value //Buffered Input/Output Stream : ó����������  ���۸���  �Ͽ� ó���Ѵ�
            BufferedInputStream bis = new BufferedInputStream(con.getInputStream());     //�Լ� �ȿ� ��ü �Ķ���ͷ� ���  : BufferInputStream 
            BufferedOutputStream bos = new BufferedOutputStream(con.getOutputStream());  
   
            String str="";
   
            byte buf[]=new byte[256];
            
            int len = 0;  //�޸𸮴� ó�� 0 ���� ������
            while((len=bis.read(buf,0,buf.length)) != -1 ) {
               str = str + new String(buf,0,len);
               bos.write(buf,0,len);  //���
               bos.flush(); //����ֱ�
               if(str.indexOf("\n") != -1 ) {  //���� ó�����ڰ� ���� ������  
                  break;
               }
            }
            
            System.out.println("������ �޽���:"+ str );
            
            //������ �־�� �Ѵ�.
            bos.close();
            bis.close();
            con.close();
            
         }catch(IOException ioe) {
            ioe.printStackTrace();
         }
      }
   }
   //��Ʈ��ũ ���α׷�  Server
   public static void main(String[] args) {
      //      
      if(args.length != 1) {
         System.out.println("�Ķ���� : <��Ʈ��ȣ>");
         System.exit(0);         //���� ����ؿ�
         
      }
      //ip�� ��� �ǳ� Port�� ����ؾ� �Ѵ�. -������ Integer.parseInt(s)
      int port = Integer.parseInt( args[0]);
      
      TCPEchoServer server = new TCPEchoServer(port);
      
      //process: ����Ǿ����� �ְų�  �̰ų�  ȣ��Ǿ ���� �Ǿ��� �ִ� ���� �Լ��� ����� �Ǿ��� �ִ� ���α׷�(����)
      //Ư¡ �ܺο���  ħ�� �װ�� �׾������.
      server.process();

   }
   
   
   
}