package LletresExtra;
import java.util.*;

public class LletresInteractiuFase2 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		printLletres(getName());
	}
	public static ArrayList<Character> nameToList(String s){
		ArrayList<Character> name = new ArrayList<>();
		for(char c : s.toCharArray()) {
			name.add(c);
		}
		return name;
	}
	public static boolean isVocal(char c) {
		c = Character.toLowerCase(c);
		if((c == 'a')||(c == 'e')||(c == 'i')||(c == 'o')||(c == 'u')) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean hasNumber(String s) {
		boolean digit = false;
		for(char c : s.toCharArray()) {
			if(Character.isDigit(c)) {
				digit = true;
				break;
			}
		}
		return digit;
	}
	public static void printLletres(String s) {
		if(hasNumber(s)) {
			System.out.println("Els noms de persones no contenen números!");
		}else {
			System.out.printf("Lletra\tTipus\n");
			System.out.printf("------\t-----\n");
			for(int i = 0; i < nameToList(s).size(); i++) {
				System.out.printf("%c\t%s\n", nameToList(s).get(i), tipusLletra(nameToList(s).get(i)));
			}
		}
	}
	public static String tipusLletra(char c) {
		if(isVocal(c)){
			return "VOCAL";
		}else {
			return "CONSONANT";
		}
	}
	public static String getName() {
		System.out.println("Escriu el teu nom: ");
		return in.nextLine();
	}

}
