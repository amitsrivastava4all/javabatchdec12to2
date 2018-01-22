import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		String sentence = new Scanner(System.in).nextLine();
		//sentence = sentence.toLowerCase();
		//System.out.println(sentence);
		String arr[] = sentence.split(" ");
		for(String a : arr) {
			
			System.out.print(String.valueOf(a.charAt(0)).toUpperCase() + a.substring(1).toLowerCase()+ " ");
		}
	}

}
