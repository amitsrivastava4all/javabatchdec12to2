import java.util.Random;

public class GenerateRandom {
	Random r;
	private int seed;
	public GenerateRandom(int seed){
		this.seed = seed;
		r = new Random();
	}
	
	public int getRandom(){
		int number = r.nextInt(this.seed);
		return number>=0?number:10;
	}
	
//	public static void main(String[] args) {
//		GenerateRandom r = new GenerateRandom(100);
//		System.out.println(r.getRandom());
//		System.out.println(r.getRandom());
//		System.out.println(r.getRandom());
//		System.out.println(r.getRandom());
//		System.out.println(r.getRandom());
//		
//
//	}

}
