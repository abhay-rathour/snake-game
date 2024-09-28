public class GameController {
	private Snake snake;
	private Apple apple;
	private boolean inGame = true;
	private final int B_WIDTH;
	private final int B_HEIGHT;

	public GameController(Snake snake, Apple apple, int width, int height){
		this.snake = snake;
		this.apple = apple;
		this.B_WIDTH = width;
		this.B_HEIGHT = height;
	}

	public void updateGame(){
		snake.move();
		checkApple();
		checkCollision();
	}
	public boolean isInGame(){
		return inGame;
	}

	private void checkApple(){
		if(snake.getX()[0] == apple.getX() && snake.getY()[0] == apple.getY()){
			snake.grow();
			apple.randomizePosition();
		}
	}
	private void checkCollision(){
		for(int i=0;i<snake.getDots();i++){
			if((i>3)&&(snake.getX()[0]==snake.getX()[i])&&(snake.getY()[0]==snake.getY()[i])){
				inGame = false;
			}
		}
		if(snake.getX()[0]>=B_WIDTH||snake.getY()[0]>=B_HEIGHT||snake.getX()[0]<0||snake.getY()[0]<0){
			inGame=false;
		}
	}
}
