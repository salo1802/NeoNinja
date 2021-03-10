
import processing.core.PApplet;
import processing.core.PFont;

public class SumScreen extends Screen {

	PFont myFont;
	boolean playPressed;
	SumScreen (PApplet app){
		super();
		myFont = app.loadFont("MaturaMTScriptCapitals-48.vlw");
		app.textFont(myFont);}
	
	
	
	public void PaintSumScreen(PApplet app,int score,int time) {
	PaintScreen(app);
	app.textSize(150);
	app.text("" + score, 500, 200);
	app.textSize(80);
	app.text("" + time + " seg", 500, 400);}
	
	public int SumScreenButton(int mouseX, int mouseY){
		playPressed = button(500,600, 250,100, mouseX, mouseY);
		
		if (playPressed==true) {return 2;}
		
		else  return 3;
	}
}
