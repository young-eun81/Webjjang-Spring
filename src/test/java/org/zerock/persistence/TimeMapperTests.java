package org.zerock.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

/**
 * 
 * @author user
 * -> 이 테스트를 성공적으로 출력하려면 root-context.xml 에서 jdbcUrl과 driverClassName을 setter() 데이터 세팅으로 변경!
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TimeMapperTests {

	// 처리해서 테스트해야 할 객체 - 자동 주입 
	@Setter(onMethod_= {@Autowired})
	private TimeMapper timeMapper;
	
	//테스트 할 메소드
	@Test
	public void testGetTime() {
		log.info("Mapper Test - getTime() ---------------------");
		log.info(timeMapper.getClass().getName()); // com.sun.proxy.$Proxy22
		log.info(timeMapper.getTime()); // 2021-10-13 19:32:25
	}
}
