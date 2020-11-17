package StringMethods;

public class StringMethods {

	public static void main(String arg[]){

		String str1 = "jaison";
		String str2 = "jai";

		//length method

		System.out.println("String length is : "+str1.length());

		//use "+"

		System.out.println("concat : "+str1+str2);

		//toLowerCase() method

		str1 = "JAISON";
		System.out.println("toLowerCase() method : "+str1.toLowerCase());

		//toLowerCase() method

				//str1 = "JAISON";
				System.out.println("toUpperCase() method : "+str2.toUpperCase());

		//replace method
				System.out.println("replace method : "+str2.replace("jai", "son"));
		//trim method 

			str1 = "  jaison   ";
			System.out.println("trim method : "+str1.trim());

		//equals method

			System.out.println("equals methhod : "+str1.equals(str2));

         //equalsIgnoreCase method

			System.out.println("equalsIgnoreCase methhod : "+str1.equalsIgnoreCase(str2));

		//charat method

			System.out.println("char at method : "+str1.charAt(3));

			//concat method 

			System.out.println("concatr method : "+str1.concat(str2));

	}

}
