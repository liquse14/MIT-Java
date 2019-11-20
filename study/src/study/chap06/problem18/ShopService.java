package study.chap06.problem18;

public class ShopService {
	// 教臂沛 父靛绰 规过
	private static ShopService instance = new ShopService();
	
	// 积己磊
	private ShopService() { }
	
	// Getter
	public static ShopService getInstance() {
		return instance;
	}
}
