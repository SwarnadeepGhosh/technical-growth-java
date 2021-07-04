package javaPrep;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Telegram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String urlString = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s";

		String apiToken = "1811972683:AAH8RHie2JXsHsiJMhShhkQaHEr0C-gEvsA"; // API token for @misData Bot
		String chatId = "-1001330900461"; // chat id of Testing Swarna Group / Channel
		String text = "Testing+Data+%0A"
				+ "Agent+Login+110+monthly+%0A"
				+ "Agent+Registration+23+daily+%0A"
				+ "Ekyc+Success+35+weekly+%0A"
				+ "Otp+Generation+123+daily";

		urlString = String.format(urlString, apiToken, chatId, text);

		try {
			URL url = new URL(urlString);
			URLConnection conn = url.openConnection();

			StringBuilder sb = new StringBuilder();
			InputStream is = new BufferedInputStream(conn.getInputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String inputLine = "";
			while ((inputLine = br.readLine()) != null) {
				sb.append(inputLine);
			}
			String response = sb.toString();
			System.out.println(response);
			// Do what you want with response

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
