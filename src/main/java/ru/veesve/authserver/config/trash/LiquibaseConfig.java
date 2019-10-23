package ru.veesve.authserver.config.trash;


import liquibase.integration.spring.SpringLiquibase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
@RequiredArgsConstructor
public class LiquibaseConfig {

    private final Environment env;


    @ConditionalOnProperty(name = "liquibaseToken.run", havingValue = "true")
    @Bean
    @Autowired
    public SpringLiquibase secondaryLiquibase(@Qualifier(value = "dataSourceToken") DataSource dataSourceToken) {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog(env.getProperty("liquibaseToken.change-log", String.class));
        liquibase.setDataSource(dataSourceToken);
        liquibase.setShouldRun(true);
        return liquibase;
    }
}

