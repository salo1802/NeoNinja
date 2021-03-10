import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PFont;

public class PlayScreen extends Screen {

	private int timePassed;
	private int score;
	private int killScore;
	private float difficulty;
	ArrayList <Enemy> enemies;
	Enemy selector;
	Player ninja;
	private int ninjaD;
	PFont myFont;
	private int coolDown;
	private boolean rSide;
	
	PlayScreen (PApplet app){
		super();
		myFont = app.loadFont("MaturaMTScriptCapitals-48.vlw");
		app.textFont(myFont);
		difficulty = 1;
		ninjaD = 0;
		ninja = new Player(500,350,app);
		enemies = new ArrayList<Enemy>();
		ninja.setdR(true);
		rSide = true;
		
		}
	
	public void PaintPlayScreen(PApplet app){
		PaintScreen(app);
		ninja.paintPlayer(app);
		for (int i = 0; i < enemies.size(); i++) {
			Enemy actual = enemies.get(i);
			actual.movement(ninja.getpX(),ninja.getpY());
			actual.paintEnemy(app);
			app.textSize(80);
			app.text("" + coolDown, 500, 650);

		}
	}
	
	
	public void startGameplay(int start){
		if(start==2) {
		timePassed = 0;}
		
	}
	public void reset( PApplet app,boolean gameOver) {
			if(gameOver==true) {
		timePassed = 0;	 
		difficulty = 1;
		ninjaD = 0;
		killScore = 0;
		ninja = new Player(500,350,app);
		enemies = new ArrayList<Enemy>();
		ninja.setdR(true);
		rSide = true;
		coolDown = 0;
		gameOver = false;}}
	
		public void gameplay(PApplet app) {
			
			

			//dificultad
			if(app.frameCount==12) {
				
				difficulty+= 0.3;
				timePassed++;
				if(coolDown > 0) {
					coolDown-=1;
				}
				
			}
			for (int i = 0; i < enemies.size(); i++) {
				Enemy actual = enemies.get(i);
				actual.setSpeed(difficulty);}
			
			//creacion de zombies
			
		if(app.frameCount == 12) {	
			if(rSide==true) {
				Enemy newEnemy = new Enemy(1100,(int)(Math.random()*(800-0)),app);
				enemies.add(newEnemy);}
			if(rSide==false) {
				Enemy newEnemy = new Enemy(-100,(int)(Math.random()*(800-0)),app);
				enemies.add(newEnemy);}
				rSide = !rSide;
		}
			
			
			
			
			//ninja movement
			
			
			switch (ninjaD){
			case 0:
				ninja.setMove(false);
				break;
			case 1:
				ninja.setdR(true);
				ninja.setMove(true);
				ninja.setpX(ninja.getpX()+10);
				break;
			case 2:
				ninja.setdR(false);
				ninja.setMove(true);
				ninja.setpX(ninja.getpX()-10);;
			case 3:
				ninja.setMove(true);
				ninja.setpY(ninja.getpY()-10);
				break;
			case 4:
				ninja.setMove(true);
				ninja.setpY(ninja.getpY()+10);
				break;}
				
				}
		
		public void eraseEnemy(int mouseX,int mouseY) {
			if(coolDown==0) {
				
		
				for (int i = 0; i < enemies.size(); i++) {
					Enemy actual = enemies.get(i);
					if(mouseX>actual.geteX() - actual.geteWidth()/2 &&
					mouseX<actual.geteX()+actual.geteWidth()/2
							&& mouseY > actual.geteY()-actual.geteHeight()/2
							&& mouseY < actual.geteY()+ actual.geteHeight()/2) {
					enemies.remove(actual);
					killScore +=100; coolDown = 2;}
				}}
			}
		public boolean crash() {
		boolean gameOver = false;
			for (int i = 0; i < enemies.size(); i++) {
				Enemy actual = enemies.get(i);
				if(ninja.getpX()>actual.geteX() - actual.geteWidth()/2 &&
				ninja.getpX()<actual.geteX()+actual.geteWidth()/2
						&& ninja.getpY() > actual.geteY()-actual.geteHeight()/2
						&& ninja.getpY() < actual.geteY()+ actual.geteHeight()/2) {
					gameOver = true;
					}}
			return gameOver;
			
		}
		
		
		public int gameOver (boolean gameOver) {
			if (gameOver==true) {
				
					enemies.removeAll(enemies);
					ninja = null;
					return 3;}
					else return 2;}
		
		
		
		public int totalScore() {
			score = killScore + timePassed*100;
			return score;
			
		}
		
		public int getTimePassed() {
			return timePassed;
		}
		
		public int getScore() {
			return score;
		}
		
		public void setNinjaD(int ninjaD) {
			this.ninjaD = ninjaD;
		}
				
	
		
		
}
