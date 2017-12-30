package ch15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sharpen
 * 현재 디렉토리에 속한 파일과 디렉토리의 이름과 크기 등의 상세정보를 보여 주는 예제
 */
class FileEx04 {

	public static void main(String[] args) {
		String currDir = System.getProperty("user.dir");
		File dir = new File(currDir);
		
		File[] files = dir.listFiles();
		
		for (int i=0; i < files.length; i++) {
			File f = files[i];
			String name = f.getName();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mma");
			String attribute = "";
			String size = "";
			
			if (files[i].isDirectory()) {
				attribute = "DIR";
			} else {
				size = f.length() + "";
				attribute = f.canRead() ? "R" : " ";
				attribute = f.canWrite() ? "W" : " ";
				attribute = f.isHidden() ? "H" : " ";
			}
			
			System.out.printf("%s %3s %6s %s \n", df.format(new Date(f.lastModified())), attribute, size, name);
		}
	}

}
