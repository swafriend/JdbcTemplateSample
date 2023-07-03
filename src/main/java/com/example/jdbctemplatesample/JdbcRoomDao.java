package com.example.jdbctemplatesample;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcRoomDao {

    JdbcTemplate jdbcTemplate;

    public JdbcRoomDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int fin(){
        String sql = "select COUNT(*) from M_USER";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

}
