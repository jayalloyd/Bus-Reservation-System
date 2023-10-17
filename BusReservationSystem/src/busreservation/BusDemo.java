package busreservation;
import java.util.*;
public class BusDemo {

	public static void main(String[] args) {
		int useroption=1;
	Scanner scanner = new Scanner(System.in);
		while(useroption==1)
		{
			System.out.println("Enter a value= 1 for new booking and 2 to exit");
			useroption=scanner.nextInt();
			if(useroption==1) {
				System.out.println("Booking Started.....");
			}
		}
		System.out.println("Booking Stopped.....");

	}

}
