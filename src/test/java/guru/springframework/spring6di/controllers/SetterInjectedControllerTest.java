package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.impl.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SetterInjectedControllerTest {

    @Autowired
    private SetterInjectedController setterInjectedController;

    @Test
    void sayHello() {
        this.setterInjectedController.sayHello();
    }
}