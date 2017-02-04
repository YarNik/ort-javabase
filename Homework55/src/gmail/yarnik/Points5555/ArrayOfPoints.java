package gmail.yarnik.Points5555;
	/**
	 * The class ArrayOfPoints describes array of points.
	 * @author yarnik75@gmail.com
	 *
	 */
public class ArrayOfPoints {
	private Point[] arr;
	
	/**
	 * Makes array of points.
	 * @param arr
	 */
	public ArrayOfPoints(Point[] arr) {
		super();
		this.arr = arr;
	}
	/**
	 * Sorts elements of point`s array by distance from the origin. 
	 */
	public void sort(){
		for(int i = arr.length - 1; i > 0; i--){
			for(int j = 0; j < i; j++){
				if (Distance(arr[j]) > Distance(arr[j + 1])){
				Point temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}
		}
	}
	/**
	 * 
	 * @param p point(x,y). 
	 * @return the distance of point from the origin.
	 */
	public double Distance (Point p){
		return Math.sqrt(p.getX() * p.getX() + p.getY() * p.getY()); 
	}
	/**
	 * Outputs elements of array on the console.
	 */
	public void print(){
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
