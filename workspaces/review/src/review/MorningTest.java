package review;

public class MorningTest{

	public static void main(String[] args) {
		
		Morning morning=new Morning();
		morning.showcolor();
		morning.color="red";
		morning.showcolor();

		Morning lyscar=new Morning("레인보우",1800);//색상과 차 가격 입력
		lyscar.showcolor();
		lyscar.run(100);
		lyscar.run(400);
		lyscar.run(350);
		System.out.println(lyscar.showKm());
		
		lyscar.use(100);  //감가상각비용
		//현재가치 1000이였으면 900
		lyscar.nowPrice();//이차의 현재 가격이 나와야 900
		
		Morning yhicar=new Morning("화이트펄");
		yhicar.showcolor();
		yhicar.run(1);
		System.out.println(yhicar.showKm());
	}

}
