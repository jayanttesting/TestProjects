package databaseConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class FetchData {

	public static void main(String[] args) {

		DatabseConnector database = new DatabseConnector();

		database.Setquery("Select * from devinfo");
		try {
			ResultSet rs = database.DBconnection();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		// Storing device id and name in map

	}

	public static HashMap<String, Object> convertdatabse(ResultSet rs) throws SQLException {
		java.sql.ResultSetMetaData md = rs.getMetaData();
		int columns = md.getColumnCount();
		HashMap<String, Object> row = new HashMap<String, Object>();
		while (rs.next()) {

			for (int i = 1; i <= columns; i++) {
				row.put(md.getColumnName(i), rs.getObject(i));
				System.out.println("This is my hashmap" +" "+ row.get(i));

			}

		}
		return row;

	}

}
