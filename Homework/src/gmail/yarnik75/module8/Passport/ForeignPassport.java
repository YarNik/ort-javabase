package gmail.yarnik75.module8.Passport;
import java.util.Arrays;

public class ForeignPassport extends Passport{

	private String _dateOfReceivingFP;
	private String _passportID_FP;
	private Visa[] _visas = new Visa[2];
	private int _visasCount = 0;
	
	
	public ForeignPassport(final String firstName,
						   final String lastName,
						   final String birthday,
						   final String sex,
						   final String dateOfReceiving,
			               final String passportID,
			               final String dateOfReceivingFP,
			               final String passportID_FP) {
		super(firstName, 
			  lastName,
			  birthday,
			  sex,
			  dateOfReceiving,
			  passportID);
		_dateOfReceivingFP = dateOfReceivingFP;
		_passportID_FP = passportID_FP;
	}
	
	public ForeignPassport() {}

	public String getdateOfReceivingFP() {
		return _dateOfReceivingFP;
	}

	public void setdateOfReceivingFP(String dateOfReceivingFP) {
		_dateOfReceivingFP = dateOfReceivingFP;
	}

	public String getpassportID_FP() {
		return _passportID_FP;
	}

	public void setpassportID_FP(String passportID_FP) {
		_passportID_FP = passportID_FP;
	}
	
	public void addVisa(String country,
						String typeVisa,
						String startDate,
						String endDate,
						int periodOfStay
			) {
		if (_visasCount < _visas.length) {
			_visas[_visasCount++] = new Visa(country, typeVisa,
											startDate, endDate, periodOfStay);
					} else {
			System.err.printf("Citizen %s %s "
						+ "has no place for record Visa%n", 
					getfirstName(), 
					getlastName());
			}
		}
	
	public String getVisa() {
		return Arrays.toString(_visas);
		}

	
	
}
