package com.example.jdbctemplatesample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcTemplateSampleApplication {

    private static JdbcRoomDao jdbcRoomDao;

    public JdbcTemplateSampleApplication(JdbcRoomDao jdbcRoomDao) {
        this.jdbcRoomDao = jdbcRoomDao;
    }

    public static void main(String[] args) {
        SpringApplication.run(JdbcTemplateSampleApplication.class, args);
        int result = jdbcRoomDao.fin();
        System.out.println(result);
    }

}
