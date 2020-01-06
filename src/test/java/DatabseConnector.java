import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabseConnector {

	public DatabseConnector() throws ClassNotFoundException, SQLException{

		String dbUrl = "jdbc:sqlserver://" + "qa2012r2-jg1.inqa.soti.net\\sqlexpress" + ";databaseName="
				+ "MobiControlDB";
		String username = "sa";
		String password = "Welcome1234";

		String query = "select * from devinfo";

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		Connection con = DriverManager.getConnection(dbUrl, username, password);

		Statement smt = con.createStatement();

		ResultSet rs = smt.executeQuery(query);

		while (rs.next()) {
			String DeviceId = rs.getString(1);
			String DevName = rs.getString(2);
			System.out.println(DeviceId);
			System.out.println(DevName);
		}

	}

}
