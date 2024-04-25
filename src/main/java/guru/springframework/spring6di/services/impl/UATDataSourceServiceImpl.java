package guru.springframework.spring6di.services.impl;

import guru.springframework.spring6di.services.DataSourceService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service("dataSourceService")
public class UATDataSourceServiceImpl implements DataSourceService {
    @Override
    public String getDataSource() {
        return "UAT Data Source";
    }
}
