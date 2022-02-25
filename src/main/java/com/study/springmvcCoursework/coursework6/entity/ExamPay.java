package com.study.springmvcCoursework.coursework6.entity;

public class ExamPay {

	private Boolean pay;
	private String payName;

	public ExamPay() {
		
	}

	public ExamPay(Boolean pay, String payName) {
		super();
		this.pay = pay;
		this.payName = payName;
	}

	public Boolean getPay() {
		return pay;
	}

	public void setPay(Boolean pay) {
		this.pay = pay;
	}

	public String getPayName() {
		return payName;
	}

	public void setPayName(String payName) {
		this.payName = payName;
	}

	@Override
	public String toString() {
		return "ExamPay [pay=" + pay + ", payName=" + payName + "]";
	}

	
}
