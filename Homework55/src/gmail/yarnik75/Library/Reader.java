package gmail.yarnik75.Library;


public class Reader {
	
	private String _firstName;
	private String _lastName;
	private String _patronymic;
	private int _idTicket;
	private String _faculty;
	private String _birthday;
	private String _phoneNumber;
	
	public Reader(String _firstName, String _lastName, String _patronymic, int _idTicket, String _faculty,
			String _birthday, String _phoneNumber) {
		super();
		this._firstName = _firstName;
		this._lastName = _lastName;
		this._patronymic = _patronymic;
		this._idTicket = _idTicket;
		this._faculty = _faculty;
		this._birthday = _birthday;
		this._phoneNumber = _phoneNumber;
	}

	public String get_firstName() {
		return _firstName;
	}

	public String get_lastName() {
		return _lastName;
	}

	public String get_patronymic() {
		return _patronymic;
	}

	public int get_idTicket() {
		return _idTicket;
	}

	public String get_faculty() {
		return _faculty;
	}

	public String get_birthday() {
		return _birthday;
	}

	public String get_phoneNumber() {
		return _phoneNumber;
	}

	@Override
 	public String toString() {
 		return "[ " + get_firstName() + " " + get_lastName() +
 				" " + get_patronymic() + " " + get_idTicket() + " "
 				+ get_faculty() + " " + get_birthday() + " " +
 				 get_phoneNumber() + "]";
 	}


}
