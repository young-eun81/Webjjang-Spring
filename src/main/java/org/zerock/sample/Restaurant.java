package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

//자동 생성하게 하는 어노테이션, 역할에 따라 어노테이션을 달리 적용한다.
//@Controller, @Service, @Repository, @Component, @RestController, @Advice(예외처리 시 사용)
///WEB_INF/spring/root-context.xml 에 설정이 되어있어야 한다. (component-scan)
//@Component - 객체를 이루고 있는 구성요소
@Component
@Data
public class Restaurant {
	
	@Autowired
	private Chef chef;

}
