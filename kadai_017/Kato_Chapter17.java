package kadai_017;

abstract public class Kato_Chapter17 {
    private String familyName = "加藤";  //姓を表す
    public String givenName ;  //名を表す
    private String address = "住所は東京都中野区〇×です";    //住所を表す
    
    public void commonIntroduce() { //共通の紹介を出力する
        System.out.println("名前は"+this.familyName+this.givenName+"です");
        System.out.println(address);
    }
    
    abstract public void eachIntroduce(); //個別の紹介を出力する
    
    public void execIntroduce() { //紹介を実行する
    	commonIntroduce();
    	eachIntroduce();
    }
}