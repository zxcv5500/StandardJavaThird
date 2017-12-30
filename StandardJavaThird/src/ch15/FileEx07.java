package ch15;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author zxcv5500
 * 특정 조건에 맞는 파일의 목록을 얻어오는 코드( 이클립스 용으로 변환했다. )
 * 이클립스의 user.dir은 D:\GithubEclipseRepo\StandardJavaThird\StandardJavaThird과 같이 나오기 때문에 src/ch15의 경로를 추가해줘야 동작하기 때문이다.
 * args는 run configurations에서 따로 지정해 줘야 한다.
 */
class FileEx07 {

	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.out.println("USAGE : java FileEx07 pattern");
			System.exit(0);
		}
		
		String currDir =  System.getProperty("user.dir");
		
		File dir = new File(currDir + File.separator + "src" + File.separator + "ch15");
		
		final String pattern = args[0];
		
		// String[] list (FilenameFilter filter)
		String[] files = dir.list(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.indexOf(pattern) != -1;
			}
		});
		
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}

}
