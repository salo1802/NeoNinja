
import processing.core.PApplet;
import processing.core.PImage;

public class MainScreen {

	private PImage p;
	private PImage l;
	
	public MainScreen(PApplet app) {
	 p = app.loadImage("pantallaP.png");
	 l = app.loadImage("LogoG.png");
	}
	
	
	public void PaintScreen(PApplet app) {
		app.image(p, 500, 350);
		int y = 210;
		app.image(l,500,y);
		
	}
}