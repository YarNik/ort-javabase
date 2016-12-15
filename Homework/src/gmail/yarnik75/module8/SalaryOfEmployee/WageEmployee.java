package gmail.yarnik75.module8.SalaryOfEmployee;

public class WageEmployee extends Employee{
	
	private int _rate;
	
	public WageEmployee(final String name, final String id, final int rate ) {
		super(name, id);
		_rate = rate;
	}

	@Override
	public double countSalary() {
		double result = _rate;
		return result;
	}

	@Override
	 	public String toString() {
	 		return "[_name=" + get_name() +
	 				", " + get_id() + ", Salary = " + countSalary() + "]";
	 	}
	


}
