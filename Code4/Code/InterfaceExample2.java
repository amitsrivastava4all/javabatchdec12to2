abstract interface X1
{
	public abstract void show(); 
	public default void display() {
		System.out.println("X1 Body Function");
	}
}
interface X2{
	void show();
	public default void display() {
		System.out.println("X2 Body Function");
	}
}
class W1 implements X1,X2{
	@Override
	public void display() {
		X1.super.display();
		X2.super.display();
		System.out.println("w1 display override");
	}
	
	public void show() {
		X1.super.display();
		X2.super.display();
		System.out.println("Inside Show");
	}
}
public class InterfaceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		W1 obj = new W1();
		obj.display();
	}

}
