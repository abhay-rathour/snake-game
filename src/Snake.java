public class Snake {
	private final int DOT_SIZE = 10;
	private final int ALL_DOTS = 29;

	private final int[] x = new int[ALL_DOTS];
	private final int[] y = new int[ALL_DOTS];

	private int dots;

	private boolean left=false;
	private boolean right=true;
	private boolean up=false;
	private boolean down=false;


	public Snake(){
		initSnake();
	}

	private void initSnake(){
		dots=3;
		for(int i=0;i<dots;i++){
			x[i]=50-i*10;
			y[i]=50;
		}
	}

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

	public void grow(){
		dots++;
	}
	public int[] getX(){
		return x;
	}
	public int[] getY(){
		return y;
	}
	public int getDots(){
		return dots;
	}
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
