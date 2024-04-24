package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingsService;

public class SetterInjectedController {
    
    private GreetingsService greetingsService;
    
    public String sayHello() {
        return this.greetingsService.sayHello();
    }

    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
}
