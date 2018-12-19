package Lletres;
import java.util.*;

public class LletresFase3 {
	static List<Character> nameList;
	
	public static void main(String[] args) {
		nameList = initName();
		printWord(nameList);
		printHeader();
		printCharacterCount(characterCount(nameList));		
	}
	public static List<Character> initName(){
		return new ArrayList<>(Arrays.asList('A', 'l', 'e', 'j', 'a', 'n', 'd', 'r', 'o'));
	}
	public static void printWord(List<Character> word) {
		System.out.print("La paraula \"");
		for(int i = 0; i < word.size(); i++) {
			System.out.printf("%c", word.get(i));
		}
		System.out.printf("\" conté: \n\n");
	}
	public static void printHeader() {
		System.out.printf("Lletra\tQuantitat\n");
		System.out.printf("------\t---------\n");
	}
	public static Map<Character, Integer> characterCount(List<Character> word) {
		Map<Character, Integer> characterMap = new HashMap<>();
		for(int i = 0; i < word.size(); i++) {
			if (characterMap.containsKey(Character.toUpperCase(word.get(i)))){
				characterMap.put(Character.toUpperCase(word.get(i)), characterMap.get(Character.toUpperCase(word.get(i)))+1);
			}else {
				characterMap.put(Character.toUpperCase(word.get(i)), 1);
			}
		}
		return characterMap;
	}	
	@SuppressWarnings("rawtypes")
	public static void printCharacterCount(Map<Character, Integer> mapChars) {
		Set set = mapChars.entrySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry mentry = (Map.Entry)iter.next();
			System.out.printf("%c\t%d\n", mentry.getKey(), mentry.getValue());
		}		
	}
}
