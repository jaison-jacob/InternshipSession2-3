package Arraydeclaration;

public class arrayclass {

	public static void main(String arg[]){

		int[] arr1 = {2,3,4,5,6};

		for(int i=0;i < arr1.length;i++){
			System.out.println("index " +i +" value "+arr1[i]);
		}

		//assigning data into array


		int[]  arr2 = new int[5];
		for(int i=0;i<arr2.length-1;i++){
			arr2[i] = i;
		}

		System.out.println("print data form assigning array");
		for(int i=0;i < arr2.length;i++){
			System.out.println("index " +i +" value "+arr2[i]);
		}


	}
}
