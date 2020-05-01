package com.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class FriendDao 
{
    private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() 
	{
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{
		this.jdbcTemplate = jdbcTemplate;
	}
       
    
	public List<Friend> displayFriend()
	{
		String str =  "select *from friend";
		
		return jdbcTemplate.query(str, new ResultSetExtractor<List<Friend>>()
				{
			       @Override
			       public List<Friend> extractData(ResultSet rs) throws SQLException,DataAccessException
			       {
			    	     
			    	   List<Friend> lis = new ArrayList<Friend>();
			    	   
			    	   while(rs.next())
			    	   {
			    		   Friend fr = new Friend();
			    		   
			    		   fr.setId(rs.getInt(1));
			    		   fr.setName(rs.getString(2));
			    		   fr.setId(rs.getInt(3));
			    		   
			    		   lis.add(fr);
			    	   }
			    	   
			    	   return lis;
			       }
				}				
				);
						
	}
	
}
