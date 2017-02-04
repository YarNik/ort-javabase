package gmail.yarnik.Points5555;
	/**
	 * The class Point describes the point  with coordinates X, Y.
	 * @author yarnik75@gmail.com
	 *
	 */
public class Point {
	private String _name;
	private int _x;
	private int _y;
	
	/**
	 * Makes point with options:
	 * @param Name - name of point,
	 * @param x - coordinate x,
	 * @param y - coordinate y.
	 */
	public Point(String Name, int x, int y) {
		super();
		this._name = Name;
		this._x = x;
		this._y = y;
	}
	
	/**
	 * 
	 * @return name of point.
	 */
	public String getName() {
		return _name;
	}
	
	/**
	 * 
	 * @return coordinate x.
	 */
	public int getX() {
		return _x;
	}

	/**
	 * 
	 * @return coordinate y.
	 */
	public int getY() {
		return _y;
	}
	
	@Override
 	public String toString() {
		return getName() + "(" + getX() + "," + getY() + ")";
	}


	
}
