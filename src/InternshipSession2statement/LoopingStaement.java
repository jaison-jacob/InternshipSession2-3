package InternshipSession2statement;

public class LoopingStaement {

	public static void main(String arg[]){

		int num = 2;

		//for loop
		System.out.println("for loop");
		for(int i=1;i<=10;i++){

			int res = num*i;
			System.out.println(num+" * "+i+" = "+res);

		}

		System.out.println();
		System.out.println();
		System.out.println();
		//while loop
		System.out.println("while loop");

		while(num < 20){

			num++;
			System.out.println("num value "+num);
		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("do while loop");
		//do while loop
		//it is working first execute without checking condition

		int check = 10;

		do{

			System.out.println(" check = "+check);

			check+=20; 
		}while(check<100);

	}
}
