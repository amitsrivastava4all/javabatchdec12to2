@FunctionalInterface
interface Calc{
	public int add(int x, int y);
	//public int sub(int x, int y);
}
class ParentA{
	int x = 100;
	ParentA(){
		System.out.println("this is parent class Cons");
	}
	void show() {
		System.out.println("this is show...");
	}
}
class MyCalc implements Calc{
	@Override
	public int add(int x, int y) {
		return x + y;
	}
//	public int subtract(int a , int b) {
//		return a - b;
//	}
}
public class InterfaceUseWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentA  p = new ParentA() {
			void print() {
				System.out.println("My Own Function");
			}
			@Override	
			void show() {
				this.print();
				super.show();
					System.out.println("this is anonymous class show "+super.x);
				}
		};
		p.show();
		//p.print();
		
		Calc c = (x,y)->x+y;
		
		
		Calc calc = new Calc() {
			public int add(int a, int b) {
				return a + b;
			}
		};
		int result = calc.add(100, 200);
		System.out.println("Result is "+result);
		/*Calc calc = new MyCalc();
		int result = calc.add(100 ,200);
		System.out.println("result is "+result);*/
	}

}
