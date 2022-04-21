package it.md5angy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import it.md5angy.controller.EchoController;
import it.md5angy.model.Echo_Service;

@SpringBootTest
public class EchoServiceTest {


	@Test
	void date_extractor() throws Exception {
		Echo_Service echo_serv = new Echo_Service();
		long response = echo_serv.date_extractor("[2020-11-27 19:15:50] Time to move");
		assertEquals(1606500950,response);
	}
	
	@Test
	void message_extractor() {
		Echo_Service echo_serv = new Echo_Service();
		String response = echo_serv.message_extractor("[2020-11-27 19:15:50] Time to move");
		assertEquals("Time to move",response);
	}
	
	
	@Test
	void fail_date_extractor() throws Exception {
		Echo_Service echo_serv = new Echo_Service();
		long response = echo_serv.date_extractor("[2020-11-27 19:15:50 Time to move");
		assertEquals(1606500950,response);
	}
	
	@Test
	void fail_message_extractor() {
		Echo_Service echo_serv = new Echo_Service();
		String response = echo_serv.message_extractor("[2020-11-27 19:15:50 Time to move");
		assertEquals("",response);
	}
	
	
	
}
