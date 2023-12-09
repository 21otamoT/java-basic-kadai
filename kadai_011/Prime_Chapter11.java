package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
        boolean[] jadge = new boolean[101];
        
        for (int i = 2; i <= 100 ; i++ ) {
            jadge[i] = true;
        }
        
        int num = 2;
        for (int i = num; i <= Math.sqrt(100); i++) {
            if (jadge[i]) {
                for (int j = i * i; j <= 100; j += i) {
                    jadge[j] = false;
                }
            }
        }
        
        for (int i = 2; i < jadge.length ; i++ ) {
            if (jadge[i]) {
                System.out.println(i);
            } 
        }
    }
}
