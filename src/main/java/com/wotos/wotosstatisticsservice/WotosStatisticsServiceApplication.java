package com.wotos.wotosstatisticsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
//@EnableDiscoveryClient
@EnableJpaRepositories
@EnableFeignClients
@EnableSwagger2
public class WotosStatisticsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WotosStatisticsServiceApplication.class, args);
	}

}
