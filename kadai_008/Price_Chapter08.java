package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		int[] userAge = {10,20,30,40,50,60,70,80,90};
		int[] serviceCost = {1000,2000,3000,3000,4000,4000,4000,5000,5000,500};
		
		switch(userAge[2]) {
		    case 30 -> System.out.println(userAge[2]+"代の料金は"+serviceCost[2]+"円");
		    default -> System.out.println(serviceCost[8]);
		}

	}

}
