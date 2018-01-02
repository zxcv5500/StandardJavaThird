package ch16;

import java.net.URL;
import java.net.URLConnection;

/**
 * @author sharpen
 * URLConnection을 생성하고 get메서드들을 통해서 관련정보를 얻어서 출력하는 예제이다.
 */
class NetworkEx03 {

	public static void main(String[] args) {
		URL url = null;
		String address = "http://www.codechobo.com/sample/hello.html";
		
		try {
			url = new URL(address);
			URLConnection conn = url.openConnection();
			
			System.out.println("conn.toString() : " + conn);
			System.out.println("getAllowUserInteraction() : "+ conn.getAllowUserInteraction());
			System.out.println("getConnectTimeout() : "+ conn.getConnectTimeout());
//			System.out.println("getContent() : "+ conn.getContent());				// 서버가 유지 되고 있지 않아서 파일이 없다는 에러가 나오는 듯함.
			System.out.println("getContentEncoding() : "+ conn.getContentEncoding());
			System.out.println("getContentLength() : "+ conn.getContentLength());
			System.out.println("getContentType() : "+ conn.getContentType());
			System.out.println("getDate() :"+ conn.getDate());
			System.out.println("getDefaultAllowUserInteraction() : " + conn.getDefaultAllowUserInteraction());
			System.out.println("getDefaultUseCaches() : "+ conn.getDefaultUseCaches());
			System.out.println("getDoInput() : " + conn.getDoInput());
			System.out.println("getDoOutput() : "+ conn.getDoOutput());
			System.out.println("getExpiration() : "+ conn.getExpiration());
			System.out.println("getHeaderFields() : "+ conn.getHeaderFields());
			System.out.println("getIfModifiedSince() : "+ conn.getIfModifiedSince());
			System.out.println("getLastModified() : "+ conn.getLastModified());
			System.out.println("getReadTimeout() : "+ conn.getReadTimeout());
			System.out.println("getURL() : "+ conn.getURL());
			System.out.println("getUseCaches() : "+ conn.getUseCaches());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
