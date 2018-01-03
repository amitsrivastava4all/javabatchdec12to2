class A1
{
	int x=100;
	void show() {
		System.out.println("A Show Call");
	}
}
class B extends A1{
	int x = 200;
	void show() {
		System.out.println("B Show Call "+x);
	}
}
public class UpcastDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new B();
		a.show();
		System.out.println(a.x);

	}

}
