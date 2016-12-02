package gmail.yarnik75.module8.Passport;

public class Passport {
	
	private String _firstName;
	private String _lastName;
	private String _birthday;
	private String _sex;
	private String _dateOfReceiving;
	private String _passportID;
	
	public Passport(final String firstName,
			        final String lastName, 
			        final String birthday,
		            final String sex,
			        final String dateOfReceiving,
			        final String passportID) {
		
		_firstName = firstName;
		_lastName = lastName;
		_birthday = birthday;
		_sex = sex;
		_dateOfReceiving = dateOfReceiving;
		_passportID = passportID;
	}
		
	public Passport () {}

	public String getfirstName() {
		return _firstName;
	}

	public void setfirstName(String firstName) {
		_firstName = firstName;
	}

	public String getlastName() {
		return _lastName;
	}

	public void setlastName(String lastName) {
		_lastName = lastName;
	}

	public String getbirthday() {
		return _birthday;
	}

	public void setbirthday(String birthday) {
		_birthday = birthday;
	}

	public String getsex() {
		return _sex;
	}

	public void setsex(String sex) {
		_sex = sex;
	}

	public String getdateOfReceiving() {
		return _dateOfReceiving;
	}

	public void setdateOfReceiving(String dateOfReceiving) {
		_dateOfReceiving = dateOfReceiving;
	}

	public String getpassportID() {
		return _passportID;
	}

	public void setpassportID(String passportID) {
		_passportID = passportID;
	}
	
}

	