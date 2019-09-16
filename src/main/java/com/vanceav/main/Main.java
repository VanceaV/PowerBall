package com.vanceav.main;

import java.net.MalformedURLException;
import java.util.Arrays;

import com.vanceav.number.Poolnumber;
import com.vanceav.number.PowerBall;
import com.vanceav.url.GetResults;

public class Main {

	Poolnumber[] createPollNumbers() {
		Poolnumber[] poolNumbers = new Poolnumber[70];

		for (int i = 1; i < 70; i++) {
			Poolnumber poolnumber = new Poolnumber(i);
			poolNumbers[i] = poolnumber;
		}
		return poolNumbers;
	}

	PowerBall[] createPowerballNumbers() {
		PowerBall[] poolNumbers = new PowerBall[27];

		for (int i = 1; i < 27; i++) {
			PowerBall powerBall = new PowerBall(i);
			poolNumbers[i] = powerBall;
		}
		return poolNumbers;
	}

	public void start() {
		Poolnumber[] poolNumbers = createPollNumbers();
		PowerBall[] powerBalls = createPowerballNumbers();
		try {
			new GetResults().readData(poolNumbers, powerBalls);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Arrays.sort(poolNumbers, 1, 70);
		
		System.out.println("                                                  [1 ]-[2 ]-[3 ]-[4 ]-[5 ]-[6 ]-[7 ]-[8 ]-[9 ]-[10]-[11]-[12]-[13]-[14]-[15]-[16]-[17]-[18]-[19]-[20]-[21]-[22]-[23]-[24]-[25]-[26]-[27]-[28]-[29]-[30]-[31]-[32]-[33]-[34]-[35]-[36]-[37]-[38]-[39]-[40]-[41]-[42]-[43]-[44]-[45]-[46]-[47]-[48]-[49]-[50]-[51]-[52]-[53]-[54]-[55]-[56]-[57]-[58]-[59]-[60]-[61]-[62]-[63]-[64]-[65]-[66]-[67]-[68]-[69]");

		for (int i = 1; i < 70; i++) {
			System.out.println(poolNumbers[i] + "  " + poolNumbers[i]._toString());
		}

	}

}
