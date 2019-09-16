package com.vanceav.url;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import com.vanceav.number.Poolnumber;
import com.vanceav.number.PowerBall;

public class GetResults {

	public void readData(Poolnumber[] poolNumbers, PowerBall[] powerBalls) throws MalformedURLException {

		URL web = new URL("https://ialottery.com/Pages/ResultsTxt/power.txt");

		try (BufferedReader in = new BufferedReader(new InputStreamReader(web.openStream()));) {

			String st;
			int i = -1;
			int k = 1;
			while ((st = in.readLine()) != null) {
				if (i < 0) {
					i++;
					continue;
				}
				String[] array = st.split("	");

				if (array[0].equals("10-03-2015"))
					break;
				int a[] = new int[6];

				for (int j = 0; j < 6; j++)
					a[j] = Integer.parseInt(array[j + 1]);

				for (int s = 0; s < 5; s++) {
					if (!poolNumbers[a[s]].isFlag()) {
						poolNumbers[a[s]].setFlag(true);
						poolNumbers[a[s]].setLastTime(i);
					}

					poolNumbers[a[s]].increment();

					for (int ss = 0; ss < 5; ss++) {
						if (s != ss) {
							poolNumbers[a[s]].getNumbers()[a[ss]]++;
						}
					}
				}
				
				if (!powerBalls[a[5]].isFlag()) {
					poolNumbers[a[5]].setFlag(true);
					poolNumbers[a[5]].setLastTime(i);
				}
				
				
				
				
				
				k++;
				if(k==70) {
					break;
				}
				i++;
			}

		} catch (IOException e) {
			System.out.println("I/O Error: " + e.getMessage());
		}
	}

}
