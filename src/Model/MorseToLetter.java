package Model;

import java.util.HashMap;

public class MorseToLetter {

	private HashMap<String, Character> morse = new HashMap<>();

	public void translateCode(String string) {
		morse.put(".-", 'a');
		morse.put("-...", 'b');
		morse.put("-.-.", 'c');
		morse.put("-..", 'd');
		morse.put(".", 'e');
		morse.put("..-.", 'f');
		morse.put("--.", 'g');
		morse.put("....", 'h');
		morse.put("..", 'i');
		morse.put(".---", 'j');
		morse.put("-.-", 'k');
		morse.put(".-..", 'l');
		morse.put("--", 'm');
		morse.put("-.", 'n');
		morse.put("---", 'o');
		morse.put(".--.", 'p');
		morse.put("--.-", 'q');
		morse.put(".-.", 'r');
		morse.put("...", 's');
		morse.put("-", 't');
		morse.put("..-", 'u');
		morse.put("...-", 'v');
		morse.put(".--", 'w');
		morse.put("-..-", 'x');
		morse.put("-.--", 'y');
		morse.put("--..", 'z');
		morse.put(".----", '1');
		morse.put("..---", '2');
		morse.put("...--", '3');
		morse.put("....-", '4');
		morse.put(".....", '5');
		morse.put("-....", '6');
		morse.put("--...", '7');
		morse.put("---..", '8');
		morse.put("----.", '9');
		morse.put("-----", '0');
		morse.put("/", ' ');

		String[] parts = string.split(" ");
		for (int i = 0; i < parts.length; i++) {
			String a = parts[i];
			System.out.print(morse.get(a));
		}
	}

}
