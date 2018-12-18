package LletresExtra;
import java.util.*;

public class LletresFase3_TreeMap {
	static ArrayList<Character> nameList = new ArrayList<>(Arrays.asList('A', 'l', 'e', 'j', 'a', 'n', 'd', 'r', 'o'));
	
	public static void main(String[] args) {
		printWord(nameList);
		printCapcelera();
		printQuantitatLletres(comptaLletres(nameList));		
	}
	public static void printWord(ArrayList<Character> word) {
		System.out.print("La paraula \"");
		for(int i = 0; i < word.size(); i++) {
			System.out.printf("%c", word.get(i));
		}
		System.out.printf("\" conté: \n\n");
	}
	public static void printCapcelera() {
		System.out.printf("Lletra\tQuantitat\n");
		System.out.printf("------\t---------\n");
	}
	public static TreeMap<Character, Integer> comptaLletres(ArrayList<Character> word) {
		TreeMap<Character, Integer> mapaLletres = new TreeMap<>();
		for(int i = 0; i < word.size(); i++) {
			if (mapaLletres.containsKey(Character.toUpperCase(word.get(i)))){
				int j = mapaLletres.get(Character.toUpperCase(word.get(i)));
				j ++;
				mapaLletres.put(Character.toUpperCase(word.get(i)), j);
				
			}else {
				mapaLletres.put(Character.toUpperCase(word.get(i)), 1);
			}
		}
		return mapaLletres;
	}	
	@SuppressWarnings("rawtypes")
	public static void printQuantitatLletres(TreeMap<Character, Integer> llistaQ) {
		Set lletres = llistaQ.entrySet();
		Iterator iter = lletres.iterator();
		while(iter.hasNext()) {
			Map.Entry mentry = (Map.Entry)iter.next();
			System.out.printf("%c\t%d\n", mentry.getKey(), mentry.getValue());
		}		
	}
}
