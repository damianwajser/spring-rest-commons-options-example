package com.test.damianwajser.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Example {
	
	@NotEmpty(message = "The field description is required")
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
