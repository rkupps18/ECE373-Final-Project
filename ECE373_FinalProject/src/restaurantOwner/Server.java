package restaurantOwner;

import java.util.ArrayList;

public class Server {

		//Fields
		private int serverID;
		private ArrayList<Table> tablesAssigned = new ArrayList<Table>();
		private Restaurant worksAt;
		
		
		//Methods
		public int getServerID() {
			//FIXME: must check for unique server id within restaurant
			return serverID;
		}
		
		public void setServerID(int serverID) {
			this.serverID = serverID;
		}

		public ArrayList<Table> getTablesAssigned() {
			return tablesAssigned;
		}
		
		public void addTable(Table t1) {
			tablesAssigned.add(t1);
			t1.setServerAssigned(this);
		}
		
		public void removeTable(Table t1) {
			if(tablesAssigned.contains(t1)) {
				tablesAssigned.contains(t1);
			}
			else {
				System.out.println("The table" + t1 + "is not a table served by " + serverID);
			}
		}
		
		public String toString() {
			String output = "Server " + serverID + "is assigned to tables: ";
			for(Table table: tablesAssigned) {
				output = output + table.getTableNumber() + " ";
			}
			return output;
		}

		public Restaurant getWorksAt() {
			return worksAt;
		}

		public void setWorksAt(Restaurant worksAt) {
			this.worksAt = worksAt;
		}
		
		
		
}
