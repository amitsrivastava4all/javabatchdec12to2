class GrandParent{
	int x;  // Instance Variable
	GrandParent(){
		System.out.println("GP Default Cons Call");
	}
	GrandParent(int x){
		System.out.println("GP Param Cons Call");
		this.x = x;
	}
}
class Parent extends GrandParent{
	int x;  // Instance Variable
	Parent(){
		System.out.println("parent Default Cons Call");
	}
	Parent(int x){
		super(x);
		System.out.println("parent Param Cons Call");
		this.x = super.x + x;
	}
}
class Child extends Parent{
	int x;  // Instance Variable
	Child(){
		System.out.println("Child Default Cons Call");
	}
	Child(int x){
		super(x);
		//GrandParent t = this;
		System.out.println("Child Param Cons Call");
		System.out.println("Parent x "+((Parent)this).x);
		System.out.println("GP X "+ ((GrandParent)this).x);
		this.x =super.x + ((GrandParent)this).x +x;
		System.out.println("X is "+this.x);
	}
}
public class MultiLevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child(10);
	}

}
