package ch05;

class ArrayEx11 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for (int i=0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10);		// 0~9의 임의의 수를 배열에 저장
			System.out.print(numArr[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++;			//i의 값이 0인 경우를 가정하면, numArr[0]의 값이 4라고 가정하자. 
											//그래서 counter[4]의 값!!을 1증가 시키라는 의미임. 같은 배열 인덱스가 될 때마다 1씩 카운팅이 올라감.
		}
		
		for (int i=0; i < numArr.length; i++) {
			System.out.println(i + "의 개수 : " + counter[i]);
		}
	}

}
