package com.okrohan.kentarus.controller;

import com.okrohan.kentarus.model.WordModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {
    @Autowired
    private WordModel wordModel;

    @GetMapping("/word")
	public String getWord() {
		return wordModel.getValue();
	}

    @PostMapping("/word")
    public WordModel setWord(@RequestBody WordModel newWordModel){
        wordModel.setValue(newWordModel.getValue());
        return wordModel;
    }
    
}
