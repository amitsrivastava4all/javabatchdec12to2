import java.io.File;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) throws IOException {
		String path = "/Users/amit/Documents/FileOutput/abcd.txt";
		File file = new File(path);
		System.out.println(file.createNewFile()?"Created":"Not Created");
		
		
		// TODO Auto-generated method stub
		String name = null;
		String name2 = "Amit";
		int x[] = {10,20};
		//x[100] = 900;
		
		int d = 10/0;
		
		System.out.println("Name is "+name2.toUpperCase());
		name.toUpperCase();
		System.out.println("Program End");
		// 77.toUpperCase();
	}

}
