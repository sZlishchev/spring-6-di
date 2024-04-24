package guru.springframework.spring6di.services.impl;

import guru.springframework.spring6di.services.GreetingsService;
import org.springframework.stereotype.Service;

@Service("simpleName")
public class GreetingsSetterServiceImpl implements GreetingsService {
    @Override
    public String sayHello() {
        return "Hello from the Setter Injected Service!!!";
    }
}
