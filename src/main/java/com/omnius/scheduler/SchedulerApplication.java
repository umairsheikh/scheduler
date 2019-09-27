package com.omnius.scheduler;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchedulerApplication {

	public static void main(String[] args) {
//		try {
//			DriverManager.getConnection("jdbc:h2:tcp://localhost/server~/test","sa","");
//			 JdbcDataSource ds = new JdbcDataSource();
//			 ds.setURL("jdbc:h2:˜/test");
//			 ds.setUser("sa");
//			 ds.setPassword("sa");
//			 Context ctx = new InitialContext();
//			 ctx.bind("jdbc/dsName", ds);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		SpringApplication.run(SchedulerApplication.class, args);
	}

}
