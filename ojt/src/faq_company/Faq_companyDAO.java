package faq_company;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import sqlmap.MyAppSqlConfig;

public class Faq_companyDAO {
	private static SqlSessionFactory sqlMapper;
	private static SqlSession session;
		
	static{
		sqlMapper = MyAppSqlConfig.getSqlMapInstance();
		session = sqlMapper.openSession(true);
	}
	
	
	public boolean delete(int fqc_num) {
		boolean flag = false;
		
		int cnt = session.update("faq_company.delete", fqc_num);
		
		if(cnt>0) flag = true;
		
		return flag;
		
		
	}
	
	public boolean update(Faq_companyDTO dto) {
		boolean flag = false;

		int cnt = session.update("faq_company.update", dto);
		
		if(cnt>0) flag = true;
		
		return flag;
		
		
	}
	
	public Faq_companyDTO read(int fqc_num) {

		return session.selectOne("faq_company.read", fqc_num);
	}
	
	public int total(Map map) {
		
		return session.selectOne("faq_company.total",map);
	}
		
	public List<Faq_companyDTO> list(Map map) {
		
		return session.selectList("faq_company.list", map);
		
	}
	
	public boolean create(Faq_companyDTO dto) {
		boolean flag = false;
		
		int cnt = session.insert("faq_company.create",dto);
		
		if(cnt>0) flag = true;
		
		return flag;
		
		
	}
}
