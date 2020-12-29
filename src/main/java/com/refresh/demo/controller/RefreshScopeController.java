package com.refresh.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.refresh.demo.config.ConfigService;

@RestController
public class RefreshScopeController {
	@Autowired
	private ConfigService configService;

	@RequestMapping(value="/reflect", method= {RequestMethod.GET}, produces={MediaType.APPLICATION_JSON_VALUE})
	public void refresh(){
		System.err.println(configService.getName());
		System.err.println(configService.getAddress());
	}
}
