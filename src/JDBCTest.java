import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest {
	public static void main(String arg[]) {


		/*
		 * msbase.jar, mssqlserver.jar, msutil.jar
		 */
//		String drivername = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
//		String dbURL = "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=db_personManager";

//		String drivername = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
//		String dbURL = "jdbc:microsoft:sqlserver://crystal-xat.gnway.cc:1433;DatabaseName=xinaotong2013";

		/*
		 * jtds-1.2.8.jar, jtds-1.3.1.jar Ö»Ö§³Öjdk1.7
		 */
		String drivername = "net.sourceforge.jtds.jdbc.Driver";
		String dbURL = "jdbc:jtds:sqlserver://crystal-xat.gnway.cc:1433/xinaotong2013";

//		String drivername = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//		String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=db_personManager";

		String user = "sa";
		String password = "xat2014";

		Connection dbConn;
		try {
			Class.forName(drivername);
//			dbConn = DriverManager.getConnection(dbURL);
			dbConn = DriverManager.getConnection(dbURL, user, password);
			System.out.println("Success!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
