package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class CompanyDBDAO implements CompanyDAO {

	@Autowired//can i use it not on a variable?
	private ConnectionPool pool;//=new ConnectionPool();
	//ConnectionPool pool= ConnectionPool.getInstance();
	//@Autowired
	//private ConnectionPool pool2=new ConnectionPool();
	
	
	
	public boolean isCompanyExists(String email, String password) throws SQLException {

		Connection con= pool.getConnection();
		try {
			PreparedStatement stmt = con.prepareStatement("select * from Companies");
			ResultSet et = stmt.executeQuery();
			while(et.next()) {
				if(et.getString("email").equals("email")&&et.getString("password").equals(password)) {
					System.out.println("exists!");//alternative to this printing?
					return true;
					
				}
			}
		}finally {pool.restoreConnection(con);}
	System.out.println("doesnt exist!");
		return false;
	}

	public void addCompany(Company company) throws SQLException {
		System.out.println("t1: "+pool.hashCode());
		//System.out.println("t2: "+pool2.hashCode());
		Connection con =pool.getConnection();
		try {
			PreparedStatement stmt = con.prepareStatement("insert into companies (name,email,password) values (?,?,?)");
			stmt.setString(1, company.getName());
			stmt.setString(2, company.getEmail());
			stmt.setString(3, company.getPassword());
			
			stmt.execute();
			System.out.println("company added!");
			
			
		}finally {pool.restoreConnection(con);}
		
	}

	public void updateCompany(Company company) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateCompany(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void deleteCompany(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Company> getAllCompanies() throws SQLException {
		// TODO Auto-generqated method stub
		return null;
	}

	public Company getOneCompany(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
