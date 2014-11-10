package com.github.lobedan.spring.boot.plugin;

import com.github.lobedan.spring.boot.plugin.core.EnablePlugin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnablePlugin
@ComponentScan
public class Application extends SpringBootServletInitializer {

  //CHECKSTYLE:OFF
  public static void main(String[] args) throws Exception {
    SpringApplication.run(Application.class, args);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(Application.class);
  }
  //CHECKSTYLE:ON
}