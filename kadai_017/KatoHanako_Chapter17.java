package kadai_017;

public class KatoHanako_Chapter17 extends Kato_Chapter17 {
    private String message = "趣味は読書です";
    
    public void setGivenName() {  //名を表すフィールドの値をセットする
        givenName = "花子";
    }
    
    public void eachIntroduce() {
        System.out.println(this.message);
    }
    
}
