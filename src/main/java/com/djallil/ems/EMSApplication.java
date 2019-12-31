package com.djallil.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.djallil.ems.*"})
@EntityScan(basePackages = {"com.djallil.ems.*"})
@EnableJpaRepositories(basePackages = {"com.djallil.ems.*"})
public class EMSApplication {

    public static void main(String[] args) {
        SpringApplication.run(EMSApplication.class, args);
    }

}
