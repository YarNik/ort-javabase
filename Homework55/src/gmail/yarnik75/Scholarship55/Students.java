package gmail.yarnik75.Scholarship55;

public class Students {
	private static int _grant = 850;
	private static int _markCountMax = 5;
	private static int _markCountMin = 3;
	private String _firstName;
	private String _lastName;
	private String _patronymic;
	private String _group;
	private int _marks[] = new int[0];
	
	public Students(final String firstName,
	                final String lastName,
	                final String patronomic,
	                final String group)
                    
       {_firstName = firstName;
        _lastName = lastName;
        _patronymic = patronomic;
        _group = group;}

	public String get_firstName() {
		return _firstName;
	}

	public void set_firstName(String _firstName) {
		this._firstName = _firstName;
	}

	public String get_lastName() {
		return _lastName;
	}

	public void set_lastName(String _lastName) {
		this._lastName = _lastName;
	}

	public String get_patronymic() {
		return _patronymic;
	}

	public void set_patronymic(String _patronymic) {
		this._patronymic = _patronymic;
	}

	public String get_group() {
		return _group;
	}

	public void set_group(String _group) {
		this._group = _group;
	}

	public void add_Mark(int Mark) {
		if (_marks.length < _markCountMax) {
			int [] temp = new int[_marks.length + 1];
			for (int i = 0; i < _marks.length; ++i){
				temp [i] = _marks [i];
			}
			temp [temp.length - 1] = Mark;
			_marks = temp;
		} else {
			System.err.printf("Student %s %s "
					+ "has maximum amount of marks%n", 
				get_firstName(), 
				get_lastName());
		}
	}
	
	public double sumOfGrand() {
		double sumOfMarks = 0;
		int sumOfThree = 0;    //amount of "three"
		double result = 0;
		for (int i = 0; i < _marks.length; ++i){
			sumOfMarks = sumOfMarks + _marks [i];
			if (_marks [i] == 3){
				sumOfThree ++;
			}
		}
		if ( sumOfThree < 3 & _marks.length > _markCountMin - 1){
			result = _grant * 1.0;
		}
		if (sumOfThree == 0 & _marks.length > _markCountMin - 1){
			result = _grant * 1.5;
		}
		if (sumOfMarks / _marks.length == 4 & sumOfThree == 0 & _marks.length > _markCountMin - 1){
			result = _grant * 1.25;
		}
		if (sumOfMarks / _marks.length == 5 & _marks.length > _markCountMin - 1){
			result = _grant * 2;
		}

		return result;
		}
	
	@Override
 	public String toString() {
 		return "[ " + get_lastName() + " " + get_group() + " " + sumOfGrand() + "]";
 	}
}