package kadai_024;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
    Scanner sc = new Scanner(System.in);
    HashMap<String,String> choices = new HashMap<String,String>();
    String[] enChoices = {"r","s","p"};
    String[] jaChoices = {"グー","チョキ","パー"};
    String[] results = new String[3];
    String result = "r,s,pのどれかを入力してください";
    
    Jyanken_Chapter24(String myChoice) {
        input();
        getMyChoice(myChoice);
        getRandom();
        playGame(myChoice);
    }
    
    public void input() {
        for (int i = 0;i < enChoices.length ; i++ ) {
            choices.put(enChoices[i],jaChoices[i]);
            results[i] = sc.next();
        }
    }
    
    public String getMyChoice(String myChoice) {//自分のじゃんけんの手を入力する
        return choices.get(myChoice);
    }
    
    public String getRandom() {//対戦相手のじゃんけんの手を乱数で選ぶ
        int index = (int)Math.floor(Math.random() * 3);
        return choices.get(enChoices[index]);
    }
    
    public void playGame(String myChoice) {     //じゃんけんを行う
        for (String key : choices.keySet()) {  //キーをセット
            if (myChoice.contains(key)) {//("r")||myChoice.contains("s")||myChoice.contains("p")) {// 正しい入力か判定
                if (choices.get(myChoice).equals("グー")) {//自分がグーを出したら
                    if (getRandom().equals("グー")) {
                        result = results[0];
                    }
                    else if(getRandom().equals("チョキ")) {
                        result = results[1];
                    }
                    else if(getRandom().equals("パー")) {
                        result = results[2];
                    }
                    
                } 
                else if (choices.get(myChoice).equals("チョキ")) {//自分がチョキを出したら
                    if (getRandom().equals("グー")) {
                        result = results[2];
                    }
                    else if(getRandom().equals("チョキ")) {
                        result = results[0];
                    }
                    else if(getRandom().equals("パー")) {
                        result = results[1];
                    }
                    
                } 
                else if (choices.get(myChoice).equals("パー")) {//自分がパーを出したら
                    if (getRandom().equals("グー")) {
                        result = results[1];
                    }
                    else if(getRandom().equals("チョキ")) {
                        result = results[2];
                    }
                    else if(getRandom().equals("パー")) {
                        result = results[0];
                    }
                    
                } 
            } 
        }
        System.out.println(result);
    }
}
