package Annotation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class EmployeeAnno extends ActionSupport {
	private String name,email;
	private int salary;
	public String getName() {
		return name;
	}
	@RequiredStringValidator(key = "msg1")
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	@RequiredStringValidator(key = "msg2")
	@EmailValidator(key = "msg3")
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	@RequiredStringValidator(key = "msg4")
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
