package ru.veesve.authserver.config.trash;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppConfig {

    @Bean
    @ConfigurationProperties("db.token.datasource")
    public ComboPooledDataSource dataSourceToken() {
        return DataSourceBuilder.create().type(ComboPooledDataSource.class).build();
    }

    @Bean
    protected PasswordEncoder passwordEncoder() {
        return new MessageDigestPasswordEncoder("SHA-1");
    }

//    @Bean
//    ClientDetailsService clientDetailsService(@Qualifier("dataSourceToken") DataSource dataSourceToken) {
//        return new JdbcClientDetailsService(dataSourceToken);
//    }
}
