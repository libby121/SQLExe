package tests;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.Company;
import dao.CompanyDBDAO;

public class Program {
	
	public static void main(String[] args) {
		
	try(	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(SpringConfig.class)){
		
		CompanyDBDAO compd= new CompanyDBDAO();
		Company com=new Company("bestCompa","bestCompa@mail","1234");
		
		compd.addCompany(com);
		compd.isCompanyExists(com.getEmail(), com.getPassword());
	
	} catch (SQLException e) {System.out.println("error!  "+e.getMessage());
	}
		
	}

}
