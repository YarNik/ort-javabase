package gmail.yarnik75.Passport;

public class Visa {

	private String _country;
	private String _typeVisa;
	private String _startDate;
	private String _endDate;
	private int _periodOfStay; // Длительность пребывания в стране
	
	public Visa(final String country,
			    final String typeVisa,
		    	final String startDate,
		    	final String endDate,
			    final int periodOfStay) {
		_country = country;
		_typeVisa = typeVisa;
		_startDate = startDate;
		_endDate = endDate;
		_periodOfStay = periodOfStay;
	}

	public String get_country() {
		return _country;
	}

	public void set_country(String _country) {
		this._country = _country;
	}

	public String get_typeVisa() {
		return _typeVisa;
	}

	public void set_typeVisa(String _typeVisa) {
		this._typeVisa = _typeVisa;
	}

	public String get_startDate() {
		return _startDate;
	}

	public void set_startDate(String _startDate) {
		this._startDate = _startDate;
	}

	public String get_endDate() {
		return _endDate;
	}

	public void set_endDate(String _endDate) {
		this._endDate = _endDate;
	}

	public int get_periodOfStay() {
		return _periodOfStay;
	}

	public void set_periodOfStay(int _periodOfStay) {
		this._periodOfStay = _periodOfStay;
	}
	
	@Override
 	public String toString() {
 		return "[Country:" + get_country() +
 				", " + "start Date: " + get_startDate() +
 				", end Date: " + get_endDate() + "]";
 	}
		
}
