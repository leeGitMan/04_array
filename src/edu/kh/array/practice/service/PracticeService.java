package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	public void practice1() {
		
		int[] arr = new int[9];
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			
			if (i % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("\n짝수 번째 인덱스 합: " + sum);
	}
	
	public void practice2() {
		int[] arr = new int[9];
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			System.out.print(arr[i] + " ");
			
			if(i %2 == 1 ) {
				sum += arr[i];
			}
		}
		System.out.println("\n홀수 번째 인덱스 합: " + sum);
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양의 정수: ");
		int[] arr = new int[sc.nextInt()];
		
		for (int i = 0; i <= arr.length; i++) {
			arr[i]= i + 1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner (System.in);
		
		int [] arr = new int[5];
		
		for(int i = 0; i <= arr.length; i++) {
			System.out.printf("입력 %d : ", i);
			arr[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int search = sc.nextInt();
		boolean flag = true;
		
		for(int i = 0; i <= arr.length; i++) {
			if (arr[i] == search) {
				System.out.println("인덱스: " + i);
				flag = false;
				break;
			}
		}
		
		if (flag) System.out.println("일치하는 값이 존재하지 않습니다.");
	}

	public void practice5() {
		// 1. 사용자에게 문자열과 문자 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열: ");
		String str = sc.nextLine();
		
		//2. 사용자가 입력한 문자열 (str)을 문자 하나하나 char배열에 넣기
		// 먼저 사용자가 입력한 문자열 길이만큼의 char 배열을 할당
		char[] arr = new char[str.length()];
		
		//반복문을 통해 str.charAt(i) 값을 arr[i]에 담는 과정
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		System.out.print("문자: ");
		char ch = sc.nextLine().charAt(0);
		
		// 3. 검색할 문자가 문자열에 몇개가 들어가는지와 어느 인덱스에 있는지 파악
		int count = 0; // 검색할 문자가 문자열에 몇개가 들어있는지를 세어줄 변수
						// 문자열에서 동일한 문자가 발생할 때마다 1씩 증가
		
		// 반복문 수행 전 문자열 출력
		System.out.print( str + "에 " + ch + "가 존재하는 위치(인덱스): ");
		
		// 인덱스마다 접근하기 위해 반복문 사용
		for (int i = 0; i < arr.length;i++) {
			if(arr[i]== ch) { //해당 인덱스 값이 검색될 문자와 같을 경우
				System.out.print(i + " "); // 해당 인덱스 이어서 출력
				
				count ++;   //그리고 count 1 증가
			}
		}
		// 위에서 print()를 사용했기 때문에 개행이 되어있지 않음
		System.out.println();
		System.out.println( ch + "개수: " + count);
	}
	
	public void practice6() {
		//1. 사용자가 배열릐 길이를 직접 입력하여 그 값만큼 정수영 배열을 선언 할당하고
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		// 2. 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("배열 " + i + "번째 인덱스에 넣을 값: ");
			arr[i] = sc.nextInt();
		}
		
		//3. 전체 값 나열 및 총 합 출력
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("총 합: " + sum);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함): ");
		String input = sc.next();
		
		char[] arr = new char[input.length()];
		
		for(int i= 0; i < arr.length; i++) {
			
			if(i <= 7) { //7번 인덱스 이하 (생년월일, - , 성별)
			arr[i] = input.charAt(i);
		}else { //8번 인덱스 부터는 *
			arr[i] = '*';
		}
		System.out.print(arr[i]);
		}
	}	

	public void practice8() {
		//3이상인 홀수를 입력받아 
		Scanner sc = new Scanner(System.in);
		while(true) { //3이상의 수가 입력될 때까지 무한 반복
					// -> 3 이상이 입력되면 break로 종료
			System.out.print("정수: ");
			int input = sc.nextInt();
			
			if(input < 3 || input %2 == 0) {//3미만 또는 짝수인 경우-> 반복
				System.out.println("다시 입력하세요");
			}else { 
				//입력 받은 정수 만큼의 크기를 가지는 배열 생성
				int[] arr = new int[input];
				
				int num = 0; //arr 배열에 대입될 값
				
				for(int i = 0; i < arr.length; i++) {
					if(i <= arr.length/2) {
						arr[i] = ++num;
					}else {//중간 이후 감소
						arr[i] = --num;
					}
					// 출력 시, 추가 (단, 마지막 제외)
					if(i == arr.length - 1) { //마지막 바퀴
						System.out.print(arr[i]);
					}else {
						System.out.print(arr[i] + ", ");
					}
				}
				break; //while 반복문 멈춤
			}
			
		}
	
	
		
		
	}
	
	public void practice9() {

		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1 );
		}
		System.out.print("발생한 난수: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print( arr[i] + " ");
		}
	}

	public void practice10() {
		// 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		int[] arr = new int[10];

		// 2. 각 인덱스에 1부터 10 사이의 난수를 발생시켜 초기화 후 출력
		for(int i= 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
		System.out.println(); //줄바꾸기
		
		//3. 반복문을 통해 최대값 최소값 알아내기
		int max = 0;
		int min = 10;
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
		}
			if (arr[i]< min) {
				min = arr[i];
			}
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

	public void practice11() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice12() {
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int j = 0; j< i; j++) {
				if( lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < lotto.length; i++) {
			for(int j = i + 1; j < lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
					}
				}
			}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void practice13() {
		// 1. 사용자에게 문자열 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열: ");
		String str = sc.nextLine();
		
		// 2. 해당 문자열들을 char[]에 담기
		char[] arr = new char [str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		//3. char배열에서 중복값 존재할 경우 출력 X
		int count = 0;
		
		System.out.print("문자열에 있는 문자: ");
		
		for(int i = 0; i < arr.length; i++) {
			boolean flag = true; // 중복체크용 flag
			
			for( int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					flag = false; // 중복이 발생했을 때
					break;
				}
			}
			if(flag) { //중복이 발생하지 않았을 경우
				
				if( i == 0) {
					System.out.print(arr[i]);
				}else {
					System.out.print("," + arr[i]);
				}
				
				count++;
			}
		}
 		System.out.println();
 		System.out.println("문자개수: " + count);
	}
	
	public void practice14() {
		//1. 배열 크기 지정
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하시오: ");
		int size = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[size];
		
		//2. 첫 배열에 저장할 문자열 입력받기
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 문자열: ");
			arr[i] = sc.nextLine();
			}
		
		//3. 반복이 시작되는 구간부터 무한루프로 작성하여 내부에 종료조건을 만들어서 break
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			// 4. 값을 더 입력할 경우
			if( ch == 'y' || ch == 'Y') {
				
				//5. 더 입려받을 개수 입력 받기
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine();
				
				//6. 새로 값을 입력 받을 배열 생성 -> 기존 배열크기 + 추가 입력 개수
				String[] newArr = new String[arr.length + addSize];
				
				//7.배열 복사 + 새로운 문자열 입력받기
				for(int i = 0; i<newArr.length; i++) {
					if( i < arr.length) { // 인덱스의 크기가 기좀 배열보다 작을 경우 기존 배열값
						newArr[i] = arr[i];
					}else { // 인덱스의 크기가 기존 배열보다 클 경우 새로운 문자열 입력 받기
						System.out.print((i+1) + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
				}
				
				//8. 기존 배열공간을 참조하던 변수 arr에 새로운 배열공간의 주소 newArr대입
				arr = newArr;
			}else if( ch == 'n' || ch == 'N') {//9. 값을 더 입력하지 않은 경우
				break; //반복문 종료
			}else { // 잘못 입력한 경우
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
	
}
