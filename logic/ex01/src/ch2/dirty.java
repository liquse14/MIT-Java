package ch2;

import java.util.Random;
import java.util.Scanner;

public class dirty {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int input;
		for(;;) {
			//1.1~20개의 숫자중 컴퓨터가 하나의 숫자를 정하기 (5% 확률)
			int sword=ran.nextInt(20)+1;
			//2.사용자로 부터 하나의 숫자 입력받기
			System.out.println("뽑아라(1~20):");
			input=scan.nextInt();
			//3. 컴퓨터가 정한 숫자와 사용자의 입력확인하기 실패시 무한 반복
			if(input==sword) {
				System.out.println("축하합니다. 뽑으셨군요");
				break;
			}else {
				System.out.println("다시한번 기회를 드리겠습니다.");
			}
		}
		//4.강화멘트 출력후 사용자 입력받기
		int value=0;	//강화값
		int count=0;	//강화횟수
		int drng=1;
		do {
			count++;
			System.out.println("강화하시겠습니까?(1.yes 2.no)");
			input=scan.nextInt();
			if(input==2) {
				System.out.println("최종결과물은 집행검 +" + value + "입니다.");
				break;
			}
			//5.강화 요청시 강화해보기	
			int check1=ran.nextInt(2*drng);	//최초 50%확률 - 뽑은값
			int check2=ran.nextInt(2*drng);	//확인값
			drng=drng*2;	//확률 반으로 줄어듬
			if(check1==check2) {
				value++;
				System.out.println("강화성공!!!! 집행검(" + value +")" );
			}else {
				System.out.println("강화실패! 집행검이 부셔졌습니다.");
				break;
			}
		}while(count!=10); //최대 10강화
		System.out.println("끝");
		
		
		
		
		
		
	}

}