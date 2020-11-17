package MethodOverloadingandOverridding;

public class Overloadclass {

	//method overloadind example
		public int add(int num1,int num2){
			int res = num1+num2;
			return res;
		}

		//method overloading changing parameter
		public int add(int num1,int num2,int num3){
			int res = num1+num2+num3;
			return res;
		}

		//method overloading changing datatype

		public int add(int num1,int num2,String str){

			int res = num1+num2;
			System.out.println(str);
			return res;
		}
}
