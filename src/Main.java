	

import processing.core.PApplet;


public class Main extends PApplet{
	
	public static void main(String[] args) {
		Sound music = new Sound();
		String filepath = ("data\\\\music.wav");
		music.playMusic(filepath);
		
		PApplet.main("Main");
		
	}
	

	public void settings() {
		size(1000,700);
		
		
		 
		 
	}
	
	MainScreen p1;
	
	
	
	
	public void setup() {
		imageMode(CENTER);
		p1 = new MainScreen(this);
		
		
	
		  
	}
	

public void draw() {
	
	
	p1.PaintScreen(this);
	
	
	  
     
     

     
    
	}}