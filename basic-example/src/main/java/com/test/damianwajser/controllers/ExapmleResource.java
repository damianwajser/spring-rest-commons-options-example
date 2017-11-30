package com.test.damianwajser.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.damianwajser.model.Example;

@RestController
@RequestMapping("/example")
public class ExapmleResource {

	@GetMapping("/{id}")
	public Example getById(@PathVariable("id") Integer id) {
		Example example = new Example();
		example.setDescription("description");
		return example;

	}

	@PostMapping
	public Example post(@RequestBody Example example) {
		return example;
	}
}
