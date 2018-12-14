package com.bizpoll.shop_CSone;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OracleConnectionTest {

	private final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private final static String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private final static String USER = "java";
	private final static String PASS = "1234";
	
	private static final Logger logger = LoggerFactory.getLogger(OracleConnectionTest.class);
	
	@Test
	public void test() throws Exception{
		Class.forName(DRIVER);
		
		try(Connection conn = DriverManager.getConnection(URL, USER, PASS)){
			logger.info("conn: "+conn);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}

}
