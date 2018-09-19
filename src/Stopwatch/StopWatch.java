package Stopwatch;

public class StopWatch {
	
	private long startTime;
	private long endTime;
	
	public StopWatch(){
		startTime = System.currentTimeMillis();
	}

	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}
	
	public void start(){
		this.startTime = System.currentTimeMillis();
	}
	
	public void stop(){
		this.endTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime(){
		return this.endTime - this.getStartTime();
	}
}