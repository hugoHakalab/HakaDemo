package cl.hakalab.demo.automation.conn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.arjuna.ats.internal.arjuna.objectstore.jdbc.drivers.oracle_driver;

import cl.hakalab.demo.automation.conn.db.DbConnFactory;

public class dao {
	private static PreparedStatement qQuery = null;
	private static Connection con = null;

	public static List<?> getJournal(String rutCliente, String rutEjecutivo, String OPRTXID) {
		List<String> lista = new ArrayList<>();
		try {
			ResultSet rs = null;
			con = DbConnFactory.getConnectionJournal();
			qQuery = con.prepareStatement("Select  OPR_JSON  "
					+ "From JNL_OPERACION  where REPLACE(OPR_RUT_CLIENTE,'-','')  =  " + "REPLACE('" + rutCliente
					+ "','-','')  AND " + "       REPLACE(OPR_RUT_EJECUTIVO,'-','') =  REPLACE('" + rutEjecutivo
					+ "','-','') " + "  AND     OPR_OPERACION = '" + OPRTXID + "'" + "       ");
			rs = qQuery.executeQuery();
			if (rs.next()) {
				lista.add(rs.getString("OPR_JSON"));
			}

			cerrarConexion(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public static List<?> getJournalAll(String rutCliente, String rutEjecutivo, String OPRTXID) {
		List<String> lista = new ArrayList<>();
		try {
			ResultSet rs = null;
			con = DbConnFactory.getConnectionJournal();

			String query = "Select   *  " + "From JNL_OPERACION  "
					+ "where REPLACE(OPR_RUT_CLIENTE,'-','')  =  REPLACE('" + rutCliente + "','-','')  AND "
					+ "      REPLACE(OPR_RUT_EJECUTIVO,'-','') =  REPLACE('" + rutEjecutivo + "','-','') "
					+ "  AND     OPR_OPERACION = '" + OPRTXID + "'"
					+ " AND   OPR_FECHA_INGRESO IN ( select   max (OPR_FECHA_INGRESO )  from JNL_OPERACION"
					+ "  where REPLACE(OPR_RUT_CLIENTE,'-','')  =  REPLACE('" + rutCliente + "','-','')  AND "
					+ " REPLACE(OPR_RUT_EJECUTIVO,'-','') =  REPLACE('" + rutEjecutivo + "','-','') "
					+ " AND OPR_OPERACION = '" + OPRTXID + "') ";
			qQuery = con.prepareStatement(query);
			rs = qQuery.executeQuery();
			if (rs.next()) {
				lista.add(rs.getString("OPR_OPERACION"));
				lista.add(rs.getString("OPR_USUARIO"));
				lista.add(rs.getString("OPR_APP_ORI"));
				lista.add(rs.getString("OPR_JSON"));
				lista.add(rs.getString("OPR_FECHA_INGRESO"));

			}

			cerrarConexion(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public static void cerrarConexion(Connection con) {
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean getIsCliente(String rutProspecto) {
		List<String> lista = new ArrayList<>();
		try {
			ResultSet rs = null;
			con = DbConnFactory.getConnectionMDM();
			String strQuery = "select  count( A.ROW_ID)  IsCiente "
					+ "from SIEBEL.S_CONTACT A "
					+ " where  A.person_uid = '" + rutProspecto + "' ";
				 
			qQuery = con.prepareStatement(strQuery);
			rs = qQuery.executeQuery();
			if (rs.next()) {
				lista.add(rs.getString("IsCiente"));
			}

			cerrarConexion(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Integer.parseInt(lista.get(0)) == 0;
	}

	public static String getRutNoDefinitivo() {
		List<String> lista = new ArrayList<>();
		try {
			ResultSet rs = null;
			con = DbConnFactory.getConnectionMDM();
			String strQuery = "	select A.PERSON_UID as RUT  from SIEBEL.S_CONTACT A  "
					+ "	where   A.ACTIVE_FLG = 'Y' and  a.row_Id <> A.PERSON_UID and"
					+ " x_false_rut_flg = 'N' and rownum =1 ";
			qQuery = con.prepareStatement(strQuery);
			rs = qQuery.executeQuery();
			if (rs.next()) {
				lista.add(rs.getString("RUT"));
			}

			cerrarConexion(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista.get(0);
	}

	public static String getRutDefinitivo() {
		List<String> lista = new ArrayList<>();
		try {
			ResultSet rs = null;
			con = DbConnFactory.getConnectionMDM();
			String strQuery = "	select A.PERSON_UID as RUT " + "	from SIEBEL.S_CONTACT A  "
					+ "	where   A.ACTIVE_FLG = 'Y' and" + "	        a.row_Id <> A.PERSON_UID and"
					+ "	           x_false_rut_flg = 'S' and rownum =1 ";
			qQuery = con.prepareStatement(strQuery);
			rs = qQuery.executeQuery();
			if (rs.next()) {
				lista.add(rs.getString("RUT"));
			}

			cerrarConexion(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista.get(0);
	}

}