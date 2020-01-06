package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.mifmif.common.regex.util.Iterator;
import com.mysql.jdbc.IterateBlock;

public class DatabseConnector {
	private String query;

	public String Getqery() {
		return query;
	}

	public void Setquery(String enterquery) {
		this.query = enterquery;

	}

	public ResultSet DBconnection() throws ClassNotFoundException, SQLException {

		String dbUrl = "jdbc:sqlserver://" + "qa2012r2-vr4.inqa.soti.net\\sqlexpress" + ";databaseName="
				+ "MobiControlDB";
		String username = "sa";
		String password = "Welcome1234";
		System.out.println("Connection With DB Successfull");
		System.out.println(".................................");

		String query = Getqery();

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		Connection con = DriverManager.getConnection(dbUrl, username, password);

		Statement smt = con.createStatement();

		ResultSet rs = smt.executeQuery(query);
		HashMap<String, String> hmap = new HashMap<String, String>();
		while (rs.next()) {
			String DeviceId = rs.getString(1);
			String DevName = rs.getString(2);
			//System.out.println("Device ID is :" + " " + DeviceId);
			//System.out.println("Device Name is: " + " " + DevName);
			hmap.put(rs.getString(1), rs.getString(2));

		}
		
		for(Map.Entry<String, String> entity : hmap.entrySet()){
//			System.out.println("key:"+ entity.getKey()+" Value:"+ entity.getValue());
			System.out.println(hmap.get(entity.getKey()));
			
		}
		
		

		return rs;
	}
}
