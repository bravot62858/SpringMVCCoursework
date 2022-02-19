package com.study.springmvcCoursework.coursework5.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.springmvcCoursework.coursework5.service.LottoService;

@Controller
@RequestMapping("/coursework5/lotto")
public class LottoController {
	
	@Autowired
	private LottoService lottoService;
	
	//Lotto 主畫面
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("lottos",lottoService.getLottos());
		model.addAttribute("numcount",lottoService.getNumCount());
		return "coursework5/show_lotto";
	}
	
	//電腦選號
	@RequestMapping("/add")
	public String add() {
		lottoService.addLotto();
		return "redirect:./";
	}
	
	//修改紀錄
	@RequestMapping("/update/{index}")
	public String updare(@PathVariable("index") int index) {
		lottoService.updateLotto(index);
		return "redirect:../";
	}
	
	//刪除紀錄
	@RequestMapping("/delete/{index}")
	public String delete(@PathVariable("index") int index) {
		lottoService.deleteLotto(index);
		return "redirect:../";
	}
	
	//作業
	@RequestMapping("/numcount")
	//"不可加上@ResponseBody"
	public String numcount(Model model) {
		lottoService.numcount();
		//model.addAttribute("numcount",lottoService.numcount());
		//System.out.println("test");
		return "redirect:./";
	}
	
}
