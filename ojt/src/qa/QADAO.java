package qa;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import sqlmap.MyAppSqlConfig;

public class QADAO {
	private static SqlSessionFactory sqlMapper;
	private static SqlSession session;
		
	static{
		sqlMapper = MyAppSqlConfig.getSqlMapInstance();
		session = sqlMapper.openSession(true);
	}
		
	public boolean checkRefnum(int q_num) {
		boolean flag = false;
		
		int cnt = session.selectOne("qa.checkRefnum", q_num);
		
		if(cnt>0) flag = true;
		
		return flag;
	}
	
	public boolean replyCreate(QADTO dto) {
		boolean flag = false;
		

		int cnt = session.insert("qa.insertReply", dto);
		
		if(cnt>0) flag = true;
		
		
		return flag;
		
	}
	
	
	public void upAnsnum(Map map){
		session.update("qa.upAnsnum", map);
	}
	
	

		
	public QADTO replyRead(int q_num) {
		return session.selectOne("qa.replyRead",q_num);
	}
	
	
	
	public boolean delete(int q_num) {
		boolean flag = false;
		
		int cnt = session.update("qa.delete", q_num);
		
		if(cnt>0) flag = true;
		
		return flag;
		
		
	}
	
	public boolean update(QADTO dto) {
		boolean flag = false;

		int cnt = session.update("qa.update", dto);
		
		if(cnt>0) flag = true;
		
		return flag;
		
		
	}
	
	public QADTO read(int q_num) {

		return session.selectOne("qa.read", q_num);
	}
	
	public int total(Map map) {
		
		return session.selectOne("qa.total",map);
	}
		
	public List<QADTO> list(Map map) {
		
		return session.selectList("qa.list", map);
		
	}
	
	public boolean create(QADTO dto) {
		boolean flag = false;
		
		int cnt = session.insert("qa.create",dto);
		
		if(cnt>0) flag = true;
		
		return flag;
		
		
	}
}
