	

import processing.core.PApplet;


public class Main extends PApplet{
	
	public static void main(String[] args) {
		Sound music = new Sound();
		String filepath = ("data\\\\music.wav");
		music.playMusic(filepath);
		
		PApplet.main("Main");
		
	}
	
	int x = 500;
	

	public void settings() {
		size(1000,700);
		
		
		 
		 
	}
	
	MainScreen s1;
	boolean prueba;
	int prueba1;
	
	
	
	public void setup() {
		imageMode(CENTER);
		s1 = new MainScreen(this);
		s1.loadScreenImage(this,"pantallaP.png");
		frameRate(12);
		
		
		
		
		  
	}
	

public void draw() {
	
	s1.PaintMainScreen(this);
	
		
	
	  
     
     

     
    
	}

@Override
public void mousePressed() {
	prueba = s1.button(500,350, 300, 300,mouseX,mouseY);
	System.out.println(prueba);
}



}