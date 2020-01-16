package p129;

import java.util.HashMap;

public class MapTest {
	
	public static void main(String[] args) {
		HashMap<String,Integer>scores=new HashMap<>();
		
		scores.put("ken", 100);
		
		scores.remove("ken");
		
		scores.size();
		
		scores.containsKey("ken");
		
		scores.containsValue(100);
	}

}
