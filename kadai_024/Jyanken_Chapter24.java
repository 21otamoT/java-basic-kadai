package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	Scanner sc = new Scanner(System.in);
    private HashMap<String,String> choices = new HashMap<>();
    private String[] enChoices = new String[3];
    private String[] jaChoices = new String[3];
    private String[] results = new String[3];
    private String result;
    
    Jyanken_Chapter24() {
    	getRandom();
    	for (int i = 0;i < this.enChoices.length ; i++ ) {
            choices.put(this.enChoices[i],this.jaChoices[i]);
            results[i] = sc.next();
        }
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");
    }
    
    public String getMyChoice(String myChoice) {//自分のじゃんけんの手を入力する
        if (!choices.containsKey(myChoice)) {
            return "r,s,pのどれかを入力してください";
        }
        return choices.get(myChoice);
    }
    
    public String getRandom() {//対戦相手のじゃんけんの手を乱数で選ぶ
    	this.enChoices[0] = "r";
    	this.enChoices[1] = "s";
    	this.enChoices[2] = "p";
    	this.jaChoices[0] = "グー";
    	this.jaChoices[1] = "チョキ";
    	this.jaChoices[2] = "パー";
        int index = (int)(Math.floor(Math.random() * 3));
        return this.choices.get(this.enChoices[index]);
    }
    
    public void playGame(String myChoice, String enemy) {     //じゃんけんを行う
        
        try {
        switch(myChoice) {
            case "グー" -> {
                if(enemy.equals("グー")) {
                    this.result = this.results[1];
                }
                else if(enemy.equals("チョキ")) {
                    this.result = this.results[2];
                }
                else if(enemy.equals("パー")) {
                    this.result = this.results[0];
                }
            }
            case "チョキ" -> {
                if(enemy.equals("グー")) {
                    this.result = this.results[0];
                }
                else if(enemy.equals("チョキ")) {
                    this.result = this.results[1];
                }
                else if(enemy.equals("パー"))  {
                    this.result = this.results[2];
                }
            }
            case "パー" -> {
                if(enemy.equals("グー")) {
                    this.result = this.results[2];
                } 
                else if(enemy.equals("チョキ")) {
                    this.result = this.results[0];
                }
                else if(enemy.equals("パー")) {
                    this.result = this.results[1];
                }
            }
            default -> this.result = "r,s,pのどれかを入力してください";
        };
        }
        catch(NullPointerException e) {
            System.err.println("r,s,pのどれかを入力してください");
        }
        
        System.out.println(myChoice);
        System.out.println("自分の手は"+myChoice+"、対戦相手の手は"+ enemy);
        System.out.println(this.result);
    }
}
