package com.bt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.bt.service.ILocalServices;


@Controller
public class MainController {
	@Autowired
	private ILocalServices service;

	
	@GetMapping(value="/welcome")
	public String showHomePage() {
		return "home";
	}
	@GetMapping(value="/countries")
	public String allCountriesList(ModelMap map){
		System.out.println("MainController.allCountriesList()");
		//ModelAndView mav=null;
		
		List<String> CountriesList=null;
		
		//mav=new ModelAndView();
		CountriesList=service.getAllCountries();
		
		map.put("listInfo", CountriesList);
		map.put("operation", "Countries");
		map.put("countriesCount", CountriesList.size());
		
		
		return "show_results";
		
	}

}
