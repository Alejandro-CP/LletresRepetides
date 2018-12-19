package Lletres;
import java.util.*;

public class LletresFase2 {
	static List<Character> nameList;
	
	public static void main(String[] args) {
		nameList = initName();
		printCharacterList(nameList);
	}
	public static List<Character> initName() {
		return new ArrayList<>(Arrays.asList('A', 'l', 'e', 'j', 'a', 'n', 'd', 'r', 'o'));
	}
	public static boolean hasNumber(List<Character> word) {
		for(int i = 0; i < word.size(); i++) {
			if(Character.isDigit(word.get(i))) {
				return true;
			}
		}
		return false;
	}
	public static void printCharacterList(List<Character> word) {
		if(hasNumber(word)) {
			System.out.println("Els noms de persones no contenen números!");
		}else if(!allCharacters(word)) {
			System.out.println("Els noms de persones només contenen lletres!");
		}else{
			printHeader();
			printCharacterType(word);
		}
	}
	public static void printHeader() {
		System.out.printf("Lletra\tTipus\n");
		System.out.printf("------\t-----\n");
	}
	public static void printCharacterType(List<Character> word){
		for(int i = 0; i < word.size(); i++) {
			System.out.printf("%c\t%s\n", word.get(i), lookCharacterType(word.get(i)));
		}
	}
	public static String lookCharacterType(char c) {
		c = Character.toLowerCase(c);
		if((c == 'a')||(c == 'e')||(c == 'i')||(c == 'o')||(c == 'u')) {
			return "VOCAL";
		}else {
			return "CONSONANT";
		}
	}
	public static boolean allCharacters(List<Character> word) {
		for(int i = 0; i < word.size(); i++) {
			if(!Character.isLetter(word.get(i))) {
				return false;
			}
		}
		return true;
	}

}
