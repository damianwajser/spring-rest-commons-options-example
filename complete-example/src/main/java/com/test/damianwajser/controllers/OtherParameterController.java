package com.test.damianwajser.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.damianwajser.model.OtherParameter;

@RestController
@RequestMapping("/other/parameter")
public class OtherParameterController extends AbstractController<OtherParameter> {

	
	@GetMapping("/response")
	public OtherParameter otherEndPoint (){
		return null;
	}
}
