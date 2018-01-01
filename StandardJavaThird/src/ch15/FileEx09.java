package ch15;

import java.io.File;

/**
 * @author zxcv5500
 * renameTo(File f)를 이용해서 파일의 이름을 바꾸는 간단한 예제이다. 
 */
class FileEx09 {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("USAGE : java FileEx09 DIRECTORY");
			System.exit(0);
		}
		
		File dir = new File(args[0]);
		
		if (!dir.exists() ||  !dir.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리 입니다.");
			System.exit(0);
		}
		
		File[] list = dir.listFiles();
		
		for (int i= 0; i < list.length; i++) {
			String fileName = list[i].getName();
			
			// 파일명
			String newFileName = "0000" + fileName;
			newFileName = newFileName.substring(newFileName.length() - 7);
			list[i].renameTo(new File(dir, newFileName));
		}
	}

}
