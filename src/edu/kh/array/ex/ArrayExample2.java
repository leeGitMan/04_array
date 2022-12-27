package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayExample2 {
	
	// 얕은 복사 ( shallow: 앝은)
	// -> 주소를 복사하여 서로 다른 두 변수가(같은 주소다!!) => 같은 주소 같은 값
	//	  하나의 배열(또는 객체)을 참조하는 상태를 만드는 복사 방법
	public void shallowCopy() {
		
		int arr[] = {1,2,3,4,5};
		
		//얕은 복사 진행
		int[] copyArr = arr;  // 주소만 복사
		System.out.println("주소확인");
		System.out.println("arr : " + arr);
		System.out.println("copyArr : " + copyArr);
		System.out.println();
		
		// 배열 값 변경
		
		System.out.println("변경 전");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		System.out.println();
		
		// 얕은 복사한 배열의 값을 변경 해보자
		
		copyArr[2] = 999;
		
		System.out.println("변경 후");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
	
	}
	
	public void deepCopy() {
		
		// 깊은 복사(deep) -> 다른 주소 같은 값  
		// - > 같은 자료형의 새로운 배열을 만들어서
		// 기존 배열의 데이터를 모두 복사하는 방법
		
		int arr[] = {1,2,3,4,5};
		
		// 1. for문을 이용한 깊은 복사
		
		int copyArr1[] = new int[arr.length]; // 5칸 짜리 배열 생성
		
		for(int i = 0; i < arr.length; i++) {
			copyArr1[i] = arr[i];
		}
		
		// 2. System.arrycopy(원본 배열, 원본 복사 시작 인덱스, 복사 배열,
							//복사 삽입 시작 인덱스, 복사 길이)
		
		
		int copyArr2[] = new int[arr.length];
		
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		
		// 3. Array.copyOf(원본 배열, 복사할 길이);
		
		int copyArr3[] = Arrays.copyOf(arr, arr.length);
		
		// 값 변경 후 확인 해보자
		
		copyArr1[4] = 0;
		copyArr2[4] = 10000;
		copyArr3[4] = 50000;
		
		System.out.println("원본");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println();
		System.out.println("변경 후");
		System.out.println("Arr1 : " + Arrays.toString(copyArr1)); // 값은 같고 원본과 주소값은 다르다
		System.out.println("Arr2 : " + Arrays.toString(copyArr2)); // 값은 같고 원본과 주소값은 다르다
		System.out.println("Arr3 : " + Arrays.toString(copyArr3)); // 값은 같고 원본과 주소값은 다르다
		

	}
	
	public void createLottoNumber() {
		
		
		//로또 번호 생성기
		//[6,12,16,20,21,42]
		
		// 1. 1~ 45 사이 중복되지 않는 난수 6개 생성 => Math.randon()
		// 2. 생성된 난수가 오름차순으로 정렬 => Arrays.sort()
		
		// 1) 정수 6개 저장할 배열 선언 및 할당
		
		int[] lotto = new int[6];
		
		// 2) 생성된 배열을 처음부터 끝까지 순차 접근하는 for문 작성
		
		for(int i = 0; i < 6; i++) {
			// 3) 1~ 45 사이의 난수 생성
			int random = (int) (Math.random() * 45 + 1);
			// 0.0 <= x < 1.0    Math.random()
			// 0.0 <= x * 45 < 45.0   Math.random() * 45
			// 1.0 <= x & 45 + 1 <46   Math.random() * 45 + 1
			// 1 <= (int) ( x * 45 + 1) < 46
			// 위 과정
			
			// 4) 생성된 난수를 순서대로 배열 요소에 대입
			
			lotto[i] = random;
			
			// 5) 중복 검사를 위한 for문 작성
			
			for(int e = 0; e < lotto.length; e++) {
				// 6) 현재 생성된 난수와 같은 수가 앞쪽 인데스에 있는지 검사
				if(random == lotto[e]) {
					i--;
					// i 가 1씩 증가할 때 마다 난수가 하나 생성
					// -> 중복 값이 있으므로 난수를 하나 더 생성해야한다.
					// -> i는 기본적으로 0~5까지 6회 반복 되지만
					//	 	i값을 인위적으로 1 감소 시켜서 7회 반복되는 모양을 만듦.
					break;
					// 앞쪽에서 중복 데이터를 발견하면
					// 남은 값을 비교할 필요 없이 난수를 다시 생성하러 감 ==> 효율 향상
				}
			}
		} // for문 끝
		// 7) 오름차순 (낮은 -> 높은)
		// 선택, 삽입, 버블, 퀵 정렬 
		// --> 자바가 정렬 방법을 미리 만들어서 제공
		//	 Arrays.sort(배열명) : 배열 내 값들이 오름차순으로 정렬됨
		// 시간복잡도, 효율~! 공부하기
		
		Arrays.sort(lotto);
		
		// 결과 출력
		
		System.out.println(Arrays.toString(lotto));
	}
	
}
