package com.spring.demo;

import java.util.Date;

//import java.sql.Date;

public class Answer 
{
      private int id;
      private String answer;
      private String by;
      private Date postedDate;
      
      
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getBy() {
		return by;
	}
	public void setBy(String by) {
		this.by = by;
	}
	public Date getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}
	
	
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", by=" + by + ", postedDate=" + postedDate + "]";
	}
      
      

}
