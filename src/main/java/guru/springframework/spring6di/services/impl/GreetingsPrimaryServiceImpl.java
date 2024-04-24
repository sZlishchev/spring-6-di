package guru.springframework.spring6di.services.impl;

import guru.springframework.spring6di.services.GreetingsService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingsPrimaryServiceImpl implements GreetingsService {
    @Override
    public String sayHello() {
        return "Hello from the Primary Service!!!";
    }
}
