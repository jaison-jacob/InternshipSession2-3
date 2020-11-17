package MethodOverloadingandOverridding;

public class Overloadmainclass {

	public static void main(String arg[]){

		Overloadclass ex = new Overloadclass();
		int result = ex.add(5, 5);
		System.out.println("method overloading example : "+result);

		result = ex.add(5, 10, 5);
		System.out.println("method overloading change parameter : "+result);

		result = ex.add(10, 10, "method overloading chang datatype : ");

		System.out.println(result);

	}
}
