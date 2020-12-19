package app.interfaces;

public interface Salary {	
	public double grossSalary();
	public double discountINSS();
	public double discountIR ();
	public double netSalary();
	
	public double getWorkedHours();
	public void setWorkedHours(double workedHours);
	
	public double getHourlyWage();
	public void setHourlyWage(double hourlyWage);
	
	public int getnDependents();
	public void setnDependents(int nDependents);
}
