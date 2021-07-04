package javaPrep;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class TelegramPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String urlString = "https://api.telegram.org/bot%s/sendMessage";
		String apiToken = "1811972683:AAH8RHie2JXsHsiJMhShhkQaHEr0C-gEvsA"; // API token for @misData Bot
		urlString = String.format(urlString, apiToken);

		try {
			URL url = new URL(urlString);
			URLConnection con = url.openConnection();
			HttpURLConnection http = (HttpURLConnection)con;
			http.setRequestMethod("POST"); // PUT is another valid option
			http.setDoOutput(true);
			
			byte[] out = "{\"chat_id\":\"-1001330900461\",\"text\":\"Demo Data \\n Parameter 1: 1234 \\n Parameter 2: 5678  \"}" 
					.getBytes(StandardCharsets.UTF_8);
			int length = out.length;

			http.setFixedLengthStreamingMode(length);
			http.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			http.connect();
			try(OutputStream os = http.getOutputStream()) {
			    os.write(out);
			}
			// Do something with http.getInputStream()

			StringBuilder sb = new StringBuilder();
			InputStream is = new BufferedInputStream(http.getInputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String inputLine = "";
			while ((inputLine = br.readLine()) != null) {
				sb.append(inputLine);
			}
			String response = sb.toString();
			int code = http.getResponseCode();
			System.out.println(code);
			System.out.println(response);
			// Do what you want with response

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
