package guru.springframework.spring6di.services.impl;

import guru.springframework.spring6di.services.DataSourceService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service("dataSourceService")
public class ProdDataSourceServiceImpl implements DataSourceService {
    @Override
    public String getDataSource() {
        return "Prod Date Source";
    }
}
