package guru.springframework.spring6di.services.impl;

import guru.springframework.spring6di.services.GreetingsService;
import org.springframework.stereotype.Service;

@Service
public class GreetingsConstructorServiceImpl implements GreetingsService {
    @Override
    public String sayHello() {
        return "Hello from the Constructor Injected Service!!";
    }
}
