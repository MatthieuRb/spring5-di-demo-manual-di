package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class PrimaryEnglishGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Hi I'm a good english guy !";
	}

}
