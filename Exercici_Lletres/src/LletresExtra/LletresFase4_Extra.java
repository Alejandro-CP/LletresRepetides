package LletresExtra;
import java.util.*;

public class LletresFase4_Extra {
	static ArrayList<Character> name = new ArrayList <>(Arrays.asList('A','l','e','j','a','n','d','r','o'));
	static ArrayList<Character> surname = new ArrayList <>(Arrays.asList('C','a','l','l','e','-','P','r','a','d','o'));

	public static void main(String[] args) {
		printList("Name", name);
		printList("Surname", surname);
		printList("Full name", juntaParaules(llistaParaules()));
	}
	public static void printList(String s, ArrayList<Character> words) {
		System.out.print(s+": [");
		//System.out.print("[");
		for(int i = 0; i < words.size() - 1; i++) {
			System.out.print("\'"+words.get(i)+"\',");
		}
		System.out.println("\'"+words.get(words.size()-1)+"\']");
	}
	public static ArrayList<Character> juntaParaules(ArrayList<ArrayList<Character>> allWords){
		ArrayList<Character> paraulesJuntes = new ArrayList<>();
		for(int i = 0; i < allWords.size() - 1; i++) {
			afegeixParaula(allWords.get(i),paraulesJuntes);
			paraulesJuntes.add(' ');
		}		
		afegeixParaula(allWords.get(allWords.size()-1),paraulesJuntes);
		return paraulesJuntes;
	}
	public static void afegeixParaula(ArrayList<Character> word, ArrayList<Character> allWords) {
		for(int i = 0; i < word.size(); i++) {
			allWords.add(word.get(i));
		}
	}
	public static ArrayList<ArrayList<Character>> llistaParaules(){
		ArrayList<ArrayList<Character>> allWords = new ArrayList<>();
		allWords.add(name);
		allWords.add(surname);
		return allWords;
	}
}
