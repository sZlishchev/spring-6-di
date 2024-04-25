package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("QA")
@SpringBootTest
class QADataSourceControllerTest {

    @Autowired
    private DataSourceController dataSourceController;
    @Test
    void getDataSource() {
        System.out.println(this.dataSourceController.getDataSource());
    }
}