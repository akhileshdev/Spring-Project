package com.spring.mvc.crudapp.edao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.mvc.crudapp.bean.Emp;

public class EmpDao 
{
    JdbcTemplate template;

	public JdbcTemplate getTemplate() 
	{
		return template;
	}

	public void setTemplate(JdbcTemplate template) 
	{
		this.template = template;
	}
	
	
	public int save(Emp e)
	{
		String sql = "insert into employee(id,name,salary,designation) values('"+e.getId()+"','"+e.getName()+"',"+e.getSalary()+",'"+e.getDesignation()+"')"; 
		
		return template.update(sql);
	}
	
	public int update(Emp e)
	{
		String sql = "update employee set name = '"+e.getName()+"',salary = "+e.getSalary()+",designation = '"+e.getDesignation()+"'";
		return template.update(sql);		
	}
	
	public int delete(int id)
	{
		String sql = "delete from empployee where id = "+id+"";
		
		return template.update(sql);
	}
	
	public Emp getEmpById(int id)
	{
		String sql = "select *from employee where id = ?";
		
		return template.queryForObject(sql,new Object[]{id},new BeanPropertyRowMapper<Emp>(Emp.class));
	}
	
	
	public List<Emp> getEmployees()
	{
		return template.query("select *from employee",new RowMapper<Emp>()
		{	
			@Override
			public Emp mapRow(ResultSet rs,int row) throws SQLException
			{
				Emp e = new Emp();
				
				e.setId(rs.getInt("id"));   //Extracting parameter "id" from ResultSet which is nothing but table column "id"
				                            //Then setting up employee object "e" with setter method.
				
				e.setName(rs.getString("name"));
				e.setDesignation(rs.getString("designation"));
				e.setSalary(rs.getFloat("salary"));
				
				return e;
			}
			
		});
	}	
	
}
