package test;

public class Exercise5 {
public static void main(String[] args) {
	int i=0;
	int j=0;
	while(i + j != 6) {
		i = rand();	// �ֻ��� 1��°
		j = rand();	// �ֻ��� 2��°
		System.out.println("(" + i + ", " + j + ")");
	}
}

private static int rand() {
	return (int)(Math.random() * 6 + 1);
}

}
