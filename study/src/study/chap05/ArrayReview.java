package study.chap05;

import java.util.Scanner;

public class ArrayReview {

	public static void main(String[] args) {
		// ������ �迭
		int[] arr1 = { 1, 2, 3, 4 };	// �迭�� ũ�Ⱑ 4
		for(int i = 0;i < arr1.length;i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();	// �� �ٲٱ�
		
		int arr2[];	// ����
//		arr2 = { 1, 2, 3, 4, 5 };	// �ʱ�ȭ : ���� �߻�
			// ����� �Բ� �ʱ�ȭ�� �����Ͽ��� ��.
		arr2 = new int[5];	// new ������ -> �ʱ�ȭ�� 0����(default)
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
		System.out.print("�迭�� ũ�� : ");
		int len = scanner.nextInt();
		double darr[] = new double[len];	// �迭�� ũ�⸦ ����
		System.out.println("�迭 darr�� ũ�� = " + darr.length);
		*/
		// �迭�� Ŭ����(��ü) -> ��ü�� �����Ϸ��� new �����ڸ� ���
		int arr3[] = new int[5];	// �ʱ�ȭ�� 0����?
		for(int i = 0;i < arr3.length;i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
	}

}
