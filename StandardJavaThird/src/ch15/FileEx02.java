package ch15;

import java.io.File;

/**
 * @author sharpen
 * args 경로로 디렉토 경로를 주고 그 경로를 기준으로 File객체를 생성한다. 없으면 프로그램을 종료시키고.
 * 
 */
class FileEx02 {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("USAGE : java FileEx02 DIRECTORY");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		
		if (!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		File[] files = f.listFiles();				// 파일경로에 존재하는 파일들의 리스트를 배열에 담는다.
		
		for (int i = 0; i < files.length; i++) {	
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "[" + fileName + "]" : fileName);		// 
		}
	}

}
