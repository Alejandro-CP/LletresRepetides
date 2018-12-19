package Lletres;
import java.util.*;

public class LletresFase4 {
	static List<Character> name;
	static List<Character> surname;

	public static void main(String[] args) {
		initWords();
		printList("Name", name);
		printList("Surname", surname);
		printList("Full name", add2Words(name, surname));
	}
	public static void initWords() {
		name = new ArrayList <>(Arrays.asList('A','l','e','j','a','n','d','r','o'));
		surname = new ArrayList <>(Arrays.asList('C','a','l','l','e','-','P','r','a','d','o'));
	}
	public static void printList(String s, List<Character> words) {
		System.out.print(s+": [");
		for(int i = 0; i < words.size() - 1; i++) {
			System.out.print("\'"+Character.toUpperCase(words.get(i))+"\',");
		}
		System.out.println("\'"+Character.toUpperCase(words.get(words.size()-1))+"\']");
	}
	public static List<Character> add2Words(List<Character> word1, List<Character> word2){
		List<Character> wordsToghether = new ArrayList<>();
		addWord(word1,wordsToghether);
		wordsToghether.add(' ');
		addWord(word2,wordsToghether);
		return wordsToghether;
	}
	public static void addWord(List<Character> word, List<Character> allWords) {
		for(int i = 0; i < word.size(); i++) {
			allWords.add(word.get(i));
		}
	}
}
