import processing.core.PApplet;
import processing.core.PImage;

public class Player {

	private int pX;
	private int pY;
	private int pSize;
	private boolean dR;
	private boolean move;
	private int timeAnimation=0;
	PImage ndn;
	PImage nd1;
	PImage nd2;
	PImage nd3;
	PImage nd4;
	PImage nd5;
	PImage nd6;
	PImage nin;
	PImage ni1;
	PImage ni2;
	PImage ni3;
	PImage ni4;
	PImage ni5;
	PImage ni6;
	
	public Player(int startPocitionX,int startPocitionY, PApplet app ){
		pX = startPocitionX;
		pY = startPocitionY;
		pSize = 100;
		move = false;
		dR = true;
		ndn = app.loadImage("ndn.png");
		nd1 = app.loadImage("nd1.png");
		nd2 = app.loadImage("nd2.png");
		nd3 = app.loadImage("nd3.png");
		nd4 = app.loadImage("nd4.png");
		nd5 = app.loadImage("nd5.png");
		nd6 = app.loadImage("nd6.png");
		nin = app.loadImage("nin.png");
		ni1 = app.loadImage("ni1.png");
		ni2 = app.loadImage("ni2.png");
		ni3 = app.loadImage("ni3.png");
		ni4 = app.loadImage("ni4.png");
		ni5 = app.loadImage("ni5.png");
		ni6 = app.loadImage("ni6.png");
	}
	
	
	
	public void paintPlayer(PApplet app) {
		
		if (app.frameCount%2==0) {
			timeAnimation++;
			
		}
		if(move == true) {
		if(dR==true) {
			if(timeAnimation==1) {
				app.image(nd1, pX, pY);}
			if(timeAnimation==2) {
				app.image(nd2, pX, pY);}
			if(timeAnimation==3) {
				app.image(nd3, pX, pY);}
			if(timeAnimation==4) {
				app.image(nd4, pX, pY);}
			if(timeAnimation==5) {
				app.image(nd5, pX, pY);}
			if(timeAnimation>=6 && timeAnimation<8) {
				app.image(nd6, pX, pY);}
			if(timeAnimation==8) {
				app.image(nd5, pX, pY);}
			if(timeAnimation==9) {
				app.image(nd4, pX, pY);}
			if(timeAnimation==10) {
				app.image(nd3, pX, pY);}
			if(timeAnimation>10) {
				app.image(nd2, pX, pY);}
			if(timeAnimation==12) {
				timeAnimation=1;}}
			
			if(dR==false) {
				if(timeAnimation==1) {
					app.image(ni1, pX, pY);}
				if(timeAnimation==2) {
					app.image(ni2, pX, pY);}
				if(timeAnimation==3) {
					app.image(ni3, pX, pY);}
				if(timeAnimation==4) {
					app.image(ni4, pX, pY);}
				if(timeAnimation==5) {
					app.image(ni5, pX, pY);}
				if(timeAnimation>=6 && timeAnimation<8) {
					app.image(ni6, pX, pY);}
				if(timeAnimation==8) {
					app.image(ni5, pX, pY);}
				if(timeAnimation==9) {
					app.image(ni4, pX, pY);}
				if(timeAnimation==10) {
					app.image(ni3, pX, pY);}
				if(timeAnimation>10) {
					app.image(ni2, pX, pY);}
				if(timeAnimation==12) {
					timeAnimation=1;}}}
		
		if(move == false) {
			if(dR==true) {
				app.image(ndn, pX, pY);}
			
			if(dR==false) {
				app.image(nin, pX, pY);}
			
		}
			
		
	}
	
	public int getpSize() {
		return pSize;
	}
	
	public int getpX() {
		return pX;
	}
	public int getpY() {
		return pY;
	}
	
	public void setdR(boolean dR) {
		this.dR = dR;
	}
	
	public void setpX(int pX) {
		this.pX = pX;
	}
	
	public void setpY(int pY) {
		this.pY = pY;
	}
	
	public void setMove(boolean move) {
		this.move = move;
	}
}
