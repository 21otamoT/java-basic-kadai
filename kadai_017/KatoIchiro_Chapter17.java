package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
    private String message =  "好きな食べ物はリンゴです";
    
    public void setGivenName() {  //名を表すフィールドの値をセットする
        givenName = "一郎";
    }
    
    public void eachIntroduce() {
        System.out.println(this.message);
    }

}
