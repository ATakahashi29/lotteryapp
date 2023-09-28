package com.lottery.app.mapper;

import org.springframework.jdbc.core.JdbcTemplate;

public interface LotteryMapper {
	final JdbcTemplate jdbcTemplate = new JdbcTemplate();
}
