package simplej;

public class ExampleError2 {
	public static void main(String[] args) {
		int [] array = new int[5];
		try {
		array[9]=8;
		}
		catch (Exception e){
			System.out.println("Array index is out of bounds");
			
		}
		finally {
			System.out.println("The size of array is: "+array.length);
		}
	}
}
