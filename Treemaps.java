package maps;
import java.util.Map;
import java.util.TreeMap;

public class Treemaps {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> map= new TreeMap<Integer, String>();
		map.put(1, "kanna");
		map.put(2, "dude");
		map.put(3, "me");
		map.put(4, null);
		map.put(5, "dot");
		
		System.out.println(map);
		System.out.println("Get 3: "+map.get(3));
		System.out.println("Get 5: "+map.get(5));
		System.out.println("Get 4: "+map.get(4));
		System.out.println("Get 6: "+map.get(6));
		
		map.remove(5);
		System.out.println(map);
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" , "+m.getValue());
		}
		
		
	}

}
