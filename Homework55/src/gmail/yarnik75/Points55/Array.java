package gmail.yarnik75.Points55;
public class Array {
	private Point[] arr;

	public Array(Point[] arr) {
		super();
		this.arr = arr;
	}
	
	public void sort(){
		for(int i = arr.length - 1; i > 0; i--){
			for(int j = 0; j < i; j++){
				if ((arr[j].get_x() * arr[j].get_x() + arr[j].get_y() * arr[j].get_y())
						> (arr[j+1].get_x() * arr[j+1].get_x() + arr[j+1].get_y() * arr[j+1].get_y())){
				Point temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}
		}
	}
	
	public void print(){
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
