package org.zerock.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.sample.Restaurant;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
//객체 생성이나 DI 적용이 src/main/java -> 자동 적용, src/test/java -> 자동 적용 안됨(읽어올 파일 지정)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//log 객체 사용하기 위한 지정 log - 사용 내역 출력
@Log4j
public class SampleTest {
	
	//자동 DI - 생성된 같은 클래스를 자동으로 넣어준다.
	@Autowired
	private Restaurant restaurant;

	// 실제적인 테스트를 하는 메소드 작성
	@Test
	public void testExist() {
		//Null일 경우 예외처리 발생 (Not Null 확인)
		assertNotNull(restaurant); 
		
		log.info(restaurant);
		log.info("----------------------------");
		log.info(restaurant.getChef());
	}

}
