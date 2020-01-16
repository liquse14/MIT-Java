package net1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;

//
   public class TCPEchoClient {
        private Socket socket = null;
        private BufferedInputStream bis = null;
        private BufferedOutputStream bos = null;
        
        public TCPEchoClient(String sAddress, int port) {
          try {
            //입력받은 서버 주소와 포트번호를 인자로 소켓을 생성한다.
            socket = new Socket(sAddress, port);
            
            //소켓에서 데이터를 읽고 쓰기 위한 스트림 객체를 생성한다.
            bis = new BufferedInputStream(socket.getInputStream());
            bos = new BufferedOutputStream(socket.getOutputStream());
          }catch(IOException ioe) {
            ioe.printStackTrace();
          }
        }
        
        public void send(byte[] buf) {
          try {
            System.out.print("송신한 메시지 : "+new String(buf));
            //출력 스트림객체에 buf에 저장된 메시지를 쓴다.
            bos.write(buf);
            //출력 스트림객체의 버퍼에 저장된 메시를 네트워크를 통해 전송한다.
            bos.flush();
          }catch(IOException ioe) {
            ioe.printStackTrace();
          }
        }
        
        public void receive() {
          try {
            String str = "";
            //서버로 부터 수신한 메시지를 저장하기 위한 바이트 배열
            byte echo[] = new byte[256];
            //수신된 데이터의 길이를 저장하기위한 변수
            int len = 0;
            
            //서버로부터 수신한 데이터의 길이가 -1이 아닌동안 반복해서 수신한다.
            while((len=bis.read(echo,0,echo.length))!=-1) {
              str = str + new String(echo,0,len);
            }
            System.out.print("수신한 메시지 : "+str);
          }catch(IOException ioe) {
            ioe.printStackTrace();
          }
        }
        
        public void close() {
          try {
            //스트림 객체와 소켓을 종료한다.
            bos.close();
            bis.close();
            socket.close();
          }catch(IOException ioe) {
            ioe.printStackTrace();
          }
        }
        
   public static void main(String[] args) {
      //1.유효성 처리 - 파라메터가  3개
       //에코 서버의 주소, 포트번호, 메시지가 입력되었는지 확인한다.
       //입력되지 않은 파라메터가 있다면 프로그램을 종료한다.
      if(args.length <= 2 || args.length > 3) {
         System.out.println("파라메터 :<서버주소> <포트번호> <메세지>");
      }
      //2.server 주소 입력 
      String sAddress = args[0];   
      
      //3.포트입력 :포트번호를 int 형으로 저장한다.
      int port = Integer.parseInt(args[1]);
      
      //4."\n" 개행처리
      byte buf[]= (args[2] + "\n").getBytes();
         
      //5.객체생성
       TCPEchoClient client = new TCPEchoClient(sAddress, port);
       client.send(buf);
       client.receive();
       client.close();
         
      //6.메세지 송신
         
      //7.메세지 수신 
      
      //8.연결 종료
   
   }

}