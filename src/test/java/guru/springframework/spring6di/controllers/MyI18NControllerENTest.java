package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("EN")
@SpringBootTest
class MyI18NControllerENTest {
    
    @Autowired
    private MyI18NController myI18NController;

    @Test
    void sayHello() {
        System.out.println(this.myI18NController.sayHello());
    }
}