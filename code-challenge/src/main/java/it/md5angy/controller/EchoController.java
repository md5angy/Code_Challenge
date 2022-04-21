package it.md5angy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.md5angy.model.Echo_Service;



@RestController
@RequestMapping(path = "/", produces = "application/json")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EchoController {
	
	@Autowired
	Echo_Service echo_ser;
	
    @PutMapping(path="/{txt}")	
    public String create(@PathVariable(value = "txt") String input) throws Exception {
		return echo_ser.create(input);
    }
    
	
}
