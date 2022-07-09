package practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void method1() {
		//배열 실습문제 1번
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수인 양의 정수 입력 : ");
		int[] arr = new int[sc.nextInt()];
		
		//증가하는 for문
		int num = 1;
		for(int i = 0; i < arr.length/2; i++) {
			arr[i] = num++;
			System.out.print(arr[i] + " ");
		}
		//감소하는 for문
		for(int i = arr.length/2; i < arr.length; i++) {
			arr[i] = num--;
			System.out.print(arr[i] + " ");
		}
	}
	public void method2() {
		//배열 실습문제 2번
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기 입력 : ");
		String[] strArr = new String[sc.nextInt()];
		
		sc.nextLine();
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(i+1 + "번째 문자열 : ");
			strArr[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.print("더 값을 입력하시겠습니까? (Y/N) : ");
			String select = sc.nextLine();
			
			if(select.toUpperCase().equals("Y")) {
				System.out.print("추가할 개수 : ");
				int add = sc.nextInt();
				String[] newArr = new String[strArr.length + add];
				System.arraycopy(strArr, 0, newArr, 0, strArr.length);
				
				sc.nextLine();
				
				for(int i = strArr.length; i < newArr.length; i++) {
					System.out.print(i+1 + "번째 문자열 : ");
					newArr[i] = sc.nextLine();
				}	
				strArr = newArr;
			}else if(select.toUpperCase().equals("N")) {
				System.out.println(Arrays.toString(strArr));
				break;
			}
		}
	}
}
