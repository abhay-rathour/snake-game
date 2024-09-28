
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GameRenderer {
	private final static Image dot;
	private final static Image apple;
	private final static Image head;

	static{
		dot = new ImageIcon("src/resources/dot.png").getImage();
		apple= new ImageIcon("src/resources/apple.png").getImage();
		head = new ImageIcon("src/resources/redDot.png").getImage();
	}
	public static void render(Graphics g, Snake snake, Apple apple, JPanel panel){
		if(snake!=null && apple!=null){
			g.drawImage(GameRenderer.apple, apple.getX(), apple.getY(), panel);
			for(int i =0;i<snake.getDots();i++){
				if(i==0){
					g.drawImage(GameRenderer.head,snake.getX()[i],snake.getY()[i],panel);
				}
				else{
					g.drawImage(GameRenderer.dot,snake.getX()[i],snake.getY()[i],panel);
				}
			}
		}
	}
	public static void gameOver(Graphics g,JPanel panel){
		String msg = "Game Over";
		Font small = new Font("Arial", Font.BOLD,14);
		FontMetrics metric = panel.getFontMetrics(small);
		g.setFont(small);
		g.setColor(Color.WHITE);
		g.drawString(msg,(panel.getWidth()-metric.stringWidth(msg))/2,panel.getHeight()/2);
	}
}
