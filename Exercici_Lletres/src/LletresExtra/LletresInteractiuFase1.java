package LletresExtra;
import java.util.*;

public class LletresInteractiuFase1 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		printLletresInteractiu(getName());
	}
	
	public static String getName() {
		System.out.println("Escriu el teu nom: ");
		return in.nextLine();
	}	
	public static void printLletresV(String s) {
		for(char c : s.toCharArray()) {
			System.out.println(c);
		}
	}
	public static void printLletresH(String s) {
		for(int i = 0; i < s.toCharArray().length-1; i++) {
			System.out.printf("\'%c\', ", s.toCharArray()[i]);
		}
		System.out.printf("\'%c\'.\n", s.toCharArray()[s.toCharArray().length-1]);
	}
	public static void printLletresInteractiu(String s) {
		System.out.println("Tria la forma de mostrar la resposta (H/V): ");
		String resp = in.nextLine();
		System.out.println("Les lletres del teu nom són: ");
		if(resp.equalsIgnoreCase("H")) {
			printLletresH(s);
		}else if(resp.equalsIgnoreCase("V")) {
			printLletresV(s);
		}else {
			System.out.println("Opció per mostrar la resposta no reconeguda.");
		}
	}
}