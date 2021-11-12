package restaurantOwner;

import java.util.ArrayList;

public class Client {
	
	//Fields
	private String name;
	private String phone;
	private String email;
	private String password;
	private ArrayList<Reservation> reservations = new ArrayList<Reservation>();
	
	
	//Methods
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Reservation> getReservations() {
		return reservations;
	}
	
	public void addReservation(Reservation r1) {
		reservations.add(r1);
	}
	
	public void cancelReservation(Reservation r1) {
		if(reservations.contains(r1)) {
			reservations.remove(r1);
		}
		else {
			System.out.println("The table" + r1 + "is not a table here");
		}
	}
	
	public boolean checkReservationConflict(Reservation r1) {
		//FIX ME
		return false;
	}
	
	public String toString() {
		String output = name + "\n" + email + "\n" + phone + "\n";
		return output;
	}
	
	
}
