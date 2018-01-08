import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z = (int)Math.pow(2, 5);
		System.out.println(z);
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		int i = 1;
		while(i<=times) {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int n= scanner.nextInt();
		System.out.println(a +"  "+b +  " "+n);
		i++;
		}
	}

}
