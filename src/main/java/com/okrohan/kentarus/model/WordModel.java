package com.okrohan.kentarus.model;

import org.springframework.stereotype.Component;

@Component
public class WordModel {
	private String value;

	public WordModel() {
		System.out.println("Initializing Default Constructor");
		this.value = "Default";
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
