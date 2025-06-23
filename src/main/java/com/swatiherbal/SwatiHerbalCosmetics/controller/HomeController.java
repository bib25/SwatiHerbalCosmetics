package com.swatiherbal.SwatiHerbalCosmetics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index()
	{
		return"index";
	}
	@GetMapping("/login")
	public String login()
	{
		return"login";
	}
	@GetMapping("/register")
	public String register()
	{
		return"register";
	}
	@GetMapping("/about")
	public String about()
	{
		return"about";
	}
	@GetMapping("/best_sellers")
	public String best_sellers()
	{
		return"best_sellers";
	}

	@GetMapping("/body")
	public String body()
	{
		return"body";
	}


	@GetMapping("/cart")
	public String cart()
	{
		return"cart";
	}


	@GetMapping("/face")
	public String face()
	{
		return"face";
	}

	@GetMapping("/gifts")
	public String gifts()
	{
		return"gifts";
	}

	@GetMapping("/hair")
	public String hair()
	{
		return"hair";
	}

	@GetMapping("/rewards")
	public String rewards()
	{
		return"rewards";
	}

	@GetMapping("/skincare_guide")
	public String skincare_guide()
	{
		return"skincare_guide";
	}

	@GetMapping("/wellness")
	public String wellness()
	{
		return"wellness";
	}


}
