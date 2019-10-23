package ru.veesve.authserver.config;

import org.springframework.security.oauth2.config.annotation.builders.ClientDetailsServiceBuilder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;

public class VeesveClientDetailsServiceConfigurer extends ClientDetailsServiceConfigurer {
    public VeesveClientDetailsServiceConfigurer(ClientDetailsServiceBuilder<?> builder) {
        super(builder);
    }
}
