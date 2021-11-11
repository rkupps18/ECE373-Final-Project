package restaurantOwner;

import java.util.ArrayList;

public class Table {

	//Fields
	private int tableNumber;
	private int tableCapacity;
	private ArrayList<Reservation> reservationsScheduled = new ArrayList<Reservation>();
	
	
	//Methods
	public int getTableNumber() {
		return tableNumber;
	}
	
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public int getTableCapacity() {
		return tableCapacity;
	}

	public void setTableCapacity(int tableCapacity) {
		this.tableCapacity = tableCapacity;
	}

	public ArrayList<Reservation> getReservationsScheduled() {
		return reservationsScheduled;
	}
	
	public void addReservation(Reservation r1) {
		reservationsScheduled.add(r1);
	}
	
	public void cancelReservation(Reservation r1) {
		if(reservationsScheduled.contains(r1)) {
			reservationsScheduled.remove(r1);
		}
		else {
			System.out.println("The reservation" + r1 + "is not scheduled in this table");
		}
	}
	
	public boolean checkReservationConflict(Reservation r1) {
		//FIX ME
		return false;
	}
	
	
}
