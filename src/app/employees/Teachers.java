package app.employees;

import app.interfaces.Employee;
import app.interfaces.Salary;
import app.abstracts.People;

public class Teachers extends People implements Employee {
private Salary salary;
	
	public Teachers (Salary salary) {
		this.salary = salary;
	}

	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public double grossSalary() {
		return this.salary.grossSalary();
	}

	public double salaryDiscount() {
		return this.salary.discountINSS() + this.salary.discountIR();
	}

	public double netSalary() {
		return this.salary.netSalary();
	}
}
