package com.toddlindner.testjdbc;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class SomeService implements CommandLineRunner {

	private final JdbcTemplate jdbcTemplate;

	public void test() {
		var hsql = "SELECT CURRENT_DATE AS today, CURRENT_TIME AS now FROM (VALUES(0))";
		var sql = "select * from sys.objects";
		var l = jdbcTemplate.queryForList(sql);
		log.info(l.toString());
	}

	@Override
	public void run(String... args) throws Exception {
		test();
	}
}
