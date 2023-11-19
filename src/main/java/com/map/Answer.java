package com.map;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {
    @Id
	private int ans_id;
	private String ans;
	@OneToOne
	private Question que;
	
	public Question getQue() {
		return que;
	}
	public void setQue(Question que) {
		this.que = que;
	}
	public int getAns_id() {
		return ans_id;
	}
	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public Answer(int ans_id, String ans) {
		super();
		this.ans_id = ans_id;
		this.ans = ans;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
