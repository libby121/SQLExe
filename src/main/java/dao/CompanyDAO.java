package dao;

import java.sql.SQLException;
import java.util.ArrayList;


public interface CompanyDAO {//all methods are automatically public->interface
	//can i bring annotation here? instead of dbdao
	
	

		boolean isCompanyExists(String email, String password)throws SQLException;

		void addCompany(Company company) throws SQLException;

		void updateCompany(Company company)throws SQLException;
		void updateCompany(int id)throws SQLException;

		void deleteCompany(int id)throws SQLException;

		ArrayList<Company> getAllCompanies()throws SQLException;

		Company getOneCompany(int id)throws SQLException;

}
