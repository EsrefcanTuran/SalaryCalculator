
public class Employee {
	String name;
	double salary;
	int workHours;
	int startYear;
	
	public Employee(String name, double salary, int workHours, int startYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.startYear = startYear;
	}
	
	public double tax() {
		if (this.salary <= 1000)
			return 0;
		else
			return this.salary * 0.03;
	}
	
	public double bonus() {
		if (workHours > 40)
			return (double) 30 * (workHours - 40);
		else
			return 0;
	}
	
	public double raiseSalary(){
        if ( (2022-this.startYear) < 10 )
            return this.salary * 0.05;
        else if ( (2022-this.startYear) >= 10 && (2021-this.startYear) < 20)
            return this.salary * 0.10;
        else
            return this.salary * 0.15;
    }
	
	@Override
	public String toString() {
        return  "Name: " + this.name + "\n" +
                "Salary: " + this.salary + "\n" +
                "Work Hours: " + this.workHours + "\n" +
                "Start Year: " + this.startYear + "\n" +
                "Tax: " + tax() + "\n" +
                "Bonus: " + bonus() + "\n" +
                "Salary increase: " + raiseSalary() + "\n" +
                "Salary with tax and bonus: " + (this.salary - tax() + bonus()) + "\n" +
                "Total: " + (this.salary + raiseSalary() - tax() + bonus());
    }

}
