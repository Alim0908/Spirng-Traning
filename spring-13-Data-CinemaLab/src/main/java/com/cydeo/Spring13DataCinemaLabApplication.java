package com.cydeo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class Spring13DataCinemaLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring13DataCinemaLabApplication.class, args);
	}
//	@Bean
//	public MigrateResult migrateResult(DataSource dataSource){
//		return Flyway.configure().baselineOnMigrate(true).dataSource(dataSource).load().migrate();
//	}

}
