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
            //�Է¹��� ���� �ּҿ� ��Ʈ��ȣ�� ���ڷ� ������ �����Ѵ�.
            socket = new Socket(sAddress, port);
            
            //���Ͽ��� �����͸� �а� ���� ���� ��Ʈ�� ��ü�� �����Ѵ�.
            bis = new BufferedInputStream(socket.getInputStream());
            bos = new BufferedOutputStream(socket.getOutputStream());
          }catch(IOException ioe) {
            ioe.printStackTrace();
          }
        }
        
        public void send(byte[] buf) {
          try {
            System.out.print("�۽��� �޽��� : "+new String(buf));
            //��� ��Ʈ����ü�� buf�� ����� �޽����� ����.
            bos.write(buf);
            //��� ��Ʈ����ü�� ���ۿ� ����� �޽ø� ��Ʈ��ũ�� ���� �����Ѵ�.
            bos.flush();
          }catch(IOException ioe) {
            ioe.printStackTrace();
          }
        }
        
        public void receive() {
          try {
            String str = "";
            //������ ���� ������ �޽����� �����ϱ� ���� ����Ʈ �迭
            byte echo[] = new byte[256];
            //���ŵ� �������� ���̸� �����ϱ����� ����
            int len = 0;
            
            //�����κ��� ������ �������� ���̰� -1�� �ƴѵ��� �ݺ��ؼ� �����Ѵ�.
            while((len=bis.read(echo,0,echo.length))!=-1) {
              str = str + new String(echo,0,len);
            }
            System.out.print("������ �޽��� : "+str);
          }catch(IOException ioe) {
            ioe.printStackTrace();
          }
        }
        
        public void close() {
          try {
            //��Ʈ�� ��ü�� ������ �����Ѵ�.
            bos.close();
            bis.close();
            socket.close();
          }catch(IOException ioe) {
            ioe.printStackTrace();
          }
        }
        
   public static void main(String[] args) {
      //1.��ȿ�� ó�� - �Ķ���Ͱ�  3��
       //���� ������ �ּ�, ��Ʈ��ȣ, �޽����� �ԷµǾ����� Ȯ���Ѵ�.
       //�Էµ��� ���� �Ķ���Ͱ� �ִٸ� ���α׷��� �����Ѵ�.
      if(args.length <= 2 || args.length > 3) {
         System.out.println("�Ķ���� :<�����ּ�> <��Ʈ��ȣ> <�޼���>");
      }
      //2.server �ּ� �Է� 
      String sAddress = args[0];   
      
      //3.��Ʈ�Է� :��Ʈ��ȣ�� int ������ �����Ѵ�.
      int port = Integer.parseInt(args[1]);
      
      //4."\n" ����ó��
      byte buf[]= (args[2] + "\n").getBytes();
         
      //5.��ü����
       TCPEchoClient client = new TCPEchoClient(sAddress, port);
       client.send(buf);
       client.receive();
       client.close();
         
      //6.�޼��� �۽�
         
      //7.�޼��� ���� 
      
      //8.���� ����
   
   }

}