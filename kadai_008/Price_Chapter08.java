package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		int[] userAge = {10,20,30,40,50,60,70,80,90};
		int[] serviceCost = {1000,2000,3000,3000,4000,4000,4000,5000,5000,500};
		
		switch(userAge[2]) {
		    case 10 -> System.out.println(userAge[0]+"代の料金は"+serviceCost[0]+"円");
		    case 20 -> System.out.println(userAge[1]+"代の料金は"+serviceCost[1]+"円");
		    case 30 -> System.out.println(userAge[2]+"代の料金は"+serviceCost[2]+"円");
		    case 40 -> System.out.println(userAge[3]+"代の料金は"+serviceCost[3]+"円");
		    case 50 -> System.out.println(userAge[4]+"代の料金は"+serviceCost[4]+"円");
		    case 60 -> System.out.println(userAge[5]+"代の料金は"+serviceCost[5]+"円");
		    case 70 -> System.out.println(userAge[6]+"代の料金は"+serviceCost[6]+"円");
		    case 80 -> System.out.println(userAge[7]+"代の料金は"+serviceCost[7]+"円");
		    default -> System.out.println(serviceCost[8]);
		}
	}

}
