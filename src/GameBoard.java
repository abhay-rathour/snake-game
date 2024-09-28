//This will be the main class conecting different smaller components together with controller
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GameBoard extends JPanel implements ActionListener{
	private final int B_WIDTH = 300;
	private final int B_HEIGHT = 300;
	private final int DELAY = 140;

	private Snake snake;
	private Apple apple;
	private GameController controller;
	private Timer timer;

	public GameBoard(){
		initBoard();
	}
	//Initialising the game board
	private void initBoard(){
		setBackground(Color.BLACK);
		setFocusable(true);
		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		snake = new Snake();
		apple = new Apple();
		controller = new GameController(snake,apple,B_WIDTH,B_HEIGHT);
		addKeyListener(new InputHandler(snake));
		initGame();
	}
	
	//starting the game
	private void initGame(){
		apple.randomizePosition();
		timer = new Timer(DELAY, this);
		timer.start();
	}

	//Paint function to paint the game graphics
	@Override
	protected void paintComponent(Graphics g){
		if(controller.isInGame()){
			super.paintComponent(g);
			GameRenderer.render(g,snake,apple,this);
			Toolkit.getDefaultToolkit().sync();
		}
		else{
			GameRenderer.gameOver(g,this);
			timer.stop();
		}

	}
	//Event listioner to update the game on each key press
	@Override
	public void actionPerformed(ActionEvent e) {
		if(controller.isInGame()){
			controller.updateGame();
		}
		repaint();
	}
}
