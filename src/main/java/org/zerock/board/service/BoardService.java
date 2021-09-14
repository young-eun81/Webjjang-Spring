package org.zerock.board.service;

import java.util.List;

import org.zerock.board.vo.BoardVO;

public interface BoardService {
	
	// 1. 리스트
	public List<BoardVO> list() throws Exception;

	// 2. 글 보기
	public BoardVO view() throws Exception;
		
	// 3. 글 쓰기
	public int write() throws Exception;
	
	// 4. 글 수정
	public int update() throws Exception;
	
	// 5. 글 삭제
	public int delete() throws Exception;
}
