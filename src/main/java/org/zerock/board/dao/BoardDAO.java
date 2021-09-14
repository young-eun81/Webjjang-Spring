package org.zerock.board.dao;

import java.util.List;

import org.zerock.board.vo.BoardVO;

//BoardService가 가지고 있는 메소드를 모두 갖고 있음
public interface BoardDAO {
	
	// 1. 리스트
	public List<BoardVO> list() throws Exception;
	// 1-1. 전체 데이터 갯수 가져오기
	public Long getTotalRow() throws Exception;

	// 2. 글 보기
	public BoardVO view() throws Exception;
	// 2-1. 조회수 1 증가
	public int increase() throws Exception;
	
	// 3. 글 쓰기
	public int write() throws Exception;
	
	// 4. 글 수정
	public int update() throws Exception;
	
	// 5. 글 삭제
	public int delete() throws Exception;

}
