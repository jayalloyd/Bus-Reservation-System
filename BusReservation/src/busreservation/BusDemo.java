package busreservation;
import java.util.*;
public class BusDemo {

	public static void main(String[] args) {
		ArrayList<Bus> buses=new ArrayList<Bus>();
		buses.add(new Bus(1, true ,1));
		buses.add(new Bus(2,false,40));
		buses.add(new Bus(5,true,50));
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		
		
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
                 Booking booking=new Booking();
                 if (booking.isAvailable(bookings,buses)) {
                	 bookings.add(booking);
                	 System.out.println("Confirmed Booking..");
                	 
                 }

			else
				System.out.println("Sorry bus is full....");
			}
			
			else
			System.out.println("Booking Stopped...");

	}
		
}
}