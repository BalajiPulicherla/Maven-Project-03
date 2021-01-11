package com.bt.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Service;

@Service("localeService")
public class LocaleService implements ILocalServices {

	@Override
	public List<String> getAllCountries() {
		System.out.println("LocaleService.getAllCountries()");
		Locale locales[]=null;
		List<String> CountriesList=null;
		
		locales=Locale.getAvailableLocales();
		CountriesList=new LinkedList<String>();
		for(Locale l:locales) {
			if(!l.getDisplayCountry().equals("")) 
				CountriesList.add(l.getDisplayCountry());
		}
		return CountriesList;
	}

}
