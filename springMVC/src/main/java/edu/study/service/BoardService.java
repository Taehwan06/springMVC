package edu.study.service;

import java.util.List;

import edu.study.vo.BoardVO;

public interface BoardService {

	List<BoardVO> list() throws Exception;
	BoardVO detail(int bidx) throws Exception;
}
