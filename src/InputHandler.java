// This class will handle all the user interactions in game
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class InputHandler extends KeyAdapter {

	private final Snake snake;
	
	// Inititialising this handler with the snake in our game
	public InputHandler(Snake snake) {
		this.snake = snake;
	}

	//On Each Keypress changing the direction according to the valid arrow keypress
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if(key == KeyEvent.VK_LEFT && !snake.isLeft() && !snake.isRight()){
			snake.setDown(false);
			snake.setUp(false);
			snake.setLeft(true);
		}
		if(key == KeyEvent.VK_RIGHT && !snake.isRight() && !snake.isLeft()){
			snake.setDown(false);
			snake.setUp(false);
			snake.setRight(true);
		}
		if(key == KeyEvent.VK_UP && !snake.isUp() && !snake.isDown()){
			snake.setLeft(false);
			snake.setUp(true);
			snake.setRight(false);
		}
		if(key == KeyEvent.VK_DOWN && !snake.isDown() && !snake.isUp()){
			snake.setLeft(false);
			snake.setRight(false);
			snake.setDown(true);
		}
	}
}
