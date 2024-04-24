package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.impl.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingsServiceImpl());
    }

    @Test
    void sayHello() {
        this.controller.sayHello();
    }
}