import java.util.Timer;
import java.util.TimerTask;

public class Time {
	
	public Time () {}
	
	
	int secondsPassed = 0;

	Timer timer = new Timer ();
	TimerTask task = new TimerTask() {
		public void run() {
			secondsPassed++;
		}
	};
	
	public void start() {
		timer.scheduleAtFixedRate(task,0,1000);
	}
	
	public int getSecondsPassed() {
		return secondsPassed;
	}
}
