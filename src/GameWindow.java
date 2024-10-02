//This is the main entry point for the game
import java.awt.EventQueue;
import javax.swing.JFrame;

public class GameWindow extends JFrame {
	public GameWindow(){
		initUI();
	}
	//Private function to initialize game window and gameboard
	private void initUI(){
		add(new GameBoard());
		setResizable(false);
		pack();
		setTitle("SNAKE");
		setLocationRelativeTo(null);
	}
	//Function main for the program entry point
	public static void main(String[] args) {
		EventQueue.invokeLater(()-> {
			JFrame ex = new GameWindow();
			ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ex.setVisible(true);
		});
	}
}
