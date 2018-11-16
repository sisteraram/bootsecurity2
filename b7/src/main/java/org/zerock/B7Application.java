package org.zerock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(basePackages="org.zerock.mapper")
@SpringBootApplication
public class B7Application {

	public static void main(String[] args) {
		SpringApplication.run(B7Application.class, args);
	}
}
