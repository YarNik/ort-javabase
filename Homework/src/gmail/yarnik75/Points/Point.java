package gmail.yarnik75.Points;

public class Point {
	private String _name;
	private int _x;
	private int _y;
	
	public Point(String _name, int _x, int _y) {
		super();
		this._name = _name;
		this._x = _x;
		this._y = _y;
	}

	public String get_name() {
		return _name;
	}

	public int get_x() {
		return _x;
	}

	public int get_y() {
		return _y;
	}
	
	@Override
 	public String toString() {
		return get_name() + "(" + get_x() + "," + get_y() + ")";
	}


	
}
