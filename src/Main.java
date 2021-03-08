	


import processing.core.PApplet;




public class Main extends PApplet{
	
	public static void main(String[] args) {
		Sound music = new Sound();
		String filepath = ("data\\\\music.wav");
		music.playMusic(filepath);
		
		PApplet.main("Main");
	}
	
	int x = 500;
	MainScreen s0;
	H2PScreen s1;
	PlayScreen s2;
	SumScreen s3;
	int screen;

	
	
	
	

	public void settings() {
		size(1000,700);
		
		
		 
		 
	}
	
	
	
	public void setup() {
		screen = 3;
		imageMode(CENTER);
		fill(157,241,255);
		textAlign(CENTER, CENTER);
		s0 = new MainScreen(this);
		s0.loadScreenImage(this,"pantallaP.png");
		s1 = new H2PScreen();
		s1.loadScreenImage(this,"how2play.jpg");
		s2 = new PlayScreen();
		s2.loadScreenImage(this,"escenario.jpg");
		s3 = new SumScreen(this);
		s3.loadScreenImage(this,"RS.jpg");
		
		frameRate(12);
		
		  
		  
		
		  
	}
	

public void draw() {

	switch(screen) {
	case 0:
	s0.PaintMainScreen(this);
	break;
	case 1:
	s1.PaintScreen(this);
	break;
	case 2:
	s2.PaintScreen(this);
	break;
	case 3:
	s3.PaintSumScreen(this,100,2);
	break;	}
	
    
	}

@Override
public void mousePressed() {
	switch (screen){
	case 0:
	screen = s0.mainScreenButtons(mouseX,mouseY);
	break;
	case 1:
	screen = s1.H2PScreenButton(mouseX,mouseY);
	break;
	case 3: 
	screen = s3.SumScreenButton(mouseX,mouseY);
		break;}
	System.out.println(screen);
}



}