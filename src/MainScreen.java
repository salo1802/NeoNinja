
import processing.core.PApplet;
import processing.core.PImage;

public class MainScreen {

	private PImage p;
	private PImage l;
	private boolean subir;
	private float y;
	
	public MainScreen(PApplet app) {
	 p = app.loadImage("pantallaP.png");
	 l = app.loadImage("LogoG.png");
	 y = 110;
	 subir = true;
	}
	
	
	public void PaintScreen(PApplet app) {
		app.image(p, 500, 350);
		
		if (subir == true) {
			y += 0.5;}
		if (subir == false) {
			y -= 0.5;}
		if (y == 100) {subir = true;}
		if (y == 160) {subir= false;}
			
		
		app.image(l,500,y);
		
	}
}