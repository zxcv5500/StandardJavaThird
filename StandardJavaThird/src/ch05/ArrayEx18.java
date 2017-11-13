package ch05;

public class ArrayEx18 {

	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100}
				, { 20, 20, 20}
				, { 30, 30, 30}
				, { 40, 40, 40}
		};
		
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d ", i, j, score[i][j]);		// 본문과는 다르게 2차원 배열모양으로 나타내도록 개행 별도처리
				
				if (j == 2) {		// 열이 2가 되면 행을 변경하도록 개행명력을 수행한다.
					System.out.println();
				}
			}
		}
		
		for (int[] tmp : score) {
			for (int i : tmp) {
				sum += i;
			}
		}
		
		System.out.println("sum=" + sum);
	}

}
