package kadai_014;

import java.util.HashMap;

public class Car_Chapter14 {
    
    private int gear = 1;
    private int speed = 10;
    
	public void gearChange	(int afterGear) {
		int[] gears = {1,2,3,4,5};
		int[] speeds = {10,20,30,40,50};
		HashMap<Integer,Integer> gearSpeeds = new HashMap<>();
		
		for (int i = 0; i < speeds.length; i++) {
			gearSpeeds.put(gears[i],speeds[i]);
		}
		
		this.speed = switch (afterGear) {
		case 2 -> gearSpeeds.get(afterGear); 
		case 3 -> gearSpeeds.get(afterGear);
		case 4 -> gearSpeeds.get(afterGear);
		case 5 -> gearSpeeds.get(afterGear);
		default -> gearSpeeds.get(1);
		};
        System.out.println("ギア"+this.gear+"から"+afterGear+"に切り替えました");
	}
	
	public void run() {
	    System.out.println("速度は時速"+this.speed+"kmです");
	}

}
