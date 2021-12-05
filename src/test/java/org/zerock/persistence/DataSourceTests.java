package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

// spring-test 라이브러리 이용
@RunWith(SpringJUnit4ClassRunner.class)
// 테스트할 때 정보 - 생성하고 조립하고 설정내용 확인 후 실행
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTests {

	// 필요한 객체를 선언 - root-context.xml의 생성자 사용
	// HikariCP 사용
	@Setter(onMethod_ = {@Autowired})
	private DataSource dataSource;
	
	
	// - Mybatis-Spring 사용 : HikariCP 포함
	@Setter(onMethod_ = {@Autowired})
	private SqlSessionFactory sqlSessionFactory;

	// 테스트 할 메소드 만들기 - MyBatis
	@Test
	public void testMybatis() {
		//객체를 2개 이상 선언할 시, 세미콜론으로 처리문 구분
		try(SqlSession session = sqlSessionFactory.openSession();
				Connection con = session.getConnection()) {
			log.info("MyBatis Test --------------------");
			log.info(session);
			log.info(con);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	
	// 테스트 할 메소드 만들기 - HikariCP
	@Test
	public void testConnection() {
		try(Connection conn = dataSource.getConnection()) {
			log.info("HikariCP Test --------------------");
			log.info(conn);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
