package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    
    @Autowired
     GreetingsService greetingsService;
    
    public String sayHello() {
        return this.greetingsService.sayHello();
    }
}
