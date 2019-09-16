package com.vanceav.number;

public class Poolnumber implements Comparable<Poolnumber> {

	private int poolNumber;

	private int frequency;

	private int lastTime;

	private int[] numbers;

	private boolean flag;

	public Poolnumber(int poolNumber) {
		this.poolNumber = poolNumber;
		numbers = new int[70];
		flag = false;
		frequency = 0;
	}

	public void increment() {
		frequency++;
	}

	public int getPoolNumber() {
		return poolNumber;
	}

	public void setPoolNumber(int poolNumber) {
		this.poolNumber = poolNumber;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public int getLastTime() {
		return lastTime;
	}

	public void setLastTime(int lastTime) {
		this.lastTime = lastTime;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {

		String poolN = "";
		if (poolNumber <= 9) {
			poolN += poolNumber + " ";
		} else {
			poolN += poolNumber;
		}

		String freq = "";
		if (frequency <= 9) {
			freq += frequency + " ";
		} else {
			freq += frequency;
		}

		String lt = "";
		if (lastTime <= 9) {
			lt += lastTime + " ";
		} else {
			lt += lastTime;
		}

		return "[" + poolN + "] Frequency [" + freq + "] LastTime [" + lt + "]";
	}

	public String _toString() {
		String st = "";

		st = "Combinations - ";
		for (int i=1;i<70;i++) {
			
			if(numbers[i]<=9)
				st += "[" + numbers[i] + " ]-";
			else {
				st += "[" + numbers[i] + "]-";
			}
		}
		return st;
	}

	@Override
	public int compareTo(Poolnumber o) {
		if (frequency == o.frequency)
			return 0;
		else if (frequency > o.frequency)
			return 1;
		else
			return -1;

	}
}
