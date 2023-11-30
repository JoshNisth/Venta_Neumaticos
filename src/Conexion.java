
import java.sql.*;

import javax.swing.JOptionPane;
public class Conexion {
	static final String DB_URL ="jdbc:postgresql://127.0.0.1:5432/Llantas";
	static final String USER = "postgres";
	static final String PASS = "1965";
	
	public Connection getConexionPostgres(){
		Connection conn=null;
	try {
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
	}
	catch (SQLException ex) {
	JOptionPane.showMessageDialog(null, "No se pudo conectar");
	return null;
	}
	JOptionPane.showMessageDialog(null, "Conexion exitosa");
	return conn;
	}
}

