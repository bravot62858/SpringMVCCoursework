package com.study.springmvcCoursework.coursework6.entity;

public class ExamSlot {
	
	private String slotId;
	private String slotName;
	
	public ExamSlot() {
		
	}
	
	public ExamSlot(String slotId, String slotName) {
		this.slotId = slotId;
		this.slotName = slotName;
	}
	
	public String getSlotId() {
		return slotId;
	}
	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}
	public String getSlotName() {
		return slotName;
	}
	public void setSlotName(String slotName) {
		this.slotName = slotName;
	}
	
	@Override
	public String toString() {
		return "ExamSlot [slotId=" + slotId + ", slotName=" + slotName + "]";
	}
	

}
