package com.test.anagram.controller;

import com.test.anagram.model.Words;
import com.test.anagram.service.BasicService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @PostMapping(value = "/isAnagram")
    public Words isAnagram(@RequestBody Words words) {
        System.out.println("POST Request received");
        BasicService service = new BasicService();
        return service.isAnagram(words);
    }
}