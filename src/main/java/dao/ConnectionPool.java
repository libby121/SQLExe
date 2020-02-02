package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ConnectionPool {

	//private static ConnectionPool instance = new ConnectionPool();//array or variable? is instance only a ref to the object?
	//do i need instance so i can call it from other classes?
	
	private ArrayList<Connection> connections=new ArrayList<Connection>() ;
	private final int MAX_CONNECTIONS = 10;
	
	
//	private ConnectionPool() {
//
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			for (int i = 1; i <= MAX_CONNECTIONS; i++) {
//				connections.add(DriverManager.getConnection(
//						"jdbc:mysql://localhost:3306/coupons_management_system?serverTimezone=UTC", "root", "1234"));
//
//			}
//
//		} catch (ClassNotFoundException e) {
//			System.out.println("Cannot find class : " + e.getMessage());
//		} catch (SQLException e) {
//			System.out.println("cannot connect to DB" + e.getMessage());// is printing needed here
//		}//cat
//	}

//	public static ConnectionPool getInstance() {//no need?
//		return instance;
//	}
	
	private ConnectionPool() {//am i allowed to create a ctor in singleton spring
		//difference between spring singleton and java singleton

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			for (int i = 1; i <= MAX_CONNECTIONS; i++) {
				connections.add(DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/coupons_management_system?serverTimezone=UTC", "root", "1234"));

			}

		} catch (ClassNotFoundException e) {
			System.out.println("Cannot find class : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("cannot connect to DB" + e.getMessage());// is printing needed here
		}//cat
	}
	public synchronized Connection getConnection() {
		while (connections.size() == 0)
			try {
				wait();
			} catch (InterruptedException e) {
			}
		Connection con = connections.get(0);
		connections.remove(con);// cannot be after return

		return con;
	}

	public synchronized void restoreConnection(Connection connection) {
		connections.add(connection);
		notify();// gentle awakening the sleeping thread from connectionPool if needed
	}

	public void closeAllConnections() {
		for (Connection connection : connections) {
			try {
				connection.close();// connection might be already closed->try
			} catch (SQLException e) {
			}
		}

	}
}