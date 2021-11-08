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

}
