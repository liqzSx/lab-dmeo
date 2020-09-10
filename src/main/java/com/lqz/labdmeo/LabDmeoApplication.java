package com.lqz.labdmeo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.lqz.labdmeo.mapper")
@SpringBootApplication
public class LabDmeoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabDmeoApplication.class, args);
    }

}
