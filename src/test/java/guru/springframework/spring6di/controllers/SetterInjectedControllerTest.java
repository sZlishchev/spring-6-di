package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.impl.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;
    
    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingsService(new GreetingsServiceImpl());
    }

    @Test
    void sayHello() {
        this.setterInjectedController.sayHello();
    }
}