package Lletres;
import java.util.*;

public class LletresFase4 {
	static ArrayList<Character> name = new ArrayList <>(Arrays.asList('A','l','e','j','a','n','d','r','o'));
	static ArrayList<Character> surname = new ArrayList <>(Arrays.asList('C','a','l','l','e','-','P','r','a','d','o'));

	public static void main(String[] args) {
		printList("Name", name);
		printList("Surname", surname);
		printList("Full name", junta2Paraules(name, surname));
	}
	public static void printList(String s, ArrayList<Character> words) {
		System.out.print(s+": [");
		//System.out.print("[");
		for(int i = 0; i < words.size() - 1; i++) {
			System.out.print("\'"+Character.toUpperCase(words.get(i))+"\',");
		}
		System.out.println("\'"+Character.toUpperCase(words.get(words.size()-1))+"\']");
	}
	public static ArrayList<Character> junta2Paraules(ArrayList<Character> word1, ArrayList<Character> word2){
		ArrayList<Character> paraulesJuntes = new ArrayList<>();
		afegeixParaula(word1,paraulesJuntes);
		paraulesJuntes.add(' ');
		afegeixParaula(word2,paraulesJuntes);
		return paraulesJuntes;
	}
	public static void afegeixParaula(ArrayList<Character> word, ArrayList<Character> allWords) {
		for(int i = 0; i < word.size(); i++) {
			allWords.add(word.get(i));
		}
	}
}
