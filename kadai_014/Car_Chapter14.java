package kadai_014;

public class Car_Chapter14 {
    
    private int gear = 1;
    private int speed = 10;
    
	public void gearChange	(int afterGear) {
        System.out.println("ギア"+gear+"から"+afterGear+"に切り替えました");
        speed = speed * afterGear;
	}
	
	public void run() {
	    System.out.println("速度は時速"+speed+"kmです");
	}

}
