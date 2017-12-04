package ch10;

import java.text.DecimalFormat;

/**
 * @author sharpen
 * 숫자 형식을 다른 형식으로 변형하는 예제.
 */
class DecimalFormatEx02 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			Number num = df.parse("1,234,567.89");
			System.out.print("1,234,567.89" + "->" );
			
			double d = num.doubleValue();
			System.out.print(d + " -> ");
			
			System.out.println(df2.format(num));
		} catch (Exception e) {
			
		}
	}

}
