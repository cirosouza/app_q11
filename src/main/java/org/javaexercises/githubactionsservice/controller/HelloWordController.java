package org.javaexercises.githubactionsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @GetMapping
    public String helloWord() {
        return "Hello World";
    }

    @GetMapping("/brasil")
    public String helloBrasil() {
        return "Hello Brasil";
    }

}
git sta