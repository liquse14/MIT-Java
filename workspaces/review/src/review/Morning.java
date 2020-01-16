package review;

public class Morning {
	//필드
	String color="무색";
	private int km=0;
	private int price=0;
	
	
	//생성자
	Morning(String color,int price){
		this.color=color;
		this.price=price;
	}
	Morning(){
	
	}
	Morning(String color){
			this.color=color;
	}
	
	
	//메소드
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
