package Logic;

import Model.MorseToLetter;

public class Runner {

	public static void main(String[] args) {
		MorseToLetter ml1 = new MorseToLetter();
		ml1.translateCode(
				".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--");

	}

}
