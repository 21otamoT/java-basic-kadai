package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {

		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
        taro.setGivenName();
        Kato_Chapter17.commonIntroduce();
        Kato_Chapter17.execIntroduce();
        taro.eachIntroduce();
        System.out.println();
        
        KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
        ichiro.setGivenName();
        Kato_Chapter17.commonIntroduce();
        Kato_Chapter17.execIntroduce();
        ichiro.eachIntroduce();
        System.out.println();
        
        KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
        hanako.setGivenName();
        Kato_Chapter17.commonIntroduce();
        Kato_Chapter17.execIntroduce();
        hanako.eachIntroduce();

	}

}
