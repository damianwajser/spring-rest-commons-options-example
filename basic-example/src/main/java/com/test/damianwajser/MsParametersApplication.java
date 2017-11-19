package com.test.damianwajser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan(basePackages={"com.github.damianwajser","com.prismamp.todopago"})
@EnableAutoConfiguration
@EnableCaching
public class MsParametersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsParametersApplication.class, args);
	}

}
