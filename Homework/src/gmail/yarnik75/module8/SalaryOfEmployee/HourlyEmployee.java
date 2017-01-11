package gmail.yarnik75.module8.SalaryOfEmployee;

public class HourlyEmployee extends Employee{
	
	private int _rateHour;
	
	public HourlyEmployee(final String name, final String id, final int rateHour ) {
		super(name, id);
		_rateHour = rateHour;
	}

	@Override
	public double countSalary() {
		double result = 20.8 * 8 * _rateHour;
		return result;
	}

	@Override
	 	public String toString() {
	 		return "[_name=" + get_name() +
	 				", " + get_id() + ", Salary = " + countSalary() + "]";
	 	}
	
}
