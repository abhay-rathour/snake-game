import javax.swing.JFrame;
import java.awt.EventQueue;

public class GameWindow extends JFrame {
	public GameWindow(){
		initUI();
	}
	private void initUI(){
		add(new GameBoard());
		setResizable(false);
		pack();
		setTitle("SNAKE");
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(()-> {
			JFrame ex = new GameWindow();
			ex.setVisible(true);
		});
	}
}
