package busreservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking{
	private String passengername;
	private int busno;
	private Date date;

	Booking(){
		Scanner scanner=new Scanner(System.in);
System.out.println("Enter passenger Name:....");
passengername=scanner.next();
System.out.println("Enter bus no:....");
busno=Integer.parseInt( scanner.next());
System.out.println("Enter the date dd-mm-yyyy:....");
String dateInput=scanner.next();
SimpleDateFormat simpledateformat=new SimpleDateFormat("dd-MM-yyyy");
try {
	date=simpledateformat.parse(dateInput);
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	public int getBusno() {
		return busno;
	}
	public void setBusno(int busno) {
		this.busno = busno;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPassengername() {
		return passengername;
	}
	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		
		int capacity=0;
		for(Bus b:buses) {
			if(b.getBusno()== busno) {
				capacity=b.getCapacity();}
			
			}
		int booked=0;
		for(Booking b:bookings) {
		
		
			if(b.busno==busno && b.date.equals(date)) {
		booked++;
			}
			
		}
return booked<capacity?true:false;
	}
}