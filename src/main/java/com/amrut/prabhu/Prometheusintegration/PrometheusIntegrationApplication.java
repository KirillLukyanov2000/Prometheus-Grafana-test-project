package com.amrut.prabhu.Prometheusintegration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PrometheusIntegrationApplication {

    final static Logger logger = LoggerFactory.getLogger(PrometheusIntegrationApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PrometheusIntegrationApplication.class, args);
    }

    @GetMapping("/test1")
    public ResponseEntity<String> createWarnLogs() {
        logger.warn("Just a WARN log");
        return ResponseEntity.ok().body("All Ok test1");
    }

    @GetMapping("/test2")
    public ResponseEntity<String> createInfoLogs() {
        logger.info("Just an INFO log");
        return ResponseEntity.ok().body("All Ok test2");
    }

}
