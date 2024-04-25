package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.DataSourceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {
    
    private final DataSourceService dataSourceService;

    public DataSourceController(@Qualifier("dataSourceService") DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }
    
    public String getDataSource() {
        return this.dataSourceService.getDataSource();
    }
}
