package ch16;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

/**
 * @author sharpen
 * Sender 와 Receiver 쓰레드 클래스로 처리하도록 하고 서바와 클라이언트 간의 1:1 채팅 기능 구현.
 */
class TcpIpClient05 {

	public static void main(String[] args) {
		try {
			String serverIp = "127.0.0.1";
			// 소켓을 생성하여 연결을 요청한다.
			Socket socket = new Socket(serverIp, 7777);
			
			System.out.println("서버에 연결되었습니다.");
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
		} catch (ConnectException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
