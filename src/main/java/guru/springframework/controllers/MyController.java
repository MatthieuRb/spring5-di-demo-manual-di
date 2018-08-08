package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

/**
 * Created by jt on 5/23/17.
 */
@Controller
public class MyController{
	
	private GreetingService greetingService;
	
	@Autowired
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

    public void hello(){
        System.out.println(this.greetingService.sayGreeting());
    }
}
