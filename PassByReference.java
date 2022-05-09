package simplej;



class PassByReference {
	public static void main(String arg[]) {


		int arr[] = { 1, 3, 4, 5, 1, 1, 7 };

		PassByReference test = new PassByReference();

		int numOnes;



		System.out.print("Values of the array: [ ");

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}

		System.out.println("]");


		numOnes = test.onetozero(arr);

		System.out.println("Number of Ones = " + numOnes);

		System.out.print("New values of the array: [ ");

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}

		System.out.println("]");

	}

	 int onetozero(int[] arr) {
		 int count=0;
		 for(int i=0;i<arr.length;i++) {
			 if (arr[i]==1){
				 count++;
				 arr[i]=0;
			 }
		 }
		return count;
	}
}