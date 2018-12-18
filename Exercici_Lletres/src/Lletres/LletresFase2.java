package Lletres;
import java.util.*;

public class LletresFase2 {
	static ArrayList<Character> nameList = new ArrayList<>(Arrays.asList('A', 'l', 'e', 'j', 'a', 'n', 'd', 'r', 'o'));

	public static void main(String[] args) {
		printLletresLlista(nameList);
	}
	public static boolean teNumero(ArrayList<Character> word) {
		boolean digit = false;
		for(int i = 0; i < word.size(); i++) {
			if(Character.isDigit(word.get(i))) {
				digit = true;
				break;
			}
		}
		return digit;
	}
	public static void printLletresLlista(ArrayList<Character> word) {
		if(teNumero(word)) {
			System.out.println("Els noms de persones no contenen números!");
		}else if(!totLletres(word)) {
			System.out.println("Els noms de persones només contenen lletres!");
		}else{
			printCapcelera();
			printLletraTipus(word);
		}
	}
	public static void printCapcelera() {
		System.out.printf("Lletra\tTipus\n");
		System.out.printf("------\t-----\n");
	}
	public static void printLletraTipus(ArrayList<Character> word){
		for(int i = 0; i < word.size(); i++) {
			System.out.printf("%c\t%s\n", word.get(i), miraTipusLletra(word.get(i)));
		}
	}
	public static String miraTipusLletra(char c) {
		c = Character.toLowerCase(c);
		if((c == 'a')||(c == 'e')||(c == 'i')||(c == 'o')||(c == 'u')) {
			return "VOCAL";
		}else {
			return "CONSONANT";
		}
	}
	public static boolean totLletres(ArrayList<Character> word) {
		boolean nomesLletres = true;
		for(int i = 0; i < word.size(); i++) {
			if(!Character.isLetter(word.get(i))) {
				nomesLletres = false;
				break;
			}
		}
		return nomesLletres;
	}

}
