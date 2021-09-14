package org.zerock.board.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.zerock.board.vo.BoardVO;

import lombok.extern.log4j.Log4j;

//자동 생성하게 하는 어노테이션, 역할에 따라 어노테이션을 달리 적용한다.
//@Controller, @Service, @Repository, @Component, @RestController, @Advice(예외처리 시 사용)
//WEB-INF/spring/appServlet/servlet-context.xml 설정이 되어있어야 한다. component-scan
//BoardService 인터페이스 기능을 구현하는 클래스
@Repository
@Log4j
public class BoardDAOImpl implements BoardDAO {

	@Override
	public List<BoardVO> list() throws Exception {
		
		log.info("list() - 게시판 리스트 데이터 가져오기 ++++++++++");
		
		return null;
	}

	@Override
	public Long getTotalRow() throws Exception {
		
		log.info("getTotalRow() - 게시판 전체 데이터 개수 가져오기 ++++++++++");
		
		return null;
	}

	@Override
	public BoardVO view() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int increase() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int write() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
