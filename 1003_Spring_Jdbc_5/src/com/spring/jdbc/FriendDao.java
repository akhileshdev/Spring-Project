package com.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class FriendDao 
{
    private JdbcTemplate jdbcTemplate;
    
	public FriendDao() 
	{
		// TODO Auto-generated constructor stub
	}

	public JdbcTemplate getJdbcTemplate() 
	{
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Friend> displayAll()
	{
		   String quer = "select *from friend";
		   
		   return jdbcTemplate.query(quer, new RowMapper<Friend>()
				   {
			              @Override
			              public Friend mapRow(ResultSet rs,int rownumber)throws SQLException
			              {			            	  
			            	  Friend fr = new Friend();
			            	  
			            	  fr.setId(rs.getInt(1));
			            	  fr.setName(rs.getString(2));
			            	  fr.setAge(rs.getInt(3));
			            	  
			            	  return fr;
			              }
			           			   
				   });
		   
	}

}
