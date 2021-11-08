package restaurantOwner;

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
	
}
