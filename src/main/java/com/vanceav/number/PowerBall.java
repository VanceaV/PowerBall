package com.vanceav.number;

public class PowerBall {

	private int powerBall;
	
	private int frequency;
	
	private boolean flag;

	public PowerBall(int powerBall) {
		this.powerBall = powerBall;
		
		flag = false;
		frequency = 0;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public int getPowerBall() {
		return powerBall;
	}
	
	public void increment() {
		frequency++;
	}

	public void setPowerBall(int powerBall) {
		this.powerBall = powerBall;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	

}
