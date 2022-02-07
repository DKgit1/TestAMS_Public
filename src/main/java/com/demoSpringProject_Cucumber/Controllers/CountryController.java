package com.demoSpringProject_Cucumber.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

import com.demoSpringProject_Cucumber.Beans.Country;
import com.demoSpringProject_Cucumber.Services.CountryService;

@RestController
public class CountryController 
{

	@Autowired
	CountryService countryService;
	
	@GetMapping("/getcountries")
	public List getCountries()
	{
		return countryService.getAllCounties();
		
	}
		@RequestMapping("/")
	public String home() {
		return "Hello Docker World Version2";
	}
	@GetMapping("/getcountries/{id}")
	public Country getCountryById(@PathVariable(value="id") int id)
	{
	
		return countryService.getCountrybyID(id);
	}
	
	@PostMapping("/addcountry")
	public Country addCountry(@RequestBody Country country)
	{
		return countryService.addCountry(country);
	}
}
