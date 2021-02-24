package oops.encapsulation;

public class Employee {
	
	public String des ="TE";
	private String salary ="18000";
	
	public String getSalary(String role) {
		if(role == "Manager")
		{
			return salary;
		}
		else
		{
			return ("Access Denied, You are a : "+ role);
		}
	}
	public void setSalary(String salary, String role) {
		if(role == "Admin")
		{
			this.salary = salary;
		}
		else
		{
			System.out.println("You don't have the access, you are a : " + role);
		}
	}
	
	
	

}
