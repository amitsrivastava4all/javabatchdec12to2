import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new 
				BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Name");
		String name = br.readLine();
		System.out.println("Enter the Age");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Name is "+name+" Age is "+age);
		br.close();
	}

}
