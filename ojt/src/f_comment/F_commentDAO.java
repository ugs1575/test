package f_comment;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import sqlmap.MyAppSqlConfig;

public class F_commentDAO {
	private static SqlSessionFactory sqlMapper;
	private static SqlSession session;

		
	static{
		sqlMapper = MyAppSqlConfig.getSqlMapInstance();
		session = sqlMapper.openSession(true);
	}
		
	public int fcCount(int f_num){
	    return session.selectOne("f_comment.fcCount", f_num);
	}
	
	
	public boolean create(F_commentDTO dto) {
		
		boolean flag = false;
		
		int cnt = session.insert("f_comment.create",dto);
		
		if (cnt>0) flag = true;
		
		return flag;
		
	}
	
	
	public List<F_commentDTO> list(Map map){
		return session.selectList("f_comment.list", map);
	}
	
	public int total(int f_num) {
		return session.selectOne("f_comment.total", f_num);
	}
	
	public F_commentDTO read(int fc_num)
	{
		return session.selectOne("f_comment.read", fc_num);
	}
	
	public boolean update(F_commentDTO dto) {
		boolean flag = false;
		
		int cnt = session.update("f_comment.update",dto);
		
		if (cnt>0) flag = true;
		
		return flag;
	}
	
	public boolean delete(int fc_num) {
		boolean flag = false;
		
		int cnt = session.delete("f_comment.delete",fc_num);
		
		if (cnt>0) flag = true;
		
		return flag;
	}
	
	public boolean deleteAll(int f_num) {
		boolean flag = false;
		
		int cnt = session.delete("f_comment.deleteAll", f_num);
		
		if (cnt>0) flag = true;
		
		return flag;
	}
}
