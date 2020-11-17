package InternshipSession2statement;

public class IfclassStatement {

	public static void main(String arg[]){

		int num = 50;


		//if else statement
		if(num == 50){
			System.out.println("this is num 50");
		}else{
			System.out.println("this num is not 50");
		}


		//Nested if statement

	     if(num > 20){

	    	 System.out.println(num + " is grater than 20 in first");

	    	 num -=20;

	    	 if(num > 20){

		    	 System.out.println(num + " is grater than 20 in second");
	    	 }

	     }

	     //switch statement 

	     int num1 = 78;


	     switch(num1=78){
	     case 46:
	    	 System.out.println("num is 78 stage1");
	    	 break;
	     case 78: 
	    	 System.out.println("num is 78 stage2");
	    	 break;
	     default:
	    	 System.out.println("num is not in the case");
	     }

	}
}
