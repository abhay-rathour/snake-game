//This class will handle everything related to snake object
public class Snake {
	private final int DOT_SIZE = 10;
	private final int ALL_DOTS = 29;

	//XY cordinate of each body dot of snake
	private final int[] x = new int[ALL_DOTS];
	private final int[] y = new int[ALL_DOTS];

	//size of snake
	private int dots;

	//direction of motion
	private boolean left=false;
	private boolean right=true;
	private boolean up=false;
	private boolean down=false;


	public Snake(){
		initSnake();
	}

	//Initialising snake with size 3 and starting from 50,50 moving towards right
	private void initSnake(){
		dots=3;
		for(int i=0;i<dots;i++){
			x[i]=50-i*10;
			y[i]=50;
		}
	}

	//Move the snake one dot in the direction of motion
	public void move(){
		for(int i=dots;i>0;i--){
			x[i]=x[i-1];
			y[i]=y[i-1];
		}
		if(left){
			x[0]-=DOT_SIZE;
		}
		if(right){
			x[0]+=DOT_SIZE;
		}
		if(up){
			y[0]-=DOT_SIZE;
		}
		if(down){
			y[0]+=DOT_SIZE;
		}
	}

	//increase the size by 1
	public void grow(){
		dots++;
	}
	//Getters for the body points
	public int[] getX(){
		return x;
	}
	public int[] getY(){
		return y;
	}
	public int getDots(){
		return dots;
	}

	//Getters and setters for the direction of motion
	public boolean isLeft(){
		return left;
	}
	public void setLeft(boolean left){
		this.left=left;
	}
	public boolean isRight(){
		return right;
	}
	public void setRight(boolean right){
		this.right=right;
	}
	public boolean isUp(){
		return up;
	}
	public void setUp(boolean up){
		this.up=up;
	}
	public boolean isDown(){
		return down;
	}
	public void setDown(boolean down){
		this.down=down;
	}
}
