package faq_users;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import sqlmap.MyAppSqlConfig;

public class Faq_usersDAO {
	private static SqlSessionFactory sqlMapper;
	private static SqlSession session;
		
	static{
		sqlMapper = MyAppSqlConfig.getSqlMapInstance();
		session = sqlMapper.openSession(true);
	}
	
	
	public boolean delete(int fqu_num) {
		boolean flag = false;
		
		int cnt = session.update("faq_users.delete", fqu_num);
		
		if(cnt>0) flag = true;
		
		return flag;
		
		
	}
	
	public boolean update(Faq_usersDTO dto) {
		boolean flag = false;

		int cnt = session.update("faq_users.update", dto);
		
		if(cnt>0) flag = true;
		
		return flag;
		
		
	}
	
	public Faq_usersDTO read(int fqu_num) {

		return session.selectOne("faq_users.read", fqu_num);
	}
	
	public int total(Map map) {
		
		return session.selectOne("faq_users.total",map);
	}
		
	public List<Faq_usersDTO> list(Map map) {
		
		return session.selectList("faq_users.list", map);
		
	}
	
	public boolean create(Faq_usersDTO dto) {
		boolean flag = false;
		
		int cnt = session.insert("faq_users.create",dto);
		
		if(cnt>0) flag = true;
		
		return flag;
		
		
	}
}
