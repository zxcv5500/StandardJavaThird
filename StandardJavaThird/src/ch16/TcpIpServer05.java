package ch16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author sharpen
 * Sender 와 Receiver 쓰레드 클래스로 처리하도록 하고 서바와 클라이언트 간의 1:1 채팅 기능 구현.
 */
public class TcpIpServer05 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			//서버 소켓을 생성하여 7777번 포트와 결합(bint)시킨다
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 준비되었습니다.");
			
			socket = serverSocket.accept();
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			sender.start();
			receiver.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}


class Sender extends Thread {
	Socket socket;
	DataOutputStream out;
	String name;
	
	Sender(Socket socket) {
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
		} catch (Exception e) { }
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while (out!=null) {
			try {
				out.writeUTF(name + scanner.nextLine());
			} catch (IOException e) {}
		}
	}
}

class Receiver extends Thread {
	Socket socket;
	DataInputStream in;
	
	Receiver(Socket socket) {
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	public void run() {
		while (in!=null) {
			try {
				System.out.println(in.readUTF());
			} catch (IOException e) { }
		}
	}
	
	
}
