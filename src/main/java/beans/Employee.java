package beans;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee extends WorkingPerson {
	
	private String jobDescription;
	private int numDaysOff;
	@Autowired
	private CEO ceo;
	
	public Employee(String name, double salary, String jobDescription, int numDaysOff) {
		this.name=name;
		this.salary=salary;
		 this.jobDescription=jobDescription;
		 this.numDaysOff=numDaysOff;
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public int getNumDaysOff() {
		return numDaysOff;
	}
	public void setNumDaysOff(int numDaysOff) {
		this.numDaysOff = numDaysOff;
	}
@Override
	public String toString() {
		return "Employee [jobDescription=" + jobDescription + ", numDaysOff=" + numDaysOff + ", ceo=" + ceo + "]";
	}
	
	

}
