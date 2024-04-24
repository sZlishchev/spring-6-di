package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingsService;

public class PropertyInjectedController {
    
     GreetingsService greetingsService;
    
    public String sayHello() {
        return this.greetingsService.sayHello();
    }
}
