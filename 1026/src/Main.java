import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Map<String,Integer>  prefs = new HashMap<String,Integer>();
		prefs.put("Kyoto",255);
		prefs.put("Tokyo",332);
		/*testtest*/

		int tokyo = prefs.get("Tokyo");
		System.out.println(tokyo);

		for (String key :prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(value + key);
		}

	}



}
