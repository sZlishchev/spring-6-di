package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConstructorInjectedControllerTest {

    @Autowired
    private ConstructorInjectedController controller;

    @Test
    void sayHello() {
        System.out.println(this.controller.sayHello());
    }
}