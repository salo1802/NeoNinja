import processing.core.PApplet;
import processing.core.PImage;

public class MainScreen extends Screen {

	private PImage l;
	private boolean subir;
	private float y;
	
	MainScreen (PApplet app) {
		super();
	
		l = app.loadImage("LogoG.png");
		 y = 110;
		 subir = true;
		
	}
	
	

	public void PaintMainScreen(PApplet app) {
		
		PaintScreen(app);
		
		
		if (subir == true) {
			y += 2;}
		if (subir == false) {
			y -= 2;}
		if (y == 100) {subir = true;}
		if (y == 160) {subir= false;}
			
		
		app.image(l,500,y);}
	
	
	

}