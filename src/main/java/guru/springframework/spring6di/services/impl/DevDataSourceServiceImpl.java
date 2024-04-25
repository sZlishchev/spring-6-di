package guru.springframework.spring6di.services.impl;

import guru.springframework.spring6di.services.DataSourceService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV", "default"})
@Service("dataSourceService")
public class DevDataSourceServiceImpl implements DataSourceService {
    @Override
    public String getDataSource() {
        return "Dev Data Source";
    }
}
