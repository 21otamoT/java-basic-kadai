package kadai_024;

import java.util.Scanner;

public class JyankenExec_Chapter24 {

	public static void main(String[] args) throws Exception {
		Jyanken_Chapter24 janken = new Jyanken_Chapter24();
		Scanner sc = new Scanner(System.in);
		String inputChoice = sc.next();
		String myChoice = janken.getMyChoice(inputChoice);
		String enemy = janken.getRandom();
		janken.playGame(myChoice, enemy);
		sc.close();
	}

}
