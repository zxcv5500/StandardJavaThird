package ch16;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sharpen
 * getPort()와 getLocalPort()를 사용해서 TCP/IP통신에서 소켓이 사용하고 있는 포트를 알아낸다.
 */
class TcpIpServer02 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			// 서버소켓을 생성하여 7777번 포트와 결합(bind)시킨다.
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime() + "서버가 준비되었습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while (true) {
			try {
				// 서버소켓
				System.out.println(getTime() + "연결 요청을 기다립니다.");
				Socket socket = serverSocket.accept();
				System.out.println(getTime() + socket.getInetAddress() + "로부터 연결요청이 들어왔습니다.");
				
				System.out.println("getPort() : " + socket.getPort());
				System.out.println("getLocalPort() : " + socket.getLocalPort());
				
				// 소켓의 출력스트림을 얻는다.
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				// 원격 소켓(remote socket)에 데이터를 보낸다.
				dos.writeUTF("[Notice] Test Message1 from Server.");
				System.out.println(getTime() + "데이터를 전송했습니다.");
				
				// 스트림과 소켓을 닫아준다.
				dos.close();
				socket.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
			
		}
		
	}
	
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}

}
