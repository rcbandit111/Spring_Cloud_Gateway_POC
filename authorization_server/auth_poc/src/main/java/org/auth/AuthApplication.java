package org.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = { "org.auth.*", "org.auth.database.service" })
public class AuthApplication {

    public static void main(final String[] args)
    {
        SpringApplication.run(AuthApplication.class, args);
    }
}
