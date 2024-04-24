package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingsService;

public class ConstructorInjectedController {
    
    private final GreetingsService greetingsService;

    public ConstructorInjectedController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
    
    public String sayHello() {
        return this.greetingsService.sayHello();
    }
}
