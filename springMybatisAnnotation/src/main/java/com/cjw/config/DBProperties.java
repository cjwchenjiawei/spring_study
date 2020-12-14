package com.cjw.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:jdbc.properties")
@Data
public class DBProperties {
    @Value(value = "${driverClassName}")
    private String driverClassName;
    @Value(value = "${url}")
    private String url;
    @Value(value = "${user}")
    private String user;
    @Value(value = "${pwd}")
    private String pwd;
}
