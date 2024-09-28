public class Apple {
	private int  x;
	private int y;
	private final int DOT_SIZE = 10;
	private final int RAND_POS = 29;

	public Apple(){
		randomizePosition();
	}
	public void randomizePosition(){
		x = (int)(Math.random()*RAND_POS) * DOT_SIZE;
		y = (int)(Math.random()*RAND_POS) * DOT_SIZE;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
}
