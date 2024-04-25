package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyI18NController {
    
    private final GreetingsService greetingsService;

    public MyI18NController(@Qualifier("i18nService") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
    
    public String sayHello() {
        return this.greetingsService.sayHello();
    }
}
