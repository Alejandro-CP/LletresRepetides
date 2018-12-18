package Lletres;

public class LletresFase1 {
	static char[] name = {'A','l','e','j','a','n','d','r','o'};

	public static void main(String[] args) {
		System.out.println("Les lletres del teu nom, en format vertical, són: ");
		printLletresCharV(name);
		System.out.println("Les lletres del teu nom, en format horitzontal, són: ");
		printLletresCharH(name);
	}
	public static void printLletresCharV(char[] word) {
		for(char c: word) {
			System.out.println(c);
		}
		System.out.println();
	}
	public static void printLletresCharH(char[] word) {
		for(int i = 0; i < word.length - 1; i++) {
			System.out.printf("\'%c\', ", word[i]);
		}
		System.out.printf("\'%c\'.\n", word[word.length - 1]);
		System.out.println();
	}
}
