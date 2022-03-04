package edu.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.study.dao.BoardDAO;
import edu.study.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO boardDao;

	@Override
	public List<BoardVO> list() throws Exception {
		
		List<BoardVO> list = boardDao.list();
		
		return list;
	}

	@Override
	public BoardVO detail(int bidx) throws Exception {
		
		return boardDao.detail(bidx);
	}
}
