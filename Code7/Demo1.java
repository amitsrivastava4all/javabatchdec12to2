import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object r;
		System.out.println("Enter the String");
		String name = new Scanner(System.in).next();
		StringBuilder sb = new StringBuilder(name);
		sb.reverse();
		System.out.println(name +" "+sb);
		String result = sb.toString().equals(name)?"Palindrome":"Not";
		System.out.println("result "+result);
		

	}

}
