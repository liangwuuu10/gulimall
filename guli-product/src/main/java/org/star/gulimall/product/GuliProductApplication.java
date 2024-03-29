package org.star.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.star.gulimall.product.dao")
public class GuliProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuliProductApplication.class, args);
	}

}
