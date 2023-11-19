package com.map;

import com.tut.MavenProject.*;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

@Entity
@Table(name="Question_table")
public class Question {
	@Id
    @Column(name="Q_id")
	private int que_id;
	private String que;
	
	@OneToOne
	private	Answer ans;
	public int getQue_id() {
		return que_id;
	}
	public void setQue_id(int que_id) {
		this.que_id = que_id;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public Answer getAns() {
		return ans;
	}
	public void setAns(Answer ans) {
		this.ans = ans;
	}
	public Question(int que_id, String que, Answer ans) {
		super();
		this.que_id = que_id;
		this.que = que;
		this.ans = ans;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
