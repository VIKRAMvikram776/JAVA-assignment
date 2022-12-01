package Practice;
import java.util.concurrent.TimeUnit;
public class TrafficLight {
	public static void main(String[] args) throws InterruptedException {
		while (true) 
		{
		System.out.println("RED Light is ON. Remaining time 3 seconds"); // Red Light
			TimeUnit.SECONDS.sleep(3);
			System.out.println("RED Light is OFF");
			System.out.println("GREEN Light is ON. Remaining time 5 seconds");// Green Ligt
			TimeUnit.SECONDS.sleep(5);
			System.out.println("GREEN Light is OFF");
			System.out.println("YELLOW Light is ON. Remaining time 2 seconds"); // Yellow Light
			TimeUnit.SECONDS.sleep(2);
			System.out.println("YELLOW Light is OFF");
		        }
		    }
}
	
		
	


