package busreservation;


public class Bus {
	private int busno;
	private boolean ac;
	private int capacity;
	
	Bus(int no,boolean ac,int cap){
		this.setBusno(no);
		this.setAc(ac);
		this.setCapacity(cap);
				
		
	}

	public static void main(String[] args) {
		
	}

	public int getBusno() {
		return busno;
	}

	public void setBusno(int busno) {
		this.busno = busno;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus number : "+busno+"AC :" +ac +"Total Capacity :"+capacity);
	}

}
