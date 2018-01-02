package ch16;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sharpen
 * ServerSocket의 setSoTimeout()을 사용해서 서버소켓의 대기시간을 지정해서 동작하게 하는 코드
 */
class TcpIpServer03 {

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
				System.out.println(getTime() + "연결요청을 기다립니다.");
				
				// 요청대기시간을 5초로 설정한다.
				// 5초동안 접속 요청이 없으면 SocketTimeoutException이 발생한다.
				serverSocket.setSoTimeout(5 * 1000);
				Socket socket = serverSocket.accept();
				System.out.println(getTime() + socket.getInetAddress() + "로부터 연결요청이 들어왔습니다.");
				
				// 소켓의 출력스트림을 얻는다.
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				// 원격 소켓(remote socket)에 데이터를 보낸다.
				dos.writeUTF("[Notice] Test Message1 from Server");
				System.out.println(getTime() + "데이터를 전송했습니다.");
				
				// 스트림과 소켓을 닫아준다.
				
			} catch (SocketTimeoutException e) {
				System.out.println("지정된 시간동안 접속요청이 없어서 서버를 종료합니다.");
				System.exit(0);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 현재 시간을 문자열로 반환하는 함수
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}

}
