package com.study.springmvcCoursework.coursework6.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Service;


import com.study.springmvcCoursework.coursework6.entity.Exam;
import com.study.springmvcCoursework.coursework6.entity.ExamPay;
import com.study.springmvcCoursework.coursework6.entity.ExamSlot;
import com.study.springmvcCoursework.coursework6.entity.ExamSubject;

@Service
public class ExamService {

	private List<Exam> exams = new CopyOnWriteArrayList<>();
	private List<ExamSubject> examSubjects = new CopyOnWriteArrayList<>();
	private List<ExamSlot> examSlots = new CopyOnWriteArrayList<ExamSlot>();
	private List<ExamPay> examPays = new CopyOnWriteArrayList<>();
	
	{
		examSubjects.add(new ExamSubject("808", "JavaSE 8 OCP I"));
		examSubjects.add(new ExamSubject("809", "JavaSE 8 OCP II"));
		examSubjects.add(new ExamSubject("819", "JavaSE 11 OCP"));
		examSubjects.add(new ExamSubject("900", "JavaEE 7 OCP"));
	}
	{
		examSlots.add(new ExamSlot("A","早上 (A) "));
		examSlots.add(new ExamSlot("B","下午 (B) "));
		examSlots.add(new ExamSlot("C","晚上 (C) "));
	}
	
	{
		examPays.add(new ExamPay(false,"未付款"));
		examPays.add(new ExamPay(true,"已付款"));
	}
	//查詢所有 exam slot
	public List<ExamSlot> queryExamSlots(){
		return examSlots;
	}
	//查詢所有 exam subject
	public List<ExamSubject> queryExamSubjects(){
		return examSubjects;
	}
	//查詢所有的繳費狀況
	public List<ExamPay> queryExamPays(){
		return examPays;
	}
	//查詢多筆
	public List<Exam> queryExams(){
		return exams;
	}
	//查詢單筆
	public Optional<Exam> queryExam(int index){
		if(index<0 || exams.size()==0 || index>=exams.size()) {
			return Optional.ofNullable(null);
		}
		return Optional.ofNullable(exams.get(index));
	}
	//新增
	public synchronized Boolean add(Exam exam) {
		int previousSize = exams.size();
		exams.add(exam);
		int nextSize = exams.size();
		return nextSize > previousSize;
	}
	//修改
	public synchronized Boolean update(int index, Exam exam) {
		if(index<0 || exams.size()==0 || index>=exams.size()) {
			return false;
		}
		exams.set(index, exam);
		return true;
	}
	//修改備註
	public synchronized Boolean updateExamNote(int index, String examNote) {
		if(index<0 || exams.size()==0 || index>=exams.size()) {
			return false;
		}
		exams.get(index).setExamNote(examNote);
		return true;
	}
	//刪除
	public synchronized Boolean delete(int index) {
		if(index<0 || exams.size()==0 || index>=exams.size()) {
			return false;
		}
		exams.remove(index);
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
