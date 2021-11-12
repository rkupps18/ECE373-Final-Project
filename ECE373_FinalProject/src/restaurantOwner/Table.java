package restaurantOwner;

import java.util.ArrayList;

public class Table {

	//Fields
	private int tableNumber;
	private int tableCapacity;
	private ArrayList<Reservation> reservationsScheduled = new ArrayList<Reservation>();
	private Restaurant tableAt;
	private Server serverAssigned;
	
	
	//Methods
	public int getTableNumber() {
		return tableNumber;
	}
	
	public void setTableNumber(int tableNumber) {
		
		//FIXME: This number must be unique for each table at a restaurant. Add a check.
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

	public Restaurant getTableAt() {
		return tableAt;
	}

	public void setTableAt(Restaurant tableAt) {
		this.tableAt = tableAt;
	}
	
	public String toString() {
		String output = "Table " + tableNumber + " is for " + tableCapacity + " and is at " + this.getTableAt().getName();
		return output;
	}

	public Server getServerAssigned() {
		return serverAssigned;
	}

	public void setServerAssigned(Server serverAssigned) {
		this.serverAssigned = serverAssigned;
	}
	
	
}
