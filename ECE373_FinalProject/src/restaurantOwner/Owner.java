package restaurantOwner;

import java.util.ArrayList;

public class Owner {
	
	//Fields
	private String name;
	private String email;
	private String phone;
	private String password;
	private Restaurant restaurantOwned;
	
	
	
	//Methods
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Restaurant getRestaurantOwned() {
		return restaurantOwned;
	}

	public void setRestaurantOwned(Restaurant restaurantOwned) {
		this.restaurantOwned = restaurantOwned;
	}
	
	public void addServer(Server s1) {
		//FIX ME
	}
	
	public void removeServer(Server s1) {
		//FIX ME
	}
	
	public void addTable(Table t1) {
		//FIX ME
	}
	
	public void removeTable(Table t1) {
		//FIX ME
	}
	
	public Reservation searchReservation(Reservation r1) {
		//FIX ME
		//Parameter will probably need to change to an email address, name or phone number
		//Return value should probably change to bool
		//This must also be fixed in documents
		var x = new Reservation();
		return x;
	}
	
	public ArrayList<Reservation> checkTableReservations(Table t1){
		//FIX ME
		//Parameter should probably change to table number
		//Print instead ?
		//Added return below so it doesn't complain, but needs to be fixed
		return this.restaurantOwned.getReservations();
		
	}
}
