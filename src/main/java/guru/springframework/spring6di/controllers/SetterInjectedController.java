package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    
    private GreetingsService greetingsService;
    
    public String sayHello() {
        return this.greetingsService.sayHello();
    }

    @Qualifier("simpleName")
    @Autowired
    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
}
