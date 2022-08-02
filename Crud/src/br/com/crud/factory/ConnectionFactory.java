package br.com.crud.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static final String USERNAME = "root";
	private static final String PASSWORD = "00112233mafia";

	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/crud";

	public static Connection createConnectionToMySQL() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		return connection;
	}

	public static void main(String[] args) throws Exception {
		Connection con = createConnectionToMySQL();

		if (con != null) {
			System.out.println("Conex�o bem sucedidad" + con);
			con.close();
		}
	}

}
