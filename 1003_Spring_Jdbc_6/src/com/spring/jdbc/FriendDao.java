package com.spring.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class FriendDao 
{   
	private NamedParameterJdbcTemplate template;
	public FriendDao() 
	{
		// TODO Auto-generated constructor stub
	}
	public NamedParameterJdbcTemplate getTemplate() 
	{
		return template;
	}
	public void setTemplate(NamedParameterJdbcTemplate template) 
	{
		this.template = template;
	}
	
	public void saveFriend(Friend f)
	{
		String query = "insert into friend values(:id,:name,:age)";
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		map.put("id",f.getId());
		map.put("name",f.getName());
		map.put("age",f.getAge());
		
		    template.execute(query,map,new PreparedStatementCallback()
			{			         
			      @Override
			      public Object doInPreparedStatement(PreparedStatement ps) throws SQLException,DataAccessException
			      {
			         return ps.executeUpdate();
			      }
			           
			});
		
		
		
		
	}
	
	

}
