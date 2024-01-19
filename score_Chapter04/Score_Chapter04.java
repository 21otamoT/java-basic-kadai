package score_Chapter04;

public class Score_Chapter04 {

	public static void main(String[] args) {
		String[] human = {"A","B","C","D","E","F","G","H","I","J"};
		Integer[] score = {10,20,30,40,50,60,70,80,90,100};
		Integer total = 0;
        
		for(int i=0;i<10;i++) {
			total += score[i];
			System.out.println(human[i]+"さんの点数は"+score[i]+"点");
		}
		
		Integer average = total/10;
		System.out.println("テストの平均点は"+average+"点");
	}

}