import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		String s = "abacabaabacaba";

		char firstNotRepeatingCharacter = firstNotRepeatingCharacter(s);
		System.out.println(firstNotRepeatingCharacter);
	}

	static char firstNotRepeatingCharacter(String s) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		char[] array = s.toCharArray();
		
		for (int i = 0; i < array.length; i++) {
			char arr = array[i];
			if(!map.containsKey(arr)) {
				map.put(arr, 1);
			} else {
				map.put(arr, map.get(arr) + 1);
			}
		}

		for (int i = 0; i < array.length; i++) {
			if(map.get(array[i]) == 1) {
				return array[i];
			}
		}
		return '_';
	}
}
