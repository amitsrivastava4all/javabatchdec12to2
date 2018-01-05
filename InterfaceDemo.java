interface IPlayer{
	int MAX_POWER = 100;  // public static final int MAX_POWER = 10;
	int DEFAULT_POWER =10;
	public abstract void attack();
	void getPower();
	void addPower(int power);
	
	
}
abstract class CommonPlayer {
	public void getPower() {
		System.out.println("Common Power 10 ");
	}
}
abstract class PlayerAdapter implements IPlayer{



	@Override
	public void addPower(int power) {
		// TODO Auto-generated method stub
		
	}
	
}
class GreenPlayer extends PlayerAdapter{
	@Override
	public void attack() {
		System.out.println("Fly Attack");
	}

	@Override
	public void getPower() {
		// TODO Auto-generated method stub
		
	}
}
interface StarPlayer{
	void morePowers();
}
interface ComboPlayer extends IPlayer, StarPlayer{
	
}
class YellowPlayer implements ComboPlayer{

	@Override
	public void attack() {
		System.out.println("Yellow Player Attack Average");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPower() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPower(int power) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void morePowers() {
		// TODO Auto-generated method stub
		
	}
	
}
class RedPlayer implements IPlayer,StarPlayer{
	@Override
	public void attack() {
		System.out.println("RedPlayer Attack 100% Power....");
	}

	@Override
	public void morePowers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPower() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPower(int power) {
		// TODO Auto-generated method stub
		
	}
}
//class GreenPlayer implements IPlayer{
//	
//}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YellowPlayer yp = new YellowPlayer();
		yp.attack();
		
		RedPlayer rp = new RedPlayer();
		rp.attack();

	}

}
