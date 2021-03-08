import processing.core.PApplet;
import processing.core.PImage;

public class MainScreen extends Screen {

	private PImage l;
	private boolean subir;
	private float y;
	boolean playButtonPressed;
	boolean H2PButtonPressed;
	
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
	
	public int mainScreenButtons(int mouseX,int mouseY) {
		
		playButtonPressed = button(500,350,350,140, mouseX, mouseY);
		
		H2PButtonPressed = button(500,520,400,100,mouseX,mouseY);
		
		if(playButtonPressed == true) {return 2;}
		if(H2PButtonPressed == true) {return 1;}
		else return 0;
	}
	
	

}