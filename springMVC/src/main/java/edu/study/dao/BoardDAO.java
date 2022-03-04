package edu.study.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.study.vo.BoardVO;

@Repository
public class BoardDAO {
	
	@Autowired
	private SqlSession sqlSession;

	private static final String Namespace = "edu.study.mapper.boardMapper";
	
	public List<BoardVO> list() throws Exception{
		
		return sqlSession.selectList(Namespace+".listBoard");
	}
	
	public BoardVO detail(int bidx) throws Exception{
		return sqlSession.selectOne(Namespace+".detailBoard",bidx);
	}
}
