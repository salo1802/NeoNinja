import processing.core.PApplet;
import processing.core.PImage;

public class Screen {

	public String fileName;
	PImage image;
	
	Screen(){
		
	}
	
	public void loadScreenImage(PApplet app, String fileName){
		this.fileName = fileName ;
		 image = app.loadImage(fileName);
		
	}
	
	public void PaintScreen(PApplet app) {
		app.image(image, 500, 350);}
	
	public boolean  button(int x, int y,int width,int height,int mouseX,int mouseY) {
		boolean action = false;
			if(mouseX  > x-width/2 && mouseX  < x+width/2 && mouseY > y-height/2 && mouseY < y+height/2) {
				action = true; 
				}
			return action;
			
			}
	
}
