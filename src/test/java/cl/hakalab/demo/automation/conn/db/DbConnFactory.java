
package cl.hakalab.demo.automation.conn.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnFactory {
	private static Connection con = null;
 
	static final String DRIVER_SQL = "oracle.jdbc.driver.OracleDriver";
	static final String DATABASE_URLJournal = "jdbc:oracle:thin:@200.14.169.234:1521/ORION";
	static final String USERJorunal = "JOURNAL_CN";
	static final String PASSJorunal = "JOURNAL_CN_ORION2K16";

	static final String DATABASE_URL_MDM = "jdbc:oracle:thin:@200.14.169.238:1521/ODIN";
	static final String USERMDM = "BCH_MDMXT";
	static final String PASSMDM = "BCH_MDMXT_ODIN2K17";

	/**
	 * Function: getConnection Description: Retorna el controlador de Base de datos
	 **/

	public static Connection getConnectionJournal() {
		try {

			Class.forName(DRIVER_SQL);
			con = DriverManager.getConnection(DATABASE_URLJournal, USERJorunal, PASSJorunal);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public static Connection getConnectionMDM() {
		try {

			Class.forName(DRIVER_SQL);
			con = DriverManager.getConnection(DATABASE_URL_MDM, USERMDM, PASSMDM);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
