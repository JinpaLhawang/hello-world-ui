package com.jinpalhawang.jambudvipa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloWorldUiApplication {

  private static final Logger log = LoggerFactory.getLogger(HelloWorldUiApplication.class);

  public static void main(String[] args) {
    final SpringApplication app = new SpringApplication(HelloWorldUiApplication.class);
    app.setLogStartupInfo(false);
    app.run(args);
    log.info(HelloWorldUiApplication.class.getSimpleName() + " started.");
  }

}
