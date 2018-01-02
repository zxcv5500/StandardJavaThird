package ch15;

import java.io.File;
import java.io.IOException;

/**
 * @author sharpen
 * 재귀 호출을 이용해서 지정한 디렉토리와 서브디렉토리에 
 * 포함된 확장자가 java, txt, bak인 모든 파일을 읽어서 
 * 지정한 키워드가 포함된 라인을 출력하는 예제
 */
class FileEx06 {
	static int found = 0;
	
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("USAGE : java FileEx06 DIRECTORY KEYBOARD");
			System.exit(0);
		}
		
		File dir = new File(args[0]);
		
		String keyword = args[1];
		
		if (!dir.exists() || !dir.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		try {
			findInFiles(dir, keyword);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("총 " + found + "개의 라인에서 '" + keyword + "'을/를 발견하였습니다.");
	}
	
	public static void findInFiles(File dir, String keyword) throws IOException {
		File[] files = dir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				findInFiles(files[i], keyword);
			} else {
				String filename = files[i].getName();
				String extension = filename.substring(filename.lastIndexOf(".") + 1);
				extension = "," + extension + ",";
			}
			
			
		}
	}

}
