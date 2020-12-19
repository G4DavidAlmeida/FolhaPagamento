package app.others;

import app.interfaces.Salary;

public class SalaryCalc implements Salary {
	private double workedHours = 0;
	private double hourlyWage = 0;
	private int nDependents = 0;

	public double grossSalary () {
		return workedHours * hourlyWage + (50 * nDependents);
	}
	
	public double discountINSS () {
		double groosSalary = this.grossSalary();
		if (groosSalary <= 1000)
			return groosSalary * 5.5 / 100;
        else
        	return groosSalary * 9 / 100;
	}

	public double discountIR () {
		double groosSalary = this.grossSalary();
		if (groosSalary > 1000)
			return groosSalary * 7 /100;
        else if (groosSalary > 500)
        	return groosSalary * 5 / 100;
        else
        	return 0;
	}
	
	public double netSalary() {
		return this.grossSalary() - this.discountINSS() - this.discountIR();
	}
	
	
	public double getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(double workedHours) {
		this.workedHours = workedHours;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public int getnDependents() {
		return nDependents;
	}

	public void setnDependents(int nDependents) {
		this.nDependents = nDependents;
	}
	
}
