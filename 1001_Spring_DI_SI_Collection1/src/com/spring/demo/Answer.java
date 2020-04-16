package com.spring.demo;

public class Answer 
{
    private int id;
    private String answer;
    private String by;
        
    
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}



	public String getAnswer() 
	{
		return answer;
	}


	public void setAnswer(String answer) 
	{
		this.answer = answer;
	}

	public String getBy() 
	{
		return by;
	}

	public void setBy(String by) 
	{
		this.by = by;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", by=" + by + "]";
	}

    
    

}
