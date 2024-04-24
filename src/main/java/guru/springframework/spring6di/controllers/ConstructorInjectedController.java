package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    
    private final GreetingsService greetingsService;

    public ConstructorInjectedController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
    
    public String sayHello() {
        return this.greetingsService.sayHello();
    }
}
