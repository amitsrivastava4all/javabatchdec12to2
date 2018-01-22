import java.util.Arrays;
import java.util.Scanner;

public class FreqCharDemo {

	public static void main(String[] args) {
		int max = 0;
		char e = '#';
		System.out.println("Enter the String");
		String str = new Scanner(System.in).next();
		char arr [] = str.toCharArray();
		Arrays.sort(arr);
		String temp =new String(arr);
		System.out.println(temp);
		for(int i = 0; i<temp.length(); i++) {
			char b = temp.charAt(i);
			
			int count = (temp.lastIndexOf(b) - temp.indexOf(b))+1;
			i = temp.lastIndexOf(b);
			if(count>max) {
				max = count;
				e = b;
			}
		
		}
		System.out.println(e + " "+max);
	}

}
