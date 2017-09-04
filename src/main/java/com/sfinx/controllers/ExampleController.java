package com.sfinx.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfinx.domain.Example;

@RestController
@RequestMapping("/xxx")
public class ExampleController {
	
	@RequestMapping("/example")
	public Example example() {
		Example example = new Example();
		example.setId(0L);
		example.setKey("key0");
		example.setValue("value0");
		return example;
	}

}
