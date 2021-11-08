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
	
	
}
