package study.chap05;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		// ������ : ������ �Է� �޴´� -> �ְ������� �������
		// ���� : �ּҰ�=0, �ִ밪=100
		// �ִ밪�� ���� �ʱ�ġ : 
		// �޴��� ���� : 1.�л��� (�迭�� ũ��)
		// 			 2. �����Է�->�迭�� ����, �ִ밪�� ���� ���Ѵ�.
		// 			3. ���� ����Ʈ : �迭�� ���
		//			4. �м� : �ְ�����, ��� ���
		//			5. ���� -> run = false
		int max = -1;	// �ʱ�ġ�� �ּҰ� -> �Է� �����ʹ� �ִ밪 (���� : ���Ǵ� ����)
		boolean run = true;	// �޴��� �Է� �ޱ� ���� �ݺ��� -> while
		int studentNum = 0;	// �л� ��
		Scanner scanner = new Scanner(System.in);
		int scores[] = null;	// 1���� �迭 ����(��������)
		int sum;	// ����
		double avg;	// ���
		
		while(run) {	// ������ �ݺ�
			// Ư�� ���� : ���� �޴��� ���� -> �ݺ����� ������� ó��
			System.out.println("--------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.���� ����Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();	// int �Է�(�޴�)
			
			if(selectNo == 1) {	// �л� ��
				// �л� ��> 3
				System.out.print("�л� ��> ");	// �л� ��> 
				studentNum = scanner.nextInt();
				// �迭�� ����
				scores = new int[studentNum];	// 1���� �迭�� ����
			} else if(selectNo == 2) {	// ���� �Է�
				// �л� ����ŭ ������ �Է�
				// scores[0]> 80
				for(int i = 0;i < studentNum;i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
				// �ִ밪�� ��->���
			} else if(selectNo == 3) {
				for(int i =0;i < studentNum;i++) {
					// scores[0]: 85
					System.out.println("scores["+ i + "]: " + scores[i]);
				}
			} else if(selectNo == 4) {	// �м� : �ְ�����, ������� ���
				// �ְ� ����: 95
				// ��� ����: 91.0
				max = -1;	// �޴��� 4.�м��� ������ ������ �ٽ� ���
				sum = 0;
				for(int i = 0;i < studentNum;i++) {
					// ���ο� �ִ밪�� ���Ѵ�.
					if(max < scores[i])
						max = scores[i];
					// ���� ���Ѵ�.
					sum += scores[i];
				}
				avg = (double)sum / studentNum;
				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + avg);
			} else if(selectNo == 5) {	// ����
				run = false;	// �ݺ����� ���ǽ� run-> �ݺ����� ����� ����
			}
		}
		System.out.println("���α׷� ����");
	}

}
