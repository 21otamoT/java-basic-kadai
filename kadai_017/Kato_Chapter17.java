package kadai_017;

abstract public class Kato_Chapter17 {
    private static String familyName = "加藤";  //姓を表す
    public static String givenName ;  //名を表す
    private static String address = "住所は東京都中野区〇×です";    //住所を表す
    
    public static void commonIntroduce() { //共通の紹介を出力する
        System.out.println("名前は"+familyName+givenName+"です");
    }
    
    abstract public void eachIntroduce(); //個別の紹介を出力する
    
    public static void execIntroduce() { //紹介を実行する
        System.out.println(address);
    }
}
