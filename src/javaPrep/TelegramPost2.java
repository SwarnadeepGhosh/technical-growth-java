package javaPrep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class TelegramPost2 {
	
	public static void main (String []args) throws IOException{
		String urlString = "https://api.telegram.org/bot%s/sendMessage";
		String apiToken = "1811972683:AAH8RHie2JXsHsiJMhShhkQaHEr0C-gEvsA"; // API token for @misData Bot
		urlString = String.format(urlString, apiToken);
		if(urlString.contains(" "))
		    urlString = urlString.replace(" ", "%20");

		//Change the URL with any other publicly accessible POST resource, which accepts JSON request body
		URL url = new URL (urlString);
		
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.setRequestMethod("POST");
		
		con.setRequestProperty("Content-Type", "application/json; utf-8");
		con.setRequestProperty("Accept", "application/json");
		
		con.setDoOutput(true);
		
		
		//JSON String need to be constructed for the specific resource. 
		//We may construct complex JSON using any third-party JSON libraries such as jackson or org.json
		String jsonInputString = "{\"chat_id\": \"-1001330900461\", \"text\": \"Post+Request \\n from Java\"}";
		
		try(OutputStream os = con.getOutputStream()){
			byte[] input = jsonInputString.getBytes("utf-8");
			os.write(input, 0, input.length);			
		}
		/*
		byte[] out = "{\"chatId\":\"-1001330900461\",\"text\":\"Post\"}" .getBytes(StandardCharsets.UTF_8);
		int length = out.length;

		con.setFixedLengthStreamingMode(length);
		con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
		con.connect();
		try(OutputStream os = con.getOutputStream()) {
		    os.write(out);
		}*/

		int code = con.getResponseCode();
		System.out.println(code);
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))){
			StringBuilder response = new StringBuilder();
			String responseLine = null;
			while ((responseLine = br.readLine()) != null) {
				response.append(responseLine.trim());
			}
			System.out.println(response.toString());
		}
	}

}