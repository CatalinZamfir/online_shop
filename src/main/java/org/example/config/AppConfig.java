package org.example.config;

import org.example.beans.MyClass3;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan("org.example")
@Import({DatabaseConfig.class})
public class AppConfig {

    @Bean("dbConnection1")
    public MyClass3 createMyClass3() {
        return new MyClass3();
    }

    @Bean("dbConnection2")
    public MyClass3 createMyClass4() {
        return new MyClass3();
    }
}
