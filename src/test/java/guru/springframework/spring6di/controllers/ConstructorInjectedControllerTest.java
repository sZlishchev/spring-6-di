package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.impl.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConstructorInjectedControllerTest {

    @Autowired
    private ConstructorInjectedController controller;

    @Test
    void sayHello() {
        this.controller.sayHello();
    }
}