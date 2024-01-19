package kadai_024;

public class JyankenExec_Chapter24 {

	public static void main(String[] args) throws Exception {
		Jyanken_Chapter24 janken = new Jyanken_Chapter24();
		
		String myChoice = janken.getMyChoice("r");
		String enemy = janken.getRandom();
		janken.playGame(myChoice, enemy);
	}

}