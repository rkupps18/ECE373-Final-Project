package restaurantOwner;

import java.util.Date;

public class Reservation {

	//Fields
	private Date day; //includes time to the milisecond too. Still need time var?
	private int tableSize;
	private Table tableAssigned;
	private Client clientReserved;
	
	
	//Methods
	public Date getDay() {
		return day;
	}
	
	public void setDay(Date day) {
		this.day = day;
	}

	public int getTableSize() {
		return tableSize;
	}

	public void setTableSize(int tableSize) {
		this.tableSize = tableSize;
	}

	public Table getTableAssigned() {
		return tableAssigned;
	}

	public void setTableAssigned(Table tableAssigned) {
		this.tableAssigned = tableAssigned;
	}

	public Client getClientReserved() {
		return clientReserved;
	}

	public void setClientReserved(Client clientReserved) {
		this.clientReserved = clientReserved;
	}
	
	
	
}
