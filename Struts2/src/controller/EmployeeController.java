package controller;
import com.opensymphony.xwork2.ActionSupport;
public class EmployeeController extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private String name,email;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void validate() {
		if(name.equals("a"))
			addFieldError("name","name is required");
		if(email.equals(""))
			addFieldError("email","email is required");
		if(salary==0)
			addFieldError("salary","salary is required");
		//you need to <result name="input">errormsgpage.jsp</result>
	}
	public String execute(){
		//do controller
		System.out.println(name);
		System.out.println(email);
		System.out.println(salary);
		return "success";
	}
}
