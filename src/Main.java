	


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
	int score;
	int start = 0;
	private boolean gameOver;
	 
	
	
	
	

	public void settings() {
		size(1000,700);
		
		
		 
		 
	}
	
	
	
	public void setup() {
		screen = 0;
		imageMode(CENTER);
		fill(157,241,255);
		textAlign(CENTER, CENTER);
		s0 = new MainScreen(this);
		s0.loadScreenImage(this,"pantallaP.png");
		s1 = new H2PScreen();
		s1.loadScreenImage(this,"how2play.jpg");
		s2 = new PlayScreen(this);
		s2.loadScreenImage(this,"escenario.jpg");
		s3 = new SumScreen(this);
		s3.loadScreenImage(this,"RS.jpg");
		
		frameRate(12);
		
		
		
		  
	}
	

public void draw() {
	if(screen==2) {
	s2.startGameplay(start);
	s2.gameplay(this);
	gameOver = s2.crash();
	screen = s2.gameOver(gameOver);}
	
	
	

	switch(screen) {
	case 0:
	s0.PaintMainScreen(this);
	break;
	case 1:
	s1.PaintScreen(this);
	break;
	case 2:
	s2.PaintPlayScreen(this);
	break;
	case 3:
	s3.PaintSumScreen(this,s2.getScore(),s2.getTimePassed());
	break;	}
	
	
	score = s2.totalScore();
    
	}

@Override
public void mousePressed() {
	if(screen==2) {
	s2.eraseEnemy(mouseX, mouseY);}
	
	switch (screen){
	case 0:
	screen = s0.mainScreenButtons(mouseX,mouseY);
	break;
	case 1:
	screen = s1.H2PScreenButton(mouseX,mouseY);
	break;
	case 3: 
	screen = s3.SumScreenButton(mouseX,mouseY);
	if(mouseX  > 375 && mouseX  < 625 && mouseY > 550 && mouseY < 650)
	s2.reset(this, gameOver);
		break;}
	if (screen==1||screen==3||screen==0) {
		
		switch (screen){
		case 0:
		start = s0.mainScreenButtons(mouseX,mouseY);
		break;
		case 1:
		start = s1.H2PScreenButton(mouseX,mouseY);
		break;
		case 3: 
		start = s3.SumScreenButton(mouseX,mouseY);
			break;}
	}
	
	
	
}

@Override
public void keyPressed() {
	if(key=='d') {
		s2.setNinjaD(1);}
	if(key=='a') {
		s2.setNinjaD(2);}
	if(key=='w') {
		s2.setNinjaD(3);}
	if(key=='s') {
		s2.setNinjaD(4);}
	
}

}