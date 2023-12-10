package kadai_020;
import java.util.HashMap;

public class Dictionary_Chapter20 {

    public static void map() {
        HashMap<String, String> fruits = new HashMap<String, String>();
        String[] english = {"apple","peach","banana","lemon","pear","kiwi","strawberry","grape","muscat","cherry"};
        String[] japan = {"りんご","桃","バナナ","レモン","梨","キウイ","いちご","ぶどう","マスカット","さくらんぼ"};
        String[] task = {"apple","banana","grape","orange"};
        
        for (int i = 0;i < english.length; i++) {
            fruits.put(english[i],japan[i]);
        }
        
        for (String key : task) {
            if (fruits.get(key)==null) {
                System.out.println(key+"は辞書に存在しません");
            }
            else {
                System.out.println(key+"の意味は"+fruits.get(key));
            }
        } 
    }
        
}