package ch16;

import java.net.URL;

/**
 * @author sharpen
 * URL은 '프로코톨://호스트명:포트번호/경로명/파일명?퀴리스트링#참조'의 형태로 이루어져 있다.
 * URL은 인터넷에 존재하는 여러 서버들이 제공하는 자원에 접근할 수 있는 주소를 표현하기 위한 것
 */
class NetworkEx02 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.codechobo.com:80/sample/" + "hello.html/?referer=javachobo#index1");
		
		System.out.println("url.getAuthority() : " + url.getAuthority());
//		System.out.println("url.getContent() : " + url.getContent());
		System.out.println(url.getDefaultPort());
		System.out.println("url.getPort() : " + url.getPort());
		System.out.println("url.getFile() : " + url.getFile());
		System.out.println("url.getHost() : " + url.getHost());
		System.out.println("url.getPath() : " + url.getPath());
		System.out.println("url.getProtocol() : "+ url.getProtocol());
		System.out.println("url.getQuery() : "+url.getQuery());
		System.out.println("url.getRef() : " +url.getRef());
		System.out.println("url.getUserInfo() : " + url.getUserInfo());
		System.out.println("url.toExternalForm() : "+ url.toExternalForm());
		System.out.println("url.toURI() : " + url.toURI());
	}

}
