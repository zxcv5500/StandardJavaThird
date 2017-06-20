package ch05;

class ArrayEx10 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int) (Math.random() * 10));
		}
		
		System.out.println();
		
		for (int i = 0; i < numArr.length; i++) {
			boolean changed = false;		//자리 바꿈이 발생했는지 체크한다.
			
			for (int j = 0; j < numArr.length-1-i ; j++) {
				if (numArr[j] > numArr[j+1]) {		// 옆의 값이 작으면 서로 바꾼다.
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;		// 자리바꿈이 발생했으니 changed를 true.
				}				
			}
			
			if (!changed)	break;		// 자리 바꿈이 없으면 반복문을 벗어난다.
			
			for (int k = 0; k < numArr.length; k++) {
				System.out.print(numArr[k]);		// 정렬된 결과를 출력한다.
			}
			System.out.println();
			
			
		}
	}

}
