package jpu2016.dogfight.gameframe;

import java.awt.Graphics;
import java.util.*;

public abstract class GamePanel implements Observer {
	
	public GamePanel(IGraphicsBuilder graphicBuilder) {} 
	public void update (Observable observable) {}
	public void paintComponent (Graphics graphic) {}
	
}
 