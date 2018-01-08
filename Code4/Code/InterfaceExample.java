interface Q1
{
	int x = 100; // public static final int x= 100
	void show(); // public abstract void show()
}
interface Q2{
	int x = 200; // public static final int x = 200;
	void show();
}
interface Q3 extends Q1, Q2{
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Q1.x);
		System.out.println(Q2.x);
	}

}
