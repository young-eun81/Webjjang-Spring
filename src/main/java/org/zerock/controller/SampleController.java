package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

///WEB-INF/spring/appServlet/servlet-context.xml 설정이 되어있어야 한다. (component-scan)

@RequestMapping("/sample")
@Controller //URL과 JAVA를 연결해준다.
@Log4j
public class SampleController {
	
	// 실행할 메소드
	@RequestMapping("")
	public void basic() {
		log.info("basic----------------");
		
	}

}
