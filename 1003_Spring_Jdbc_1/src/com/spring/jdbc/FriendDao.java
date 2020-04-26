package com.spring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;


public class FriendDao 
{
    private JdbcTemplate jdbcTemplate;
	 
    
    
    public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveFriend(Friend f)
	{
		String query = "insert into friend values('"+f.getId()+"','"+f.getName()+"','"+f.getAge()+"')";
		
		return jdbcTemplate.update(query);
		
	}
	
	
	public int updateFriend(Friend f)
	{
		String query = "update friend set name = '"+f.getName()+"',age = '"+f.getAge()+"' where id = '"+f.getId()+"'";
		return jdbcTemplate.update(query);
	}
	
	public int deleteFriend(Friend f)
	{
		String query = "delete from friend where id = '"+f.getId()+"'";
		
		return jdbcTemplate.update(query);
	}

}
