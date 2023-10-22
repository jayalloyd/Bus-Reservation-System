package busreservation;
import java.util.*;
import java.util.ArrayList;
public class BusDemo {

	public static void main(String[] args) {
		ArrayList<Bus> buses=new ArrayList<Bus>();
		buses.add(new Bus(1, true ,20));
		buses.add(new Bus(2,false,40));
		buses.add(new Bus(5,true,50));
		
		int useroption=1;
	Scanner scanner = new Scanner(System.in);
	for(Bus b:buses) {
		b.displayBusInfo();
	}
		while(useroption==1)
		{
			System.out.println("Enter a value= 1 for new booking and 2 to exit");
			useroption=scanner.nextInt();
			if(useroption==1) {
				System.out.println("Booking Started.....");
			}
			else
			System.out.println("Booking Stopped...");	}
	}}