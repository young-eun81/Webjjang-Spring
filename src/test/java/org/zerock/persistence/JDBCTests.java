package org.zerock.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {

	// static 블록 - static 변수 초기화할 때 / 딱 한번만 실행된다.
	static {
		try {
			// 1. 드라이버 확인 2. static으로 정의되어 있는 요소들을 메모리로 올린다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	} // static 블록 끝

	// Oracle DB와 연결이 되는지 확인 - Connection만 확인
	@Test
	public void testConnection() {
		// try(try 안에서만 사용할 객체 선언 - try 블록이 끝나면 자동으로 close() 된다.)
		try(Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe","zerosilver","duddms960")) 
		{
			log.info(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


