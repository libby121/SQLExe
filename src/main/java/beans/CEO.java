package beans;

import org.springframework.stereotype.Component;

@Component
public class CEO extends WorkingPerson {
	private double yearlyBonus = 20;
	private String name="yair";
	private double salary=877.9;
	
	
//	public CEO(String name, double salary, double yearlyBonus) {

//		this.yearlyBonus = yearlyBonus;
//
//	}

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

	public double getYearlyBonus() {
		return yearlyBonus;
	}

	public void setYearlyBonus(double yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}

	@Override
	public String toString() {
		return "CEO [name=" + name + ", salary=" + salary + ", yearlyBonus=" + yearlyBonus + "]";
	}

}
