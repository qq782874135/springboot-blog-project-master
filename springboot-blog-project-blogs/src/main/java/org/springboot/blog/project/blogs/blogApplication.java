package org.springboot.blog.project.blogs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("org.springboot.blog.project.blogs.mapper")
public class blogApplication {
	public static void main(String[] args) {
		SpringApplication.run(blogApplication.class, args);
	}
}
