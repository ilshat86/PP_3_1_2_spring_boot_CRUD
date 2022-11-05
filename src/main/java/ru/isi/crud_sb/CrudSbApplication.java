package ru.isi.crud_sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ru.isi")
public class CrudSbApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudSbApplication.class, args);
    }

}
