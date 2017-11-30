package com.test.damianwajser.model;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Example {
	@JsonProperty("p")
	@NotEmpty(message = "The field description is required")
	private String description1;

	@JsonProperty("get")
	public String getDescription() {
		return this.description1;
	}
	@JsonProperty("set")
	public void setDescription(String description) {
		this.description1 = description;
	}

}
