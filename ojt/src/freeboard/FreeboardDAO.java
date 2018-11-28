package freeboard;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import sqlmap.MyAppSqlConfig;

public class FreeboardDAO {
	
private static SqlSessionFactory sqlMapper;
private static SqlSession session;
	
	static{
		sqlMapper = MyAppSqlConfig.getSqlMapInstance();
		session = sqlMapper.openSession(true);
	}
	
	public boolean create(FreeboardDTO dto) {
		boolean flag = false;
		int cnt = session.insert("freeboard.create", dto);
		if(cnt>0)flag = true;
		return flag;
	}
	
	
	public void upViewcnt(int f_num) {
		session.update("freeboard.upViewcnt", f_num);
	}
	
	
	public boolean delete(int f_num) {
		boolean flag = false;
		
		int cnt = session.update("freeboard.delete", f_num);
		
		if(cnt>0) flag = true;
		
		return flag;
		
		
	}
	
	public boolean update(FreeboardDTO dto) {
		boolean flag = false;

		int cnt = session.update("freeboard.update", dto);
		
		if(cnt>0) flag = true;
		
		return flag;
		
		
	}
	
	public FreeboardDTO read(int f_num) {

		return session.selectOne("freeboard.read", f_num);
	}
	
	public int total(Map map) {
		
		return session.selectOne("freeboard.total",map);
	}
		
	public List<FreeboardDTO> list(Map map) {
		
		return session.selectList("freeboard.list", map);
		
	}

	
	
}
