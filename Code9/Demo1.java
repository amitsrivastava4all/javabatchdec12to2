import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
	static Scanner s = new Scanner(System.in);
	static int firstNumber = 0;
	static int secondNumber = 0;
	static final String MSG = "Only Number Allowed , U EnterSomething Else";
	static int result = 0;
	static void divide(){
		try{
			result = firstNumber / secondNumber;
		}
		catch(ArithmeticException e){
			System.out.println("U Divide a number with zero ");
			takeSecondNumber();
			divide();
		}
	}
	static void takeFirstNumber(){
		try{
		System.out.println("Enter the First Number");
		firstNumber = s.nextInt();
		}
		catch(InputMismatchException e){
			s.nextLine();
			System.out.println(MSG);
			takeFirstNumber();
		}
		}
	static void takeSecondNumber(){
		try{
		System.out.println("Enter the Second Number");
		secondNumber = s.nextInt();
		}
		catch(InputMismatchException e){
			s.nextLine();
			System.out.println(MSG);
			takeSecondNumber();
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x[] = new int[5];
//		for(int i : x){
//			System.out.println(i);
//		}
//		x[6] = 100;
//		System.out.println(" I will never execute...");
//		int firstNumber = 0;
//		int secondNumber  = 0;
//		int result = 0;
//		Scanner s = new Scanner(System.in);
//		try{
//		System.out.println("Enter the First Number");
//		 firstNumber = s.nextInt();
//		}
//		catch(InputMismatchException exceptionObject){
//			s.nextLine();
//			System.out.println("Only Number Allowed , U Enter something else...");
//		}
//		try{
//		System.out.println("Enter the Second Number");
//		 secondNumber = s.nextInt();
//		}
//		catch(InputMismatchException e){
//			s.nextLine();
//			System.out.println("Only Number Allowed , U Enter Something else....");
//		}
//		try{
//		 result = firstNumber / secondNumber;
//		}
//		catch(ArithmeticException e){
//			System.out.println("U divide a number with zero ");
//		}
		try{
			takeFirstNumber();
			takeSecondNumber();
			divide();
			System.out.println("Result is "+result);
		}
		finally{
		
		s.close();
		}
		

	}

}
