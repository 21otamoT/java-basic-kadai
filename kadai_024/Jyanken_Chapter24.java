package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	Scanner sc = new Scanner(System.in);
    HashMap<String,String> choices = new HashMap<>();
    String[] enChoices = {"r","s","p"};
    String[] jaChoices = {"グー","チョキ","パー"};
    String[] results = new String[3];
    String result = "";
    
    Jyanken_Chapter24() {
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");
        for (int i = 0;i < enChoices.length ; i++ ) {
            choices.put(enChoices[i],jaChoices[i]);
            results[i] = sc.next();
        }
    	sc.close();
    }
    
    public String getMyChoice(String myChoice) {//自分のじゃんけんの手を入力する
        if (!choices.containsKey(myChoice)) {
            return "r,s,pのどれかを入力してください";
        }
        return choices.get(myChoice);
    }
    
    public String getRandom() {//対戦相手のじゃんけんの手を乱数で選ぶ
        int index = (int)(Math.floor(Math.random() * 3));
        return choices.get(enChoices[index]);
    }
    
    public void playGame(String myChoice, String enemy) {     //じゃんけんを行う
        
        try {
        switch(myChoice) {
            case "グー" -> {
                if(enemy.equals("グー")) {
                    result = results[1];
                }
                else if(enemy.equals("チョキ")) {
                    result = results[2];
                }
                else if(enemy.equals("パー")) {
                    result = results[0];
                }
            }
            case "チョキ" -> {
                if(enemy.equals("グー")) {
                    result = results[0];
                }
                else if(enemy.equals("チョキ")) {
                    result = results[1];
                }
                else if(enemy.equals("パー"))  {
                    result = results[2];
                }
            }
            case "パー" -> {
                if(enemy.equals("グー")) {
                    result = results[2];
                } 
                else if(enemy.equals("チョキ")) {
                    result = results[0];
                }
                else if(enemy.equals("パー")) {
                    result = results[1];
                }
            }
            default -> result = "r,s,pのどれかを入力してください";
        };
        }
        catch(NullPointerException e) {
            System.err.println("r,s,pのどれかを入力してください");
        }
        
        System.out.println(myChoice);
        System.out.println("自分の手は"+myChoice+"、対戦相手の手は"+ enemy);
        System.out.println(result);
    }
}
