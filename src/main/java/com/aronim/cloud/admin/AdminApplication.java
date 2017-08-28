package com.aronim.cloud.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * User: Kevin W. Sewell
 * Date: 2016-08-14
 * Time: 10h18
 */
@EnableAdminServer
@EnableDiscoveryClient
@EnableAutoConfiguration
@SpringBootApplication
public class AdminApplication
{
    public static void main(String[] args)
    {
        System.setProperty("spring.profiles.active", "cloud");
        SpringApplication.run(AdminApplication.class);
    }
}
