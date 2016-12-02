package gmail.yarnik75.module8.Passport;

public class Visa {

	private String _country;
	private String _typeVisa;
	private String _startDate;
	private String _endDate;
	private int _periodOfStay; // срок пребывания в стране
	
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
	
	public Visa() {}
	
	public String getcountry() {
		return _country;
	}
	public void setcountry(String country) {
		_country = country;
	}
	public String gettypeVisa() {
		return _typeVisa;
	}
	public void settypeVisa(String typeVisa) {
		_typeVisa = typeVisa;
	}
	public String getstartDate() {
		return _startDate;
	}
	public void setstartDate(String startDate) {
		_startDate = startDate;
	}
	public String getendDate() {
		return _endDate;
	}
	public void setendDate(String endDate) {
		_endDate = endDate;
	}
	public int getperiodOfStay() {
		return _periodOfStay;
	}
	public void setperiodOfStay(short periodOfStay) {
		_periodOfStay = periodOfStay;
	}
	
	}
