package com.example.corso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.corso.domain.Item;
import com.example.corso.viewmodel.DetailViewBean;

@Controller
@RequestMapping("/detail")
public class DetailController {

	@GetMapping
	public String getPage(Model model) {
		Item mockItem = new Item();
		mockItem.setSingleId("12345789");
		mockItem.setName("Portachiavi");
		mockItem.setDescription("Portachiavi in acciaio inossidabile con moschettone, lorem ipsum dolor sit amet.");

		DetailViewBean viewBean = new DetailViewBean();
		viewBean.setItem(mockItem);
		
		model.addAttribute("viewBean", viewBean);
		
		return "detail";
	}
}
