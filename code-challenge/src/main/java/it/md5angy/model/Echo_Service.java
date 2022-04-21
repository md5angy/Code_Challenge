package it.md5angy.model;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Service;

@Service
public class Echo_Service {

	 public String create(String input) throws Exception {
			Echo_Request ech_req = new Echo_Request();
			ech_req.setMessage(message_extractor(input));
			ech_req.setTimestamp(date_extractor(input));
			return ech_req.toString();
	    }
		
		
		
		public String message_extractor(String s) {
			String[] tmp;
			String ret ="";
			if(s.indexOf("]") > 0) {
				tmp = s.split("]");	
				if(tmp.length > 0) ret = tmp[1].trim();
				}
			return ret;
		}
		
		public long date_extractor(String s) throws Exception {
			String[] tmp;
			String str_data ="";
			long epoch = 0;
			tmp = s.split("]");	
			if(tmp.length > 0) {
				str_data = tmp[0].trim();
				str_data = str_data.replace("[","");
				epoch = datetoepoch(str_data);
			}
			return epoch;
		}
		
		
		
		
		public long datetoepoch(String s) throws java.text.ParseException {
	        SimpleDateFormat dateParser = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        {
	                java.util.Date date = dateParser.parse(s);
	                System.out.println(date);
	                long formattedDate = date.getTime() / 1000;
	                return formattedDate;
	        }
		}
}
