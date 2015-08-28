package Week2;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Scanner;

public class DateActivity {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("02/17/1990", "first love. 78 degree, raining");
		map.put("08/08/2008", "Olympic games. 80 degree, shinny");
		map.put("01/01/2002", "first snow. 79 degree, raining");
		map.put("05/22/2011", "omg. 80 degree, shinny");
		map.put("09/11/2001", "911. 81 degree, shinny");
		//Date date;
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date date;
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the date that you are asking about?    :");
		String str = "";
		while((str = sc.nextLine()).length() > 0){
			String newDate = "";
			try{
				date = sdf.parse(str);
				newDate = sdf.format(date);
			}catch(ParseException e){
				;
			}
			//System.out.println(newDate);
			if(map.containsKey(newDate)){
				System.out.println(map.get(newDate));
			}else{
				System.out.println("It's a shinny day. But I can't remember anything else.");
			}
			System.out.println("What is the date that you are asking about?    :");
			//str = sc.next();
		}
		System.out.println("I shake it off, shake it off...");
	}

}