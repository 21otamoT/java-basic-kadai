package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {

    private String message = "私はJavaが得意です";
    
    public void setGivenName() {  //名を表すフィールドの値をセットする
        givenName = "太郎";
    }
    
    public void eachIntroduce() {

        System.out.println(this.message);

    }
}
