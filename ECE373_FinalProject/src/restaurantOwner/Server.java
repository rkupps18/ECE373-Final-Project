package restaurantOwner;

import java.util.ArrayList;

public class Server {

		//Fields
		private int serverID;
		private ArrayList<Table> tablesAssigned = new ArrayList<Table>();
		
		
		//Methods
		public int getServerID() {
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
		}
		
		public void removeTable(Table t1) {
			if(tablesAssigned.contains(t1)) {
				tablesAssigned.contains(t1);
			}
			else {
				System.out.println("The table" + t1 + "is not a table served by " + serverID);
			}
		}
		
		
}
