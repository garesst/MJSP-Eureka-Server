package com.seguridad.gob.sv.mjspserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MjspEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MjspEurekaServerApplication.class, args);
    }

}
