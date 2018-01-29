import javax.swing.JFrame;
import javax.swing.Timer;

public class GameFrame extends JFrame implements GameConstants {
	
	
	
	GameFrame(){
		setSize(GWIDTH, GHEIGHT);
		setTitle("Ball Game");
		setLocationRelativeTo(null);
		Board board = new Board();
		add(board);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameFrame frame = new GameFrame();
		

	}

}
