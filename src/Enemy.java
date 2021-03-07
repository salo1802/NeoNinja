import processing.core.PApplet;
import processing.core.PImage;

public class Enemy {
	
	private int eX;
	private int eY;
	private int eWidth;
	private int eHeight;
	private boolean dR;
	PImage zi1;
	PImage zi2;
	PImage zi3;
	PImage zd1;
	PImage zd2;
	PImage zd3;
	
	public Enemy(int startPocitionX,int startPocitionY, PApplet app ){
		eX = startPocitionX;
		eY = startPocitionY;
		dR = true;
		eWidth = 132;
		eHeight = 144;
		
		zi1 = app.loadImage("zi1.png");
		zi2 = app.loadImage("zi2.png");
		zi3 = app.loadImage("zi3.png");
		zd1 = app.loadImage("zd1.png");
		zd2 = app.loadImage("zd2.png");
		zd3 = app.loadImage("zd3.png");
	}
	
	
	
	
	public void paintEnemy(PApplet app){
		if (dR==false) {
		if (app.frameCount>=0 && app.
				frameCount < 5) {
			app.image(zi1,eX,eY);
		}
		
		if (app.frameCount>=5 && app.frameCount < 9) {
			app.image(zi2,eX,eY);
		}
		
		if (app.frameCount>= 9) {
			app.image(zi1,eX,eY);
		}}
		
		if (dR==true) {
			if (app.frameCount>=0 && app.
					frameCount < 5) {
				app.image(zd1,eX,eY);
			}
			
			if (app.frameCount>=5 && app.frameCount < 9) {
				app.image(zd2,eX,eY);
			}
			
			if (app.frameCount>= 9) {
				app.image(zd1,eX,eY);
			}}
		
		if(app.frameCount==12) {
			app.frameCount = 0;
		}
	}
	
	public int geteX() {
		return eX;
	}
	
	public int geteY() {
		return eY;
	}
	
	public int geteHeight() {
		return eHeight;
	}
	
	public int geteWidth() {
		return eWidth;
	}
	
	public void setdR(boolean dR) {
		this.dR = dR;
	}
	
	public void seteX(int eX) {
		this.eX = eX;
	}
	
	public void seteY(int eY) {
		this.eY = eY;
	}

}
