package review;

public class Morning {
	//�ʵ�
	String color="����";
	private int km=0;
	private int price=0;
	
	
	//������
	Morning(String color,int price){
		this.color=color;
		this.price=price;
	}
	Morning(){
	
	}
	Morning(String color){
			this.color=color;
	}
	
	
	//�޼ҵ�
	void showcolor() {
		System.out.println(color);
	}
	void lyscar() {
		System.out.println(color);
	}
	void run(int aa) {
		this.km+=aa;
	}
	int showKm() {
		return km;
	}
	void use(int ii) {
		this.price-=ii;
	}
	void nowPrice() {
		System.out.println(price);
	}
}
