package guru.springframework.spring6di.services.impl;

import guru.springframework.spring6di.services.DataSourceService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service("dataSourceService")
public class QADataSourceServiceImpl implements DataSourceService {
    @Override
    public String getDataSource() {
        return "QA Data Source";
    }
}
