 class FirstClass{
// ... it is called var args (Java 5)
	
	public static void main(int x){
		System.out.println("It is Just a Normal Function ");
	}

	static strictfp public  void main(String ...arr){
	String name = "Amit";
	boolean v1 = true;
	char e1 = 'ए'; // 2 byte (Unicode chars)
		byte x = (byte)129;
		if(arr.length==2){
		long a =Long.parseLong(arr[0]);
		long b =Long.parseLong(arr[1]);
		long c = a + b;
		float v = 10.20f;
		double bb = 10.24354620;
		System.out.println("Hello Java "+c+" " +e1);
		main(100);
		}
		else{
		System.out.println("Invalid Args ");
		}
	}
}