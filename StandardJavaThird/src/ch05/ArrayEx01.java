package ch05;

class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5];
		int k = 1;
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;
		score[3] = 80;
		score[4] = 90;
		
		int tmp = score[k+2] + score[4];		// int tmp = score[3] + score[4]
		
		// for문으로 배열의 모든 요소를 출력한다.
		for (int i = 0; i < 5; i++) {
			System.out.printf("score[%d]:%d%n", i, score[i]);
		}
		
		System.out.printf("tmp:%d%n", tmp);
		System.out.printf("score[%d]:%d%n", 7, score[7]);			// index의 범위를 벗어난 값
		
		/* 출력 결과 인덱스가 유효한 범위를 넘었다는 뜻이다. 
		score[Exception in thread "main" 0]:50
score[1]:60
score[2]:70
score[3]:80
score[4]:90
tmp:170
java.lang.ArrayIndexOutOfBoundsException: 7
	at ch05.ArrayEx1.main(ArrayEx1.java:24)
		*/
	}

}
