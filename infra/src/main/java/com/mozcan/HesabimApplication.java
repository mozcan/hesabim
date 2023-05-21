package com.mozcan;

import com.mozcan.config.SpringFoxConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({SpringFoxConfig.class})
public class HesabimApplication {

    public static void main(String[] args) {
        SpringApplication.run(HesabimApplication.class, args);
    }
}
