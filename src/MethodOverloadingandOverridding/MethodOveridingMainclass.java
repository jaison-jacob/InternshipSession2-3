package MethodOverloadingandOverridding;

public class MethodOveridingMainclass {

	public static void main(String arg[]){

		Bclass ex =new Bclass();

		System.out.println("method overridding : ");
		 ex.output();
		 //output A
		 ex.outputA();

		 //output B

		 ex.outputB();

	}
}
