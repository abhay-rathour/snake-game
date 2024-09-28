import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class InputHandler extends KeyAdapter {

	private final Snake snake;
	public InputHandler(Snake snake) {
		this.snake = snake;
	}

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
