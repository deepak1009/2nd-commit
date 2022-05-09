package simplej;

public class ExampleError1 {
public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
	int [] array=new int[3];
	array[6]=5;
	System.out.println("The array is of size "+array.length);
}
}
