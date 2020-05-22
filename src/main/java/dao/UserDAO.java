package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import vo.UserVO;

@Repository("user_dao")
public class UserDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public UserDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public int register(UserVO vo) {
		
		int res = sqlSession.insert("cgv.register_member", vo);
		return res;
		
	}
	
	

}
