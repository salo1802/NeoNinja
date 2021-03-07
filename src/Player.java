import processing.core.PApplet;
import processing.core.PImage;

public class Player {

	private int pX;
	private int pY;
	private boolean dR;
	public Player(int startPocitionX,int startPocitionY ){
		pX = startPocitionX;
		pY = startPocitionY;
		dR = true;
	}
	
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
	
	public void loadPlayerImages(PApplet app) {
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
		if(dR==true) {
			if(app.frameCount==1) {
				app.image(nd1, pX, pY);}
			if(app.frameCount==2) {
				app.image(nd2, pX, pY);}
			if(app.frameCount==3) {
				app.image(nd3, pX, pY);}
			if(app.frameCount==4) {
				app.image(nd4, pX, pY);}
			if(app.frameCount==5) {
				app.image(nd5, pX, pY);}
			if(app.frameCount>=6 && app.frameCount<8) {
				app.image(nd6, pX, pY);}
			if(app.frameCount==8) {
				app.image(nd5, pX, pY);}
			if(app.frameCount==9) {
				app.image(nd4, pX, pY);}
			if(app.frameCount==10) {
				app.image(nd3, pX, pY);}
			if(app.frameCount>10) {
				app.image(nd2, pX, pY);}
			if(app.frameCount==12) {
				app.frameCount=1;}}
			
			if(dR==false) {
				if(app.frameCount==1) {
					app.image(ni1, pX, pY);}
				if(app.frameCount==2) {
					app.image(ni2, pX, pY);}
				if(app.frameCount==3) {
					app.image(ni3, pX, pY);}
				if(app.frameCount==4) {
					app.image(ni4, pX, pY);}
				if(app.frameCount==5) {
					app.image(ni5, pX, pY);}
				if(app.frameCount>=6 && app.frameCount<8) {
					app.image(ni6, pX, pY);}
				if(app.frameCount==8) {
					app.image(ni5, pX, pY);}
				if(app.frameCount==9) {
					app.image(ni4, pX, pY);}
				if(app.frameCount==10) {
					app.image(ni3, pX, pY);}
				if(app.frameCount>10) {
					app.image(ni2, pX, pY);}
				if(app.frameCount==12) {
					app.frameCount=1;}}
			
		
	}
	
	
}