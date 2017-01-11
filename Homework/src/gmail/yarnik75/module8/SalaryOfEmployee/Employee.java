package gmail.yarnik75.module8.SalaryOfEmployee;

public abstract class Employee {
	
	private String _name;
	private String _id;
	
	public Employee(final String name, final String id) {_name = name; _id = id;}
	
	public abstract double countSalary();

	public String get_name() {
		return _name;
	}
	
	public String get_id() {
		return _id;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

}
