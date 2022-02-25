package com.study.springmvcCoursework.coursework6.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.springmvcCoursework.coursework6.entity.Exam;
import com.study.springmvcCoursework.coursework6.entity.ExamSlot;
import com.study.springmvcCoursework.coursework6.service.ExamService;

@Controller
@RequestMapping("/coursework6/exam")
public class ExamController {
	@Autowired
	private ExamService examService;
	
	@GetMapping("/")
	public String index(@ModelAttribute Exam exam, Model model) {
		model.addAttribute("_method", "POST");
		model.addAttribute("exams", examService.queryExams());
		model.addAttribute("examSubjects", examService.queryExamSubjects());
		model.addAttribute("examSlots",examService.queryExamSlots());
		model.addAttribute("examPays", examService.queryExamPays());
		return "coursework6/exam";
	}
	
	@GetMapping("/{index}")
	public String get(@PathVariable("index") int index, Model model) {
		Optional<Exam> optExam = examService.queryExam(index);
		if(optExam.isPresent()) {
			model.addAttribute("_method", "PUT");
			model.addAttribute("exams", examService.queryExams());
			model.addAttribute("examSubjects", examService.queryExamSubjects());
			model.addAttribute("examSlots",examService.queryExamSlots());
			model.addAttribute("examPays", examService.queryExamPays());
			model.addAttribute("exam", optExam.get());
			return "coursework6/exam";
		}
		return "redirect:./";
	}
	
	@PostMapping("/")
	public String add(Exam exam) {
		examService.add(exam);
		return "redirect:./";
	}
	
	@PutMapping("/{index}")
	public String update(@PathVariable("index") int index, Exam exam) {
		examService.update(index, exam);
		return "redirect:./";
	}
	
	@PutMapping("/{index}/exam_note")
	public String updateExamNote(@PathVariable("index") int index, Exam exam) {
		examService.updateExamNote(index, exam.getExamNote());
		return "redirect:../";
	}
	
	@DeleteMapping("/{index}")
	public String delete(@PathVariable("index") int index) {
		examService.delete(index);
		return "redirect:./";
	}
	
}
