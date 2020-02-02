package beans;


public abstract class WorkingPerson {
	
	protected String name;
	protected double salary;
	
	
	
	public WorkingPerson() {
		
		
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
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "WorkingPerson [name=" + name + ", salary=" + salary + "]";
	}
	
	

}
