package study.chap05;

import java.util.Scanner;

public class ArrayReview {

	public static void main(String[] args) {
		// 일차원 배열
		int[] arr1 = { 1, 2, 3, 4 };	// 배열의 크기가 4
		for(int i = 0;i < arr1.length;i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();	// 줄 바꾸기
		
		int arr2[];	// 선언
//		arr2 = { 1, 2, 3, 4, 5 };	// 초기화 : 에러 발생
			// 선언과 함께 초기화를 수행하여야 함.
		arr2 = new int[5];	// new 생성자 -> 초기화가 0으로(default)
		int num = 1;
		for(int i = 0;i < arr2.length;i++) {
			arr2[i] = num++;
		}
		for(int i = 0;i < arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("배열의 크기 : ");
		int len = scanner.nextInt();
		double darr[] = new double[len];	// 배열의 크기를 변수
		System.out.println("배열 darr의 크기 = " + darr.length);
		*/
		// 배열도 클래스(객체) -> 객체를 생성하려면 new 생성자를 사용
		int arr3[] = new int[5];	// 초기화가 0인지?
		for(int i = 0;i < arr3.length;i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
	}

}
