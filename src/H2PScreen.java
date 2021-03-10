

public class H2PScreen extends Screen {
	
	private boolean playPressed;
	
	H2PScreen (){
		super();
		
	}
	
	public int H2PScreenButton(int mouseX, int mouseY){
		playPressed = button(500,600, 400,100, mouseX, mouseY);
		
		if (playPressed==true) {return 2;}
		
		else  return 1;
	}
}
