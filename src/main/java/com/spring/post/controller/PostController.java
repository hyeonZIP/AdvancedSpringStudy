package com.spring.post.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/welcome")
public class PostController {

    @GetMapping("/cicd")
    public String welcome(){
        return "Welcome, This is CICD Check Page, 안녕하세요, CI/CD 체크 페이지 입니다";
    }
}
