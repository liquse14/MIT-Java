package review;

public class MorningTest{

	public static void main(String[] args) {
		
		Morning morning=new Morning();
		morning.showcolor();
		morning.color="red";
		morning.showcolor();

		Morning lyscar=new Morning("���κ���",1800);//����� �� ���� �Է�
		lyscar.showcolor();
		lyscar.run(100);
		lyscar.run(400);
		lyscar.run(350);
		System.out.println(lyscar.showKm());
		
		lyscar.use(100);  //�����󰢺��
		//���簡ġ 1000�̿����� 900
		lyscar.nowPrice();//������ ���� ������ ���;� 900
		
		Morning yhicar=new Morning("ȭ��Ʈ��");
		yhicar.showcolor();
		yhicar.run(1);
		System.out.println(yhicar.showKm());
	}

}
