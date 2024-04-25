package guru.springframework.spring6di.services.impl.i18n;

import guru.springframework.spring6di.services.GreetingsService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18NSpanishGreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayHello() {
        return "Hola Mundo - ES";
    }
}
